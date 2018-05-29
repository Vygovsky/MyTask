package sapper;

public class Game {
    private Bomb bomb;
    private Flag flag;
    private GameState state;

    public GameState getState() {
        return state;
    }

    public Game(int x, int y, int bombs) {
        Ranges.setSize(new Coord(x, y));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start() {
        bomb.start();
        flag.start();
        state = GameState.PLAYED;
    }

    Box getBox(Coord coord) {
        if (Box.OPENED == flag.get(coord)) {
            return bomb.get(coord);
        } else {
            return flag.get(coord);
        }
    }

    private void checkWinner() {
        if (GameState.PLAYED == state) {
            if (flag.getTotalClosed() == bomb.getTotalBombs()) {
                state = GameState.WINNER;
                flag.setFlagetToLastClosedBox();
            }
        }
    }

    public int getTotalBomb() {
        return bomb.getTotalBombs();
    }

    public int getTotalFlagged() {
        return flag.getTotalFlaged();
    }

    private void openBox(Coord coord) {
        switch (flag.get(coord)) {
            case OPENED:
                setOpenToCloseBoxAroundNumb(coord);
                break;
            case FLAGED:
                break;
            case CLOSED:
                switch (bomb.get(coord)) {
                    case ZERO:
                        openBoxesAroundZero(coord);
                        break;
                    case BOMB:
                        openBombs(coord);
                        break;
                    default:
                        flag.setOpenedToBox(coord);
                        break;
                }
        }
    }

    private void setOpenToCloseBoxAroundNumb(Coord coord) {
        if (Box.BOMB != bomb.get(coord)) {
            if (bomb.get(coord).getNumber() == flag.getCountFlaggetBoxAruond(coord)) {
                for (Coord around : Ranges.getCoordsAround(coord)) {
                    if (flag.get(around) == Box.CLOSED) {
                        openBox(around);

                    }
                }
            }
        }

    }

    private void openBombs(Coord coordBombs) {
        flag.setBombedToBox(coordBombs);
        for (Coord coord : Ranges.getAllCoords())
            if (bomb.get(coord) == Box.BOMB) {
                flag.setOpenedToCosedBox(coord);
            } else {
                flag.setNobombsToFlaggedBox(coord);

            }
        state = GameState.BOMBER;

    }

    private void openBoxesAroundZero(Coord coord) {
        System.out.println(coord.x + " " + coord.y);
        flag.setOpenedToBox(coord);
        for (Coord aroundZero : Ranges.getCoordsAround(coord)) {
            openBox(aroundZero);
        }
    }

    public void pressRightButton(Coord coord) {
        if (isGameOver()) return;
        flag.toggleFlagedToBox(coord);

    }

    public void pressLeftButton(Coord coord) {
        if (isGameOver()) return;
        openBox(coord);
        checkWinner();
    }

    private boolean isGameOver() {
        if (state != GameState.PLAYED) {
            start();
            return true;
        }
        return false;
    }
}

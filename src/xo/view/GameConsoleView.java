package xo.view;

import xo.controller.GameController;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameConsoleView {
    protected GameController gameController;

    public GameConsoleView(GameController gameController) {
        assert gameController != null;
        this.gameController = gameController;
    }

    public void showGameName() {
        System.out.println(gameController.getGameName());
    }

    public void showPlaerName() {
        System.out.println(gameController.getPlayers());
    }


    public void showBoard() {
        for (int i = 0; i < 3; i++) {
            showBordLine(i);
        }
    }

    public void showBordLine(int row) {
        for (int i = 0; i < 3; i++) {
            System.out.print(gameController.getBoard().getFigure(row, i));
        }
    }


    public void start() {
        int x = getCoordinat("X");
        int y = getCoordinat("Y");
    }

    public int getCoordinat(String coordinatName) {
        int count = 0;
        int popitka = 3;
        do {
            System.out.println(String.format("Input coordinat %s: ", coordinatName));
            try {
                Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You input incorrect");
                count += 1;
            }
        } while (count < popitka);
        return -1;
    }
}
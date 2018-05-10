package xo.controller;


import xo.helpers.CordinateHelper;
import xo.model.Board;
import xo.model.Player;

public class GameController {

    private Board board;
    private String gameName;
    private Player[] players;

    public Board getBoard() {
        return board;
    }

    public GameController(String gameName, Player[] players, Board board) {
        this.players = players;
        this.board = board;
        if (gameName == null || gameName.isEmpty()) {
            this.gameName = "XO";
        } else {
            this.gameName = gameName;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(int x, int y) {
        if (!CordinateHelper.checkCoodinat(x) || !CordinateHelper.checkCoodinat(y)) {
            return false;
        }

        //TODO
        return true;
    }

    public Player[] getPlayers() {
        return players;
    }
}

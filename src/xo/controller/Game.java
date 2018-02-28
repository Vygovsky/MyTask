package xo.controller;


import xo.model.Player;

public class Game {
    private static String GAME_NAME = "XO";
    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public String getGameName() {
        return GAME_NAME;

    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(int x, int y) {
        return false;
    }
}

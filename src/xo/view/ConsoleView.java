package xo.view;

import xo.controller.Game;

public class ConsoleView {
    private Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }
    public void showGameName(){
        System.out.println(game.getGameName());
    }
    public void  showPlayerName(){
        System.out.println(game.getPlayers());

    }
}

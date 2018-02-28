package xo.view;

import xo.controller.Game;

public class AdvConsoleView extends ConsoleView {


    public AdvConsoleView(Game game, Game game1) {
        super(game);
    }

    @Override
    public void showGameName() {
        printLine();
        super.showGameName();
        printLine();
    }

    public void printLine() {
        System.out.println("***");
    }
}

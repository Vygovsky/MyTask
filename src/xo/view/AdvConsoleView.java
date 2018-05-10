package xo.view;

import xo.controller.GameController;

public class AdvConsoleView extends GameConsoleView {


    public AdvConsoleView(GameController gameController) {
        super(gameController);
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

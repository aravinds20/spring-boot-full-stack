package com.aravind.spring_framework.model;

public class GameRunner {

    public Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {

        game.up();
        game.down();
        game.left();
        game.right();

    }

}

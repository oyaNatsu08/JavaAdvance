package oop;

public class Player {
    String name;
    int wins;

    public Player(String name) {
        this.name = name;
    }

    public void countUpWins() {
        wins++;
    }
}

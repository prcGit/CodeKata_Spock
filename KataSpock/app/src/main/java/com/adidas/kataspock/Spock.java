package com.adidas.kataspock;

public class Spock extends Actor {
    @Override
    public Action act(Actor opponent) {
        if (opponent instanceof Scissors) {
            return Action.beat("smashes");
        } else if (opponent instanceof Rock) {
            return Action.beat("vaporizes");
        } else {
            return Action.LOOSE;
        }
    }
}

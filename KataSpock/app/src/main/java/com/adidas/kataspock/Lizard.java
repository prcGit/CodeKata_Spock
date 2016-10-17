package com.adidas.kataspock;

public class Lizard extends Actor {
    @Override
    public Action act(Actor opponent) {
        if (opponent instanceof Spock) {
            return Action.beat("poisons");
        } else if (opponent instanceof Paper) {
            return Action.beat("eats");
        } else {
            return Action.LOOSE;
        }
    }
}

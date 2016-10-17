package com.adidas.kataspock;

public class Rock extends Actor {

    @Override
    public Action act(Actor opponent) {
        if (opponent instanceof Lizard) {
            return Action.beat("crushes");
        } else if (opponent instanceof Scissors) {
            return Action.beat("crushes");
        } else {
            return Action.LOOSE;
        }
    }
}

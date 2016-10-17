package com.adidas.kataspock;

public class Scissors extends Actor {
    @Override
    public Action act(Actor opponent) {
        if (opponent instanceof Paper) {
            return Action.beat("cuts");
        } else if (opponent instanceof Lizard) {
            return Action.beat("decapitates");
        } else {
            return Action.LOOSE;
        }
    }
}

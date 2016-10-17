package com.adidas.kataspock;

public class Paper extends Actor {
    @Override
    public Action act(Actor opponent) {
        if (opponent instanceof Spock) {
            return Action.beat("disproves");
        } else if (opponent instanceof Rock) {
            return Action.beat("covers");
        } else {
            return Action.LOOSE;
        }
    }
}

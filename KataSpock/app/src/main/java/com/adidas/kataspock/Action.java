package com.adidas.kataspock;

public class Action {

    private static final int BEAT_CODE = 1;
    private static final int LOOSE_CODE = 0;

    public static final Action LOOSE = new Action(LOOSE_CODE);

    private int mCode;
    private String mName;

    private Action(int code) {
        mCode = code;
    }

    public static Action beat(String name) {
        Action action = new Action(BEAT_CODE);
        action.mName = name;
        return action;
    }

    public static Action loose(String name) {
        Action action = new Action(LOOSE_CODE);
        action.mName = name;
        return action;
    }

    public boolean isBeat() {
        return mCode == BEAT_CODE;
    }

    @Override
    public String toString() {
        return isBeat() ? mName : "looses to";
    }
}

package io.github.pedrofraca.codekata;

/**
 * Created by fracaped on 17/10/16.
 */

public class Won {

    private int winningOption;
    private int mOption2;

    public Won(int option1, int option2) {
        winningOption = option1;
        mOption2 = option2;
    }

    public int applyTo(int option1, int option2) {
        if (option1 == winningOption && option2 == mOption2 ){
            return 1;
        } else if (option2 == winningOption && option1 == mOption2) {
            return 2;
        }
        return 0;
    }
}

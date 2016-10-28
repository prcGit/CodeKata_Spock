package io.github.pedrofraca.codekata;

import java.util.ArrayList;

/**
 * Created by fracaped on 17/10/16.
 */
public class Game {
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;
    public static final int ROCK = 3;
    public static final int LIZARD = 4;
    public static final int SPOCK = 5;

    private ArrayList<Won> rules = new ArrayList<>();

    public Game(){
        rules.add(new Won(SCISSORS,PAPER));
        rules.add(new Won(PAPER,ROCK));
        rules.add(new Won(ROCK,LIZARD));
        rules.add(new Won(LIZARD,SPOCK));
        rules.add(new Won(SPOCK,SCISSORS));
        rules.add(new Won(SCISSORS,LIZARD));
        rules.add(new Won(LIZARD,PAPER));
        rules.add(new Won(PAPER,SPOCK));
        rules.add(new Won(SPOCK,ROCK));
        rules.add(new Won(ROCK,SCISSORS));
    }

    //Will return 1 if option 1 wins or 2 if option 2 wins
    //0 if draft
    public int play(int option1, int option2) {
        for (Won won : rules){
            int result = won.applyTo(option1,option2);
            if(result>0){
                return result;
            }
        }
        return 0;
    }


}

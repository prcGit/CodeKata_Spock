package com.oxana.codekata.codekata;

import android.content.Context;
import android.content.res.Resources;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oksana_Skorniakova on 10/17/16.
 */

public class Game {

    Map<Integer, Result> results;


    public static int PAPER = 0;
    public static int SCISSORS = 1;
    public static int ROCK = 2;
    public static int LIZARD = 3;
    public static int SPOCK = 4;

    public Game(Context context) {

        results = new HashMap();
        Resources res = context.getResources();

        Integer choice = PAPER;
        Map<Integer, String> links = new HashMap();
        links.put(SCISSORS, res.getString(R.string.result_scissors_vins_paper));
        links.put(ROCK, res.getString(R.string.result_paper_vins_rock));
        links.put(LIZARD, res.getString(R.string.result_lizard_vins_paper));
        links.put(SPOCK, res.getString(R.string.result_paper_vins_spock));

        results.put(choice, new Result(choice, links));


        choice = SCISSORS;
        links = new HashMap();
        links.put(PAPER, res.getString(R.string.result_scissors_vins_paper));
        links.put(ROCK, res.getString(R.string.result_rock_vins_scissors));
        links.put(LIZARD, res.getString(R.string.result_scissors_vins_lizars));
        links.put(4, res.getString(R.string.result_spock_vins_scissors));

        results.put(choice, new Result(choice, links));


        choice = ROCK;
        links = new HashMap();
        links.put(PAPER, res.getString(R.string.result_paper_vins_rock));
        links.put(SCISSORS, res.getString(R.string.result_rock_vins_scissors));
        links.put(LIZARD, res.getString(R.string.result_rock_vins_lizard));
        links.put(SPOCK, res.getString(R.string.result_spock_vins_rock));

        results.put(choice, new Result(choice, links));


        choice = LIZARD;
        links = new HashMap();
        links.put(PAPER, res.getString(R.string.result_lizard_vins_paper));
        links.put(ROCK, res.getString(R.string.result_rock_vins_lizard));
        links.put(SCISSORS, res.getString(R.string.result_scissors_vins_lizars));
        links.put(SPOCK, res.getString(R.string.result_lizard_vins_spock));

        results.put(choice, new Result(choice, links));

        choice = SPOCK;
        links = new HashMap();
        links.put(PAPER, res.getString(R.string.result_paper_vins_spock));
        links.put(ROCK, res.getString(R.string.result_spock_vins_rock));
        links.put(LIZARD, res.getString(R.string.result_lizard_vins_spock));
        links.put(SCISSORS, res.getString(R.string.result_spock_vins_scissors));

        results.put(choice, new Result(choice, links));


    }


    public String defineResult(int firstPlayerChoice, int secondPlayerChoice) {

String res =  results.get(firstPlayerChoice).getResult(secondPlayerChoice);
        if(res==null||res.length()==0){
             res="DRAW";
        }
        return res;
    }
}

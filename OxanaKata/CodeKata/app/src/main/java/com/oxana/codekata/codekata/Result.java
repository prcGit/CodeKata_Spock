package com.oxana.codekata.codekata;

import java.util.Map;

/**
 * Created by Oksana_Skorniakova on 10/17/16.
 */
public class Result {

    private int choise;
    private Map<Integer, String> links;

    public Result(int choise, Map<Integer, String> links) {
        this.choise = choise;
        this.links = links;
    }


    public String getResult(int secondPlayerChoice) {
        return links.get(secondPlayerChoice);
    }
}

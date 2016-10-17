package com.example.scissors;

/**
 * Created by royopal on 10/17/16.
 */

public class Game {

    //Game choices
    //0 Scissors
    //1 Paper
    //2 Rock
    //3 Lizard
    //4 Spock

    private final static String WINNER_A = "A";
    private final static String WINNER_B = "B";
    private final static String EQUALS = "Equals";
    int mChoiceA;
    int mChoiceB;

    public Game(int mChoiceA, int mChoiceB) {
        this.mChoiceA = mChoiceA;
        this.mChoiceB = mChoiceB;
    }

    public String andTheWinnerIs(){

         if(mChoiceA == mChoiceB){
             return EQUALS;
         }
         if (mChoiceA == 4 ){
             if(mChoiceB == 2 ||mChoiceB==0){
                 return WINNER_A;
             }
         }

         if (mChoiceA == 3){
             if(mChoiceB == 4 ||mChoiceB==1){
                 return WINNER_A;
             }
         }
        if(mChoiceA == 2){
            if(mChoiceB == 3 ||mChoiceB==0){
                return WINNER_A;
            }
        }
        if(mChoiceA == 1){

            if(mChoiceB == 2 || mChoiceB==4){
                return WINNER_A;
            }
        }
        if(mChoiceA == 0){

            if(mChoiceB == 3 ||mChoiceB==1){
                return WINNER_A;
            }
        }
        return WINNER_B;

    }
}

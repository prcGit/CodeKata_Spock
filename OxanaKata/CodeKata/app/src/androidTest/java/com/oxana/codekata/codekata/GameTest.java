package com.oxana.codekata.codekata;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


/**
 * Created by Oksana_Skorniakova on 10/17/16.
 */

@RunWith(AndroidJUnit4.class)
public class GameTest {
    Context context;

    Game game;

    @Before
    public void setUp() throws Exception {
        context = InstrumentationRegistry.getTargetContext();
        game = new Game(context);

    }

    @Test
    public void defineResult() throws Exception {
        assertEquals(context.getString(R.string.result_lizard_vins_paper),game.defineResult(Game.LIZARD, Game.PAPER));

        assertEquals(context.getString(R.string.result_spock_vins_rock),game.defineResult(Game.SPOCK, Game.ROCK));

        assertEquals(context.getString(R.string.result_scissors_vins_paper),game.defineResult(Game.PAPER, Game.SCISSORS));

        assertEquals(context.getString(R.string.result_spock_vins_scissors),game.defineResult(Game.SCISSORS, Game.SPOCK));

        assertEquals(context.getString(R.string.result_rock_vins_lizard),game.defineResult(Game.ROCK, Game.LIZARD));


    }

}
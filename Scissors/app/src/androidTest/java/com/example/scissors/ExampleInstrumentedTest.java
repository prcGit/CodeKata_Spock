package com.example.scissors;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.scissors", appContext.getPackageName());
    }

    @Test
    public void checkWinnerA() throws  Exception {
        Game game = new Game(3,1);
        assertEquals("A", game.andTheWinnerIs());
    }

    @Test
    public void checkWinnerB() throws  Exception {
        Game game = new Game(0,4);
        assertEquals("B", game.andTheWinnerIs());
    }

    @Test
    public void checkSpockWinsRock() throws  Exception {
        Game game = new Game(2,4);
        assertEquals("B", game.andTheWinnerIs());
    }

    @Test
    public void checkPaperWinsSpock() throws  Exception {
        Game game = new Game(1,4);
        assertEquals("A", game.andTheWinnerIs());
    }
    @Test
    public void checkRockWinsLizard() throws  Exception {
        Game game = new Game(2,3);
        assertEquals("A", game.andTheWinnerIs());
    }


}

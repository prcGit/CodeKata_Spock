package io.github.pedrofraca.codekata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testScissorsCutPaper(){
        Game game = new Game();
        assertEquals(1,game.play(Game.SCISSORS,Game.PAPER));
    }

    @Test
    public void testPaperCoversRock(){
        Game game = new Game();
        assertEquals(2,game.play(Game.ROCK,Game.PAPER));
    }

    @Test
    public void testRockCrushesLizard(){
        Game game = new Game();
        assertEquals(1,game.play(Game.ROCK,Game.LIZARD));
    }

    @Test
    public void testLizardPoisonsSpock(){
        Game game = new Game();
        assertEquals(2,game.play(Game.SPOCK,Game.LIZARD));
    }

    @Test
    public void testSpockSmashesScissors(){
        Game game = new Game();
        assertEquals(1,game.play(Game.SPOCK,Game.SCISSORS));
    }

    @Test
    public void testScissorsDecapitateLizard(){
        Game game = new Game();
        assertEquals(1,game.play(Game.SCISSORS,Game.LIZARD));
    }

    @Test
    public void testLizardEatsPaper(){
        Game game = new Game();
        assertEquals(2,game.play(Game.PAPER,Game.LIZARD));
    }

    @Test
    public void testPaperDisprovesSpock(){
        Game game = new Game();
        assertEquals(1,game.play(Game.PAPER,Game.SPOCK));
    }

    @Test
    public void testSpockVaporizesRock(){
        Game game = new Game();
        assertEquals(2,game.play(Game.ROCK,Game.SPOCK));
    }

    @Test
    public void testRockBreakScissors(){
        Game game = new Game();
        assertEquals(1,game.play(Game.ROCK,Game.SCISSORS));
    }

    @Test
    public void testRule(){
        Won won = new Won(Game.SCISSORS, Game.PAPER);
        assertEquals(1,won.applyTo(Game.SCISSORS,Game.PAPER));
    }

    @Test
    public void testRuleInverse(){
        Won won = new Won(Game.SCISSORS, Game.PAPER);
        assertEquals(2,won.applyTo(Game.PAPER,Game.SCISSORS));
    }

    @Test
    public void testRuleDraft(){
        Won won = new Won(Game.SCISSORS, Game.PAPER);
        assertEquals(0,won.applyTo(Game.SCISSORS,Game.SCISSORS));
    }
}
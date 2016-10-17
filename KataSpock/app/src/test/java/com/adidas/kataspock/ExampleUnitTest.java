package com.adidas.kataspock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private Rock rock;
    private Lizard lizard;
    private Spock spock;
    private Scissors scissors;
    private Paper paper;

    @Before
    public void prepare() {
        rock = new Rock();
        lizard = new Lizard();
        spock = new Spock();
        scissors = new Scissors();
        paper = new Paper();
    }

    @Test
    public void rockCrushesLizard() {
        Action action = rock.act(lizard);
        System.out.println(action);
        assertTrue(action.isBeat());
    }

    @Test
    public void paperCoversRock() {
        Action action = paper.act(rock);
        System.out.println(action);
        assertTrue(action.isBeat());
    }
}
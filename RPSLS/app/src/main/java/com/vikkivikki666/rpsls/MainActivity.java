package com.vikkivikki666.rpsls;

import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @IntDef({RPSLS.ROCK, RPSLS.PAPER, RPSLS.SCISSORS, RPSLS.LIZARD, RPSLS.SPOCK})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RPSLS {
        int ROCK = 0;
        int PAPER = 1;
        int SCISSORS = 2;
        int LIZARD = 3;
        int SPOCK = 4;
        int NA = -1;
    }

    private HashMap<Integer, LinkedList<Integer>> mBeatMap = new HashMap<>(5);

    private
    @RPSLS
    int mFirstChoise = RPSLS.NA;
    private
    @RPSLS
    int mSecondChoise = RPSLS.NA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initBeatsMap();
    }


    private void initViews() {
        findViewById(R.id.start).setOnClickListener(this);

        findViewById(R.id.btn_rock_1).setOnClickListener(this);
        findViewById(R.id.btn_paper_1).setOnClickListener(this);
        findViewById(R.id.btn_scissors_1).setOnClickListener(this);
        findViewById(R.id.btn_lizard_1).setOnClickListener(this);
        findViewById(R.id.btn_spock_1).setOnClickListener(this);

        findViewById(R.id.btn_rock_2).setOnClickListener(this);
        findViewById(R.id.btn_paper_2).setOnClickListener(this);
        findViewById(R.id.btn_scissors_2).setOnClickListener(this);
        findViewById(R.id.btn_lizard_2).setOnClickListener(this);
        findViewById(R.id.btn_spock_2).setOnClickListener(this);
    }


    private void initBeatsMap() {
        mBeatMap.put(RPSLS.ROCK, new LinkedList<>(Arrays.asList(RPSLS.SCISSORS, RPSLS.LIZARD)));
        mBeatMap.put(RPSLS.PAPER, new LinkedList<>(Arrays.asList(RPSLS.SPOCK, RPSLS.ROCK)));
        mBeatMap.put(RPSLS.SCISSORS, new LinkedList<>(Arrays.asList(RPSLS.PAPER, RPSLS.LIZARD)));
        mBeatMap.put(RPSLS.LIZARD, new LinkedList<>(Arrays.asList(RPSLS.SPOCK, RPSLS.PAPER)));
        mBeatMap.put(RPSLS.SPOCK, new LinkedList<>(Arrays.asList(RPSLS.SCISSORS, RPSLS.ROCK)));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_rock_1:
                mFirstChoise = RPSLS.ROCK;
                setFirstChoise(R.string.rock);
                break;
            case R.id.btn_paper_1:
                mFirstChoise = RPSLS.PAPER;
                setFirstChoise(R.string.paper);
                break;
            case R.id.btn_scissors_1:
                mFirstChoise = RPSLS.SCISSORS;
                setFirstChoise(R.string.scissors);
                break;
            case R.id.btn_lizard_1:
                mFirstChoise = RPSLS.LIZARD;
                setFirstChoise(R.string.lizard);
                break;
            case R.id.btn_spock_1:
                mFirstChoise = RPSLS.SPOCK;
                setFirstChoise(R.string.spock);
                break;
            case R.id.btn_rock_2:
                mSecondChoise = RPSLS.ROCK;
                setSecondChoise(R.string.rock);
                break;
            case R.id.btn_paper_2:
                mSecondChoise = RPSLS.PAPER;
                setSecondChoise(R.string.paper);
                break;
            case R.id.btn_scissors_2:
                mSecondChoise = RPSLS.SCISSORS;
                setSecondChoise(R.string.scissors);
                break;
            case R.id.btn_lizard_2:
                mSecondChoise = RPSLS.LIZARD;
                setSecondChoise(R.string.lizard);
                break;
            case R.id.btn_spock_2:
                mSecondChoise = RPSLS.SPOCK;
                setSecondChoise(R.string.spock);
                break;

            case R.id.start: {
                //noinspection ResourceType
                if((mFirstChoise == RPSLS.NA) || (mSecondChoise== RPSLS.NA)) {
                    Toast.makeText(this, "Choose both sides!", Toast.LENGTH_SHORT).show();
                    break;
                }
                doCheck();
                break;
            }
        }
    }

    private void setFirstChoise(int stringId) {
        ((TextView)findViewById(R.id.first_choise)).setText(getString(stringId));
    }

    private void setSecondChoise(int stringId) {
        ((TextView)findViewById(R.id.second_choise)).setText(getString(stringId));
    }

    private void doCheck() {
        if(mFirstChoise == mSecondChoise) {
            ((TextView)findViewById(R.id.winner)).setText("Draw!");
        } else {
            if (mBeatMap.get(mFirstChoise).contains(mSecondChoise)) {
                ((TextView) findViewById(R.id.winner)).setText("First one is winner!");
            } else {
                ((TextView) findViewById(R.id.winner)).setText("Second one is winner!");
            }
        }
    }
}

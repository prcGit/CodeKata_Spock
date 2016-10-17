package com.oxana.codekata.codekata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.result)
    TextView result;
    @BindView(R.id.button1_0)
    Button btn1_0;
    @BindView(R.id.button1_1)
    Button btn1_1;
    @BindView(R.id.button1_2)
    Button btn1_2;
    @BindView(R.id.button1_3)
    Button btn1_3;
    @BindView(R.id.button1_4)
    Button btn1_4;

    @BindView(R.id.button2_0)
    Button btn2_0;
    @BindView(R.id.button2_1)
    Button btn2_1;
    @BindView(R.id.button2_2)
    Button btn2_2;
    @BindView(R.id.button2_3)
    Button btn2_3;
    @BindView(R.id.button2_4)
    Button btn2_4;

    Integer first;
    Integer second;


    Game game;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn1_0.setOnClickListener(new MyListener());
        btn1_1.setOnClickListener(new MyListener());
        btn1_2.setOnClickListener(new MyListener());
        btn1_3.setOnClickListener(new MyListener());
        btn1_4.setOnClickListener(new MyListener());
        btn2_0.setOnClickListener(new MyListener());
        btn2_1.setOnClickListener(new MyListener());
        btn2_2.setOnClickListener(new MyListener());
        btn2_3.setOnClickListener(new MyListener());
        btn2_4.setOnClickListener(new MyListener());

        game = new Game(this);
    }


    public void setResult() {
        result.setText(game.defineResult(first, second));
        first=null;
        second=null;
    }


    public class MyListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case (R.id.button1_0):
                    first = Game.PAPER;
                    break;
                case (R.id.button1_1):
                    first = Game.SCISSORS;
                    break;
                case (R.id.button1_2):
                    first = Game.ROCK;
                    break;
                case (R.id.button1_3):
                    first = Game.LIZARD;
                    break;
                case (R.id.button1_4):
                    first = Game.SPOCK;
                    break;
                case (R.id.button2_0):
                    second = Game.PAPER;
                    break;
                case (R.id.button2_1):
                    second = Game.SCISSORS;
                    break;
                case (R.id.button2_2):
                    second = Game.ROCK;
                    break;
                case (R.id.button2_3):
                    second = Game.LIZARD;
                    break;
                case (R.id.button2_4):
                    second = Game.SPOCK;
                    break;
            }
            if (first != null & second != null) {
                setResult();
            }


        }
    }
}

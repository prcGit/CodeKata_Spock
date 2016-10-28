package com.adidas.kataspock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Actor[] actors = {new Lizard(), new Paper(), new Rock(), new Scissors(), new Spock()};

    private TextView actor1TextView;
    private TextView actor2TextView;
    private TextView actionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actor1TextView = (TextView) findViewById(R.id.text_actor1);
        actor2TextView = (TextView) findViewById(R.id.text_actor2);
        actionTextView = (TextView) findViewById(R.id.text_action);

        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button) {

            Actor actor1 = randomActor();
            Actor actor2 = randomActor();

            if (actor1 == actor2) {
                presentActors(actor1, actor2);
                actionTextView.setText("X");
            } else {
                Action action = actor1.act(actor2);
                if (action.isBeat()) {
                    presentActors(actor1, actor2);
                    actionTextView.setText(action.toString());
                } else {
                    presentActors(actor2, actor1);
                    actionTextView.setText(actor2.act(actor1).toString());
                }
            }
        }
    }

    private void presentActors(Actor actor1, Actor actor2) {
        actor1TextView.setText(actor1.getClass().getSimpleName());
        actor2TextView.setText(actor2.getClass().getSimpleName());
    }

    private Actor randomActor() {
        Random r = new Random();
        return actors[r.nextInt(actors.length)];
    }
}

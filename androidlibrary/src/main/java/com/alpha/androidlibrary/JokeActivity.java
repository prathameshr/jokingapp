package com.alpha.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class JokeActivity extends AppCompatActivity {

    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity);
        
        String joke = getIntent().getStringExtra(INTENT_JOKE);
        TextView textview = (TextView) findViewById(R.id.joke);
        if (joke != null) {
                textview.setText(joke);
        } else {
             textview.setText("No more jokes! Please !!!");
        }
        
    }

    
}

package com.sam.gettngfeetwetlab2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String msg = getIntent().getStringExtra(MainActivity.MESSAGE);
        TextView msgText = (TextView) findViewById(R.id.txt_sent);
        msgText.setText(msg);
    }

}

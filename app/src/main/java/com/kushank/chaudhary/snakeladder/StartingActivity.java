package com.kushank.chaudhary.snakeladder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }

    public void single(View view) {
        Intent intent = new Intent(this, SingleActivity.class);
        startActivity(intent);
    }

    public void multi(View view) {
        Intent intent = new Intent(this, MultiActivity.class);
        startActivity(intent);
    }

}

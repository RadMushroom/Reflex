package com.example.radmushroom.reflex;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.radmushroom.reflex.view.ReflexView;

public class MainActivity extends AppCompatActivity {
    ReflexView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout = findViewById(R.id.constraintLayout);
        gameView = new ReflexView(this, getPreferences(Context.MODE_PRIVATE), layout);

        layout.addView(gameView, 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume(this);
    }
}

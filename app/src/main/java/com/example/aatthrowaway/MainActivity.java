package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.intentsoftware.addapptr.AATKit;

public class MainActivity extends AppCompatActivity {

    App app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (App) getApplicationContext();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                app.requestInterstitial();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        AATKit.onActivityPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        AATKit.onActivityResume(this);
    }
}

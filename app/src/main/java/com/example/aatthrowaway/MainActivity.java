package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.intentsoftware.addapptr.AATKit;

public class MainActivity extends AppCompatActivity {

    App app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (App) getApplicationContext();
        final ViewGroup container = (ViewGroup) findViewById(R.id.container);

        app.requestBanner(new BannerCallback() {
            @Override
            public void bannerReceived(final View bannerView) {
                container.addView(bannerView);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();

        app.cancelCallback();
    }
}

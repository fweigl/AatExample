package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.intentsoftware.addapptr.AATKit;
import com.intentsoftware.addapptr.BannerPlacementLayout;

public class MainActivity extends AppCompatActivity {

    App app;
    BannerPlacementLayout banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (App) getApplicationContext();
        final ViewGroup container = (ViewGroup) findViewById(R.id.container);

        app.requestBanner(new BannerCallback() {
            @Override
            public void bannerReceived(final BannerPlacementLayout bannerView) {
                banner = bannerView;
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

        if (banner != null) {

            banner.destroy();

            ViewParent parent = banner.getParent();
            if (parent != null && parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(banner);
            }
        }
    }
}

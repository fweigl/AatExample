package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.intentsoftware.addapptr.AATKit;
import com.intentsoftware.addapptr.BannerPlacementLayout;
import com.intentsoftware.addapptr.PlacementSize;

public class MainActivity extends AppCompatActivity implements AATKit.Delegate {

    static String TAG = "AATKit";

    ViewGroup root;
    ViewGroup placementContainer;
    Button buttonA;
    Button buttonB;

    int placementId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplicationContext()).delegate = this;

        root = (ViewGroup) findViewById(R.id.root);

        findViewById(R.id.button_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                loadBannerVariantA();
            }
        });

        findViewById(R.id.button_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                loadBannerVariantB();
            }
        });

        placementId = AATKit.createPlacement("test", PlacementSize.MultiSizeBanner);
    }

    void loadBannerVariantA() {
        Log.d(TAG, "loading placement Variant A");
        AATKit.reloadPlacement(placementId);
    }

    void loadBannerVariantB() {
        Log.d(TAG, "loading placement Variant B");
        placementContainer = (ViewGroup) AATKit.getPlacementView(placementId);
        AATKit.reloadPlacement(placementId);
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
    public void aatkitHaveAd(final int i) {
        Log.d(TAG, "aatkitHaveAd" + i);
    }

    @Override
    public void aatkitNoAd(final int i) {
        Log.d(TAG, "aatkitNoAd" + i);
    }

    @Override
    public void aatkitPauseForAd(final int i) {

    }

    @Override
    public void aatkitResumeAfterAd(final int i) {

    }

    @Override
    public void aatkitShowingEmpty(final int i) {

    }

    @Override
    public void aatkitUserEarnedIncentive(final int i) {

    }

    @Override
    public void aatkitObtainedAdRules(final boolean b) {

    }

    @Override
    public void aatkitUnknownBundleId() {

    }

    @Override
    public void aatkitHaveAdForPlacementWithBannerView(
            final int i, final BannerPlacementLayout bannerPlacementLayout) {

        Log.d(TAG, "Rcvd bannerPlacement");

        // Variant A
        if (placementContainer == null) {
            Log.d(TAG, "Adding to special placement container");
            root.addView(bannerPlacementLayout);
        } else  // Variant B{
        {
            Log.d(TAG, "Adding directly to layout");
            root.addView(bannerPlacementLayout);
        }
    }
}

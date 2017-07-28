package com.example.aatthrowaway;

import android.app.Application;
import android.util.Log;

import com.intentsoftware.addapptr.AATKit;
import com.intentsoftware.addapptr.BannerPlacementLayout;
import com.intentsoftware.addapptr.PlacementSize;

public class App extends Application implements AATKit.Delegate {

    int placementId = -1;

    @Override
    public void onCreate() {
        super.onCreate();
        AATKit.init(this, this);
        placementId = AATKit.createPlacement("test", PlacementSize.MultiSizeBanner);
    }

    @Override
    public void aatkitHaveAd(final int i) {

    }

    @Override
    public void aatkitNoAd(final int i) {
        Log.d("yyy", "noad " + i);
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

        Log.d("yyy", "aatkitHaveAdForPlacementWithBannerView " + i);
    }
}

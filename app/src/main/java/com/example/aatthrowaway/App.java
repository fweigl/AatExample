package com.example.aatthrowaway;

import android.app.Application;
import android.util.Log;

import com.intentsoftware.addapptr.AATKit;
import com.intentsoftware.addapptr.BannerPlacementLayout;

public class App extends Application implements AATKit.Delegate {

    public AATKit.Delegate delegate;

    @Override
    public void onCreate() {
        super.onCreate();

        AATKit.init(this, this);
    }

    @Override
    public void aatkitHaveAd(final int i) {
        Log.d("yyy", "aatkitHaveAd");
    }

    @Override
    public void aatkitNoAd(final int i) {
        Log.d("yyy", "aatkitNoAd");
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

        delegate.aatkitHaveAdForPlacementWithBannerView(i, bannerPlacementLayout);
    }
}

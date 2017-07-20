package com.example.aatthrowaway;

import android.util.Log;

import com.intentsoftware.addapptr.AATKit;
import com.intentsoftware.addapptr.BannerPlacementLayout;

public class AATLogger implements AATKit.Delegate {
    @Override
    public void aatkitHaveAd(final int i) {
        Log.d("yy", "aatkitHaveAd " + i);
    }

    @Override
    public void aatkitNoAd(final int i) {
        Log.d("yy", "aatkitNoAd " + i);
    }

    @Override
    public void aatkitPauseForAd(final int i) {
        Log.d("yy", "aatkitPauseForAd " + i);
    }

    @Override
    public void aatkitResumeAfterAd(final int i) {
        Log.d("yy", "aatkitResumeAfterAd " + i);
    }

    @Override
    public void aatkitShowingEmpty(final int i) {
        Log.d("yy", "aatkitShowingEmpty " + i);
    }

    @Override
    public void aatkitUserEarnedIncentive(final int i) {
        Log.d("yy", "aatkitUserEarnedIncentive " + i);
    }

    @Override
    public void aatkitObtainedAdRules(final boolean b) {
        Log.d("yy", "aatkitObtainedAdRules " + b);
    }

    @Override
    public void aatkitUnknownBundleId() {
        Log.d("yy", "aatkitUnknownBundleId ");
    }

    @Override
    public void aatkitHaveAdForPlacementWithBannerView(
            final int i, final BannerPlacementLayout bannerPlacementLayout) {
        Log.d("yy", "aatkitHaveAdForPlacementWithBannerView " + i + " " + bannerPlacementLayout);
    }
}

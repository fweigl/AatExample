package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment implements BannerCallback {

    ViewGroup bannerContainer;

    @Nullable
    @Override
    public View onCreateView(
            final LayoutInflater inflater,
            @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, null);

        bannerContainer = (ViewGroup) view.findViewById(R.id.container);

        loadBanner();

        return view;
    }

    void loadBanner() {
        App app = (App) getActivity().getApplicationContext();
        app.requestBanner(this);
    }

    @Override
    public void bannerReceived(final View bannerView) {

        bannerContainer.removeAllViews();
        bannerContainer.addView(bannerView);
    }
}

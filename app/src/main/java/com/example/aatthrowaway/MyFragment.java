package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intentsoftware.addapptr.AATKit;

public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            final LayoutInflater inflater,
            @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, null);

        loadBanner();

        return view;
    }

    void loadBanner() {
        App app = (App) getActivity().getApplicationContext();
        int placementId = app.placementId;
        Log.d("yyy", "reloadPlacement" + placementId);
        AATKit.reloadPlacement(app.placementId);
    }
}

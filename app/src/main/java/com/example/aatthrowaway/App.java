package com.example.aatthrowaway;

import android.app.Application;

import com.intentsoftware.addapptr.AATKit;
import com.intentsoftware.addapptr.PlacementSize;

public class App extends Application {

    int placementId = -1;

    @Override
    public void onCreate() {
        super.onCreate();
        AATKit.init(this, null);
        placementId = AATKit.createPlacement("Fullscreen", PlacementSize.Fullscreen);
    }

}

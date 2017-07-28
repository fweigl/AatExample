package com.example.aatthrowaway;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.intentsoftware.addapptr.AATKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

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

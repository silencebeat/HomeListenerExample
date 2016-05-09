package com.silencebeat.homelistenerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeWatcher homeWatcher = new HomeWatcher(this);

        homeWatcher.setOnHomePressedListener(new HomePressedListener() {
            @Override
            public void onHomePressed() {
                Log.d(TAG, "home pressed");
                Toast.makeText(getApplicationContext(), "home pressed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onHomeLongPressed() {
                Toast.makeText(getApplicationContext(), "home long pressed", Toast.LENGTH_SHORT).show();
            }
        });

        homeWatcher.startWatch();
    }
}

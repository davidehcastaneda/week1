package com.dehcast.week1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logThis("onCreate B");
    }

    @Override
    protected void onPause() {
        logThis("pause B");
        super.onPause();
    }

    @Override
    protected void onStop() {
        logThis("stop B");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        logThis("destroy B");
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        logThis("start B");
        super.onStart();
    }

    @Override
    protected void onResume() {
        logThis("resume B");
        super.onResume();
    }

    void logThis(String message) {
        Log.d( "logThis: ", message);
    }
}
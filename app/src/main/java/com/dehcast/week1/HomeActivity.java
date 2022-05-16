package com.dehcast.week1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView title;

    View.OnClickListener titleListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), MainActivity.class);
            startActivity(intent);
            Log.d("modayTag", "Userclicked!!!!");
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        title = findViewById(R.id.home_title);
        title.setOnClickListener(titleListener);
        logThis("onCreate A");
    }

    @Override
    protected void onPause() {
        logThis("pause A");
        super.onPause();
    }

    @Override
    protected void onStop() {
        logThis("stop A");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        logThis("destroy A");
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        logThis("start A");
        super.onStart();
    }

    @Override
    protected void onResume() {
        logThis("resume A");
        super.onResume();
    }

    void logThis(String message) {
        Log.d( "logThis: ", message);
    }
}

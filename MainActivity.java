package com.example.root.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MY_TAG = "Log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(MY_TAG, "onCreate method called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "onResume method called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "onPause method called!");
    }

    public void changeText(View view) {

    }
}

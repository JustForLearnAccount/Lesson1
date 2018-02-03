package com.example.root.lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MY_TAG = "Log";

    private static ListView listView;

    private static String[] NAMES = new String[]
            {"Mietek", "Wladek", "Krzysiu", "Bastek"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView();
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

    public void listView () {
        listView = (ListView)findViewById(R.id.listV);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.name_list, NAMES);
        listView.setAdapter(arrayAdapter);

    }

    public void changeText(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        TextView textView = (TextView)findViewById(R.id.textView);

        String inputText = editText.getText().toString();

        textView.setText(inputText.toString());

    }

    public void openActivity(View view) {
        Intent intent = new Intent("com.example.root.lesson1.SecondActivity");
        startActivity(intent);
    }
}

package com.emamagic.builderannotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person.Builder()
                            .setName("ali")
                            .setFamily("rezaii")
                            .setAge(12)
                            .build();

        Log.e(TAG, "onCreate: "+ person.toString());

    }
}
package com.emamagic.builderannotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.emamagic.annotation.BindView;
import com.emamagic.binder.Binding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.txt_test)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding.bind(this);
        textView.setText("binding view working");

        PersonBuilder.Builder()
                .name("ali")
                .family("hasan")
                .age(2)
                .build();

    }
}
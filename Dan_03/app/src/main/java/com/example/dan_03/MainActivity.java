package com.example.dan_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button updateClick;
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateClick = findViewById(R.id.updateClick);

    }

    public void Update(View view) {
        clicks++;
        updateClick.setText("This is a click number" + clicks);
    }
}
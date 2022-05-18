package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(view -> offensive());
    }
    public void offensive(){
        Intent intent=new Intent(this, five.class);
        startActivity(intent);
    }
}
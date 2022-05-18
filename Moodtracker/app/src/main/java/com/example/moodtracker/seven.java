package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;



public class seven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven2);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener(view -> seven.this.opened());
    }
    public void opened(){
        Intent intent=new Intent(this, eight.class);
        startActivity(intent);
    }
}
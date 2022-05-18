package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class eight extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> eight.this.opened());
    }
    public void opened(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);




    }
}
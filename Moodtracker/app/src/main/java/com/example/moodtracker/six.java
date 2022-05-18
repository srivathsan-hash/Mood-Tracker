package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(view -> openseven());
    }
    public void openseven(){
        Intent intent=new Intent(this, seven.class);
        startActivity(intent);
    }
}
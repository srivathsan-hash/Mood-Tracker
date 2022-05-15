package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class two extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button=(Button) findViewById(R.id.btn2);
        button.setOnClickListener(view -> openthree());
    }
    public void openthree(){
        Intent intent=new Intent(this, three.class);
        startActivity(intent);
    }
}
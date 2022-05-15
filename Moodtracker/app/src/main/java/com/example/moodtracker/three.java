package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class three extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        button=(Button) findViewById(R.id.btn2);
        button.setOnClickListener(view -> openfour());
    }
    public void openfour(){
        Intent intent=new Intent(this, four.class);
        startActivity(intent);
    }
}
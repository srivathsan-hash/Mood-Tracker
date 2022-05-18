package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(view -> opensix());
    }
    public void opensix(){
        Intent intent=new Intent(this, six.class);
        startActivity(intent);

    }
}
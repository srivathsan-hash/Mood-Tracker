package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class seven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven2);
        Button button = (Button) findViewById(R.id.btn2);

        button.setOnClickListener(view -> seven.this.opened());
    }
    public void opened(){
        Intent intent=new Intent(this, eight.class);
        startActivity(intent);
    }
}
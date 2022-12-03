package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Reis_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
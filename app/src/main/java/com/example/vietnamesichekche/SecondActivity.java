package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {
    Button buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonTwo = (Button) findViewById(R.id.buttonSecondPage);
        buttonTwo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTwo = new Intent(SecondActivity.this, ThridActivity.class);
                startActivity(intentTwo);
            }
        }));
    }
}
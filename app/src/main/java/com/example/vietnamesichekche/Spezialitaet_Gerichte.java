package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Spezialitaet_Gerichte extends AppCompatActivity {

    ImageView backIcon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spezialitaet_activity);

        backIcon = (ImageView) findViewById(R.id.left_back_icon_3);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Spezialitaet_Gerichte.this, AllRecipe_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
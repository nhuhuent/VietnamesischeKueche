package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Spezialitaet_Gerichte_Activity extends AppCompatActivity {

    ImageView backIcon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spezialitaet_gerichte);

        backIcon = (ImageView) findViewById(R.id.left_back_icon_3);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Spezialitaet_Gerichte_Activity.this, VietnamesichesKueche_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
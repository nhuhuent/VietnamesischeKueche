package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_BoLucLac extends AppCompatActivity {

    ImageView boluclacImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reis_bo_luc_lac);

        // back button
        boluclacImg =(ImageView) findViewById(R.id.left_back_4);
        boluclacImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_BoLucLac.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
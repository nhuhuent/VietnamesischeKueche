package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_ComGaLuoc extends AppCompatActivity {

    ImageView comgaluocImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reis_com_ga_luoc);

        // back button
        comgaluocImg =(ImageView) findViewById(R.id.left_back_5);
        comgaluocImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_ComGaLuoc.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
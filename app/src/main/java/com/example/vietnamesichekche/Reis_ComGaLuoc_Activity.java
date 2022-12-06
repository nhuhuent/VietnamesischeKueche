package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_ComGaLuoc_Activity extends AppCompatActivity {

    ImageView comgaluocImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_com_ga_luoc);

        // back button
        comgaluocImg =(ImageView) findViewById(R.id.left_back_5);
        comgaluocImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_ComGaLuoc_Activity.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
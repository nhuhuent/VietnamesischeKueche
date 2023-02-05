package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Spezialitaet_Gerichte_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView banhmithitheonuongImg, banhxeoImg, goicuonImg, bokhoImg, lauhaisanImg, goigaImg, chagiochayImg,
    goicuonchayImg;

    Button onlineRecipe;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spezialitaet_gerichte);

        onlineRecipe =(Button) findViewById(R.id.spezialitaet_button);
        onlineRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onlineIntent = new Intent(Spezialitaet_Gerichte_Activity.this, OnlineRecipes_Activity.class);
                onlineIntent.putExtra("Spezialitaet_Gerichte_Activity", 3);
                startActivity(onlineIntent);
            }
        });

        backIcon = (ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Spezialitaet_Gerichte_Activity.this, VietnamesichesKueche_Activity.class);
                startActivity(backIcon);
            }
        });

        banhmithitheonuongImg = (ImageView) findViewById(R.id.bild_banhmithitheonuong);
        banhmithitheonuongImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_BanhMiThitHeoNuong_Activity.class);
                startActivity(intent);
            }
        });

        banhxeoImg = (ImageView) findViewById(R.id.bild_banhxeo);
        banhxeoImg.setOnClickListener((View view) -> {
            Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_BanhXeo_Activity.class);
            startActivity(intent);
        });

        goicuonImg = (ImageView) findViewById(R.id.bild_goicuon);
        goicuonImg.setOnClickListener((View view) -> {
            Intent miengaIntent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_GoiCuon_Activity.class);
            startActivity(miengaIntent);
        });

        bokhoImg = (ImageView) findViewById(R.id.bild_bokho);
        bokhoImg.setOnClickListener((View view) -> {
            Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_BoKho_Activity.class);
            startActivity(intent);
        });

        lauhaisanImg = (ImageView) findViewById(R.id.bild_lauhaisan);
        lauhaisanImg.setOnClickListener((View view) -> {
            Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_LauHaiSan_Activity.class);
            startActivity(intent);
        });

        goigaImg = (ImageView) findViewById(R.id.bild_goiga);
        goigaImg.setOnClickListener((View view) -> {
            Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_ChaGio_Activity.class);
            startActivity(intent);
        });

        chagiochayImg = (ImageView) findViewById(R.id.bild_chagiochay);
        chagiochayImg.setOnClickListener((View view) -> {
            Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_Vege_ChaGioChay_Activity.class);
            startActivity(intent);
        });

        goicuonchayImg = (ImageView) findViewById(R.id.bild_goicuonchay);
        goicuonchayImg.setOnClickListener((View view) -> {
            Intent intent = new Intent(Spezialitaet_Gerichte_Activity.this, Spezialitaet_Vege_GoiCuonChay_Activity.class);
            startActivity(intent);
        });
    }
}
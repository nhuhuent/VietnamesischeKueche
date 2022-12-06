package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_Gerichte_Activity extends AppCompatActivity {

    ImageView comtamImg, gakhosaotImg, dauhurimtomImg, boluclacImg, comgaluocImg, comchienduongchauImg,
    dauhusotcaImg, comvitquayImg, canhchuanamchayImg;

    ImageView backIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_gerichte);

        // back button
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true); or:
        backIcon =(ImageView) findViewById(R.id.left_back_icon_1);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_Gerichte_Activity.this, VietnamesichesKueche_Activity.class);
                startActivity(backIcon);
            }
        });

        // events for Images
        comtamImg = (ImageView) findViewById(R.id.bild_comtam);
        comtamImg.setOnClickListener((View view) -> {
                Intent comtamIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComTam.class);
                startActivity(comtamIntent);
        });

        gakhosaotImg = (ImageView) findViewById(R.id.bild_gakhosaot);
        gakhosaotImg.setOnClickListener((View view) -> {
                Intent gakhosaotIntent = new Intent(Reis_Gerichte_Activity.this, Reis_GaKhoSaOt.class);
                startActivity(gakhosaotIntent);
        });

        dauhurimtomImg = (ImageView) findViewById(R.id.bild_dauhurimtom);
        dauhurimtomImg.setOnClickListener((View view) -> {
                Intent dauhurimtomIntent = new Intent(Reis_Gerichte_Activity.this, Reis_DauHuTomRim.class);
                startActivity(dauhurimtomIntent);
        });


        comgaluocImg = (ImageView) findViewById(R.id.bild_comgaluoc);
        comgaluocImg.setOnClickListener((View view) -> {
                Intent comgaluocIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComGaLuoc.class);
                startActivity(comgaluocIntent);
        });

        comchienduongchauImg = (ImageView) findViewById(R.id.bild_comchienduongchau);
        comchienduongchauImg.setOnClickListener((View view) -> {
                Intent comchienduongchauIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComChienDuongChau.class);
                startActivity(comchienduongchauIntent);
        });

        dauhusotcaImg = (ImageView) findViewById(R.id.bild_dauhusotca);
        dauhusotcaImg.setOnClickListener((View view) -> {
                Intent dauhusotcaIntent = new Intent(Reis_Gerichte_Activity.this, Reis_DauHuSotCa.class);
                startActivity(dauhusotcaIntent);
        });

        comvitquayImg = (ImageView) findViewById(R.id.bild_comvitquay);
        comvitquayImg.setOnClickListener((View view) -> {
                Intent comvitquayIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComVitQuay.class);
                startActivity(comvitquayIntent);

        });

        canhchuanamchayImg = (ImageView) findViewById(R.id.bild_canhchuanamchay);
        canhchuanamchayImg.setOnClickListener((View view) -> {
                Intent canhchuanamchayIntent = new Intent(Reis_Gerichte_Activity.this, Reis_CanhChuaNamChay.class);
                startActivity(canhchuanamchayIntent);
        });

        boluclacImg = (ImageView) findViewById(R.id.bild_boluclac);
        boluclacImg.setOnClickListener((View view) -> {
            Intent canhchuanamchayIntent = new Intent(Reis_Gerichte_Activity.this, Reis_BoLucLac.class);
            startActivity(canhchuanamchayIntent);
        });
    }
}
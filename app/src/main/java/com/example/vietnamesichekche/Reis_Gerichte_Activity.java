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
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
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
                Intent comtamIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComTam_Activity.class);
                startActivity(comtamIntent);
        });

        gakhosaotImg = (ImageView) findViewById(R.id.bild_gaxaosaot);
        gakhosaotImg.setOnClickListener((View view) -> {
                Intent gakhosaotIntent = new Intent(Reis_Gerichte_Activity.this, Reis_GaXaoSaOt_Activity.class);
                startActivity(gakhosaotIntent);
        });

        comgaluocImg = (ImageView) findViewById(R.id.bild_comgaluoc);
        comgaluocImg.setOnClickListener((View view) -> {
                Intent comgaluocIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComGaLuoc_Activity.class);
                startActivity(comgaluocIntent);
        });

        comchienduongchauImg = (ImageView) findViewById(R.id.bild_comchienduongchau);
        comchienduongchauImg.setOnClickListener((View view) -> {
                Intent comchienduongchauIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComChienDuongChau_Activity.class);
                startActivity(comchienduongchauIntent);
        });

        dauhusotcaImg = (ImageView) findViewById(R.id.bild_dauhusotca);
        dauhusotcaImg.setOnClickListener((View view) -> {
                Intent dauhusotcaIntent = new Intent(Reis_Gerichte_Activity.this, Reis_Vege_DauHuSotCa_Activity.class);
                startActivity(dauhusotcaIntent);
        });

        comvitquayImg = (ImageView) findViewById(R.id.bild_comvitquay);
        comvitquayImg.setOnClickListener((View view) -> {
                Intent comvitquayIntent = new Intent(Reis_Gerichte_Activity.this, Reis_ComVitQuay_Activity.class);
                startActivity(comvitquayIntent);

        });

        canhchuanamchayImg = (ImageView) findViewById(R.id.bild_canhchuanamchay);
        canhchuanamchayImg.setOnClickListener((View view) -> {
                Intent canhchuanamchayIntent = new Intent(Reis_Gerichte_Activity.this, Reis_Vege_CanhChuaNamChay_Activity.class);
                startActivity(canhchuanamchayIntent);
        });

        boluclacImg = (ImageView) findViewById(R.id.bild_boluclac);
        boluclacImg.setOnClickListener((View view) -> {
            Intent canhchuanamchayIntent = new Intent(Reis_Gerichte_Activity.this, Reis_BoLucLac_Activity.class);
            startActivity(canhchuanamchayIntent);
        });
    }
}
package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_Gerichte extends AppCompatActivity {

    ImageView comtamImg, gakhosaotImg, dauhurimtomImg, boluclacImg, comgaluocImg, comchienduongchauImg,
    dauhusotcaImg, comvitquayImg, canhchuanamchayImg;

    ImageView backIcon;

    TextView comtam, gakhosaot, dauhutomrim, boluclac, comgaluoc, comchienduongchau,
    dauhusotca, comvitquay, canhchuanamchay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reis_activity);

        // back button
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true); or:
        backIcon =(ImageView) findViewById(R.id.left_back_icon_1);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_Gerichte.this, AllRecipe_Activity.class);
                startActivity(backIcon);
            }
        });

        //events for TextView
        comtam =(TextView) findViewById(R.id.reis_comtam);
        comtam.setOnClickListener((View view) -> {
                Intent comtamIntent = new Intent(Reis_Gerichte.this, Reis_ComTam.class);
                startActivity(comtamIntent);
        });

        gakhosaot =(TextView) findViewById(R.id.reis_gakhosaot);
        gakhosaot.setOnClickListener((View view) -> {
                Intent gakhosaotIntent = new Intent(Reis_Gerichte.this, Reis_GaKhoSaOt.class);
                startActivity(gakhosaotIntent);
        });

        dauhutomrim =(TextView) findViewById(R.id.reis_dauhutomrim);
        dauhutomrim.setOnClickListener((View view) -> {
                Intent dauhutomrimIntent = new Intent(Reis_Gerichte.this, Reis_DauHuTomRim.class);
                startActivity(dauhutomrimIntent);
        });

        boluclac =(TextView) findViewById(R.id.reis_boluclac);
        boluclac.setOnClickListener((View view) -> {
                Intent boluclacIntent = new Intent(Reis_Gerichte.this, Reis_BoLucLac.class);
                startActivity(boluclacIntent);
        });

        comgaluoc =(TextView) findViewById(R.id.reis_comgaluoc);
        comgaluoc.setOnClickListener((View view) -> {
                Intent comgaluocIntent = new Intent(Reis_Gerichte.this, Reis_ComGaLuoc.class);
                startActivity(comgaluocIntent);
        });

        comchienduongchau =(TextView) findViewById(R.id.reis_comchienduongchau);
        comchienduongchau.setOnClickListener((View view) -> {
                Intent comchienduongchauIntent = new Intent(Reis_Gerichte.this, Reis_ComChienDuongChau.class);
                startActivity(comchienduongchauIntent);
        });

        dauhusotca =(TextView) findViewById(R.id.reis_dauhusotca);
        dauhusotca.setOnClickListener((View view) -> {
                Intent dauhusotcaIntent = new Intent(Reis_Gerichte.this, Reis_DauHuSotCa.class);
                startActivity(dauhusotcaIntent);
        });

        comvitquay =(TextView) findViewById(R.id.reis_comvitquay);
        comvitquay.setOnClickListener((View view) -> {
                Intent comvitquayIntent = new Intent(Reis_Gerichte.this, Reis_ComVitQuay.class);
                startActivity(comvitquayIntent);
        });

        canhchuanamchay =(TextView) findViewById(R.id.reis_canhchuanamchay);
        canhchuanamchay.setOnClickListener((View view) -> {
                Intent canhchuanamchayIntent = new Intent(Reis_Gerichte.this, Reis_CanhChuaNamChay.class);
                startActivity(canhchuanamchayIntent);
        });

        // events for Images
        comtamImg = (ImageView) findViewById(R.id.bild_comtam);
        comtamImg.setOnClickListener((View view) -> {
                Intent comtamIntent = new Intent(Reis_Gerichte.this, Reis_ComTam.class);
                startActivity(comtamIntent);
        });

        gakhosaotImg = (ImageView) findViewById(R.id.bild_gakhosaot);
        gakhosaotImg.setOnClickListener((View view) -> {
                Intent gakhosaotIntent = new Intent(Reis_Gerichte.this, Reis_GaKhoSaOt.class);
                startActivity(gakhosaotIntent);
        });

        dauhurimtomImg = (ImageView) findViewById(R.id.bild_dauhurimtom);
        dauhurimtomImg.setOnClickListener((View view) -> {
                Intent dauhurimtomIntent = new Intent(Reis_Gerichte.this, Reis_DauHuTomRim.class);
                startActivity(dauhurimtomIntent);
        });

        boluclacImg = (ImageView) findViewById(R.id.bild_boluclac);
        boluclacImg.setOnClickListener((View view) -> {
                Intent dauhurimtomIntent = new Intent(Reis_Gerichte.this, Reis_BoLucLac.class);
                startActivity(dauhurimtomIntent);
        });

        comgaluocImg = (ImageView) findViewById(R.id.bild_comgaluoc);
        comgaluocImg.setOnClickListener((View view) -> {
                Intent comgaluocIntent = new Intent(Reis_Gerichte.this, Reis_ComGaLuoc.class);
                startActivity(comgaluocIntent);
        });

        comchienduongchauImg = (ImageView) findViewById(R.id.bild_comchienduongchau);
        comchienduongchauImg.setOnClickListener((View view) -> {
                Intent comchienduongchauIntent = new Intent(Reis_Gerichte.this, Reis_ComChienDuongChau.class);
                startActivity(comchienduongchauIntent);
        });

        dauhusotcaImg = (ImageView) findViewById(R.id.bild_dauhusotca);
        dauhusotcaImg.setOnClickListener((View view) -> {
                Intent dauhusotcaIntent = new Intent(Reis_Gerichte.this, Reis_DauHuSotCa.class);
                startActivity(dauhusotcaIntent);
        });

        comvitquayImg = (ImageView) findViewById(R.id.bild_comvitquay);
        comvitquayImg.setOnClickListener((View view) -> {
                Intent comvitquayIntent = new Intent(Reis_Gerichte.this, Reis_ComVitQuay.class);
                startActivity(comvitquayIntent);

        });

        canhchuanamchayImg = (ImageView) findViewById(R.id.bild_canhchuanamchay);
        canhchuanamchayImg.setOnClickListener((View view) -> {
                Intent canhchuanamchayIntent = new Intent(Reis_Gerichte.this, Reis_CanhChuaNamChay.class);
                startActivity(canhchuanamchayIntent);
        });
    }
}
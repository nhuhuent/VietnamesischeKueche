package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Vegetarisch_Gerichte_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView canhchuanamchayImg, dauhusotcaImg, mienchayraucuImg, mienchayxaoImg, chagiochayImg, goicuonchayImg;
    Intent intent;
    Button onlineRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegatarisch_gerichte);

        onlineRecipe =(Button) findViewById(R.id.vegetarisch_button);
        onlineRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onlineIntent = new Intent(Vegetarisch_Gerichte_Activity.this, OnlineRecipes_Activity.class);
                onlineIntent.putExtra("Vegetarisch_Gerichte_Activity", 4);
                startActivity(onlineIntent);
            }
        });

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Vegetarisch_Gerichte_Activity.this, VietnamesichesKueche_Activity.class);
                startActivity(intent);
            }
        });

        canhchuanamchayImg = (ImageView) findViewById(R.id.bild_canhchuanamchay);
        canhchuanamchayImg.setOnClickListener((View view) -> {
            intent = new Intent(Vegetarisch_Gerichte_Activity.this, Reis_Vege_CanhChuaNamChay_Activity.class);
            intent.putExtra("chooseActivity",2 );
            startActivity(intent);
        });

        dauhusotcaImg = (ImageView) findViewById(R.id.bild_dauhusotca);
        dauhusotcaImg.setOnClickListener((View view) -> {
            intent = new Intent(Vegetarisch_Gerichte_Activity.this, Reis_Vege_DauHuSotCa_Activity.class);
            intent.putExtra("chooseActivity",2 );
            startActivity(intent);
        });

        mienchayraucuImg = (ImageView) findViewById(R.id.bild_mienchayraucu);
        mienchayraucuImg.setOnClickListener((View view) -> {
            intent = new Intent(Vegetarisch_Gerichte_Activity.this, Nudeln_Vege_MienChayRauCu_Activity.class);
            intent.putExtra("chooseActivity",2 );
            startActivity(intent);
        });

        mienchayxaoImg = (ImageView) findViewById(R.id.bild_mienchayxao);
        mienchayxaoImg.setOnClickListener((View view) -> {
            intent = new Intent(Vegetarisch_Gerichte_Activity.this, Nudeln_Vege_MienChayXao_Activity.class);
            intent.putExtra("chooseActivity",2 );
            startActivity(intent);
        });

        chagiochayImg = (ImageView) findViewById(R.id.bild_chagiochay);
        chagiochayImg.setOnClickListener((View view) -> {
            intent = new Intent(Vegetarisch_Gerichte_Activity.this, Spezialitaet_Vege_ChaGioChay_Activity.class);
            intent.putExtra("chooseActivity",2 );
            startActivity(intent);
        });

        goicuonchayImg = (ImageView) findViewById(R.id.bild_goicuonchay);
        goicuonchayImg.setOnClickListener((View view) -> {
            intent = new Intent(Vegetarisch_Gerichte_Activity.this, Spezialitaet_Vege_GoiCuonChay_Activity.class);
            intent.putExtra("chooseActivity",2 );
            startActivity(intent);
        });
    }
}
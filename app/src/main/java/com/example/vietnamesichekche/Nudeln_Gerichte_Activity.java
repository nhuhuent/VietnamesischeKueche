package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Nudeln_Gerichte_Activity extends AppCompatActivity {

    ImageView phoboImg, hutieutomthitImg, miengaImg, miquangImg, bunbohueImg, bunthitnuongImg,
            mienchayraucuImg, mienchayxaoImg;

    ImageView backIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nudeln_gerichte);

        // back button
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true); or:
        backIcon = (ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Nudeln_Gerichte_Activity.this, VietnamesichesKueche_Activity.class);
                startActivity(backIcon);
            }
        });

        phoboImg = (ImageView) findViewById(R.id.bild_phobo);
        phoboImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phoboIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_PhoBo_Activity.class);
                startActivity(phoboIntent);
            }
        });

        hutieutomthitImg = (ImageView) findViewById(R.id.bild_hutieutomthit);
        hutieutomthitImg.setOnClickListener((View view) -> {
            Intent hutieutomthitIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_HuTieuTomThit_Activity.class);
            startActivity(hutieutomthitIntent);
        });

        miengaImg = (ImageView) findViewById(R.id.bild_mienga);
        miengaImg.setOnClickListener((View view) -> {
            Intent miengaIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_MienGa_Activity.class);
            startActivity(miengaIntent);
        });

        miquangImg = (ImageView) findViewById(R.id.bild_miquang);
        miquangImg.setOnClickListener((View view) -> {
            Intent miquangIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_MiQuang_Activity.class);
            startActivity(miquangIntent);
        });

        bunbohueImg = (ImageView) findViewById(R.id.bild_bunbohue);
        bunbohueImg.setOnClickListener((View view) -> {
            Intent bunbohueIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_BunBoHue_Activity.class);
            startActivity(bunbohueIntent);
        });

        bunthitnuongImg = (ImageView) findViewById(R.id.bild_buntihtnuong);
        bunthitnuongImg.setOnClickListener((View view) -> {
            Intent bunthitnuongIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_BunThitNuong_Activity.class);
            startActivity(bunthitnuongIntent);
        });

        mienchayraucuImg = (ImageView) findViewById(R.id.bild_mienchayraucu);
        mienchayraucuImg.setOnClickListener((View view) -> {
            Intent mienchayraucuIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_Vege_MienChayRauCu_Activity.class);
            startActivity(mienchayraucuIntent);
        });

        mienchayxaoImg = (ImageView) findViewById(R.id.bild_mienchayxao);
        mienchayxaoImg.setOnClickListener((View view) -> {
            Intent mienchayxaoIntent = new Intent(Nudeln_Gerichte_Activity.this, Nudeln_Vege_MienChayXao_Activity.class);
            startActivity(mienchayxaoIntent);
        });

    }
}
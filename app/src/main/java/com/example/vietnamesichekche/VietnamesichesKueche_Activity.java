package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VietnamesichesKueche_Activity extends AppCompatActivity {

    Button reisButton, nudelnButton, spezialitaetButton, vegetarischButton;
    ImageView searchIcon;
    ImageView reisImg, nudelnImg, spezialitaetImg, vegetarischImg;
    Reis_ComTam_Activity reisComTamActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vietnamesiche_kueche);

        searchIcon = (ImageView) findViewById(R.id.right_search_icon);
        searchIcon.setOnClickListener((View view) -> {
            Intent searchIcon = new Intent(VietnamesichesKueche_Activity.this, Search_Filter_Activity.class);
            startActivity(searchIcon);
        });

        reisImg =(ImageView) findViewById(R.id.reisImg);
        reisImg.setOnClickListener((View view) -> {
                Intent reisIntent = new Intent(VietnamesichesKueche_Activity.this, Reis_Gerichte_Activity.class);
                startActivity(reisIntent);
        });

        nudelnImg =(ImageView) findViewById(R.id.nudelnImg);
        nudelnImg.setOnClickListener((View view) -> {
                Intent nudelnIntent = new Intent(VietnamesichesKueche_Activity.this, Nudeln_Gerichte_Activity.class);
                startActivity(nudelnIntent);
        });

        spezialitaetImg =(ImageView) findViewById(R.id.spezialitaetImg);
        spezialitaetImg.setOnClickListener((View view) -> {
                Intent spezialitaetIntent = new Intent(VietnamesichesKueche_Activity.this, Spezialitaet_Gerichte_Activity.class);
                startActivity(spezialitaetIntent);
        });

        vegetarischImg =(ImageView) findViewById(R.id.vegetarischImg);
        vegetarischImg.setOnClickListener((View view) -> {
            Intent vegetarischIntent = new Intent(VietnamesichesKueche_Activity.this, Vegetarisch_Gerichte_Activity.class);
            startActivity(vegetarischIntent);
        });

        reisButton = (Button) findViewById(R.id.reisButton);
        reisButton.setOnClickListener((View view) ->{
            Intent reisIntentButton = new Intent(VietnamesichesKueche_Activity.this, Reis_Gerichte_Activity.class);
            startActivity(reisIntentButton);
        });

        spezialitaetButton = findViewById(R.id.spezialitaetButton);
        spezialitaetButton.setOnClickListener((View view) -> {
            Intent spezialitaetIntentButton = new Intent(VietnamesichesKueche_Activity.this, Spezialitaet_Gerichte_Activity.class);
            startActivity(spezialitaetIntentButton);
        });

        nudelnButton = findViewById(R.id.nudelnButton);
        nudelnButton.setOnClickListener((View view) -> {
            Intent nudelnIntentButton = new Intent(VietnamesichesKueche_Activity.this, Nudeln_Gerichte_Activity.class);
            startActivity(nudelnIntentButton);
        });

        vegetarischButton = findViewById(R.id.vegetarischButton);
        vegetarischButton.setOnClickListener((View view) -> {
            Intent vegetarischIntentButton = new Intent(VietnamesichesKueche_Activity.this, Vegetarisch_Gerichte_Activity.class);
            startActivity(vegetarischIntentButton);
        });
    }

    // search Machine: onCreateOptionsMenu + onOptionsItemSelected
    // add search icon to ActionBar
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // to listen for item clicks in menu, id action_search in main_menu.xml
   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Intent intentThree = new Intent(VietnamesichesKueche_Activity.this, Search_Activity.class);
                startActivity(intentThree);
                break;
                    }
        return super.onOptionsItemSelected(item);
                }*/
}



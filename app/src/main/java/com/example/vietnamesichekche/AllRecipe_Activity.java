package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AllRecipe_Activity extends AppCompatActivity {

    Button reisButton, nudelnButton, spezialitaetButton, vegetarischButton;
    ImageView searchIcon;
    ImageView reisImg, nudelnImg, spezialitaetImg, vegetarischImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_recipe_activity);

        reisImg =(ImageView) findViewById(R.id.reisImg);
        reisImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reisIntent = new Intent(AllRecipe_Activity.this, Reis_Gerichte.class);
                startActivity(reisIntent);
            }
        });

        nudelnImg =(ImageView) findViewById(R.id.nudelnImg);
        nudelnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntent = new Intent(AllRecipe_Activity.this, Nudeln_Gerichte.class);
                startActivity(nudelnIntent);
            }
        });

        spezialitaetImg =(ImageView) findViewById(R.id.spazialitaetImg);
        spezialitaetImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spezialitaetIntent = new Intent(AllRecipe_Activity.this, Spezialitaet_Gerichte.class);
                startActivity(spezialitaetIntent);
            }
        });

        vegetarischImg =(ImageView) findViewById(R.id.vegetarischImg);
        vegetarischImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vegetarischIntent = new Intent(AllRecipe_Activity.this, Vegatarisch_Gerichte.class);
                startActivity(vegetarischIntent);
            }
        });

        searchIcon = (ImageView) findViewById(R.id.right_search_icon);
        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIcon = new Intent(AllRecipe_Activity.this, Search_Activity.class);
                startActivity(searchIcon);
            }
        });

        reisButton = (Button) findViewById(R.id.reisButton);
        reisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reisIntentButton = new Intent(AllRecipe_Activity.this, Reis_Gerichte.class);
                startActivity(reisIntentButton);
            }
        });

        spezialitaetButton = findViewById(R.id.spezialitaetButton);
        spezialitaetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntentButton = new Intent(AllRecipe_Activity.this, Spezialitaet_Gerichte.class);
                startActivity(nudelnIntentButton);
            }
        });

        nudelnButton = findViewById(R.id.nudelnButton);
        nudelnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntentButton = new Intent(AllRecipe_Activity.this, Nudeln_Gerichte.class);
                startActivity(nudelnIntentButton);
            }
        });

        vegetarischButton = findViewById(R.id.vegetarischButton);
        vegetarischButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntentButton = new Intent(AllRecipe_Activity.this, Vegatarisch_Gerichte.class);
                startActivity(nudelnIntentButton);
            }
        });


    }

    // search Machine: onCreateOptionsMenu + onOptionsItemSelected
    // add search icon to ActionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // to listen for item clicks in menu
   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Intent intentThree = new Intent(AllRecipe_Activity.this, Search_Activity.class);
                startActivity(intentThree);
                break;
                    }
        return super.onOptionsItemSelected(item);
                }
}



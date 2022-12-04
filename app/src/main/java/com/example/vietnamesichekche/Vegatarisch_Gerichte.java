package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vegatarisch_Gerichte extends AppCompatActivity {

    ImageView backIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegatarisch_activity);

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon_4);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Vegatarisch_Gerichte.this, AllRecipe_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Spezialitaet_BanhXeo_Activity extends AppCompatActivity {

    ImageView backIcon;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spezialitaet_banh_xeo);

        intent = getIntent();

        // back button
        backIcon = (ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Spezialitaet_BanhXeo_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Spezialitaet_BanhXeo_Activity.this, Spezialitaet_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });
    }
}
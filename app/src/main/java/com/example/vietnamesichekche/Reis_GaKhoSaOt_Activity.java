package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_GaKhoSaOt_Activity extends AppCompatActivity {

    ImageView gakhosaotImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_ga_kho_sa_ot);

        // back button
        gakhosaotImg=(ImageView) findViewById(R.id.left_back_2);
        gakhosaotImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_GaKhoSaOt_Activity.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
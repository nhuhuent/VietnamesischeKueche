package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_ComVitQuay extends AppCompatActivity {

    ImageView comvitquayImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reis_com_vit_quay);

        // back button
        comvitquayImg =(ImageView) findViewById(R.id.left_back_9);
        comvitquayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_ComVitQuay.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
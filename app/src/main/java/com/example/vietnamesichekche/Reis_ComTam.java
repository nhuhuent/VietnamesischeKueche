package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_ComTam extends AppCompatActivity {

    ImageView comtamImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reis_com_tam);

        // back button
        comtamImg =(ImageView) findViewById(R.id.left_back_1);
        comtamImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_ComTam.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
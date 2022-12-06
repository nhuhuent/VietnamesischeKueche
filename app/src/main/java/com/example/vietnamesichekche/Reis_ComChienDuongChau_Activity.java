package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_ComChienDuongChau_Activity extends AppCompatActivity {

    ImageView comchienduongchauImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_com_chien_duong_chau);

        // back button
        comchienduongchauImg =(ImageView) findViewById(R.id.left_back_6);
        comchienduongchauImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_ComChienDuongChau_Activity.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
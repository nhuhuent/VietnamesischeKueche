package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_CanhChuaNamChay_Activity extends AppCompatActivity {

    ImageView canhchuanamchayImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_canh_chua_nam_chay);

        // back button
        canhchuanamchayImg =(ImageView) findViewById(R.id.left_back_8);
        canhchuanamchayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_CanhChuaNamChay_Activity.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}
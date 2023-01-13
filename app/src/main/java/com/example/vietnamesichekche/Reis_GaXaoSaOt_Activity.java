package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_GaXaoSaOt_Activity extends AppCompatActivity {

    ImageView backIcon;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_ga_kho_sa_ot);

        intent = getIntent();

        // back button
        backIcon=(ImageView) findViewById(R.id.left_back_2);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_GaXaoSaOt_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Reis_GaXaoSaOt_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });
    }
}
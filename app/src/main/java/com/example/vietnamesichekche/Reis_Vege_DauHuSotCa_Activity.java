package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_Vege_DauHuSotCa_Activity extends AppCompatActivity {

    ImageView backIcon;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_vege_dau_hu_sot_ca);

        intent = getIntent();

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_7);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_Vege_DauHuSotCa_Activity.this, Search_Filter_Activity.class);
                }else if (intent.getIntExtra("chooseActivity", 0) == 2) {
                    intent = new Intent(Reis_Vege_DauHuSotCa_Activity.this, Vegatarisch_Gerichte_Activity.class);
                } else {
                    intent = new Intent(Reis_Vege_DauHuSotCa_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });
    }
}
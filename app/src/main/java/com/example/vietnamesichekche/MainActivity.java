package com.example.vietnamesichekche;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // fullscreen to do
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Automatically Change Activity after Few Seconds
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intentOne = new Intent(MainActivity.this, VietnamesichesKueche_Activity.class);
                startActivity(intentOne);
            }
        }, 2000);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.banhxeo_lasen3);
    }

}

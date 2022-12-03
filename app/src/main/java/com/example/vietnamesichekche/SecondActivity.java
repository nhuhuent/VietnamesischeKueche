package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SecondActivity extends AppCompatActivity {
    Button reisButton;
    Button nudelnButton;
    Button spezialitaetButton;
    Button vegetarischButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        reisButton = (Button) findViewById(R.id.reisButton);
        reisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reisIntent = new Intent(SecondActivity.this, Reis_Activity.class);
                startActivity(reisIntent);
            }
        });

        spezialitaetButton = findViewById(R.id.spezialitaetButton);
        spezialitaetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntent = new Intent(SecondActivity.this, Spezialitaet_Activity.class);
                startActivity(nudelnIntent);
            }
        });

        nudelnButton = findViewById(R.id.nudelnButton);
        nudelnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntent = new Intent(SecondActivity.this, Nudeln_Activity.class);
                startActivity(nudelnIntent);
            }
        });

        vegetarischButton = findViewById(R.id.vegetarischButton);
        vegetarischButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nudelnIntent = new Intent(SecondActivity.this, Vegatarisch_Activity.class);
                startActivity(nudelnIntent);
            }
        });


    }

    // search Machine: onCreateOptionsMenu + onOptionsItemSelected
    // add search icon to ActionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // to listen for item clicks in menu
   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Intent intentThree = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intentThree);
                break;
                    }
        return super.onOptionsItemSelected(item);
                }
}



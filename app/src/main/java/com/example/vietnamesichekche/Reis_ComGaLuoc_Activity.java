package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_ComGaLuoc_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView comgaluoc_f1_1_Img, comgaluoc_f2_1_Img;
    TextView comgaluoc_dauer, comgaluoc_schwierigkeitsgrad, comgaluoc_rezept, comgaluoc_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_com_ga_luoc);

        intent = getIntent();

        comgaluoc_f1_1_Img = (ImageView) findViewById(R.id.reis_comgaluoc_f1_1);
        comgaluoc_f2_1_Img = (ImageView) findViewById(R.id.reis_comgaluoc_f2_1);

        comgaluoc_dauer = (TextView) findViewById(R.id.comgaluoc_dauer);
        comgaluoc_schwierigkeitsgrad = (TextView) findViewById(R.id.comgaluoc_schwierigkeitsgrad);
        comgaluoc_rezept = (TextView) findViewById(R.id.comgaluoc_rezept);
        comgaluoc_zutaten = (TextView) findViewById(R.id.comgaluoc_zutaten);

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_ComGaLuoc_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Reis_ComGaLuoc_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });

        String inhalte =
                "   Kategorie: Reis, Fleisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tMaishuhn: 1/2\n" +
                        "       •\tReis: 130 g\n" +
                        "       •\tTomaten: 2\n" +
                        "       •\tGurke: 1\n" +
                        "       •\tVietnamesischer Koriander\n" +
                        "         (Rau râm): 2 TL\n" +
                        "       •\tSalz: true\n" +
                        "       •\tFischsauce: true\n" +
                        "       •\tLimette: true\n" +
                        "       •\tZucker: true\n" +
                        "       •\tPeperoni: true\n" +
                        "       •\tKurkuma Pulver: true\n\n" +
                        "Anleitung:\n" +
                        "1. In das Kochwasser ein paar Scheiben Ingwer, 1/2 TL Salz, 1 TL Zucker und 1/4 TL Kurkuma geben. Das Huhn hinzugeben und für 30 Minuten kochen. Danach das Huhn in kaltes Wasser legen, damit die Hühnerhaut zäh wird.\n\n" +
                        "2. 1 Schälchen (ca. 300 g) Reis mit Wasser waschen. Zum Kochen 1 ½ Schälchen der vorher gekochten Hühnerbrühe verwenden. Hinzu kommt 1/2 TL Salz für ca. 25 Minuten kochen.\n\n" +
                        "3. Fischsauce, Zucker und Wasser in Verhältnis 3:3:3 mittlere Hitze einstellen und in einem Topf kochen.\n\n" +
                        "4. Die Peperoni mit in die Sauce geben. Bis sie weich werden, Rausnehmen und klein hacken.\n\n" +
                        "5. In eine Pfanne 2 Knoblauchzehe mit Speiseöl goldbraun braten, danach die gehackten Peperoni mit 1 EL Zucker und 1 EL Essig für 5 Minuten erhitzen und mit in Topf der Fischsauce rühren.\n\n" +
                        "6. Dann gießen Sie die Sauce in eine Schüssel, nach Geschmack wird die hinzugepresst.\n\n" +
                        "7. Reis und Huhn auf einen Teller legen zusammen mit Tomaten, Gurken und vietnamesischer Koriander (Rau râm)\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        comgaluoc_zutaten.setText(spannableString);
    }
}
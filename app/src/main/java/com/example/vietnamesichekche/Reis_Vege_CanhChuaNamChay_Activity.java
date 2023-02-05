package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_Vege_CanhChuaNamChay_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView canhchuanamchay_f1_1_Img, canhchuanamchay_f2_1_Img, canhchuanamchay_f3_1_Img;
    TextView canhchuanamchay_dauer, canhchuanamchay_schwierigkeitsgrad, canhchuanamchay_rezept, canhchuanamchay_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_vege_canh_chua_nam_chay);

        intent = getIntent();

        canhchuanamchay_f1_1_Img = (ImageView) findViewById(R.id.reis_canhchuanamchay_f1_1);
        canhchuanamchay_f2_1_Img = (ImageView) findViewById(R.id.reis_canhchuanamchay_f2_1);
        canhchuanamchay_f3_1_Img = (ImageView) findViewById(R.id.reis_canhchuanamchay_f3_1);

        canhchuanamchay_dauer = (TextView) findViewById(R.id.canhchuanamchay_dauer);
        canhchuanamchay_schwierigkeitsgrad = (TextView) findViewById(R.id.canhchuanamchay_schwierigkeitsgrad);
        canhchuanamchay_rezept = (TextView) findViewById(R.id.canhchuanamchay_rezept);
        canhchuanamchay_zutaten = (TextView) findViewById(R.id.canhchuanamchay_zutaten);

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_Vege_CanhChuaNamChay_Activity.this, Search_Filter_Activity.class);
                }else if (intent.getIntExtra("chooseActivity", 0) == 2) {
                    intent = new Intent(Reis_Vege_CanhChuaNamChay_Activity.this, Vegetarisch_Gerichte_Activity.class);
                } else {
                    intent = new Intent(Reis_Vege_CanhChuaNamChay_Activity.this, Reis_Gerichte_Activity.class);
            }
                startActivity(intent);
            }
        });

        String inhalte =
                "   Kategorie: Suppe, Vegetarisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tGebratener Tofu: 100 g\n" +
                        "       •\tTomaten: 80 g\n" +
                        "       •\tNadelpilze: 80 g\n" +
                        "       •\tShiitake Pilze: 50 g\n" +
                        "       •\tAnanas: 50 g\n" +
                        "       •\tGaladium Stängel: 50 g\n" +
                        "       •\tOkra: 50 g\n" +
                        "       •\tZitronensaft: 30 ml\n" +
                        "       •\tWürzpulver: 2 TL\n" +
                        "       •\tZucker: true\n" +
                        "       •\tSalz: true\n" +
                        "       •\tSpeiseöl: true\n" +
                        "       •\tFrühlingszwiebel: true\n" +
                        "       •\tKoriander: true\n" +
                        "       •\tPfeffer: true\n\n" +
                        "Anleitung:\n" +
                        "1. Tofu in Würfel geschnitten und gold braten. Ananas in Scheiben geschnitten. Tomaten in 6 geschnitten.\n\n" +
                        "2. Galadium Stängel, Okra die Stiele entfernen, schräg in Scheiben schneiden.\n\n" +
                        "3. Nadelpilze und Shiitake-Pilze 10 Minuten in gekochtem Wasser einweichen lassen, abspülen und abtropfen.\n\n" +
                        "4. Stellen Sie den Topf auf den Herd, geben Sie 1 EL Speiseöl hinein.\n\n" +
                        "5. Braten Sie die Tomaten und Ananas an, würzen Sie hier 2 TL Würzpulver und 1 EL Zucker. Als nächstes 400ml Wasser in den Topf geben.\n\n" +
                        "6. Wenn die Brühe aufkocht, Tofu, Okra, Galadium, Nadelpilze und Shiitake-Pilze hinzufügen.\n\n" +
                        "7. Warten, bis das Wasser wieder kocht, Zitronensaft eingießen nach Geschmack würzen.\n\n" +
                        "8. Die Suppe wird in einer Schüssel mit Frühlingszwiebel, Koriander und Pfeffer bestreut und serviert.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        canhchuanamchay_zutaten.setText(spannableString);
    }
}
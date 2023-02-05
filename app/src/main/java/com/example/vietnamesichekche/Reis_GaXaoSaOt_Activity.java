package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_GaXaoSaOt_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView gaxaosaot_f1_1_Img, gaxaosaot_f2_1_Img;
    TextView gaxaosaot_dauer, gaxaosaot_schwierigkeitsgrad, gaxaosaot_rezept, gaxaosaot_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_ga_xao_sa_ot);

        intent = getIntent();

        gaxaosaot_f1_1_Img = (ImageView) findViewById(R.id.reis_gaxaosaot_f1_1);
        gaxaosaot_f2_1_Img = (ImageView) findViewById(R.id.reis_gaxaosaot_f2_1);

        gaxaosaot_dauer = (TextView) findViewById(R.id.gaxaosaot_dauer);
        gaxaosaot_schwierigkeitsgrad = (TextView) findViewById(R.id.gaxaosaot_schwierigkeitsgrad);
        gaxaosaot_rezept = (TextView) findViewById(R.id.gaxaosaot_rezept);
        gaxaosaot_zutaten = (TextView) findViewById(R.id.gaxaosaot_zutaten);

        // back button
        backIcon=(ImageView) findViewById(R.id.left_back_icon);
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

        String inhalte =
                "   Kategorie: Reis, Fleisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tMaishuhn: 1/2\n" +
                        "       •\tZitronengras-Stange: 3\n" +
                        "       •\tPeperoni: 1\n" +
                        "       •\tIngwer: true\n" +
                        "       •\tKnoblauch: true\n" +
                        "       •\tRote Zwiebel: true\n" +
                        "       •\tKoriander: true\n" +
                        "       •\tFischsauce: true\n" +
                        "       •\tZucker: true\n" +
                        "       •\tWürzpulver: true\n" +
                        "       •\tSpeiseöl: true\n" +
                        "       •\tPfeffer: true\n\n" +
                        "Anleitung:\n" +
                        "1. Knoblauch, Rote Zwiebel, Ingwer schälen und getrennt zerhacken.\n\n" +
                        "2. Peperoni klein schneiden. Zitronengras in 3 cm Stücke schneiden und mit dem Gerät zerkleinern, in zwei hälfte aufbewahren.\n\n" +
                        "3. Hühnerfleisch in kleinen Stücken trennen.\n\n" +
                        "4. Zu dem Hühnerfleisch kommen die zubereiteten Gewürze: 1 EL Knoblauch, 1 EL Rote Zwiebel und Peperoni.\n\n" +
                        "5. Das Hühnerfleisch wird gewürzt mit 2 EL Zucker, 1 TL Würzpulver, 2 EL Fischsauce, etwas Pfeffer und die Hälfte von Zitronengras, alles gut mischen.\n\n" +
                        "6. Danach im Kühlfach für 30 Minuten legen, damit das Fleisch die Aromen einziehen.\n\n" +
                        "7. Das Speiseöl auf eine Pfanne heizen danach Knoblauch, Rote Zwiebel und die andere Hälfte von Zitronengras goldbraun anbraten.\n\n" +
                        "8. Anschließend kommt hinzu das Hühnerfleisch und ca. 100ml Wasser wenn das Fleisch angebraten hat, evtl. mit Würzpulver nachwürzen.\n\n" +
                        "9. Mit kleine Hitzestufe weiter garen und wenden bis das Wasser abdampft.\n\n" +
                        "10. Das gebratene Hühnerfleisch mit Zitronengras wird mit gekochtem Reis serviert.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        gaxaosaot_zutaten.setText(spannableString);
    }
}
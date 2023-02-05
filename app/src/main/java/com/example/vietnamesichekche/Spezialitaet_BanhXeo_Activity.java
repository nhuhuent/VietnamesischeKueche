package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Spezialitaet_BanhXeo_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView banhxeo_f1_1_Img, banhxeo_f2_1_Img, banhxeo_f3_1_Img, banhxeo_f4_1_Img;
    TextView banhxeo_dauer, banhxeo_schwierigkeitsgrad, banhxeo_rezept, banhxeo_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spezialitaet_banh_xeo);

        intent = getIntent();

        banhxeo_f1_1_Img = (ImageView) findViewById(R.id.spezialitaet_banhxeo_f1_1);
        banhxeo_f2_1_Img = (ImageView) findViewById(R.id.spezialitaet_banhxeo_f2_1);
        banhxeo_f3_1_Img = (ImageView) findViewById(R.id.spezialitaet_banhxeo_f3_1);
        banhxeo_f4_1_Img = (ImageView) findViewById(R.id.spezialitaet_banhxeo_f4_1);

        banhxeo_dauer = (TextView) findViewById(R.id.banhxeo_dauer);
        banhxeo_schwierigkeitsgrad = (TextView) findViewById(R.id.banhxeo_schwierigkeitsgrad);
        banhxeo_rezept = (TextView) findViewById(R.id.banhxeo_rezept);
        banhxeo_zutaten = (TextView) findViewById(R.id.banhxeo_zutaten);

        // back button
        backIcon = (ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Spezialitaet_BanhXeo_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Spezialitaet_BanhXeo_Activity.this, Spezialitaet_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });

        String inhalte =
                "   Kategorie: Fleisch, Garnele,\n" +
                        "                        Spezialität\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tPfannkuchenmehl: 200 g\n" +
                        "       •\tBier (für knuspriger Teig):\n" +
                        "          50 ml\n" +
                        "       •\tGarnelen: 300 g\n" +
                        "       •\tSchweinebauch: 300 g\n" +
                        "       •\tNadelpilze: 300 g\n" +
                        "       •\tZwiebeln: 2\n" +
                        "       •\tPeperonis klein: 2\n" +
                        "       •\tKnoblauchzehen: 4\n" +
                        "       •\tSojasprossen: 400 g\n" +
                        "       •\tSalat: 1/2 Bund\n" +
                        "       •\tBlattsenf (cải bẹ xanh):\n" +
                        "          1/2 Bund\n" +
                        "       •\tMinze: 1/2 Bund\n" +
                        "       •\tMexikanischer Koriander\n" +
                        "          (ngò gai):  1/2 Bund\n" +
                        "       •\tKoriander: 1/2 Bund\n" +
                        "       •\tSchnittlauch: 1/2 Bund\n" +
                        "       •\tWürzpulver: true\n" +
                        "       •\tSalz: true\n" +
                        "       •\tPfeffer: true\n" +
                        "       •\tFischsauce: true\n" +
                        "       •\tEssig: true\n" +
                        "       •\tSpeiseöl: true\n" +
                        "       •\tKurkumapulver: 1/4 TL\n\n" +
                        "Anleitung:\n" +
                        "1. Schweinebauch in dünne Scheibe schneiden.\n\n" +
                        "2. Garnelen schälen und zum Scheinebauch in eine Schüssel geben. Zusammen mischen mit 1 TL Würzpulver und 1/2 TL Pfeffer.\n\n" +
                        "3. Die Zwiebeln längs in dünnen Streifen schneiden.\n\n" +
                        "4. Schnittlauch klein schneiden.\n\n" +
                        "5. Knoblauchzehen und Peperoni klein hacken.\n\n" +
                        "6. Salat, Blattsenf, Sojasprossen, Minze, Koriander und Mexikanischer Koriander waschen und abtropfen lassen.\n\n" +
                        "7. 50 ml Bier mit 300ml Wasser, 200 g Pfannkuchenmehl, 1/4 TL Kurkumapulver und 1/4 TL Salz mischen bis alle Mehlklumpen im Wasser auflöst sind.\n\n" +
                        "8. Danach den geschnittenen Schnittlauch hinzugeben.\n\n" +
                        "9. Für die Dip-Sauce 3 EL Zucker mit 4 EL Fischsauce, 4 EL warme Wasser und 1 EL Zitronensaft in eine kleine Schüssel vermischen.\n\n" +
                        "10. Fügen Sie die gehackten Knoblauchzehen und Peperonis zur Sause hinzu.\n\n" +
                        "11. Stellen Sie die Ölpfanne auf den Herd, wenn das Öl kocht, geben Sie das Fleisch hinein und braten Sie es bei schwacher Hitze.\n\n" +
                        "12. Wenn das Fleisch gegart ist, nehmen Sie es heraus.\n\n" +
                        "13. Geben die Garnelen in die Pfanne und braten Sie sie für ca. 3 Minuten an.\n\n" +
                        "14. Nun werdenen die Pfannkuchen gebraten. Dafür geben Sie 1 EL Öl in eine beschichtete Pfanne und warten Sie, bis das Öl kocht.\n\n" +
                        "15. Gießen Sie die Teigmischung mit einer Suppenkelle in die Pfanne und schwenken Sie den flüssigen Pfannkuchenteig, so dass sich der Teig gleichmäßig auf dem Pfannenboden verteilt.\n\n" +
                        "16. Geben Sie nach ca. 1 Minute die Garnelen, Fleisch, Zwiebeln, Sojasprossen und Nadelpilze hinzu.\n\n" +
                        "17. Anschließend die Pfanne für 1 Minute zugedecken, damit alles gleichmäßig gegart wird.\n\n" +
                        "18. Der Teig soll goldbraun und knussprig sein. Falls der Teig zu dunkel wird und anbrennt, stellen Sie die Hitze etwas zurück.\n\n" +
                        "19. Danach den Pfannkuchen zusammengefalten und rausgenommen.\n\n" +
                        "20. Vietnamesische Pfannkuchen wird zusammen mit Salat, Blattsenf, Minze, Koriander, Mexikanischer Koriander und Dip-Sauce serviert.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
       banhxeo_zutaten.setText(spannableString);
    }
}
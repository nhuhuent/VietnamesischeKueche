package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_BoLucLac_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView boluclac_f1_1_Img, boluclac_f2_1_Img, boluclac_f3_1_Img;
    TextView boluclac_dauer, boluclac_schwierigkeitsgrad, boluclac_rezept, boluclac_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_bo_luc_lac);

        intent = getIntent();

        boluclac_f1_1_Img = (ImageView) findViewById(R.id.reis_boluclac_f1_1);
        boluclac_f2_1_Img = (ImageView) findViewById(R.id.reis_boluclac_f2_1);
        boluclac_f3_1_Img = (ImageView) findViewById(R.id.reis_boluclac_f3_1);

        boluclac_dauer = (TextView) findViewById(R.id.boluclac_dauer);
        boluclac_schwierigkeitsgrad = (TextView) findViewById(R.id.boluclac_schwierigkeitsgrad);
        boluclac_rezept = (TextView) findViewById(R.id.boluclac_rezept);
        boluclac_zutaten = (TextView) findViewById(R.id.boluclac_zutaten);

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_BoLucLac_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Reis_BoLucLac_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });

        String inhalte =
                "   Kategorie: Fleisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tRinderfilet: 300 g\n" +
                        "       •\tRote, gelbe und grüne Paprika:\n" +
                        "          150 g\n" +
                        "       •\tZwiebel: 1\n" +
                        "       •\tSalat: 100 g\n" +
                        "       •\tTomate: 1\n" +
                        "       •\tGurke: 1\n" +
                        "       •\tKoriander: 1/4 Bund\n" +
                        "       •\tZerhackte Knoblauch: 30 g\n" +
                        "       •\tTapiokamehl: 3 g\n" +
                        "       •\tSpeiseöl: true\n" +
                        "       •\tAusternsauce: true\n" +
                        "       •\tZucker: true\n" +
                        "       •\tWürzpulver: true\n" +
                        "       •\tChili-Sauce: true\n" +
                        "       •\tKetchup: true\n" +
                        "       •\tSojasauce: true\n" +
                        "       •\tPfeffer: true\n" +
                        "       •\tDunkle Sojasauce: true\n\n" +
                        "Anleitung:\n" +
                        "1. Rinderfilet in große Würfel schneiden und mit 15 g Speiseöl gleichmäßig marinieren. Dazu 3 g Tapiokamehl vermischt.\n\n" +
                        "2. Zwiebel und Paprika in recheckige Stücke schneiden.\n\n" +
                        "3. Satat waschen und abtropfen lassen.\n\n" +
                        "4. Tomate und Gurke Waschen in Scheiben schneiden.\n\n" +
                        "5. Koriander waschen halbieren und abtropfen.\n\n" +
                        "6. Für die Sauce: In eine Tasse geben: 1 TL Austernsauce, 1 TL Zucker, 1 TL Chili-Sauce, 1 TL Sojasauce, 1 TL Ketchup, 1/2 TL Pfeffer, 1/2 TL Würzpulver, 15 g Speiseöl und vermischen. Zu beachten ist, dass der Zucker sich auflösen sowie andere Gewürze.\n\n" +
                        "7. Stellen Sie die Pfanne auf den Herd und fügen Sie 1 EL Speiseöl, 10 g Bratenbutter hinzu.\n\n" +
                        "8. Dann kommt 15 g gehackter Knoblauch und das Rindfleisch hinein. Zu beachten ist, dass bei starker Hitze schnell umgerührt werden muss.\n\n" +
                        "9. Als nächstes gießen Sie die Hälfte der oben gemachten Sauce hinein und für 1 Minute gleichmäßig umrühren. Danach wird das Ganze in eine große Schüssel gegeben.\n\n" +
                        "10. Stellen Sie eine weitere Pfanne auf den Herd, fügen Sie 1 Esslöffel Speiseöl zusammen mit 10 g Bratenbutter hinzu.\n\n" +
                        "11. Wenn die Butter schmilzt, fügen Sie zuerst die Zwiebel ein und dann die 3 Paprikas und schließlich den Rest der Sauce und gleichmäßig rühren.\n\n" +
                        "12. Zum Schluß das gebratene Rindfleisch hinzu mischen.\n\n" +
                        "13. Das Geschwenktes Rindfleisch wird auf einem Teller mit Salat, in Scheiben geschnittenen Tomaten und Gurken serviert. Dekoriert mit Koriander und mit gemahlenem Pfeffer bestreuen.\n\n" +
                        "14. Passende Beilage: Reis, Brot oder Pommes.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        boluclac_zutaten.setText(spannableString);
}
}
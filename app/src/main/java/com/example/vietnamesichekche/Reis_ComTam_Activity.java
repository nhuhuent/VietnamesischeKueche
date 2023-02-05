package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_ComTam_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView comtam_f1_1_Img, comtam_f2_1_Img, comtam_f3_1_Img;
    TextView comtam_dauer, comtam_schwierigkeitsgrad, comtam_rezept, comtam_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_com_tam);

        intent = getIntent();

        comtam_f1_1_Img = (ImageView) findViewById(R.id.reis_comtam_f1_1);
        comtam_f2_1_Img = (ImageView) findViewById(R.id.reis_comtam_f2_1);
        comtam_f3_1_Img = (ImageView) findViewById(R.id.reis_comtam_f3_1);

        comtam_dauer = (TextView) findViewById(R.id.comtam_dauer);
        comtam_schwierigkeitsgrad = (TextView) findViewById(R.id.comtam_schwierigkeitsgrad);
        comtam_rezept = (TextView) findViewById(R.id.comtam_rezept);
        comtam_zutaten = (TextView) findViewById(R.id.comtam_zutaten);

        // back button
        backIcon = (ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_ComTam_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Reis_ComTam_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }

        });

        String inhalte =
                "   Kategorie: Reis, Fleisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tKotelett: 2 Stk\n" +
                        "       •\tHonig: 2 EL\n" +
                        "       •\tSalz: 1 TL\n" +
                        "       •\tFischsauce: 1 EL\n" +
                        "       •\tAusternsauce: 2 TL\n" +
                        "       •\tSesamöl: 1 TL\n" +
                        "       •\tKnoblauch: true\n" +
                        "       •\tFrühlingszwiebeln: true\n" +
                        "       •\tPfeffer: true\n" +
                        "       •\tGetrocknete Schweineschwarte:\n" +
                        "          50 g\n" +
                        "       •\tGerostet Reispulver: 80 g\n" +
                        "       •\tWürzpulver: true\n" +
                        "       •\tKnoblauchpulver: true\n" +
                        "       •\tZucker: true\n" +
                        "       •\tEier: 3\n" +
                        "       •\tMargeres Schweinehackfleisch:\n" +
                        "          100 g\"\n" +
                        "       •\tGlassnudeln: 50 g\n" +
                        "       •\tZwiebel: 1/4\n" +
                        "       •\tSchwarze Pilz (Woodear):\n" +
                        "          2 Stück\n" +
                        "       •\tSpeiseöl: true\n" +
                        "       •\tLimette: true\n" +
                        "       •\tPeperoni: true\n" +
                        "       •\tKarotte: true\n" +
                        "       •\tWeißer Rettich: true\n" +
                        "       •\tWeißessig: true\n" +
                        "       •\tTomate: true\n" +
                        "       •\tGurken: true\n" +
                        "       •\tGebrochener Reis: true\n\n" +
                        "Anleitung:\n" +
                        "1. Für das Essiggemüse: Karotten und Weißer Rettich schälen, waschen, zu Fasern schneiden und in eine Schüssel geben. 1/4 l Wasser, 1/4 TL Salz, 2 EL Zucker und 1 EL Essig hinzugeben, umrühren und ca. eine Stunde einwirken lassen, danach abtropfen.\n\n" +
                        "2. Für den Gebrochenen Reis: 1 Schälchen (ca. 300 g) gebrochenen Reis mit Wasser waschen. In dem Topf mit dem gewaschenen Reis, 1 ½ Schälchen Wasser dazugeben und ca. 25 Minuten kochen lassen.\n\n" +
                        "3. Nun kommt das gedämpte Hackfleisch Omelett dran.\n\n" +
                        "4. Zwei schwarzen Pilze in heißem Wasser 5 Minuten einweichen lassen. Anschließend waschen und in feine Streifen scheniden.\n\n" +
                        "5. 50g Glassnudeln in warmes Wasser für 10 Minuten einweichen und abtropfen. Danach die Glassnudeln mit einer Schere auf 5 cm kürzen. \n\n" +
                        "6. 1/4 Zwiebel in kleine Würfel schneiden.\n\n" +
                        "7. Schweinehackfleisch, Glassnudeln, Zwiebel und Schwarze Pilz in eine Schüssel geben.\n\n" +
                        "8. Ein Eigelb in ein Schälchen trennen, das Eiweiß mit den 2 ganzen Eiern zu den Hackfleisch Schüssel geben.\n\n" +
                        "9. 1 EL Fischsauce. 1/2 TL Würzpulver, 1/2 TL Zucker, 1/2 TL Pfeffer dazu geben und mischen. Danach in eine geölte Form füllen.\n\n" +
                        "10. Das Hackfleisch Omelett 30 Minuten lang dämpfen lassen. Kurz vor dem Rausnehmen das Eigelb auf die Oberfläche aufstreichen.\n\n" +
                        "11. Für die Schweineschwarte: Die Schweineschwarte in heißem Wasser 2 Minuten kochen lassen und gut abtropfen. Anschließend mit 1/2 TL Knoblauchpulver, 1/2 TL Würzpulver, 1 TL Zucker würzen.\n\n" +
                        "12. Anschließend die Pfanne auf mittlerer Hitze stellen und die Schweineschwarte mit etwas Speiseöl eingeben für 5 Minuten gleichmäßig umrühren.\n\n" +
                        "13. Für die Fischsauce: 50 ml heißes Wasser, 3 EL Zucker, 4 EL Fischsauce und 1 EL Limette kurz aufkochen.\n\n" +
                        "14. Danach die zerkleinerten Peperoni und Knoblauch dazugeben.n.\n\n" +
                        "15. Geölte Frühlingszwiebeln: Das Speiseöl aufheizen und in ein Schälchen mit klein geschnittene Frühlingszwiebeln gießen.\n\n" +
                        "16. Gegrillte Kotellett: Knoblauch und Frühlingszwiebeln klein hacken. Das Fleisch mit Salz, Honig, Austernsauce, Fischsauce, Sesamöl, Pfeffer, Knoblauch und Frühlingszwiebeln marinieren.\n\n" +
                        "17. Die Kotelette grillen, gleichmäßig auf beiden Seiten. Ggf. die Marinade nachpinseln, damit die Kotelette nicht austrocknet.\n\n" +
                        "18. Servieren: Reis, Kotelett und Essiggemüse zusammen mit den geschnittenen Gurken- und Tomatenscheiben werden auf dem Teller serviert.\n\n" +
                        "19. Dazu das geölte Frühlingszwiebeln und die Sauce darauf geben.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        comtam_zutaten.setText(spannableString);
    }
}
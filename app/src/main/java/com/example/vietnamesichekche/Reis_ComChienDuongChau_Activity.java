package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_ComChienDuongChau_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView comchienduongchau_f1_1_Img, comchienduongchau_f2_1_Img;
    TextView comchienduongchau_dauer, comchienduongchau_schwierigkeitsgrad, comchienduongchau_rezept, comchienduongchau_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_com_chien_duong_chau);

        intent = getIntent();

        comchienduongchau_f1_1_Img = (ImageView) findViewById(R.id.reis_comchienduongchau_f1_1);
        comchienduongchau_f2_1_Img = (ImageView) findViewById(R.id.reis_comchienduongchau_f2_1);

        comchienduongchau_dauer = (TextView) findViewById(R.id.comchienduongchau_dauer);
        comchienduongchau_schwierigkeitsgrad = (TextView) findViewById(R.id.comchienduongchau_schwierigkeitsgrad);
        comchienduongchau_rezept = (TextView) findViewById(R.id.comchienduongchau_rezept);
        comchienduongchau_zutaten = (TextView) findViewById(R.id.comchienduongchau_zutaten);


        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_ComChienDuongChau_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Reis_ComChienDuongChau_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });

        String inhalte =
                "   Kategorie: Reis, Garnele\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tGekochter Reis: 2 Schälchen\n" +
                        "       •\tEier: 1 Stk\n" +
                        "       •\tChinesische Wurst: 1 Stk\n" +
                        "       •\tGeschälte Garnelen: 100g\n" +
                        "       •\tKarotte: 1 Stk\n" +
                        "       •\tErbse: 100 g\n" +
                        "       •\tZwiebeln: 1 Stk\n" +
                        "       •\tGewürz: Würzpulver, Zucker,\n" +
                        "          Speiseöl, Sojasauce, Knoblauch,\n" +
                        "          Frühlingszwiebeln, Koriander\n\n " +
                        "Anleitung:\n" +
                        "1. Den Reis vorbereiten: Der gekochte Reis sollte kühl sein und in eine Schüssel gegeben werden, dazu 1 Ei, 1/2 TL Würzpulver, 1/2 TL Zucker und 1/4 TL Salz gut vermischen, 30 Minuten im Kühlschrank stellen, damit der Reis sich nicht verklebt.\n\n" +
                        "2. Ein Zwiebel und 2 Knoblauchzehen schälen und klein schneiden. Frühlingszwiebeln klein schneiden, getrennt legen.\n\n" +
                        "3. Frühlingszwiebeln klein schneiden.\n\n" +
                        "4. Erbsen, Karotte ankochen und in kleinen Würfeln schneiden.\n\n" +
                        "5. Garnelen würzen mit 1/4 TL Salz, 1 EL Fischsauce 1/2 TL Zucker.\n\n" +
                        "6. Das Ei mit 1 TL Fischsauce anrühren.\n\n" +
                        "7. Chinesische Wurst mit Speiseöl braten und in kleinen Würfeln schneiden.\n\n" +
                        "8. Ei, Karottenwürfel und Erbsen.\n\n" +
                        "9. Die Pfanne mit 2 EL Speiseöl erhitzen, 1/3 Portion gehackten Knoblauch und Zwiebel anbraten. Danach das gerührte Ei in die Pfanne gießen, kontinuierlich umrühren, bis es sich löst. Karottenwürfeln und Erbsen hinzugeben und nach dem Braten in eine Schüssel geben.\n\n" +
                        "10. Chinesische Wurst und Garnelen\n\n" +
                        "11. Die gleiche Pfanne wieder verwendet mit 1 EL Speiseöl, 1/3 Portion gehackten Knoblauch und Zwiebel anbraten, dann mit den Chinesische Wurst und Garnelen kurz anbraten. Mit 1 TL Fischsauce, 1 TL Sojasauce, 1/2 TL Zucker, etwas Pfeffer würzen und vom Herd nehmen.\n\n" +
                        "12. Den Reis braten: Die Pfanne erhitzen und 1/3 gehackten Knoblauch und Zwiebel mit 2 EL Speiseöl anbraten.\n\n" +
                        "13. Die Chinesische Wurst und Garnelen zu dem Reis geben, 10 Minuten immer wieder mal umrühren. Danach werden Ei, Karottenwürfel und Erbsen mit Frühlingszwiebeln hinzugegeben und für 1 weitere Minute braten.\n\n" +
                        "14. Der Reis wird auf dem Teller serviert, dekoriert mit Koriander, Salat, Gurke oder Tomate. Passende Sauce hierzu: Sojasauce oder Chili-Sauce.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        comchienduongchau_zutaten.setText(spannableString);
    }
}
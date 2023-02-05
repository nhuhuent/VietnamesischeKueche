package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_Vege_DauHuSotCa_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView dauhusotca_f1_1_Img, dauhusotca_f2_1_Img;
    TextView dauhusotca_dauer, dauhusotca_schwierigkeitsgrad, dauhusotca_rezept, dauhusotca_zutaten;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_vege_dau_hu_sot_ca);

        intent = getIntent();

        dauhusotca_f1_1_Img = (ImageView) findViewById(R.id.reis_dauhusotca_f1_1);
        dauhusotca_f2_1_Img = (ImageView) findViewById(R.id.reis_dauhusotca_f2_1);

        dauhusotca_dauer = (TextView) findViewById(R.id.dauhusotca_dauer);
        dauhusotca_schwierigkeitsgrad = (TextView) findViewById(R.id.dauhusotca_schwierigkeitsgrad);
        dauhusotca_rezept = (TextView) findViewById(R.id.dauhusotca_rezept);
        dauhusotca_zutaten = (TextView) findViewById(R.id.dauhusotca_zutaten);

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_Vege_DauHuSotCa_Activity.this, Search_Filter_Activity.class);
                }else if (intent.getIntExtra("chooseActivity", 0) == 2) {
                    intent = new Intent(Reis_Vege_DauHuSotCa_Activity.this, Vegetarisch_Gerichte_Activity.class);
                } else {
                    intent = new Intent(Reis_Vege_DauHuSotCa_Activity.this, Reis_Gerichte_Activity.class);
                }
                startActivity(intent);
            }
        });

        String inhalte =
                "   Kategorie: Tofu, Vegetarisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n " +
                        "      •\tTofu: 400 g\n" +
                        "       •\tTomaten: 2\n" +
                        "       •\tKnoblauch: 2 Zehen\n" +
                        "       •\tWürzpulver: 1 TL\n" +
                        "       •\tZucker: 1 TL\n" +
                        "       •\tKetchup: 2 TL\n" +
                        "       •\tZerkleinerte Peperoni:\n" +
                        "          1/2 TL\n" +
                        "       •\tWasser: 80 ml\n" +
                        "       •\tFrühlingszwiebeln: 2 stk\n\n" +
                        "Anleitung:\n" +
                        "1. Den Tofu waschen, abtupfen und in rechteckige Würfel schneiden.\n\n" +
                        "2. Die Tomate klein schneiden.\n\n" +
                        "3. Den Knoblauch klein hacken.\n\n" +
                        "4. Den Frühlingszwiebeln klein schneiden.\n\n" +
                        "5. Die Pfanne auf mittlere Hitze stellen und mit Öl den Tofu goldbraun braten.\n\n" +
                        "6. Öl in eine Pfanne geben, den gehackten Knoblauch goldbraun braten und danach die Tomate einrühren.\n\n" +
                        "7. Mit Wasser ablöschen, dazu mit Würzpulver, Zucker, Ketchup, Peperoni würzen und 5 Minuten stehen lassen.\n\n" +
                        "8. Dann den Tofu eingeben und für weitere 5 Minuten garen, damit die Sauce in den Tofu einzieht.\n\n" +
                        "9. Der Frühlingszwiebel wird auf die Tofu gestreut und serviert.\n";

        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        dauhusotca_zutaten.setText(spannableString);
    }
}
package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Reis_ComVitQuay_Activity extends AppCompatActivity {

    ImageView backIcon;
    ImageView comvitquay_f1_1_Img, comvitquay_f2_1_Img;
    TextView comvitquay_dauer, comvitquay_schwierigkeitsgrad, comvitquay_rezept, comvitquay_zutaten;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_com_vit_quay);

        intent = getIntent();

        comvitquay_f1_1_Img = (ImageView) findViewById(R.id.reis_comvitquay_f1_1);
        comvitquay_f2_1_Img = (ImageView) findViewById(R.id.reis_comvitquay_f2_1);

        comvitquay_dauer = (TextView) findViewById(R.id.comvitquay_dauer);
        comvitquay_schwierigkeitsgrad = (TextView) findViewById(R.id.comvitquay_schwierigkeitsgrad);
        comvitquay_rezept = (TextView) findViewById(R.id.comvitquay_rezept);
        comvitquay_zutaten = (TextView) findViewById(R.id.comvitquay_zutaten);

        // back button
        backIcon =(ImageView) findViewById(R.id.left_back_icon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getIntExtra("chooseActivity", 0) == 1) {
                    intent = new Intent(Reis_ComVitQuay_Activity.this, Search_Filter_Activity.class);
                } else {
                    intent = new Intent(Reis_ComVitQuay_Activity.this, Reis_Gerichte_Activity.class);
            }
                startActivity(intent);}
        });

        String inhalte =
                "   Kategorie: Reis, Fleisch\n" +
                        "   NumOfPersons: 2\n\n" +
                        "   Zutaten:\n" +
                        "       •\tEnte: ca. 1 – 1,2kg\n " +
                        "       •\tGehackter Knoblauch: 1 EL\n" +
                        "       •\tGranulierter Zwiebel: 1 EL\n" +
                        "       •\tAusternsauce: 2 EL\n" +
                        "       •\tSalz: 1,5 TL\n" +
                        "       •\tZucker: 1 EL\n" +
                        "       •\tPfeffer: 1 TL\n" +
                        "       •\t5 Gewürze Mischung: 1 TL\n " +
                        "       •\tHonig: 3 EL\n" +
                        "       •\tWasser: 2 EL\n" +
                        "       •\tGehackter Knoblauch: 2 TL\n" +
                        "       •\tGehackter Ingwer: 2 TL\n" +
                        "       •\tSojasauce: 2 EL\n" +
                        "       •\tWeißessig: 1 TL\n" +
                        "       •\tSalz: 1/4 TL\n\n" +
                        "Anleitung:\n" +
                        "1. Die Ente vor der Zubereitung gründlich waschen, zum Entfernen des Entengeruches wird Weißwein gemischt mit einem Zweig kleingeschnittener Ingwer, sowohl innerhalb als auch außerhalb der Ente eingerieben. Lassen Sie diese Mischung für etwa 20 Minuten und spülen Sie dann mit Wasser ab und abtropfen lassen.\n\n" +
                        "2. Innenseite der Ente würzen: Für die Innenseite der Ente wird die oben vorbereitete Gewürz-Mischung verwendet. Reiben Sie diese Gewürz-Mischung mit den Händen in das Innere der Ente.\n\n" +
                        "3. Die Ente abtrocknen: Verwenden Sie 2/3 TL Salz und 2/3 TL 5 Gewürze Mischung zum Auftragen auf die Haut der Ente. Legen Sie die Ente auf einen Rost oder hängen Sie sie auf, mindestens 6-8 Stunden trocknen lassen und damit die Aromen ins Fleisch einzieht.\n\n" +
                        "4. Außenseite der Ente marinieren: Es werden alle Zutaten wie beschrieben in eine Pfanne gegeben und aufgekocht. Schalten Sie den Herd aus und halten Sie den Entenkopf in der Pfanne hoch und schöpfen Sie die Mischung immer wieder über die Ente. Dies hilft, schöne Farbe und Glanz und eine knusprige Haut zu erzeugen. Lassen Sie die Ente weiter 8 Stunden trocknen, unter den Sonnenstahl 3, je länger desto besser ist die Ente. Die Haut der Ente sollte wirklich trocken sein, bevor sie in den Ofen kommt.\n\n" +
                        "5. Garen: Legen Sie die Ente in den Ofen und schalten sie dann ein, so dass die Temperatur etwa 160-170 Grad Celsius beträgt. Eine 1 kg Ente benötigt 45-55 Minuten. Drehen Sie die Ente nach 25 Minuten um, damit sie gleichmäßig gart. Lassen Sie die Ente nach dem Garen im Ofen, um das Fett abtropfen zu lassen.\n\n" +
                        "6. Die Ente soll etwas abgekühlt sein bevor sie in lange Stücke zerteilt wird. Legen Sie die Fleischstücke auf einen Teller, serviert mit Salat, Sojasauce oder Dip-Sauce nach Vorlieben.\n";


        SpannableString spannableString = new SpannableString(inhalte);
        //spannableString.setSpan(new RelativeSizeSpan(2f));
        // spannableString.setSpan(new StyleSpan(Typeface.BOLD), start:0);
        comvitquay_zutaten.setText(spannableString);
    }
}
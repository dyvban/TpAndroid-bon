package com.example.dyvban.tpandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondeActivity extends AppCompatActivity {

    TextView affichage;
    Button couleurT, couleurB;
    LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);


        //récupération des id
        affichage = (TextView) findViewById(R.id.affichageNomT);
        couleurB = (Button) findViewById(R.id.changerCouleurB);
        couleurT = (Button) findViewById(R.id.changerCouleurT);
        l = (LinearLayout) findViewById(R.id.lParent);

        //on récupère le nom envoyé dans l'activité précedente

        Intent i = getIntent();

        if(i != null){
            //on se rassure que l'intent qui a démarré cette activité n'est pas vide
            String message = "Bonjour "+ i.getStringExtra("nom") + ". Comment vas-tu ???";

            affichage.setText(message);
        }
    }

    /*
    * fonction de modification de la couleur du background
     * on peut ajouter d'autres couleur
     * @params view
    * */
    public void changerCouleurB(View view){
        l.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }


    /*
   * fonction de modification de la couleur du texte
    * on peut ajouter d'autres couleur
    * @params view
   * */
    public void changerCouleurT(View view){
        affichage.setTextColor(getResources().getColor(R.color.colorAccent));
    }
}

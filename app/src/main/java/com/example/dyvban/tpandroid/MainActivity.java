package com.example.dyvban.tpandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nomE;
    Button suivB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        suivB = (Button) findViewById(R.id.suivantButton);


    }


/*
*     fonction qui sera exécuté lorsqu'on va appuyer sur le bouton
*     @params view
* */

    public void openSecondActivity(View view){
        nomE = (EditText) findViewById(R.id.nomEditText);

        //on déclare l'intent qui va ouvrir la deuxième activité et lui envoyé le nom saisi
        Intent intent = new Intent(MainActivity.this, SecondeActivity.class);

        String nom = nomE.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // se rassurer que tout les champ on été remplit
        if (TextUtils.isEmpty(nom)) {
            nomE.setError(getString(R.string.erreur_champ_requis));
            focusView=nomE;
            cancel=true;
        }
else{


            intent.putExtra("nom",nom );

            //on démarre la nouvelle activité
            startActivity(intent);
        }


    }
}

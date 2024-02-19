package com.example.lab03_exercice4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEmploye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.saisie_layout);
        Intent intent = getIntent();
        //recuperation des EditText


        //Recupération de l'objet employe
        Employe employe = (Employe) intent.getSerializableExtra("employe");

        String matricule = employe.getTxtMatricule();
        String salaire = employe.getTxtSalaire();
        String autresLangue = employe.getTxtLangueSup();
        String nom = employe.getTxtNom();
        String prenom = employe.getTxtPrenom();

        TextView textViewM = (TextView) findViewById(R.id.idMatriculeSaisi);
        String messageM = getString(R.string.matricule_text)  + " " +  matricule;
        textViewM.setText(messageM);

        TextView textViewN = (TextView) findViewById(R.id.idNomSaisi);
        String messageN = " " + prenom + ", " + nom;
        textViewN.setText(messageN);

        TextView textViewS = (TextView) findViewById(R.id.idSalaireSaisi);
        String messageS =  ": " + salaire + "$";
        textViewS.setText(messageS);

        //recuperation des checkbox
        boolean etatFrancais = employe.isEtatFrancais();
        boolean etatAnglais = employe.isEtatFrancais();
        boolean etatAutresLangues = employe.isEtatAutresLangues();

        // Utilisation des données reçues
        TextView textView = findViewById(R.id.idLangueSaisi);
        String message = " ";

        if (etatFrancais) {
            message += getString(R.string.francais_text);
        }

        if (etatAnglais) {
            if (!message.isEmpty()) {
                message += ", ";
            }
            message += getString(R.string.anglais_text);
        }

        if (etatAutresLangues) {
            if (!message.isEmpty()) {
                message += ", ";
            }
            message += autresLangue;
        }

        textView.setText(message);

        //recuperation des radioButton
        boolean isHommeSelected = employe.isHommeSelected();
        boolean isFemmeSelected = employe.isFemmeSelected();

        boolean isMarieSelected = employe.isMarieSelected();
        boolean isCelibataireSelected = employe.isCelibataireSelected();
        boolean isSepareSelected = employe.isSepareSelected();
        boolean isVeufSelected = employe.isVeufSelected();
        boolean isConjointSelected = employe.isConjointSelected();

        // Utilisation des données reçues
        if (isHommeSelected) {
            TextView textViewG = (TextView) findViewById(R.id.idSexeSaisi);
            String messageG = getString(R.string.sexe_text) + " Homme ";
            textViewG.setText(messageG);
        }
        else {
            TextView textViewG = (TextView) findViewById(R.id.idSexeSaisi);
            String messageG = getString(R.string.sexe_text) + " Femme ";
            textViewG.setText(messageG);
        }

        if (isMarieSelected) {
            TextView textViewG = (TextView) findViewById(R.id.idEtatCivilSaisi);
            String messageG = " " + getString(R.string.marie_text);
            textViewG.setText(messageG);
        } else if (isCelibataireSelected) {
            TextView textViewG = (TextView) findViewById(R.id.idEtatCivilSaisi);
            String messageG = " " + getString(R.string.celibataire_text);
            textViewG.setText(messageG);
        } else if (isSepareSelected) {
            TextView textViewG = (TextView) findViewById(R.id.idEtatCivilSaisi);
            String messageG = " " + getString(R.string.separe_text);
            textViewG.setText(messageG);
        } else if (isVeufSelected) {
            TextView textViewG = (TextView) findViewById(R.id.idEtatCivilSaisi);
            String messageG = " " + getString(R.string.veuf_text);
            textViewG.setText(messageG);
        } else if (isConjointSelected) {
            TextView textViewG = (TextView) findViewById(R.id.idEtatCivilSaisi);
            String messageG = " " + getString(R.string.conjoint_text);
            textViewG.setText(messageG);
        }

        Button btnMenu = (Button) findViewById(R.id.idMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityEmploye.this, accueil.class);

                // Démarrez l'activité d'accueil
                startActivity(intent);
            }
        });

    }
}

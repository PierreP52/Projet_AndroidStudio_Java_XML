package com.example.lab03_exercice4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button btnMenu;
    EditText txtMatricule;
    EditText txtNom;
    EditText txtPrenom;

    EditText txtSalaire;

    EditText txtLangueSup;

    ListEmploye listEmploye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnMenu = (Button) findViewById(R.id.idMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupération de l'état actuel des EditText
                txtMatricule = (EditText) findViewById(R.id.idEditMatricule);
                txtNom = (EditText) findViewById(R.id.idEditNom);
                txtPrenom = (EditText) findViewById(R.id.idEditPrenom);
                txtSalaire = (EditText) findViewById(R.id.idSalaire);
                txtLangueSup = (EditText) findViewById(R.id.idLangueSup);



                // Récupération de l'état actuel des checkbox
                CheckBox checkBoxFrancais = findViewById(R.id.idFrancais);
                CheckBox checkBoxAnglais = findViewById(R.id.idAnglais);
                CheckBox checkBoxAutres = findViewById(R.id.idAutres);

                boolean etatFrancais = checkBoxFrancais.isChecked();
                boolean etatAnglais = checkBoxAnglais.isChecked();
                boolean etatAutresLangues = checkBoxAutres.isChecked();

                // Récupération de l'état actuel des boutons radio
                RadioButton radioButtonHomme = findViewById(R.id.idCheckbox_homme);
                RadioButton radioButtonFemme = findViewById(R.id.idCheckbox_femme);

                boolean isHommeSelected = radioButtonHomme.isChecked();
                boolean isFemmeSelected = radioButtonFemme.isChecked();

                // Récupération de l'état actuel des boutons radio
                RadioButton radioButtonMarie = findViewById(R.id.idCheckbox_Marie);
                RadioButton radioButtonCelibataire = findViewById(R.id.idCheckbox_celibataire);
                RadioButton radioButtonSepare = findViewById(R.id.idCheckbox_separe);
                RadioButton radioButtonVeuf = findViewById(R.id.idCheckbox_veuf);
                RadioButton radioButtonConjoint = findViewById(R.id.idCheckbox_conjoint);

                boolean isMarieSelected = radioButtonMarie.isChecked();
                boolean isCelibataireSelected = radioButtonCelibataire.isChecked();
                boolean isSepareSelected = radioButtonSepare.isChecked();
                boolean isVeufSelected = radioButtonVeuf.isChecked();
                boolean isConjointSelected = radioButtonConjoint.isChecked();

                Employe employe = new Employe(txtMatricule.getText().toString(),
                        txtNom.getText().toString(),
                        txtPrenom.getText().toString(),
                        txtSalaire.getText().toString(),
                        txtLangueSup.getText().toString(),
                        etatFrancais,
                        etatAnglais,
                        etatAutresLangues,
                        isHommeSelected,
                        isFemmeSelected,
                        isMarieSelected,
                        isCelibataireSelected,
                        isSepareSelected,
                        isVeufSelected,
                        isConjointSelected);

                ListEmploye.ajouterEmploye(employe);

                txtMatricule.setText("");
                txtNom.setText("");
                txtPrenom.setText("");
                txtSalaire.setText("");
                txtLangueSup.setText("");

                Intent intent = new Intent(MainActivity.this, accueil.class);

                // Démarrez l'activité d'accueil
                startActivity(intent);

                // Terminez l'activité actuelle si vous ne voulez pas y revenir
                finish();
            }
        });
    }
}
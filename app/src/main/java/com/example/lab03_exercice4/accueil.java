package com.example.lab03_exercice4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class accueil extends AppCompatActivity {

    Button btnAjouter;
    Button btnViewList;

    private List<Employe> listeEmployes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boutton_layout);

        btnAjouter = findViewById(R.id.idButtonAjouter);
        btnViewList = findViewById(R.id.idButtonListe);

        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ajouterEmploye();
            }
        });

        btnViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewList();
            }
        });
    }

    private void ajouterEmploye() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void viewList() {

        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }
}

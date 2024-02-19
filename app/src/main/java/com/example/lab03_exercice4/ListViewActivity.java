package com.example.lab03_exercice4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_layout);

        ArrayList<Employe> listeEmployes = ListEmploye.getListeEmployes();

        AdapterListEmploye adapter = new AdapterListEmploye(this, R.layout.item_list, listeEmployes);
        ListView listView = (ListView) findViewById(R.id.idListeEmploye);
        listView.setAdapter(adapter);

        btnMenu = (Button) findViewById(R.id.idMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListViewActivity.this, accueil.class);

                // Démarrez l'activité d'accueil
                startActivity(intent);
            }
        });
    }
}

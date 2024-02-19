package com.example.lab03_exercice4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListEmploye  extends ArrayAdapter<Employe> {

    private Context context;
    private int layoutItemListe;

    private Resources res;

    ArrayList<Employe> listeEmploye;

    public AdapterListEmploye(Context context, int layoutItemListe, ArrayList<Employe> listeEmploye) {
        super(context, layoutItemListe, listeEmploye);
        this.context = context;
        this.layoutItemListe = layoutItemListe;
        res = context.getResources();
        this.listeEmploye = listeEmploye;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(
                    context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(layoutItemListe, parent, false);
        }

        Employe employe = getItem(position);

        if (employe != null) {
            TextView textViewMatriculeEmploye = view.findViewById(R.id.idMatricule);
            TextView textViewNomEmploye = view.findViewById(R.id.idNom);
            TextView textViewPrenomEmploye = view.findViewById(R.id.idPrenom);

            textViewMatriculeEmploye.setText(employe.getTxtMatricule());
            textViewNomEmploye.setText(employe.getTxtNom());
            textViewPrenomEmploye.setText(employe.getTxtPrenom());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context, ActivityEmploye.class);

                    intent.putExtra("employe", employe);

                    // Démarrez l'activité Employe
                    context.startActivity(intent);
                }
            });
        }
        return view;
    }

    @Override
    public int getCount() {return listeEmploye.size(); }

}

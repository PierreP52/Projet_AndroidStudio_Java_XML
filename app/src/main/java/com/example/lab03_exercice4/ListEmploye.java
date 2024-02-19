package com.example.lab03_exercice4;

import java.util.ArrayList;
import java.util.List;

public class ListEmploye {

    private static ArrayList<Employe> listeEmployes = new ArrayList<>();

    public static void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public static ArrayList<Employe> getListeEmployes() {
        return new ArrayList<>(listeEmployes);
    }
}

package com.example.lab03_exercice4;

import android.widget.EditText;

import java.io.Serializable;

public class Employe implements Serializable {

    private String txtMatricule;
    private String txtNom;
    private String txtPrenom;
    private String txtSalaire;

    private String txtLangueSup;
    private boolean etatFrancais;
    private boolean etatAnglais;
    private boolean etatAutresLangues;
    private boolean isHommeSelected;
    private boolean isFemmeSelected;
    private boolean isMarieSelected;
    private boolean isCelibataireSelected;
    private boolean isSepareSelected;
    private boolean isVeufSelected;
    private boolean isConjointSelected;

    public Employe(String txtMatricule, String txtNom, String txtPrenom, String txtSalaire, String txtLangueSup, boolean etatFrancais, boolean etatAnglais, boolean etatAutresLangues,
                   boolean isHommeSelected, boolean isFemmeSelected,
                   boolean isMarieSelected, boolean isCelibataireSelected,
                   boolean isSepareSelected, boolean isVeufSelected, boolean isConjointSelected) {

        this.txtMatricule = txtMatricule;
        this.txtNom = txtNom;
        this.txtPrenom = txtPrenom;
        this.txtSalaire = txtSalaire;
        this.txtLangueSup = txtLangueSup;
        this.etatFrancais = etatFrancais;
        this.etatAnglais = etatAnglais;
        this.etatAutresLangues = etatAutresLangues;
        this.isHommeSelected = isHommeSelected;
        this.isFemmeSelected = isFemmeSelected;
        this.isMarieSelected = isMarieSelected;
        this.isCelibataireSelected = isCelibataireSelected;
        this.isSepareSelected = isSepareSelected;
        this.isVeufSelected = isVeufSelected;
        this.isConjointSelected = isConjointSelected;
    }

    // Getter et Setter pour txtMatricule
    public String getTxtMatricule() {
        return txtMatricule;
    }

    public void setTxtMatricule(String txtMatricule) {
        this.txtMatricule = txtMatricule;
    }

    // Getter et Setter pour txtNom
    public String getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(String txtNom) {
        this.txtNom = txtNom;
    }

    // Getter et Setter pour txtPrenom
    public String getTxtPrenom() {
        return txtPrenom;
    }

    public void setTxtPrenom(String txtPrenom) {
        this.txtPrenom = txtPrenom;
    }

    // Getter et Setter pour txtSalaire
    public String getTxtSalaire() {
        return txtSalaire;
    }

    public void setTxtSalaire(String txtSalaire) {
        this.txtSalaire = txtSalaire;
    }

    public String getTxtLangueSup() {
        return txtLangueSup;
    }

    public void setTxtLangueSup(String txtLangueSup) {
        this.txtLangueSup = txtLangueSup;
    }

    // Getter et Setter pour etatFrancais
    public boolean isEtatFrancais() {
        return etatFrancais;
    }

    public void setEtatFrancais(boolean etatFrancais) {
        this.etatFrancais = etatFrancais;
    }

    public boolean isEtatAnglais() {
        return etatAnglais;
    }

    public void setEtatAnglais(boolean etatAnglais) {
        this.etatAnglais = etatAnglais;
    }

    // Getter et Setter pour etatAutresLangues
    public boolean isEtatAutresLangues() {
        return etatAutresLangues;
    }

    public void setEtatAutresLangues(boolean etatAutresLangues) {
        this.etatAutresLangues = etatAutresLangues;
    }

    // Getter et Setter pour isHommeSelected
    public boolean isHommeSelected() {
        return isHommeSelected;
    }

    public void setHommeSelected(boolean hommeSelected) {
        isHommeSelected = hommeSelected;
    }

    // Getter et Setter pour isFemmeSelected
    public boolean isFemmeSelected() {
        return isFemmeSelected;
    }

    public void setFemmeSelected(boolean femmeSelected) {
        isFemmeSelected = femmeSelected;
    }

    // Getter et Setter pour isMarieSelected
    public boolean isMarieSelected() {
        return isMarieSelected;
    }

    public void setMarieSelected(boolean marieSelected) {
        isMarieSelected = marieSelected;
    }

    // Getter et Setter pour isCelibataireSelected
    public boolean isCelibataireSelected() {
        return isCelibataireSelected;
    }

    public void setCelibataireSelected(boolean celibataireSelected) {
        isCelibataireSelected = celibataireSelected;
    }

    // Getter et Setter pour isSepareSelected
    public boolean isSepareSelected() {
        return isSepareSelected;
    }

    public void setSepareSelected(boolean separeSelected) {
        isSepareSelected = separeSelected;
    }

    // Getter et Setter pour isVeufSelected
    public boolean isVeufSelected() {
        return isVeufSelected;
    }

    public void setVeufSelected(boolean veufSelected) {
        isVeufSelected = veufSelected;
    }

    // Getter et Setter pour isConjointSelected
    public boolean isConjointSelected() {
        return isConjointSelected;
    }

    public void setConjointSelected(boolean conjointSelected) {
        isConjointSelected = conjointSelected;
    }

}

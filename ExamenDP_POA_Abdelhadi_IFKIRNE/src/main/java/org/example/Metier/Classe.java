package org.example.Metier;

public class Classe extends Entite {
    private String nom;

    public Classe(String nom) {
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

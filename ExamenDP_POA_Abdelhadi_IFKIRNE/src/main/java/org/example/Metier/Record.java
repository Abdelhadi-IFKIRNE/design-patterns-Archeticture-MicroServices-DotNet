package org.example.Metier;

import org.example.Metier.Entite;

public class Record extends Entite {
    private String nom;

    public Record() {
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }
}

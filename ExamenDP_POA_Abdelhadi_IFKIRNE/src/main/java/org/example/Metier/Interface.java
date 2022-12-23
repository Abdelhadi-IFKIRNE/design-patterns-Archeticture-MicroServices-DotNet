package org.example.Metier;

import org.example.Metier.Entite;

public class Interface extends Entite {
    private String nom;

    public Interface() {
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

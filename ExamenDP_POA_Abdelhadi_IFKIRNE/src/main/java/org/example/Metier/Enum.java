package org.example.Metier;

import org.example.Metier.Entite;

import java.util.List;

public class Enum extends Entite {
    private String nom;
    private List<String> valeurs;

    public Enum() {
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getValeurs() {
        return valeurs;
    }

    public void setValeurs(List<String> valeurs) {
        this.valeurs = valeurs;
    }
}

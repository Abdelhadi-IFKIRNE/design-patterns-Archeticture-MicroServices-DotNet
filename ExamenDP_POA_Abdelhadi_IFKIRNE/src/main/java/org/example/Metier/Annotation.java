package org.example.Metier;

import java.util.List;

public class Annotation extends Entite {
    private String nom;
    private List<String> propriéties;

    public Annotation(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getPropriéties() {
        return propriéties;
    }

    public void setPropriéties(List<String> propriéties) {
        this.propriéties = propriéties;
    }
}

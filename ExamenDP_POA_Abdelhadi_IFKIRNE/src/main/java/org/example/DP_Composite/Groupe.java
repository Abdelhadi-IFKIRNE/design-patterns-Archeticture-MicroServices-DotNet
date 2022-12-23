package org.example.DP_Composite;

import org.example.Metier.Classe;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Classe {
    private List<Classe> classes=new ArrayList<>();

    public Groupe(String nom) {
        super(nom);
    }
}

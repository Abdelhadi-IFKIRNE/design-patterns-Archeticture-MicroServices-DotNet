package org.example;

public class Client {
    private Traitement traitement;

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    double calcul(double a){
        return traitement.calcul(a);
    }
}

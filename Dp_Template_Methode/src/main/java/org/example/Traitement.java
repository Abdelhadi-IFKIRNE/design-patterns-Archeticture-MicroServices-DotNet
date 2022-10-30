package org.example;

public abstract class Traitement {
    private double resultat=0;
    public double calcul(double a){
        resultat=a/2+Math.pow(resultat,7);
        for (int i = 0; i < 7; i++) {
            resultat+=resultat/2;
        }
        resultat=filter1(resultat)+filter2(resultat);
        return resultat;
    }

    protected abstract double filter1(double n);
    protected abstract double filter2(double n);
}

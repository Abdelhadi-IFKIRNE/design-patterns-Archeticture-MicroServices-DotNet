package org.example;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        observable.setCc("rouge");
        observable.setCr("vert");
        observable.setEp(2);
        Figure figure=new Rect(observable);
        figure.setStrategyAffichage(new strategyAffichage2());
        figure.afficherEtat();
    }
}
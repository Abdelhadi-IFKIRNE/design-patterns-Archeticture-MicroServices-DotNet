package org.example;

public class strategyAffichge1 implements StrategyAffichage{
    @Override
    public void afficher() {
        System.out.println("j'applique la strategy d'affichage 1");
    }
}

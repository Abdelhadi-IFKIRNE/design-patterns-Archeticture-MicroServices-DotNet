package org.example;

public class StrategyFiltre_1 extends IstrategyFiltre{
    public StrategyFiltre_1(Image image) {
        super(image);
    }

    @Override
    public int[] Filtrer() {
        System.out.println("---------J'applique la stratégie filtrage 1 de l'implementation standard -------------");
        return image.getData();
    }
}

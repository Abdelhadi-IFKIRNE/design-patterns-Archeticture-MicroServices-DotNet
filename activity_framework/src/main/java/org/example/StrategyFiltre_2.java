package org.example;

public class StrategyFiltre_2 extends IstrategyFiltre{
    public StrategyFiltre_2(Image image) {
        super(image);
    }

    @Override
    public int[] Filtrer() {
        System.out.println("---------J'applique la strategie filtrage 2 implementation standard--------");
        return image.getData();
    }
}

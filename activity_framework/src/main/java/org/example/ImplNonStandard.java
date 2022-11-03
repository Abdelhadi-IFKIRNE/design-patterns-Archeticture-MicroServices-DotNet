package org.example;

public class ImplNonStandard implements InterfaceNonStandard {
    @Override
    public int[] Filtrer(String className, int[] data) {
      System.out.println("-----j'applique la strategie filtrage de l'implementation non standard");
        return data;
    }
}

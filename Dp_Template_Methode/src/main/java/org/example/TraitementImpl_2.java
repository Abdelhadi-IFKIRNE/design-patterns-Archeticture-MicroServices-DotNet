package org.example;

public class TraitementImpl_2 extends Traitement{
    @Override
    protected double filter1(double n) {
        System.out.println("From Traitement_Impl_2.....");
        return n/20;
    }

    @Override
    protected double filter2(double n) {
        return n+78;
    }
}

package org.example;

public class TraitementImpl_1 extends Traitement{
    @Override
    protected double filter1(double n) {
        System.out.println("From Traimenent_Impl_1......");
        return n*2;
    }

    @Override
    protected double filter2(double n) {
        return n/2;
    }
}

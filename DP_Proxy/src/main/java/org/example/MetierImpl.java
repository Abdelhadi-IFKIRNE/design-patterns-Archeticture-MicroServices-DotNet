package org.example;

public class MetierImpl extends Metier{


    @Override
    double doOperation(int a, int b) {
        return Math.random()+a/b;
    }
}

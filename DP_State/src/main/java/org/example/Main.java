package org.example;

public class Main {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.attirir();
        avion.entrerGarage();
        avion.sortirGarage();
        avion.decoller();
        avion.sortirGarage();
        avion.entrerGarage();
        avion.attirir();
        avion.sortirGarage();
        avion.entrerGarage();
    }
}
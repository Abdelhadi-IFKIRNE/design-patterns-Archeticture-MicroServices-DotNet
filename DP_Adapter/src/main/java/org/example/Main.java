package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Computer computer=new Computer();
        computer.setVgaImpl(new VGA_Impl());
        computer.afficher();
        System.out.println("-----------------------------------------");
        Adapter adapter=new Adapter();
        adapter.setHdmi(new V_Projector_v2());
        computer.setVgaImpl(adapter);
        computer.afficher();
        System.out.println("-----------------------------------------");
        adapter.setHdmi(new V_Projector());
        computer.setVgaImpl(adapter);
        computer.afficher();
    }
}
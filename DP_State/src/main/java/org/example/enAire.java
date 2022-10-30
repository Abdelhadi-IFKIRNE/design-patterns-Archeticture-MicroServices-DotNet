package org.example;

public class enAire extends State{
    public enAire(AvionImpl avion) {
        super(avion);
    }

    @Override
    void sortirGarage() {
        System.out.println("Impossible...! je suis déjà en aire");
    }

    @Override
    void entrerGarage() {
        System.out.println("Impossible...! je suis déjà en aire");

    }

    @Override
    void decoller() {
        System.out.println("Impossible...! je suis déjà en aire");
    }

    @Override
    void attirir() {
        System.out.println("Transformation d'état, Aire ---> psite");
        avion.setState(new EnPiste(avion));
    }

    @Override
    void doActivity() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Activité en aire est en train de s'effectuer .....");
        }
    }
}

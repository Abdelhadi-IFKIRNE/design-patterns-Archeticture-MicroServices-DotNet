package org.example;

public class EnPiste extends State{

    public EnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void sortirGarage() {
        System.out.println("Impossible...! je suis déjà en piste");
    }

    @Override
    void entrerGarage() {
        System.out.println("Transformation d'état, piste ----> garage");
        avion.setState(new AuGarage(avion));
    }

    @Override
    void decoller() {
        System.out.println("Transformation d'état, psite ----> aire");
        avion.setState(new enAire(avion));
    }

    @Override
    void attirir() {
        System.out.println("Impossible...! je suis déjà en piste");
    }

    @Override
    void doActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("activité en piste est en train de s'effectuer....."+i);
        }
    }
}

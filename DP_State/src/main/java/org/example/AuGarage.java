package org.example;

public class AuGarage extends State{
    public AuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void sortirGarage() {
        System.out.println("Transformation d'état, Garage ----> psite");
        avion.setState(new EnPiste(avion));
    }

    @Override
    void entrerGarage() {
        System.out.println("Impossible...! je suis déjà au garage");

    }

    @Override
    void decoller() {
        System.out.println("Impossible...! je suis déjà au garage");
    }

    @Override
    void attirir() {
        System.out.println("Impossible...! je suis déjà au garage");
    }

    @Override
    void doActivity() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Activité au garage est en train de s'effectuer ...."+i);
        }
    }
}

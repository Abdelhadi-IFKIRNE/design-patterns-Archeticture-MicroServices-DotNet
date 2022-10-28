package org.example;

import org.example.types.Point;

public class Cycle extends Figure {
    private Point pc;
    private Point pp;
    private float r;

    public Cycle(ObservableImpl observableImpl) {
        super(observableImpl);
    }

    @Override
    public float calculSurface() {
        return (float) (3.14*r*r);
    }

    @Override
    public float calculpirimi() {
        return (float) (2*3.14*r);
    }

    @Override
    public void afficherEtat() {
        strategyAffichage.afficher();
        System.out.println("xc="+pc.getX());
        System.out.println("yc="+pc.getX());
        System.out.println("r="+pc.getX());
    }

    @Override
    public void update(ObservableImpl observableImpl) {
         String newColorC=observableImpl.getCc();
         String newColorR= observableImpl.getCr();
         System.out.println("new colorC: "+newColorC);
         System.out.println("new colorR: "+newColorR);
    }
}

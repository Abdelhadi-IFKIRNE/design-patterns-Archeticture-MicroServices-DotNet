package org.example;

import org.example.types.Point;

public class Rect extends Figure{
    private Point pcs;
    private Point psi;
    private float l;
    private float h;

    public Rect(ObservableImpl observableImpl) {
        super(observableImpl);
    }

    @Override
    public float calculSurface() {
        return l*h;
    }

    @Override
    public float calculpirimi() {
        return (l+h)*2;
    }

    @Override
    public void afficherEtat() {
        strategyAffichage.afficher();
          System.out.println("cyrcle");
          System.out.println("etat: l"+l);
          System.out.println("etat: pcsx="+h);
    }

    @Override
    public void update(ObservableImpl observableImpl) {
        String newColorC=observableImpl.getCc();
        String newColorR= observableImpl.getCr();
        System.out.println("new colorC: "+newColorC);
        System.out.println("new colorR: "+newColorR);
    }
}

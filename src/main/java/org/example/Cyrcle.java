package org.example;

public class Cyrcle extends Figure{
    private Point c;
    private float r;


    private String cc= observabledefParam.getCc();
    private String cr=observabledefParam.getCr();
    private float ep=observabledefParam.getEp();

    public Cyrcle() {
    }

    public Cyrcle(Point c, float r) {
        this.c = c;
        this.r = r;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    float calculSurface() {
        return (float) (Math.PI*r*r);
    }

    @Override
    float calculPerimitre() {
        return (float) (2*Math.PI*r);
    }

    @Override
    void afficheEtatFigure() {
        System.out.println("\n");
       System.out.println("Il s'agit d'un cyrcle- \n"+"du rayon:"+r);
       System.out.println("son centre défini par :("+c.getX()+";"+c.getY()+")");
       System.out.println("color contour : "+cc);
       System.out.println("color remplissage : "+cr);
       System.out.println("epss : "+ep);
        System.out.println("\n");

    }

    @Override
    void update(ObservabledefParamImpl observabledefParam) {
                 cc= observabledefParam.getCc();
                 cr=observabledefParam.getCr();
                 ep=observabledefParam.getEp();
    }
}

package org.example;

public class Rect extends Figure{
    private Point csg;
    private float l;
    private float h;

    private String cc= observabledefParam.getCc();
    private String cr=observabledefParam.getCr();
    private float ep=observabledefParam.getEp();

    public Rect() {
    }

    public Rect(Point csg, float l, float h) {
        this.csg = csg;
        this.l = l;
        this.h = h;
    }

    public Point getCsg() {
        return csg;
    }

    public void setCsg(Point csg) {
        this.csg = csg;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    @Override
    float calculSurface() {
        return l*h;
    }

    @Override
    float calculPerimitre() {
        return (l+h)*2;
    }

    @Override
    void afficheEtatFigure() {
       System.out.println("Il s'agit d'un Rectangle - \n"+"de langeur:"+l+"\n"+"et de largeur :"+h+"\n");
       System.out.println("son coin superieur gauche est à :("+csg.getX()+";"+csg.getY()+")");
        System.out.println("color contour : "+cc);
        System.out.println("color remplissage : "+cr);
        System.out.println("epss : "+ep);
    }

    @Override
    void update(ObservabledefParamImpl observabledefParam) {
                 cc= observabledefParam.getCc();
                 cr=observabledefParam.getCr();
                 ep=observabledefParam.getEp();
       System.out.println("changement du color contour de :"+cc+"vers :"+observabledefParam.getCc());
       System.out.println("changement du color remplissage de :"+cr+"vers :"+observabledefParam.getCr());
       System.out.println("changement d'epaisseur :"+ep+"vers :"+observabledefParam.getEp());
    }
}

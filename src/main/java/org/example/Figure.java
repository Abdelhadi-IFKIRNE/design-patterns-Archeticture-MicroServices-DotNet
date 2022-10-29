package org.example;

public abstract class Figure {
    protected ObservabledefParamImpl observabledefParam=new ObservabledefParamImpl();
    abstract float calculSurface();
    abstract float calculPerimitre();
    abstract void afficheEtatFigure();
    abstract void update(ObservabledefParamImpl observabledefParam);
}

package org.example;

public abstract class IstrategyFiltre {
    protected  Image image;

    public IstrategyFiltre(Image image) {
        this.image = image;
    }

    abstract int [] Filtrer();
}

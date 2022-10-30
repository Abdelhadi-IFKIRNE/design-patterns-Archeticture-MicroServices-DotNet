package org.example;

public class Computer {
    private VGA vgaImpl;

    public void setVgaImpl(VGA vgaImpl) {
        this.vgaImpl = vgaImpl;
    }

    public void afficher(){
        vgaImpl.afficher();
    }
}

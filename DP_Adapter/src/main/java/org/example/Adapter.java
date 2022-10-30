package org.example;

public class Adapter implements VGA{
    private HDMI hdmi;
    @Override
    public void afficher() {
        hdmi.afficher();
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}

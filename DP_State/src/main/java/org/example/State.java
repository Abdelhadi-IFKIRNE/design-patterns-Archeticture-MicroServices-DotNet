package org.example;

public abstract class State {
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    abstract void sortirGarage();
    abstract void entrerGarage();
    abstract   void decoller();
    abstract void attirir();
    abstract   void doActivity();
}

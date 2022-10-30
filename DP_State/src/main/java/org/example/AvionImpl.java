package org.example;

public class AvionImpl implements Avion{
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public AvionImpl() {
        this.state = new EnPiste(this);
    }

    @Override
    public void sortirGarage() {
       state.sortirGarage();
    }

    @Override
    public void entrerGarage() {
        state.entrerGarage();
    }

    @Override
    public void decoller() {
         state.decoller();
    }

    @Override
    public void attirir() {
         state.attirir();
    }

    @Override
    public void doActivity() {
      state.doActivity();
    }
}

package org.example.DP_Observable;

import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
          observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.Update(this);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}

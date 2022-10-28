package org.example;

import org.example.Figure;
import org.example.observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements observable {
    private String cc;
    private String cr;
    private float ep;

    private List<Figure> figures =new ArrayList<>();
    @Override
    public void addObserver(Figure figure) {
        figures.add(figure);
    }

    @Override
    public void removeObserver(Figure figure) {
          figures.remove(figure);
    }

    @Override
    public void notifyObservers() {
        for (Figure d: figures) {
            d.update(this);
        }
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public float getEp() {
        return ep;
    }

    public void setEp(float ep) {
        this.ep = ep;
    }
}

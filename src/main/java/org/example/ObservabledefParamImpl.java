package org.example;

import java.util.ArrayList;
import java.util.List;

public class ObservabledefParamImpl implements ObservableDefParam{
    private List<Figure> figureList=new ArrayList<>();
    private float ep= 2.5F;
    private String cc="noir";
    private String cr="bleu";
    @Override
    public void addObserver(Figure figure) {
        figureList.add(figure);
    }

    @Override
    public void removeObserver(Figure figure) {
          figureList.remove(figure);
    }

    @Override
    public void notifyObservers() {
        for (Figure f:figureList) {
            f.update(this);
        }
    }

    public float getEp() {
        return ep;
    }

    public void setEp(float ep) {
        this.ep = ep;
        notifyObservers();
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
        notifyObservers();
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
        notifyObservers();
    }
}

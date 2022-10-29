package org.example;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigure extends Figure{
    private List<Figure> figureList=new ArrayList<>();

    public GroupeFigure() {
    }
    public void addFigure(Figure figure){
        figureList.add(figure);
    }
    public void removeFigure(Figure figure){
        figureList.remove(figure);
    }
    public List<Figure> getfils(){
        return figureList;
    }

    @Override
    float calculSurface() {
        return 0;
    }

    @Override
    float calculPerimitre() {
        return 0;
    }

    @Override
    void afficheEtatFigure() {
        System.out.println("--- figure en groupe----");
        for (Figure f:figureList) {
            f.afficheEtatFigure();
        }
        System.out.println("-----------------");

    }

    @Override
    void update(ObservabledefParamImpl observabledefParam) {
        for (Figure f:figureList) {
            f.update(observabledefParam);
        }
    }



}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figureList=new ArrayList<>();
    private StrategyTraitement strategyTraitement=new StrategyTraitementImpl_1();

    public Dessin(StrategyTraitement strategyTraitement) {
        this.strategyTraitement = strategyTraitement;
    }

    public StrategyTraitement getStrategyTraitement() {
        return strategyTraitement;
    }

    public Dessin() {
    }

    public void setStrategyTraitement(StrategyTraitement strategyTraitement) {
        this.strategyTraitement = strategyTraitement;
    }

    public void addFigure(Figure figure){
        figureList.add(figure);
    }

    public void removeFigure(Figure figure){
        figureList.remove(figure);
    }

    public void displayAllFigures(){
        strategyTraitement.traiter();
        for (Figure f:figureList) {
            f.afficheEtatFigure();
        }
    }
}

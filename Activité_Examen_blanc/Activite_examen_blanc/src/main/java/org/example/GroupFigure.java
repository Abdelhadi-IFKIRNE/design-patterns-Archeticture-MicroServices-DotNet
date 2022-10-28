package org.example;

import java.util.ArrayList;
import java.util.List;

public class GroupFigure extends Figure {
    private List<Figure> figureList=new ArrayList<>();
    public GroupFigure(ObservableImpl observableImpl) {
        super(observableImpl);
    }

    @Override
    public float calculSurface() {

        return 0;
    }

    @Override
    public float calculpirimi() {

        return 0;
    }

    @Override
    public void afficherEtat() {
        for (Figure f:figureList
             ) {
            f.afficherEtat();
        }
    }

    @Override
    public void update(ObservableImpl observableImpl) {
        for (Figure f:figureList
        ) {
            f.update(observableImpl);
        }
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        Dessin dessin=new Dessin();

        Figure figure=new Rect(new Point(2.5F,5.6F),5.8F,8.7F);
        Figure figure1=new Cyrcle(new Point(4.5F,5.7F),8.5F);
        GroupeFigure groupeFigure=new GroupeFigure();
        Figure figure3=new Rect(new Point(2.5F,5.6F),5.8F,8.7F);
        Figure figure4=new Cyrcle(new Point(4.5F,5.7F),8.5F);
        groupeFigure.addFigure(figure3);
        groupeFigure.addFigure(figure4);
        dessin.addFigure(figure);
        dessin.addFigure(figure1);
        dessin.addFigure(groupeFigure);
        dessin.displayAllFigures();

        ObservabledefParamImpl observableDefParam=new ObservabledefParamImpl();
        observableDefParam.addObserver(figure);
        observableDefParam.addObserver(groupeFigure);
        observableDefParam.setCc("rouge");
        observableDefParam.setCr("jaune");
        System.out.println("---------/////-------------//////-----------");
        dessin.displayAllFigures();
        dessin.setStrategyTraitement(new StrategyTraitementImpl_2());
        dessin.displayAllFigures();
    }
}
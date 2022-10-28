package org.example;

public abstract class Figure {
    public StrategyAffichage getStrategyAffichage() {
        return strategyAffichage;
    }

    public void setStrategyAffichage(StrategyAffichage strategyAffichage) {
        this.strategyAffichage = strategyAffichage;
    }

    public ObservableImpl observableImpl;
    public StategyTraitement stategyTraitement;

    public StrategyAffichage strategyAffichage;
    public Figure(ObservableImpl observableImpl) {
        this.observableImpl = observableImpl;
    }

    public abstract float calculSurface();
    public abstract float calculpirimi();
    public abstract void afficherEtat();
    public abstract void update(ObservableImpl observableImpl);

    public ObservableImpl getObservableImpl() {
        return observableImpl;
    }

    public void setObservableImpl(ObservableImpl observableImpl) {
        this.observableImpl = observableImpl;
    }

    public StategyTraitement getStategyTraitement() {
        return stategyTraitement;
    }

    public void setStategyTraitement(StategyTraitement stategyTraitement) {
        this.stategyTraitement = stategyTraitement;
    }
}

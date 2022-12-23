package org.example.Metier;

public class Association extends Relation {
    private Classe source;
    private Entite distination;

    public Association(Classe source,Entite distination) {
        this.source=source;
        this.distination=distination;
    }

    public Classe getSource() {
        return source;
    }

    public void setSource(Classe source) {
        this.source = source;
    }

    public Entite getDistination() {
        return distination;
    }

    public void setDistination(Entite distination) {
        this.distination = distination;
    }
}

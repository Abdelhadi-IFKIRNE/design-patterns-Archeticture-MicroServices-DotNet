package org.example.Metier;

import java.util.List;

public class DiagrammeC {
    private List<Entite> entites;
    private List<Relation> relations;

    public DiagrammeC() {
    }

    public List<Entite> getEntites() {
        return entites;
    }

    public void setEntites(List<Entite> entites) {
        this.entites = entites;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }
}

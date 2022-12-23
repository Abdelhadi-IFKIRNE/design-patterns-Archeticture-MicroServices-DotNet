package org.example;

import org.example.DP_Adapter.IadapterGenerateCode;
import org.example.DP_Adapter.IadapterGenerateCodeImpl;
import org.example.DP_Adapter.IstandardGenerateCode;
import org.example.DP_Adapter.IstandardGenerateCodeImpl;
import org.example.DP_Strategy.S_JAVA;
import org.example.DP_Strategy.StrategyCode;
import org.example.Metier.*;
import org.example.security.SecurityContext;

import java.util.ArrayList;
import java.util.List;

public class Context {
    public static void main(String[] args) {
        SecurityContext.authenticate("abdelhadi","1234",new String[]{"USER"});
        StrategyCode strategyCode=new S_JAVA();
        strategyCode.genererCode();
        System.out.println("--------------------------------");
        IstandardGenerateCode istandardGenerateCode=new IstandardGenerateCodeImpl();
        istandardGenerateCode.generateCode();
        IadapterGenerateCode istandardGenerateCode1= new IadapterGenerateCodeImpl();
        System.out.println("-----------------------------------");
        istandardGenerateCode1.generateCode();
        List<Entite> entites=new ArrayList<>();
        List<Relation> relations=new ArrayList<>();
        Classe classe=new Classe("Source");
        Classe classe1=new Classe("distination");
        entites.add(new Classe("C1"));
        entites.add(new Classe("C2"));
        entites.add(new Classe("C3"));
        entites.add(new Classe("C4"));
        entites.add(new Classe("C5"));
        relations.add(new Association(classe1,classe1));
        relations.add(new Association(classe1,classe));
        relations.add(new Association(classe1,classe));
        relations.add(new Association(classe1,classe));
        relations.add(new Association(classe1,classe));
        relations.add(new Association(classe1,classe));
        DiagrammeC diagrammeC=new DiagrammeC();
        diagrammeC.setEntites(entites);
        diagrammeC.setRelations(relations);
        System.out.println("votre diagramme de classe contient :");
        for (int i = 0; i < diagrammeC.getEntites().size(); i++) {
            System.out.println(diagrammeC.getEntites().get(i).getNom());
        }
    }
}

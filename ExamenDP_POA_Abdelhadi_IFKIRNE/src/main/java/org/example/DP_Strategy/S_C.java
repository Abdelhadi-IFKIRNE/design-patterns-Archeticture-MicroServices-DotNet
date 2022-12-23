package org.example.DP_Strategy;

import org.example.DP_Strategy.StrategyCode;
import org.example.aspects.Log;

public class S_C implements StrategyCode {
    @Override
    @Log
    public void genererCode() {
        System.out.println("j'applique la strategie de génération du code C#");
    }
}

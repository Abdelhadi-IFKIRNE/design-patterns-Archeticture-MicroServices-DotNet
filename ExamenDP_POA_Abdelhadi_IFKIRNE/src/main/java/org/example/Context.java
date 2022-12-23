package org.example;

import org.example.DP_Adapter.IadapterGenerateCode;
import org.example.DP_Adapter.IadapterGenerateCodeImpl;
import org.example.DP_Adapter.IstandardGenerateCode;
import org.example.DP_Adapter.IstandardGenerateCodeImpl;
import org.example.DP_Strategy.S_JAVA;
import org.example.DP_Strategy.StrategyCode;
import org.example.security.SecurityContext;

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
    }
}

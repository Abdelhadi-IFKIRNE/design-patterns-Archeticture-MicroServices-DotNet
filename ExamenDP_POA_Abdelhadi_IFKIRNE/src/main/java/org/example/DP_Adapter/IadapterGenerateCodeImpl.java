package org.example.DP_Adapter;

import org.example.aspects.Log;
import org.example.aspects.SecuredByAspect;

public class IadapterGenerateCodeImpl implements IadapterGenerateCode {
    @Override
    @Log
    @SecuredByAspect(roles={"USER","ADMIN"})
    public void generateCode() {
        System.out.println("generation du code a partir de l'interface adaptee .......");
    }
}

package org.example.DP_Adapter;

import org.example.aspects.Lock;
import org.example.aspects.Log;

public class IstandardGenerateCodeImpl implements IstandardGenerateCode {
    @Override
    @Log
    @Lock
    public void generateCode() {
     System.out.println("generation du code a partir de la strategy standard.....");
    }
}

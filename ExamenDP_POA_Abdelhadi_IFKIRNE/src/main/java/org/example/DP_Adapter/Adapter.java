package org.example.DP_Adapter;

public class Adapter implements IstandardGenerateCode{
    private IadapterGenerateCode iadapterGenerateCode;
    @Override
    public void generateCode() {
          System.out.println("generation du code a partir du proxy ......");
          iadapterGenerateCode.generateCode();
    }
}

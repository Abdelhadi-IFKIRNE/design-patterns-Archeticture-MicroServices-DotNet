package org.example;

public class Main {
    public static void main(String[] args) {
     Client client =new Client();
     client.setTraitement(new TraitementImpl_1());
     double res= client.calcul(8);
     System.out.println(res);

     client.setTraitement(new TraitementImpl_2());
     double res1= client.calcul(8);
     System.out.println(res1);
    }
}
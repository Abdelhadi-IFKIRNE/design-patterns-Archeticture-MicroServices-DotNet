package org.example;

public class Main {
    public static void main(String[] args) {
       Client client=new Client();
       client.setMetier(new proxy());
       double res=client.getMetier().doOperation(7,8);
       System.out.println(res);
        double res1=client.getMetier().doOperation(7,8);
        System.out.println(res1);
    }
}
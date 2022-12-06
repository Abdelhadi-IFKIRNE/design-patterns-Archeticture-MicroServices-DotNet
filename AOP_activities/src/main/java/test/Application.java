package test;

import metier.Account;
import metier.IMetier;
import metier.MetierImpl;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        System.out.println("Démarrage de l'applcation ... ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Donner un code du compte :");
        Long code= scanner.nextLong();
        System.out.println("Donner un montant du compte : ");
        Double montant= scanner.nextDouble();
        IMetier metier=new MetierImpl();
        metier.addAccount(new Account(code,montant));

        while (true){
          try {
              System.out.println("Entrer le nom de l'operation :");
              String op=scanner.next();
              if(op.equals("quitter")) break;
              else if (op.equals("v")) {
                  System.out.print("donner le montant :");
                  Double amount=scanner.nextDouble();
                  metier.verser(code,amount);
                  System.out.println(metier.getAccount(code).toString());
              } else if (op.equals("t")) {
                  System.out.print("donner le montant :");
                  Double amount=scanner.nextDouble();
                  metier.retirer(code,amount);
                  System.out.println(metier.getAccount(code).toString());
              }else if (op.equals("c")){
                  System.out.println(metier.getAccount(code).toString());
              }else {
                  System.out.println("cette operation n'existe pas non plus ..!");
              }
          }catch (Exception e){
              System.out.println(e.getMessage());
          }
        }

    }
}

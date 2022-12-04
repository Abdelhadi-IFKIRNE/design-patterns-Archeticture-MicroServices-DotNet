package org.example.firstAspect;

public aspect aspectMain {
    pointcut pc1(): execution(* test.Application.main(..));
    before():pc1(){
        System.out.println("*********************************************");
        System.out.println("Avant l'execution de la methode main ......!");
        System.out.println("**********************************************");
    }

    after():pc1(){
        System.out.println("*********************************************");
        System.out.println("Apres l'execution de la methode main ......!");
        System.out.println("**********************************************");    }
}

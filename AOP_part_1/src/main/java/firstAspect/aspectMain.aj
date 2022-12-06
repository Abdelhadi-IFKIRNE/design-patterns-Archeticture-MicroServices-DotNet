package firstAspect;

public aspect aspectMain {
    pointcut pc1(): execution(* test.Application.mai(..));

//    before():pc1(){
//        System.out.println("*********************************************");
//        System.out.println("Avant l'execution de la methode main ......!");
//        System.out.println("**********************************************");
//    }
//
//    after():pc1(){
//        System.out.println("*********************************************");
//        System.out.println("Apres l'execution de la methode main ......!");
//        System.out.println("**********************************************");
//    }

   void around():pc1(){
        System.out.println("*********************************************");
        System.out.println("Avant l'execution de la methode main ......!");
        System.out.println("**********************************************");
        proceed();
        System.out.println("*********************************************");
        System.out.println("Apres l'execution de la methode main ......!");
        System.out.println("**********************************************");

    }
}

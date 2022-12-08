package org.example;

import org.example.metier.IMetier;
import org.example.metier.IMetierImpl;
import org.example.metier.SecurityContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"org.example"})
public class Main {
    public static void main(String[] args) {
       try {
           SecurityContext.authenticate("abdelhadi","1234",new String[]{"USER"});
           ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Main.class);
           IMetier metier=applicationContext.getBean(IMetier.class);
           System.out.println("------------------------");
           System.out.println(metier.getClass().getName());
           System.out.println("------------------------");
           metier.display();
           System.out.println(metier.account());
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

}
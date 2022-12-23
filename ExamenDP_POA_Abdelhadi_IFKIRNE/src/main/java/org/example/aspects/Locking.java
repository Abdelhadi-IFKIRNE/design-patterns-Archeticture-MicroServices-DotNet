package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Locking {

    @Around("@annotation(Lock)")
    public void lock(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("cette methode ne peut pas s'executer elle est Verrouiller .....");
    }
}

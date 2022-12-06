package firstAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectAnnota {

    @Pointcut("execution(* test.*.mai(..))")
    public void pc1(){}

//    @Before("pc1()")
//    public void beforeMain(){
//        System.out.println("hello c'est de l'annotation before .......!");
//    }
//
//    @After("pc1()")
//   public void afterMain(){
//        System.out.println("hello c'est l'annotation after......!");
//    }

    @Around("pc1()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("hello c'est de l'annotation before .......!");
        //proceedingJoinPoint.proceed();
        System.out.println("hello c'est l'annotation after......!");
    }

}

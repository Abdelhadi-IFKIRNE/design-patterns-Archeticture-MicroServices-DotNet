package firstAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Scanner;

@Aspect
public class SecurutyAspect {

    @Pointcut("execution(* test.Application.start(..))")
    void pc1(){}

    @Around("pc1()")
    public void verifyAuthorization(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Donner username : ");
        String username=scanner.next();
        System.out.print("Donner password  : ");
        String password=scanner.next();

        if(username.equals("root") && password.equals("1234")){
            proceedingJoinPoint.proceed();
        }else {
            throw new RuntimeException("access not authorized ....!");
        }
    }
}

package firstAspect;

import metier.Account;
import metier.MetierImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class patchAspect {

    @Pointcut("execution(* metier.MetierImpl.retirer(..))")
    void pc1(){}

    @Around("pc1() && args(code,balance)")
    public Object verifyAmount(Long code,double balance, ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint) throws Throwable {
        MetierImpl metier= (MetierImpl) joinPoint.getTarget();
        Account account=metier.getAccount(code);
        if(account.getBalance()<balance){
           throw new RuntimeException("solde insufisant .....!");
        }else {
            return proceedingJoinPoint.proceed();
        }
    }
}

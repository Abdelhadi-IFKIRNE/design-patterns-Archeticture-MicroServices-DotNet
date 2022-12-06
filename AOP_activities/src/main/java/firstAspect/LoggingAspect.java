package firstAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger=Logger.getLogger(LoggingAspect.class.getName());

    public LoggingAspect() throws IOException {
        logger.addHandler(new FileHandler("logger.xml"));
        logger.setUseParentHandlers(false);
    }

    @Pointcut("execution(* metier.MetierImpl.*(..))")
    public void pc1(){}

    @Around("pc1()")
    public Object autour(ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint) throws Throwable {
       Long t1= System.currentTimeMillis();
       logger.info("-------------------- avant l'execution -----------------------");
       logger.info(joinPoint.getSignature().getName());
       Object object=proceedingJoinPoint.proceed();
       Long t2=System.currentTimeMillis();
       logger.info("-------------------- apres l'execution ------------------------");
       logger.info(joinPoint.getSignature().getName());
       logger.info("temps d'execution de la methode est :"+(t2-t1));
       return object;
    }
}

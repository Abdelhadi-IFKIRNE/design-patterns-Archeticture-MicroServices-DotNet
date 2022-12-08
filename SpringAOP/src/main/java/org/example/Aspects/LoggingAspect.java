package org.example.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
@EnableAspectJAutoProxy
@Component
public class LoggingAspect {
    Logger  logger=Logger.getLogger(LoggingAspect.class.getName());

    public LoggingAspect() throws IOException {
        logger.addHandler(new FileHandler("logger.xml"));
        logger.setUseParentHandlers(true);
    }

    @Around("@annotation(org.example.Aspects.Log)")
    public void controlIMetierImpl(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        double t1=System.currentTimeMillis();
        logger.info("avant l'execution de la methode ....");
        proceedingJoinPoint.proceed();
        logger.info("apres l'execution de la methode ....");
        double t2=System.currentTimeMillis();
        logger.info("Duration : " +(t2-t1));
    }
}

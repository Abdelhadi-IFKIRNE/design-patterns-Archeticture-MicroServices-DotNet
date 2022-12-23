package org.example.aspects;

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
public class Journalisation {
    Logger logger=Logger.getLogger(Journalisation.class.getName());

    public Journalisation() throws IOException {
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(true);
    }

    @Around("@annotation(Log)")
    public void logging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("avant l'execution ........");
        proceedingJoinPoint.proceed();
        logger.info("apres l'execution .......");
    }
}

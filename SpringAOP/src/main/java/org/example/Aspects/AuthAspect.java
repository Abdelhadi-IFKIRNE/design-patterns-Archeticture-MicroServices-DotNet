package org.example.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.metier.SecurityContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

@Aspect
@EnableAspectJAutoProxy
@Component
public class AuthAspect {
    @Around(value = "@annotation(securedByAspect)",argNames = "pjp,securedByAspect")
    public void verifyAuth(ProceedingJoinPoint pjp,SecuredByAspect securedByAspect) throws Throwable {
        String[] roles= securedByAspect.roles();
        boolean isAuth=false;
        for (String s:roles) {
            if(SecurityContext.hasRole(s))
                isAuth=true;
        }

        if(isAuth){
            pjp.proceed();
        }else {
            throw new RuntimeException("access unauthorized.....!");
        }
    }
}

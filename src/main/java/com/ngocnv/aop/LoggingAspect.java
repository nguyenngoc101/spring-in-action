package com.ngocnv.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by framgia on 08/11/2016.
 */

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.ngocnv.aop.CustumerBo.addCustumer(..))")
    public void addCustomer(){};

//    @Before("addCustomer()")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("logBefore() is running");
//        System.out.println("hijacked: " +joinPoint.getSignature().getName());
//        System.out.println("***********");
//    }
//
//    @After("addCustomer()")
//    public void logAfter(JoinPoint joinPoin) {
//        System.out.println("logAfter() is running");
//        System.out.println("hijacked: " + joinPoin.getSignature().getName());
//        System.out.println("********");
//    }
//
//    @AfterThrowing("addCustomer()")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println("logAfterThrwing() is running");
//        System.out.println("hijacked: " + joinPoint.getSignature().getName());
//        System.out.println("********");
//    }

    @Around("addCustomer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logBefore is running");
        System.out.println("hijacked: " + joinPoint.getSignature().getName());
        System.out.println("********");
        joinPoint.proceed();
        System.out.println("logAfter is running");
        System.out.println("hijacked: " + joinPoint.getSignature().getName());
        System.out.println("********");
    }
}

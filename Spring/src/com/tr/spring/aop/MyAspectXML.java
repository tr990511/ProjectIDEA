package com.tr.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {
    public void checkPri(JoinPoint joinPoint){
        System.out.println("校验权限");
    }
    public void writeLog(Object result){
        System.out.println("日子记录");
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Object object=joinPoint.proceed();
        System.out.println("环绕后");
        return object;
    }
}

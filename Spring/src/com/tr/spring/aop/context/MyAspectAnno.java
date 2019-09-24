package com.tr.spring.aop.context;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class MyAspectAnno {
    @Pointcut(value = "execution(* com.tr.spring.aop.context.OrderDao.save(..))")
    private void pointcut1(){}
    @Before(value = "MyAspectAnno.pointcut1()")
    public  void befor(){
        System.out.println("前置。。。");
    }
    @AfterReturning(value = "execution(* com.tr.spring.aop.context.OrderDao.delete(..))",returning = "result")
    public void after(Object result){
        System.out.println("后置。。。"+result);
    }
    @Around(value = "execution(* com.tr.spring.aop.context.OrderDao.update(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前。。。");
        Object obj=joinPoint.proceed();
        System.out.println("环绕后。。。");
        return obj;
    }
    @AfterThrowing(value = "execution(* com.tr.spring.aop.context.OrderDao.*(..))",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("异常抛出。。。"+e.getMessage());
    }
    @After(value = "execution(* com.tr.spring.aop.context.OrderDao.*(..))")
    public void after(){
        System.out.println("================");
    }
}

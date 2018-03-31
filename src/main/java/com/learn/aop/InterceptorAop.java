package com.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * 
 * @author wei.sun02
 *
 */
@Aspect  //定义一个切面，注解配置需要。
@Component //使这个切面类可以被扫描到。注解配置需要。
public class InterceptorAop {
	@Pointcut("execution (* com.learn.service..*.*(..))")
	public void anyMethod() {}//声明一个切入点，anyMethod为切入点名称，此方法注解配置需要。
	
	@Before("anyMethod()")  
    public void doBefore() {
        System.out.println("========执行前置通知 /Before:在目标方法被调用之前做增强处理==========");
    }
    
	@AfterReturning("anyMethod()") //注解配置需要。
    public void doAferReturning() {
        System.out.println("=========执行后置通知/AfterReturning在目标方法正常完成后做增强================");
    }
    
	@After("anyMethod()") //注解配置需要。
    public void doAfter() {
        System.out.println("========执行最终通知/After:在目标方法完成之后做增强，无论目标方法是否成功完成==========");
    }
    
	@AfterThrowing("anyMethod()") //注解配置需要。
    public void doAferThrowing() {
        System.out.println("=============执行意外通知/AfterThrowing:主要用来处理程序中未处理的异常================");
    }
    
	@Around("anyMethod()") //注解配置需要。
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        
        System.out.println("=========进入判断方法/Around:环绕通知,在目标方法完成前后做增强处理,环绕通知是最重要的通知类型,像事务,日志等都是环绕通知===========");
        Object result = pjp.proceed();
        System.out.println("==========进入退出方法/Around:环绕通知,在目标方法完成前后做增强处理,环绕通知是最重要的通知类型,像事务,日志等都是环绕通知==========");
        return result;
    }
}
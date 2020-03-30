package com.example.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectJAdvice {

//    @Pointcut("execution(* com.example.demo.controller.UserController.login(..)) && @annotation(com.example.demo.config.newAnnotation)")
    @Pointcut("execution(* com.example.demo.controller.*.*(..)) && @annotation(com.example.demo.config.newAnnotation)")
    private void aspectJMethodGet(){};

    @Before("aspectJMethodGet()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("----dobefore()开始----");
        System.out.println("执行业务逻辑前做一些工作");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        if(false){
            throw new RuntimeException("权限不足");
            // 直接跳转到提示页面
        }
        System.out.println("通过jointPoint获得所需内容：");
        System.out.println("----dobefore()结束----");

    }
}

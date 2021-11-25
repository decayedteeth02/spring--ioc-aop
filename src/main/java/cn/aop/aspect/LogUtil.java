package cn.aop.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogUtil {
    @Before("execution(* cn.aop.dynamic..*.*(..))")
    public static void before(){
        System.out.println("方法钱");
    }


}

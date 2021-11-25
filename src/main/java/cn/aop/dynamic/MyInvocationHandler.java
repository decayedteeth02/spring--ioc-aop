package cn.aop.dynamic;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {

    //被代理的对象
    Object target;

    public MyInvocationHandler(Object targer) {
        this.target=targer;
    }

    //代理类执行的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(args==null||args.length==0){
            System.out.println("日志：没有参数");
        }else {
            System.out.println("用户调用了ADD方法，参数是"+ Arrays.asList(args));
        }

        //直线被代理的方法
//        Object obj,被代理的对象
//        Object... args 被代理的方法参数
        Object result=method.invoke(target,args);
        System.out.println("日志："+result);
        return result;
    }
}

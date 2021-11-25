package cn.aop.dynamic;

import cn.aop.statically.GamePlayer;
import cn.aop.statically.IGamePlayer;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//利用jdk动态生成代理类
public class MainTest {
    @Test
    public void test(){
        IGamePlayer proxy = (IGamePlayer)MainTest.createProxy(new GamePlayer("AA"));
        proxy.play();


    }
    //公共jdk动态代理对象生成
    public static Object createProxy(Object needProxy){
        ClassLoader classLoader =needProxy.getClass().getClassLoader();
        Class<?>[] interfaces=needProxy.getClass().getInterfaces();
        //传入被代理的对象
        InvocationHandler handler=new MyInvocationHandler(needProxy);

        //动态创建代理类
        Object o =  Proxy.newProxyInstance(classLoader,interfaces,handler);
        System.out.println(o.getClass());

        return o;
    }
}

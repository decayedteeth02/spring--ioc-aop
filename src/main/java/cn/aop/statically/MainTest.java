package cn.aop.statically;

import cn.aop.statically.GameProxyPlayer;
import cn.aop.statically.GamePlayer;
import org.junit.jupiter.api.Test;
    //静态测试
public class MainTest {
    @Test
    public void test(){
        GameProxyPlayer gamePlayer=new GameProxyPlayer("CC");
        gamePlayer.start();
        gamePlayer.play();

    }

}

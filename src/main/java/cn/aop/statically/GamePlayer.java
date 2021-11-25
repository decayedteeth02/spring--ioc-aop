package cn.aop.statically;

import org.springframework.stereotype.Component;

@Component
//静态代练
public class GamePlayer implements IGamePlayer {

    private String name="";
    public GamePlayer(String name){
        this.name=name;
    }

    @Override
    public void start() {
        System.out.println("登陆游戏");
        System.out.println(name+"开始了游戏");
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println(name+"被曹贼击杀");
    }
}

package cn.aop.statically;

//静态代理
public class GameProxyPlayer implements IGamePlayer{

    private String name;
    private GamePlayer gamePlayer;

    public GameProxyPlayer(String name) {
        this.name=name;
        this.gamePlayer=new GamePlayer(name);
//        开始代练
    }

    @Override
    public void start() {
        System.out.println("拿到"+name+"用户名密码");
        gamePlayer.start();
    }

    @Override
    public void play() {
        System.out.println("代练击杀了曹贼");
    }
}

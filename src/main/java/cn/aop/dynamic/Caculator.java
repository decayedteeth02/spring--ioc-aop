package cn.aop.dynamic;

public class Caculator implements ICaculator{

    @Override
    public Integer add(Integer i,Integer j) {

        Integer result=i+j;
        return result;
    }

    @Override
    public Integer sub(Integer i,Integer j) {
        Integer result=i-j;
        return result;
    }

    @Override
    public Integer muc(Integer i,Integer j) {
        Integer result=i*j;
        return result;
    }

    @Override
    public Integer div(Integer i,Integer j) {
        Integer result=i/j;
        return result;
    }

    @Override
    public String toString() {
        return "Caculator{}";
    }
}

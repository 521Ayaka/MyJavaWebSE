package 基础知识.多态.Polymorphism03;

public class Zi extends Fu{

    @Override
    public void method() {
        System.out.println("子类覆盖重写父类方法");
    }

    public void methodZi(){
        System.out.println("子类特有的方法");
    }


}

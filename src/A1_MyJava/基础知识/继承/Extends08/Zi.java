package A1_MyJava.基础知识.继承.Extends08;

public class Zi extends Fu {
    int sup = 20;

    public void method() {
        System.out.println(super.sup);
        System.out.println("同名子类方法！");
        super.method();
    }

    public Zi() {
        System.out.println("子类构造方法执行！");
    }
}

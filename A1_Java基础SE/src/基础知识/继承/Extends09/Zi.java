
package 基础知识.继承.Extends09;

public class Zi extends Fu {
    int num;

    public void method() {
        int num = 321;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void methodA() {
        this.methodB();
        this.methodB();
        System.out.println("AAA");
    }

    public void methodB() {
        System.out.println("BBB");
    }

    public Zi() {
        this(666);
        System.out.println("子类无参构造方法执行");
    }

    public Zi(int x) {
        this(222, 333);
        System.out.println("====================================");
        System.out.println("子类另一个构造方法执行！参数为：" + x + "。");
    }

    public Zi(int x, int y) {
        this.num = 123;
        System.out.println("子类另另一个构造方法执行！参数为：" + x + "&&" + y + "。");
    }
}

package 基础知识.继承.Extends07;

public class Zi extends Fu {
    int num = 200;
    String str = "尴尬了";

    public Zi() {
        System.out.println("子类无参构造方法。");
    }

    public Zi(int num, String str) {
        super(num, str);
        System.out.println("子类有参构造方法。");
    }
}

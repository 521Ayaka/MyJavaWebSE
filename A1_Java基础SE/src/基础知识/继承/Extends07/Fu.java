package 基础知识.继承.Extends07;

public class Fu {
    int num = 100;
    String str = "尴尬酱";

    public Fu() {
        System.out.println("父类无参构造方法。");
    }

    public Fu(int num) {
        System.out.println("父类有参构造方法。");
    }

    public Fu(int num, String str) {
        System.out.println(num);
        System.out.println(str);
    }
}

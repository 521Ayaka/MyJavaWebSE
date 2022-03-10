package 基础知识.类库.GetSet;

public class LeiYong {
    public static void main(String[] args) {
        //用无参数的构造方法
        Lei lei1 = new Lei();
        lei1.setName("尴尬酱");
        lei1.setAge(18);
        lei1.setAihao("玩LOL，次饭，学习，睡觉，敲代码");
        lei1.setLiubu(true);

        System.out.println("我叫" + lei1.getName());
        System.out.println("今年已经" + lei1.getAge() + "岁了");
        System.out.println("我的爱好是：" + lei1.getAaihao());
        System.out.println("我玩LOL很6的，" + lei1.isLiubu() + "的!!!");
        System.out.println("========================================");

        //用有参数的构造方法
        Lei lei2 = new Lei( "尴尬酱", 18, "玩LOL，次饭，学习，睡觉，敲代码", true,666);
        System.out.println("我叫" + lei2.getName());
        System.out.println("今年已经" + lei2.getAge() + "岁了");
        System.out.println("我的爱好是：" + lei2.getAaihao());
        System.out.println("我玩LOL很6的，" + lei2.isLiubu() + "的!!!");
        System.out.println("========================================");
        lei2.setAge(19);//仍然可以在方法内部使用Getter/Settet方法。
        System.out.println("快过年了，我快" + lei2.getAge() + "了");
        System.out.println("========================================");
    }
}

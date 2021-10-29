package 基础知识.案例.红包案例1;

//所有成员    //父类
public class User {

    //使用private修饰成员变量，用下面的GetSet方法调用等，提高安全性。
    private String name;
    private double money;
    private double max;

    //构造方法
    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    //成员方法，打印用户信息。
    public void show() {
        System.out.println("我叫：" + this.name + "。我的余额为：" + this.money);
    }

    //使用三对GetSet方法提高安全性
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}

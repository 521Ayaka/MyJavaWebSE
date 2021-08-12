package A1_MyJava.基础知识.类量.A类作为变量类型;

public class Hero {

    private String name;
    private int age;
    private Weapon weapon;

    public void method(){
        System.out.println("年龄为"+age+"的"+name+",正在拿着["+ weapon.getCode()+"]打野......真坑！");
    }

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

package 基础知识.类量.A接口作为变量类型;


//hero 英雄
public class Hero {

    private String name;
    private int age;
    private Skill skill;
    private Weapon weapon;

    //打印英雄信息及行为
    void method(){
        System.out.print("年龄为:"+age+"的"+name+",正在拿着["+ weapon.getCode()+"] 使用名为[");
        skill.use();
        System.out.println("]的技能 在打野......真坑！");
    }


    void skill(){

    }

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon, Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

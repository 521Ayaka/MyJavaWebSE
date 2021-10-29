package 基础知识.类量.A接口作为变量类型;

public class MyGame {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("寒冰射手-艾希");
        hero.setAge(18);

        //创建武器
        Weapon weapon = new Weapon("AK-47");
        //创建技能
        SkillImpl impl = new SkillImpl();

        //传递类型参数
        hero.setWeapon(weapon);
        hero.setSkill(impl);

        //调用英雄
        hero.method();

        System.out.println("==========================================================================================");

        //简便写法

        //匿名内部类来实现接口
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.print("利刃华尔兹 / 华尔兹圆舞曲");
            }
        };
        //创建英雄并传入英雄数据
        Hero hero1 = new Hero("无双剑姬" , 3 , new Weapon("多兰剑") , skill);
        hero1.method();

        System.out.println("==========================================================================================");

        //另外的
        hero1.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.print("无双挑战");
            }
        });

        hero1.method();




    }

}

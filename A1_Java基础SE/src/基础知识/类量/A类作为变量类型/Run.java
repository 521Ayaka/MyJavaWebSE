package 基础知识.类量.A类作为变量类型;

public class Run {

    public static void main(String[] args) {
        //创建英雄对象
        Hero heroOne = new Hero();
        //传递英雄信息
        heroOne.setName("大盖伦");
        heroOne.setAge(32);

        //创建武器对象
        Weapon weapon = new Weapon();
        weapon.setCode("AK-47");

        //传递武器参数
        heroOne.setWeapon(weapon);

        heroOne.method();
        System.out.println("========================================================================================");

        //直接创建英雄对象并向内部传入英雄信息参数
        Weapon weapon1 = new Weapon("无尽之刃");
        Hero heroTwo = new Hero("疾风剑豪",31,weapon1);

        heroTwo.method();



    }

}

package 基础知识.转型.用Instanceof关键字;
/*
如何才能知道一个父类引用的对象，本来是什么类?
格式: 对象名称 instanceof 子类名称;

这样返回的是一个boolean值，用于判断父类引用的对象是否为后面的类
*/
public class Down {

    public static void main(String[] args) {

        Animal animal = new Cat();

        //使用instanceof关键字进行判断父类引用的对象是否为后面的子类
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchMouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

        //什么时候使用instanceof:
        giveMeAPet(new Dog());//调用方法，传入子类对象，父类引用指向子类对象，就是向上转型，多态。
    }

    //当另一个方法参数是个父类 大范围 ，传入的参数是某子类 小范围，在该方法当中是不知道父类引用的是那个子类，使用instanceof进行判断。
    public static void giveMeAPet(Animal animal){
        //判断父类是否引用的狗子
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;//向下转型
            dog.watchMouse();
        }
        //判断父类是否引用的猫
        if(animal instanceof Cat){
            Cat catTwo = (Cat)animal;//向下转型
            catTwo.catchMouse();
        }
    }

}

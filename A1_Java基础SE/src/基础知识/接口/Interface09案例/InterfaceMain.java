package 基础知识.接口.Interface09案例;

public class InterfaceMain {

    public static void main(String[] args) {

        //创建笔记本电脑对象
        Laptop laptop = new Laptop();

        laptop.powerOn();  //打开电脑

        System.out.println("=========");
        //第一种方法: 使用多态，接口引用指向实现类对象
        USB usb = new Mouse();
        laptop.useDevice(usb);

        System.out.println("=========");
        //第二种方法: 没有使用多态，但是方法传入参数时，也会自动向上转型。
        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard);//                      keyboard ---> usb    也会自动向上转型为usb

        System.out.println("=========");
        //另外 也可以是由匿名对象更为简单:
        laptop.useDevice(new UsbLight());//       同理:     new UsbLight() ---> usb 也会自动向上转型为usb

        System.out.println("=========");

        laptop.powerOff(); //关闭电脑

        System.out.println("==========================================================================================");

        method(10.0);//                       就比如:  int ---> double
        int num = 10;
        method((double) num); //会向上转型为double           int ----> double

    }

    public static void method(Double num){
        System.out.println(num);
    }

}

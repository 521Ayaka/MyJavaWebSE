package A1_MyJava.基础知识.内部类.InnerClass01;

public class Wai {

    int num = 10; //外部类的成员变量
    private String str = "外部类的成员变量";

    public void methodWai(){
        System.out.println("外部类的成员方法");
    }

    public class Nei{
        public void methodNei(){
            System.out.println("内部类的成员方法");

            System.out.println("======下面是调用外部类======");

            System.out.println("内部类调用"+str);  //内部类可以随意调用外部类的东西
            Wai.this.methodWai(); //调用外部类的成员方法。
        }
        String string = "内部类的成员变量";
        int num = 20; //内部类的成员变量
        public void methodNum(){
            int num = 30; //内部类的局部变量
            System.out.println("内部局部变量:"+num);
            System.out.println("内部成员变量:"+this.num);
            System.out.println("外部成员变量:"+Wai.this.num);
        }
    }

    public void method(){
      //System.out.println(string);//无法调用
        System.out.println(new Nei().string);
        //外用内，要创建对象或者使用匿名对象来调用内部。
        new Nei().methodNei();
    }

    //使用内部类:
    //==========================================================================================
    //1. 间接使用内部类
    public void method01(){
        Nei nei = new Nei();
        System.out.println("简介调用内部类："+nei.string);
        System.out.print("间接调用内部类：");
        nei.methodNei();
    }

}

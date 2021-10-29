package 基础知识.内部类.InnerClass02;
/*


*/
public class Wai {

    public void methodOuterOne(){

        class InnerOne {
            String str = "局部内部类成员变量";
            void method(){
                System.out.println("局部内部类的成员方法");
            }
        }

        InnerOne innerOne = new InnerOne();
        System.out.println(innerOne.str);
        innerOne.method();
    }
    public void methodOutTwo(){
        int num = 666; //final可以不写，但是必须保证变量值不再改变
        //num = 555; //如果重新赋值，就不是final
        final int age = 18;
        class InnerTwo{
            public void method(){
                System.out.println(num);
                System.out.println(age);
            }
        }
    }



}

package 基础知识.异常.异常分类;

/*
编译时异常和运行时异常的区别
java 中的异常被分为两大类: [编译时异常][运行时异常]，也被称为[受检异常]和[非受检异常]
所有的RuntimeException类及其子类被称为【运行时异常】，其他的异常都是【编译时异常】

[编译时异常]: 必须显示处理，否则程序就会发生错误，无法通过编译。

[运行时异常]: 无需显示处理，也可以和编译时异常一样处理。

*/

public class YiChang {

    public static void main(String[] args) {
        System.out.println("开始运行");

        method1();
        method2();

        System.out.println("结束运行");


    }

    //运行时异常(进行异常处理)
    public static void method1(){
        int [] array = {0,1,2,3,4};
        try {
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("运行异常，索引越界");
        }
    }

    //运行时异常(不进行处理)
    public static void method2(){
        int [] array = {0,1,2,3,4};
        System.out.println(array[5]);
    }

    //编译时异常
/*
    public static void method3(){
        int a = "gan";
        :\源代码\src\MyJava\Lei\异常\异常分类\YiChang.java:46:17
        java: 不兼容的类型: java.lang.String无法转换为int
    }

    //没有调用，编译也不会通过，必须返回代码当中进行修改
*/
}

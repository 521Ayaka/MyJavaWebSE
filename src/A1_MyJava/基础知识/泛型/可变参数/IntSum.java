package A1_MyJava.基础知识.泛型.可变参数;
/*
 可变参数
 public static int sum(int... a){}
 public static int sum(int b, int... a){}
 public static int sum(String str, int... a){}


 ！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！!!
 可变参数就是把数据封装到一个数组。数据类型 [] 形参 = { 实参 };

*/
public class IntSum {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println("======================");
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
        System.out.println("======================");
        System.out.println(sum("总数和为", 10, 20, 30, 40, 50, 60, 70, 80));

        int [] a ={};
    }

    //可变参数方法
    public static int sum(int... a) {
        int i = 0;
        for (int num :
                a) {
            i += num;
        }
        return i;
    }

    public static int sum(int a) {
        return a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    /*
    //错误写法，Vararg必须在最后一个参数
    public static int sum(int ...a, int b){
        return 0;
    }
    */

    //正确写法
    public static int sum(String str, int... a) {
        int i = 0;
        for (int num :
                a) {
            i += num;
        }
        System.out.print(str + "：");
        return i;
    }

    /*这种也是可以的，不过上面有一个带sum(int...a){}的方法了，不能重复，这里也算重复
    public static int sum(int b, int... a) {
        int i = 0;
        for (int num :
                a) {
            i += num;
        }
        i+=b;
        return i;
    }
    */


}

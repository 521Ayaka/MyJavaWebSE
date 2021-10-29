package 基础知识.类库.Math;
/*

java.lang.Math
Math是没有构造方法的，但是内部的成员方法都是静态static方法。
可以根据类名称调用方法

*/
public class MathLei {

    public static void main(String[] args) {

        //public static int abs (int a){...}                   // 返回参数的绝对值 [方法可重载]

        //public static double ceil (double a){...}            // 向上取整

        //public static double floor (double a){...}           // 向下取整

        //public static int round (double a){...}              // 四舍五入

        //public static int max (int a, int b){...}            // 比价两个参数那个大，并返回最大值 [方法可重载]

        //public static int min (int a, int b){...}            // 比较两个参数那个小，并返回最小值 [方法可重载]

        //public static double por (double a, double b){...}   // 返回第一个参数的第二个参数次幂的值 [参数和返回值都是double]

        //public static double random (){...}                  // 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。

        System.out.println("==========================================================================================");

        //public static int abs (int a){...}                  // 返回参数的绝对值 [方法可重载]
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5.21));
        System.out.println("==========");
        //public static double ceil (double a){...}           // 向上取整
        System.out.println(Math.ceil(5.21));
        System.out.println(Math.ceil(-5.21));
        System.out.println("==========");
        //public static double floor (double a){...}          // 向下取整
        System.out.println(Math.floor(5.21));
        System.out.println(Math.floor(-5.21));
        System.out.println("==========");
        //public static int round (double a){...}             // 四舍五入
        System.out.println(Math.round(6.6));
        System.out.println("==========");
        //public static int max (int a, int b){...}           // 比价两个参数那个大，并返回最大值 [方法可重载]
        System.out.println(Math.max(5.21, 5.211314));
        System.out.println(Math.max(521, 5211314));
        System.out.println("==========");
        //public static int min (int a, int b){...}           // 比较两个参数那个小，并返回最小值 [方法可重载]
        System.out.println(Math.max(5.21, 5.211314));
        System.out.println(Math.max(521, 5211314));
        System.out.println("==========");
        //public static double pow (double a, double b){...}  // 返回第一个参数的第二个参数次幂的值 [参数和返回值都是double]
        System.out.println(Math.pow(8, 2));                   //8 2 强制转换成8.0 和 2.0 ，返回的值也是 64.0 的 double
        System.out.println("==========");
        //public static double random (){...}                 // 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
        System.out.println(Math.random());
        System.out.println("1-10生成20个随机数");
        for (int i = 0; i < 20; i++) {
            System.out.println( (int)(Math.random()*10+1) );
        }



    }

}

package 基础知识.异常.Throwable;
/*

public String getMessage(){...}     //返回throwable的详细消息字符串  [返回值是String]
public String toSting(){...}        //返回此可抛出的简短描述         [返回值是String]
public void printStackTrace(){...}  //把异常的错误信息输出在控制台     [无返回值，直接打印]

只要是这个体系的都能使用Throwable的成员变量。

*/


public class ThrowableLei {

    public static void main(String[] args) {

        System.out.println("程序开始");

        method1(); /** Index 3 out of bounds for length 3 */

        method2(); /** java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 */

        method3(); /** java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
                       at MyJava.基础知识.异常.Throwable.ThrowableLei.method3(ThrowableLei.java:51)
                       at MyJava.基础知识.异常.Throwable.ThrowableLei.main(ThrowableLei.java:22)           */

        method4(); // JVM向下运行

        System.out.println("程序结束");
    }

    //成员方法1
    //public String getMessage(){...}     //返回throwable的详细消息字符串  [返回值是String]
    public static void method1(){

        try {
            int[] array = {0,1,2};
            System.out.println(array[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    //成员方法2
    //public String toSting(){...}        //返回此可抛出的简短描述         [返回值是String]
    public static void method2(){
        try {
            String[] str = {"异常数组索引值"};
            System.out.println(str[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }

    //成员方法3
    //public void printStackTrace(){...}  //把异常的错误信息输出在控制台     [无返回值，直接打印]
    public static void method3(){
        try {
            double[] num ={0.00};
            System.out.println(num[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    //JMV在碰见异常的时候不会继续运行，但用try...catch...异常处理后，会往下继续运行。
    public static void method4(){
        System.out.println("JMV继续运行");
    }

}

package 基础知识.异常.异常处理.try_To_catch;

/*
[格式]:
      try{
           //可能出现的异常的代码;
      } catch(异常类名 变量名){
           //异常的处理代码;
      }

[说明]: 程序从try里面的代码开始执行
       出现异常，会自动生成一个异常类对象，该异常对象将被提交给java运行时系统
       当Java运行时系统接收到异常对象时，回到catch中找匹配的异常类，找到后进行异常的处理
       执行完毕之后，程序还可以继续往下执行。

[补充]: JVM的默认处理方案:
       如果程序出现了问题，我们没有做任何处理，最终JVM会默认的处理
       --把异常的名称，异常的原因及异常出现的位置等信息输出在了控制台
       --程序停止执行

========================================================================================================================

Throwable的成员方法:
public String getMessage(){...}     //返回throwable的详细消息字符串
public String toSting(){...}        //返回此可抛出的简短描述
public void printStackTrace(){...}  //把异常的错误信息输出在控制台

 */
public class try_catch {

    public static void main(String[] args) {
        System.out.println("程序开始运行");
        System.out.println("=========");

        method();

        System.out.println("程序结束运行");
        System.out.println("=========");
    }

    public static void method(){

        int [] array = { 0, 1, 2, 3, 4,5, 6};
        System.out.println(array[3]);
//      System.out.println(array[7]);   //异常类: ArrayIndexOutOfBoundsException
        try{
            System.out.println(array[7]);
        }catch(ArrayIndexOutOfBoundsException e){  //可以直接写Exception
            System.out.println("这个索引值越界了");
            e.printStackTrace(); //调用对象的方法
            e.toString();
        }

    }

}

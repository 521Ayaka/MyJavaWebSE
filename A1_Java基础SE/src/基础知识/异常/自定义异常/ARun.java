package 基础知识.异常.自定义异常;
import java.util.Scanner;
/*
[创建异常]:
格式:        修饰符 class 自定义异常名 extends Exception { //... }
两个构造方法:  public 自定义异常名(){ }
             public 自定义异常名(String message){
                    super(message);
             }

[使用]:
格式: throw new 自定义异常名(  "异常的提示(字符串，也可以留空)"  );
注意: 方法头()后面要使用 throws 自定义异常名{ //... }
     在调用这个带异常的方法的时候 可以对这个方法使用 try...catch...处理

========================================================================================================================

[注意]:
throws 和 throw 的区别:

[1]
throws 用在方法声明后面，跟的时异常类名。
throw  用在方法内部，跟的时异常对象名。

[2]
throws 表示抛出异常，有该方法的调用者来处理
throw  表示抛出异常，有方法体内的语句处理

[3]
throws 表示出现异常的一种可能性，并不一定会发生这些异常
throw  执行throw一定出现了某种异常

*/

public class ARun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        Teacher teacher = new Teacher();
        try {
            teacher.scoreMethod(score);
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }

}

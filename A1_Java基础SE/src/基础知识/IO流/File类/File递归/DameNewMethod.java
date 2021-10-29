package 基础知识.IO流.File类.File递归;

/**
 * 根据Review中的问题，使用递归的方法进行操作
 * 递归解决问题: 使用递归就必须先定义一个方法
 * 定义一个方法 f(n) 来表示第n个月的兔子数
 * 那么, 第 n-1 个月的兔子数就是 f(n-1)
 * 同理, 第 n-2 个月的兔子数就是 f(n-2)
 */


public class DameNewMethod {

    public static void main(String[] args) {

        //调用f(int n)
        try{
            System.out.println(f(20));//这样会出现异常。而且还是Error体系中的异常，无法解决。
            System.out.println("f(int n) 未出现异常！！！");
        }catch (StackOverflowError e) {
            System.out.println("f(int n) 出现异常！！！");
            System.out.println("发生异常, 异常类: Error体系的：StackOverflowError 类");
            System.out.println("API说明: 当应用程序递归太深而发生堆栈溢出时，抛出该错误。");
        }

        System.out.println("=========================================================");

        //修改后的fx(int n)
        try{
            System.out.println(fx(20));//这样就不会出现栈溢出异常了。
            System.out.println("fx(int n) 未出现异常！！！");
        }catch (StackOverflowError e) {
            System.out.println("fx(int n) 出现异常！！！");
            System.out.println("发生异常, 异常类: Error体系的：StackOverflowError 类");
            System.out.println("API说明: 当应用程序递归太深而发生堆栈溢出时，抛出该错误。");
        }

        //拓展，使用递归求阶乘
        System.out.println(y(10));
        System.out.println(10*9*8*7*6*5*4*3*2*1);

    }

    //返回值 和 参数类型 都是int
    public static int f(int n) {
        n = f(n - 1) + f(n - 2);
        return n;//返回值是参数变量n
    }


    //重现修改后的
    public static int fx(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fx(n - 1) + fx(n - 2);
        }
    }

    //求阶乘的方法
    public static int y(int n){
        if (n == 1){
            return 1;
        }else {
            return n * y(n-1);
        }
    }

}

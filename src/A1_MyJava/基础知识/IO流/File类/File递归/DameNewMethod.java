package A1_MyJava.基础知识.IO流.File类.File递归;

/*
根据Review中的问题，使用递归的方法进行操作
    递归解决问题: 使用递归就必须先定义一个方法
        定义一个方法 f(n) 来表示第n个月的兔子数
        那么, 第 n-1 个月的兔子数就是 f(n-1)
        同理, 第 n-2 个月的兔子数就是 f(n-2)

*/


public class DameNewMethod {

    public static void main(String[] args) {

        //调用f(int n)
        System.out.println(f(20));

    }

    //返回值 和 参数类型 都是int
    public static int f(int n){
        if (i)
        n = f(n-1)+f(n-2);
        return n;//返回值是参数变量n
    }

}

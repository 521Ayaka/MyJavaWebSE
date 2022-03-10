package 基础知识.基础.Method;

/*
方法格式为：
            修饰符 返回值类型 方法名(参数列表){
                //代码省略...
                return 结果;
            }


其中：
     修饰符：     现阶段的固定写法，public static
     返回值类型： 也就是方法最终产生的数据结果是什么类型
     方法名称：   方法的名字，规则和变量一样，小驼峰
     参数类型：   进入方法的数据是什么类型
     参数名称：   进入方法的数据对应的变量名称
     PS：        参数如果有多个，使用逗号进行分隔
     方法体：    方法需要做的事情，若干行代码
     return：    两个作用，第一停止当前方法，第二将后面的返回值还给调用处
     返回值：    也就是方法执行后最终产生的数据结果

注意：return后面的“返回值”，必须和方法名称前面的“返回值类型”，保持对应。

===============================================================================

有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
例如两个数字相加，必须知道两个数字是各自多少，才能相加。

无参数：小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。
例如定义一个方法，打印固定10次HelloWorld。
例如求两数和：
        public static void printSum(int a, int b) {
            int result = a + b;
            System.out.println("结果是：" + result);
        }

=================================================================================

*/ 
public class Method01 {
    public static void main(String[] args) {
        int i = method( 2, 5, 7 );   //调用方法一
        System.out.println(" 方法输出结果为："+ i );
        method_void();                   //调用方法二
    }
    //带返回值的方法
    public static int method(int i, int n, int t) {
        int num = i*n*t;
        return num;
    }

    //不带返回值的方法
    public static void method_void(){
        for (int i = 0; i < 10; i++) {
            System.out.println("==================");
            System.out.println("   尴尬酱万岁！");
        }
    }
}

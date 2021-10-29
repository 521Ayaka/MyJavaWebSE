package 基础知识.IO流.特殊操作流.标准输入输出流.标准输出流;

import java.io.PrintStream;

// public static final PrintStream out : 标准输出流
public class StandardPrintStream {

    public static void main(String[] args) {
        //返回值类型为: PrintStream
        PrintStream ps = System.out;
        //PrintStream继承了OutputStream
        //此类里面有很多方法用于输出各种类型
        ps.println("字符串");
        ps.println(521);
        ps.println(true);
        ps.println('尴');
        ps.print(123);
        ps.print("Go");

        //直接时使用！
        System.out.println("这就是System.out.println()");
        System.out.println();
        //System.out.print(); //把ln去掉不放参数会报错，因为没有该方法

    }

}

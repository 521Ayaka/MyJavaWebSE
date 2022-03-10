package 基础知识.IO流.特殊操作流.字节字符打印流.字节打印流;

import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\字节打印流\\文件.txt");
        //使用方法
        ps.write(97);//a     //write有三种方法,单个字符,byte数组,byte数组一部分
        ps.println();  //换行
        ps.print(97);  //97    //print / println 特有方法||写入的内容是什么,写进去的内容就是什么
        ps.println();
        ps.println("中文写入");

        //需要释放资源
        ps.close();
    }

}

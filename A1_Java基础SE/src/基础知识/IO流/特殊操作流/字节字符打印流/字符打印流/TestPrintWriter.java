package 基础知识.IO流.特殊操作流.字节字符打印流.字符打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
字符打印流其中的两个构造方法
        PrintWriter(String fileName)
            使用指定的文件名创建一个新的PrintWriter,而不自动执行刷新

        PrintWriter(Writer out,boolean autoFlush)
            创建一个新的PrintWriter
            -- out: 字符输入流
            -- autoFlush: 一个布尔值，如果为true，
                          则println,printf,format
                          方法将刷新输出缓冲区
*/
public class TestPrintWriter {

    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName) 使用指定的文件名创建一个新的PrintWriter,而不自动执行刷新
        PrintWriter rw = new PrintWriter("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\字符打印流\\文件.txt");
        rw.write(97); //使用write可以单个字符写入 可以char数组写入
        //需要刷新
        rw.flush();//需要刷新流操作
        rw.println();
        rw.println("尴尬酱万岁！");
        rw.flush();
        rw.println("============");
        rw.flush();

        //释放资源
        rw.close();

/*      PrintWriter(Writer out,boolean autoFlush)
            创建一个新的PrintWriter
                -- out: 字符输入流
                -- autoFlush: 一个布尔值，如果为true，则println,printf,format方法将刷新输出缓冲区
*/
        PrintWriter rwAuto = new PrintWriter(
                new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\字符打印流\\文件.txt")
                ,true);//参数为true
        //使用println printf format 会自动刷新
        rwAuto.println("这就尴尬了");
        rwAuto.print("中文");
        rwAuto.flush();
        rwAuto.printf("编码");
        rwAuto.println();
        rwAuto.format("完成写入");

        //释放资源
        rwAuto.close();

    }

}

package 基础知识.IO流.字符流.字符流_编码解码.字符流类Method;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
OutputStreamWriter 中写数据的方法
    void write(int c)                       写一个字符
    void write(char[] cbuf)                 写入一个字符数组
    void write(char[] cbuf,int off,int len) 写入字符数组的一部分
    void write(String str)                  写一个字符串
    void write(String str,int off, int len) 写一个字符串的一部分

[注意]:
字符流相对于字节流 是有缓冲的！！！
使用刷新流: flush();进行刷新。
close执行,先刷新一次,再关闭流,关闭后不能再写如数据

*/
public class TestOutputStreamWriter_Method {

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt"));
        //void write(int c)                       写一个字符
        osw1.write(97);
        osw1.flush();//刷新流
        osw1.write("\r\n");
        //这个没有flush()刷新也出来了，因为close() 先刷新,后关闭
        osw1.close();//释放资源
        //osw1.write(98);
        /**
         * 其实,close是关闭流，注意:close执行,先刷新一次,再关闭流,关闭后不能再写如数据
         * Exception in thread "main" java.io.IOException: Stream closed
         * */

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(char[] cbuf)                 写入一个字符数组
        char[] array = {'a','b','c','中','国','汉','字','\n'};
        osw2.write(array);
        osw2.close();//刷新+关闭流

        OutputStreamWriter osw3 = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(char[] cbuf,int off,int len) 写入字符数组的一部分
        osw3.write(array,3,array.length-3);//规定为 '中','国','汉','字','\n'
        osw3.close();

        OutputStreamWriter osw4 = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(String str)                  写一个字符串
        String str = "问君能有几多愁,恰似一江春水向东流。\r\n";
        osw4.write(str);
        osw4.close();

        OutputStreamWriter osw5 = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(String str,int off, int len) 写一个字符串的一部分
        osw5.write(str,8,str.length()-8);
        osw5.write("========================================");
        osw5.close();

    }

}

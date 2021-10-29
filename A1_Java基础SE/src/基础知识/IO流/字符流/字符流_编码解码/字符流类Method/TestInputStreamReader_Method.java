package 基础知识.IO流.字符流.字符流_编码解码.字符流类Method;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
读数据的方法和字节流的方法差不多，只不过一个是字节流，一个是字符流，一个是byte数组，一个是char数组

[方法]:
    int read()                一次读一个字符数据
    int read(char[] cbuf)     一次读一个字符数组数据

*/
public class TestInputStreamReader_Method {

    public static void main(String[] args) throws IOException {

        //方法一  int read()                一次读一个字符数据
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt"));
        int by;
        while ((by = isr1.read()) != -1){
            System.out.print((char) by);
        }
        isr1.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //方法二  int read(char[] cbuf)     一次读一个字符数组数据
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt"));
        char [] array = new char[1024];
        int len;
        while ((len = isr2.read(array)) != -1){
            System.out.print(new String(array,0,len));
        }
        isr2.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //读一个长文件
        InputStreamReader isr3 = new InputStreamReader(new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\TestOutputStreamWriter_Method.java"));
        char[] arrayN = new char[1024];
        int lenN;
        while( (lenN = isr3.read(arrayN)) != -1 ){
            System.out.print(new String(arrayN,0,lenN));
        }
        isr3.close();

    }

}

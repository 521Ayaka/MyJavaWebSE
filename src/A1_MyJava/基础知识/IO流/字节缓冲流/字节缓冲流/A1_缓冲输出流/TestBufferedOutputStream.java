package A1_MyJava.基础知识.IO流.字节缓冲流.A1_缓冲输出流;

/*
构造方法：

    //参数是OutputStream 类的对象 ，只有一个参数
    public BufferedOutputStream(OutputStream out) {
        this(out, 8192);     //这里调用了下面一个构造方法，默认 size是 8*1024 = 8192
    }


    public BufferedOutputStream(OutputStream out, int size) {
        super(out);
        if (size <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        buf = new byte[size];   //创建了缓冲字节数组。
    }



*/

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream {

    public static void main(String[] args) throws IOException {

        //创建字节输入流对象。
//        FileOutputStream out = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\测试文件.txt");
//        BufferedOutputStream bOut = new BufferedOutputStream(out);//这里放入

        //out对象只用了一次，使用匿名对象优化
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\测试文件.txt"));
        //使用BufferedOutputStream 来写数据
        bos.write("问君能有几多愁\r\n".getBytes());
        bos.write("剑圣塔下达不溜\r\n".getBytes());

        //依然需要释放资源
        bos.close();//如果这里没有释放资源的话，就不会进行写入内容！！！
    }

}

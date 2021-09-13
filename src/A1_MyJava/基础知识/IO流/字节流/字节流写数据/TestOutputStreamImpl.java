package A1_MyJava.基础知识.IO流.字节流.字节流写数据;
/*
OutputStream接口 是所有输出字节流的超类，用来写入数据。



*/

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStreamImpl {

    public static void main(String[] args) throws IOException /*throws FileNotFoundException*/ {

        //使用多态的方法创建OutputStream类，这里用的是FileOutputStream类实现的OutputStream
        FileOutputStream outputStream = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件.txt");

        /*
        创建完 FileOutputStream 后，做了三件事：
        A: 调用系统功能创建了该文件
        B: 创建字节输出流对象
        C: 让字节输出流对象指向创建好的文件
        */

        //调用写入方法  public void write(int b): 将指定字节写入此文件
        outputStream.write(97); //抛出IOException后，就不用抛出 FileNotFoundException了
        //使用此方法，不要忘了抛出异常！！！
        outputStream.write(57);//输入的是字符底层字节

        //使用完之后，一定不要忘了 使用close【关闭此文件输出流并释放与此流有关的所有系统资源。】
        outputStream.close();

    }

}

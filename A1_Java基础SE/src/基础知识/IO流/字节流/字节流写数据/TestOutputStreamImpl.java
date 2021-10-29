package 基础知识.IO流.字节流.字节流写数据;
/*
OutputStream接口 是所有输出字节流的超类，用来写入数据。



*/

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStreamImpl {

    public static void main(String[] args) throws IOException /*throws FileNotFoundException*/ {

        //使用多态的方法创建OutputStream类，这里用的是FileOutputStream类实现的OutputStream
        FileOutputStream outputStream = new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件1.txt");

        /*
        创建完 FileOutputStream 后，做了三件事：
        A: 调用系统功能创建了该文件
        B: 创建字节输出流对象
        C: 让字节输出流对象指向创建好的文件
        */

        //调用写入方法  public void write(int b): 将指定字节写入此文件
        outputStream.write(97); //抛出IOException后，就不用抛出 FileNotFoundException了
        //使用此方法，不要忘了抛出异常！！！
        outputStream.write(57-9);//输入的是字符底层字节

        //使用完之后，一定不要忘了 使用close【关闭此文件输出流并释放与此流有关的所有系统资源。】
        outputStream.close();

        System.out.println("===========================================================");

        /*
        上面的创建 FileOutputStream outputStream = new FileOutputStream(路径);
        会把原文件内容给干掉，写入数据时，是从开通写的，如果不要重开头写
        需要常见时，使用另外一个构造方法。

        public FileOutputStream(String name, boolean append) throws FileNotFoundException{
            this(name != null ? new File(name) : null, append);
        }

        boolean append 是否追加写入内容，append为true时，写入文件时从尾部开始写入。

        */
        //参数为true
        FileOutputStream fos = new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件2.txt",true);

        //开始写入数据
        for (int i = 0; i < 10; i++) {
            if (i == 0) { fos.write("\n".getBytes()); }// 换行符 \n 调用getBytes()进行实现换行
            fos.write("我命由我不由天".getBytes());
            fos.write("\n".getBytes());// 换行符 \n 调用getBytes()进行实现换行
            /*
            *不同系统的换行符不同:
            *
            * windows: \r\n
            * Linux  : \n
            * Moc    : \r
            *
            * */
        }
        //最后不要忘了清除调用的系统资源！！！！！
        fos.close();


    }

}

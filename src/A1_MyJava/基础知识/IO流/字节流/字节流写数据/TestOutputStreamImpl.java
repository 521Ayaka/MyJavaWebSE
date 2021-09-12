package A1_MyJava.基础知识.IO流.字节流.字节流写数据;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestOutputStreamImpl {

    public static void main(String[] args) throws FileNotFoundException {

        //使用多态的方法创建OutputStream类，这里用的是FileOutputStream类实现的OutputStream
        FileOutputStream outputStream= new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件.txt");
        //这里的路径里的文件，在创建对象的时候，会自动创建这个文件。 测试文件.txt


    }

}

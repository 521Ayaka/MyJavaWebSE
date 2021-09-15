package A1_MyJava.基础知识.IO流.字节缓冲流.A2_缓冲输入流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

    public static void main(String[] args) throws IOException {

        //同BufferedInputStream相同，创建对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\测试文件.txt"));

        //通过bis进行读取数据

        //单个读取
        /*
        int by;
        while((by = bis.read()) != -1){
            System.out.print((char) by);
        }*/
        //使用byte数组获取
        byte [] array = new byte[1024];
        int len;
        while( (len = bis.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }

        //同样需要释放资源
        bis.close();
    }

}

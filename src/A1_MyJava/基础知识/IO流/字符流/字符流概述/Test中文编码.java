package A1_MyJava.基础知识.IO流.字符流.字符流概述;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;//使用遍历打印数组

public class Test中文编码 {

    public static void main(String[] args) throws IOException {

        //单字节 读取文件
        FileInputStream fis1 = new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流概述\\文件.txt");
        int by;
        while ((by = fis1.read()) != -1){
            System.out.print((char) by); //abc ???ú
        }
        fis1.close();
        System.out.println("\n======================");

        //byte数组 读取文件
        FileInputStream fis2 = new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流概述\\文件.txt");
        byte [] array = new byte[1024];
        int len;
        while ((len = fis2.read(array)) != -1){
            System.out.print(new String(array,0,len)); //abc 中国
        }
        fis2.close();
        System.out.println("\n======================");

        /*
        单个读取结果: abc ???ú
        数组读取结果: abc 中国

        一个汉字的存储：
            GBK: 占两个字节
            UTF-8: 占三个字符
        */

        byte[] by1 = "中国".getBytes();
        System.out.println(Arrays.toString(by1));//[-42, -48, -71, -6] 默认和该文件同样的编码
        byte[] by2 = "中国".getBytes("GBK");
        System.out.println(Arrays.toString(by2));//[-42, -48, -71, -6]
        byte[] by3 = "中国".getBytes("UTF-8");
        System.out.println(Arrays.toString(by3));//[-28, -72, -83, -27, -101, -67]

        /*
            分析：
               1. 汉字占多个字节来表示的
               2. 不管什么编码格式，汉字每个字节编码都是负数
               3. 都是负数保证了汉字编码的连贯性，当系统识别负数byte时，就知道是汉字了，相应编码格式拼接

            解释:
               单个字节读取乱码，因为汉字占多个字节，单个字节读取肯定会乱码
               byte数组读无乱码，读取后，系统识别为负数编码，就知道是汉字，会通过相应的编码格式，拼接成为相应的汉字

            所以:
               由于字节流操作中文不是特别方便,所以Java就提供了字符流
               [字符流] = [字节流] + [编码格式]

        */

    }

}

package 基础知识.IO流.字符缓冲流.字符缓冲流案例;

import java.io.*;
/*
继续改进【字符流案例】这次使用 [字符缓冲流] 来实现

*/
public class NewJavaCopy {

    public static void main(String[] args) {

        //创建字符缓冲流
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //赋值路径对象
            br = new BufferedReader(new FileReader("D:\\源代码\\A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\字符缓冲流案例\\NewJavaCopy.java"));
            bw = new BufferedWriter(new FileWriter("D:\\源代码\\A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\字符缓冲流案例\\复制到这里\\NewJavaCopy.java"));
            //开始复制
            char[] array = new char[1024];
            int len;
            while ((len = br.read(array)) != -1) {
                //复制
                bw.write(array, 0, len);
                //打印输出到控制台
                System.out.print(new String(array,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null) {
                try {
                    br.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null) {
                try {
                    bw.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

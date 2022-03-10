package 基础知识.IO流.特殊操作流.字节字符打印流.案例打印流复制文件;

import java.io.*;

public class PrintWriterCopy {

    public static void main(String[] args) throws IOException{

        //字符缓冲流
        method1();

        //字符打印流改进
        method2();


    }



    private static void method1() throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\PrintWriterCopy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\NewCopy001.txt"));
        //读写数据
        String str;
        while ( (str=br.readLine())!= null ){
            bw.write(str); //写入数据
            bw.newLine();  //换行
            bw.flush();    //刷新
        }

        //最后释放资源
        br.close();
        bw.close();

    }

    private static void method2() throws IOException {
        //注意：打印流只负责写数据，不负责读取数据

        //读数据仍然使用字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\PrintWriterCopy.java"));
        //创建打印流
        PrintWriter pw = new PrintWriter(new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\NewCopy002.txt")
                                         , true);//第二个参数为true
        //读写数据
        String str;
        while ( (str = br.readLine())!= null ){
            pw.println(str);//三步：写入 换行 刷新
        }

        //释放资源
        br.close();
        pw.close();

    }
}

package 基础知识.IO流.字符缓冲流;

import java.io.*;
//标准点用try...catch...finally环绕处理,这里简写了我!
/*
字符缓冲流: 默认值足够大,符合大多数用途

构造方法:
    BufferedWriter(Writer out)
    BufferedReader(Reader in)
    默认值足够大,符合大多数用途

    BufferedWriter(Writer out, int si)
    BufferedReader(Reader in, int si)

*/
public class TestBuffered_ReaderWriter {

    public static void main(String[] args) throws IOException {

        goBufferedWriter();//写入数据
        goBufferedReader(false);//读取数据,单个字符
        goBufferedReader(true); //读取数据,char数组

    }

    public static void goBufferedWriter() throws IOException {
        //创建字符缓冲输入流 来 写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\测试文件.txt"));
        //写数据
        bw.write("问君能有几多愁,\r\n");
        bw.write("恰似一江春水向东流。\r\n");
        //释放资源
        bw.close();
        System.out.println("==================");
    }

    public static void goBufferedReader(boolean isCharArray) throws IOException {
        //创建缓冲字符输入流 来 读取数据
        BufferedReader br = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\测试文件.txt"));
        //读取数据 两种方法
        if (!isCharArray){
            //一次读取一个字符
            int by;
            while ((by = br.read()) != -1) {
                System.out.print((char) by);
            }
        }else{
            //读取char[] array数组
            char[] array = new char[1024];
            int len;
            while ((len = br.read(array)) != -1) {
                System.out.print(new String(array,0,len));
            }
        }
        //释放资源
        br.close();
        System.out.println("==================");

    }


}

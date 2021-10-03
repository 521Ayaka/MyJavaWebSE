package A1_MyJava.基础知识.IO流.标准输入输出流;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputStream {

    public static void main(String[] args) throws IOException {

        //启动
        new StandardInputStream().init();

    }

    public void init() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("调用方法:");
        int isMethod = sc.nextInt();
        if (isMethod == 1) {
            method1();
        } else if (isMethod == 2) {
            method2();
        } else if (isMethod == 3){
            method3();
        }

    }

    //在System中有一个静态常量
    //public static final InputStream in : 标准输入流
    public void method1() throws IOException {
        //创建标准输入流
        InputStream in1 = System.in;
        //单个字节读取数据
        int by;
        while ((by = in1.read()) != -1) {
            System.out.print((char) by);
        }
        /*
        输出结果可以, 但是由于这是 [字节流]
        所以, 当读取到中文的时候,
        由于中文采用了 UTF-8 / GBK / ...
        编码会出现错误
        如:
        输入: 尴尬
        结果: ???? //四个字符 编码采用的时 [GBK编码集]

        */
    }

    //使用标准输入流, 数组方式读取数据
    private void method2() throws IOException {

        //创建标准输入流
        InputStream in = System.in;
        //读数据 byte[]
        byte[] array = new byte[1024];
        int len;
        while ((len = in.read(array)) != -1) {
            System.out.print(new String(array, 0, len));
        }
        /*
        使用字节流方法 中的 数组读取方法 可以读取中文了
        */
    }

    //将[标准输入流] 封装成为 [字符流]
    private void method3() {

        //创建标准输入流
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        //使用封装好后的 字符流 读取数据
        //两种

    }

}

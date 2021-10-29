package 基础知识.IO流.特殊操作流.标准输入输出流.标准输入流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputStream {

    public static void main(String[] args) throws IOException {

        //启动
        new StandardInputStream().init();

    }

    //选择调用那个方法
    public void init() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("调用方法:");
        int isMethod = sc.nextInt();
        //选择调用
        if (isMethod == 1) {
            method1();//字节流
        } else if (isMethod == 2) {
            method2();//字节流 数组读取
        } else if (isMethod == 3) {
            method3();//字符流
        } else if (isMethod == 4) {
            method4();//字符缓冲流
        } else if (isMethod == 5) {
            method5();//Scanner的引入
        }

    }

    //在System中有一个静态常量
    //public static final InputStream in : 标准输入流
    public void method1() throws IOException {
        System.out.println("已调用方法一");
        //创建标准输入流
        InputStream in1 = System.in;
        //单个字节读取数据
        int by;
        while ((by = in1.read()) != -1) {
            System.out.print((char) by);
        }
        in1.close();
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
        System.out.println("已调用方法二");
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
        in.close();
    }

    //将[标准输入流] 封装成为 [字符流]
    private void method3() throws IOException {
        System.out.println("已调用方法三");
        //创建标准输入流
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        //使用封装好后的 字符流 读取数据
        //两种
        /*单个字符读取
        int by;
        while ((by = isr.read()) != -1) {
            System.out.print((char) by);
        }*/
        //字符数组读取
        char[] array = new char[1024];
        int len;
        while ( (len = isr.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }
        //释放资源
        isr.close();
    }

    //包装为字符缓冲输入流
    public void method4() throws IOException {
        System.out.println("已调用方法四");
        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);
        // 三步简写
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //使用特殊的方法读取 单行读取
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }

    //关于类型格式与Scanner类
    public void method5() throws IOException {
        System.out.println("已调用方法五");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //如果读取的数据为想要的数据类型
        int num = Integer.parseInt(br.readLine());
        System.out.println("还需要使用转换工具 ："+num);
        br.close();
        //这样来回转换很麻烦。
        /*
        System.out.println("所以Java提供Scanner类包装的就是System.in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("===");
        int abc = scanner.nextInt();
        System.out.println(abc);
        */


    }


}

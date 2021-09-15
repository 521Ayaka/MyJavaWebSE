package A1_MyJava.基础知识.IO流.字节流.字节流读数据;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) throws IOException {

        //创建字节输入流对象
        FileInputStream input1 = new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件1.txt");

        //读取数据，使用方法是read()方法，读取返回的是byte类型
        //第一次读取
        int i1 = input1.read();
        System.out.print(i1);// 底层是byte
        System.out.println((char) i1); //强转为想要的类型 char
        //第二次读取
        int i2 = input1.read();
        System.out.print(i2);
        System.out.println((char) i2);
        //第三次读取
        int i3 = input1.read();
        System.out.print(i3);
        System.out.println((char) i3);
        //第四次读取
        int i4 = input1.read();
        System.out.print(i4); //空格是 32
        System.out.println((char) i4); //对应的char是是空格
        //第五次读取
        int i5 = input1.read();
        System.out.print(i5);
        System.out.println((char) i5);
        System.out.println("=======");
        //因为不知道文件里的内容量 所以多读几次
        System.out.println(input1.read()); //-1
        System.out.println(input1.read()); //-1
        System.out.println((char) input1.read()); // ? 解码不出
        //最后别忘了释放资源
        input1.close();
        /*
        * 上面可知, 当无数据的时候，对应的byte是 -1
        * 那么可以判断 input.read() != -1 就是有数据的
        *
        * 下面进行改进：
        * */

        System.out.println("================================================");

        //创建字节输入流对象
        FileInputStream input2 = new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件1.txt");

        //读取数据
        int by = input2.read();//获取
        while (by != -1){
            System.out.print((char) by);  //这里不要换行
            by = input2.read();//重新读取赋值给by
        }
        //释放资源
        input2.close();

        //可进行再次优化！！！！！！！！！！
        System.out.println("\n！！！！！！！！！！！！！标准写法！！！！！！！！！！！！！");

        //创建字节输入流对象
        FileInputStream input3 = new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");

        //读取数据
        int byt; //先定义一个变量用于获取，但不赋值
        /*
        * ( byt = input3.read() ) != -1这里干了三件事
        * 第一: input3.read()        获取的文件内容
        * 第二: byt = input3.read()  把获取到的byte赋值给but
        * 第三: byt != -1            最后在判断是否为 -1
        * */
        while ( ( byt = input3.read() ) != -1){
            System.out.print((char) byt);  //这里不要换行
        }
        //释放资源
        input3.close();

        /*这就是标准的读文件的代码

        //创建字节输入流对象
        FileInputStream input3 = new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");
        //读取数据
        int byt;
        while ( ( byt = input3.read() ) != -1){
            System.out.print((char) byt);
        }
        //释放资源
        input2.close();

        */


        //完全标准写法
        System.out.println("\n！！！！！！！！！！！！！完全标准写法！！！！！！！！！！！！！");
        System.out.println("！！！！！！！！！！！！！完全标准写法！！！！！！！！！！！！！");
        //创建字节输入流对象
        FileInputStream fileInput = null;
        int getByte ;
        //读取数据，使用try...catch...finally环绕处理
        try{
            fileInput =  new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");
            //读取数据
            while((getByte = fileInput.read()) != -1){
                System.out.print((char) getByte);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //释放资源
            if(fileInput != null){
                try {
                    fileInput.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}

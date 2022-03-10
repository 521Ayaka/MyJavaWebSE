package 基础知识.IO流.字节流.字节流的案例.复制文本;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DameIO_put {

    public static void main(String[] args) {

        method1();
        method1();//边读编写可以简化很多代码。

    }

    //方法一: 先读取所有内容，然后在全部写入
    public static void method1(){
        //创建字节输入流读取数据
        FileInputStream input = null;
        String str = "";
        int by;
        try{
            input = new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流的案例\\复制文本\\测试文件1.txt");
            //读数据
            while( (by = (input.read())) != -1 ){
                str = str + (char)by;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(input != null){
                try{
                    input.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        //开始复制数据
        FileOutputStream output = null;
        try{
            //追加写入
            output = new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流的案例\\复制文本\\测试文件2.txt",true);
            output.write("\n\n".getBytes());//先给它换行
            output.write(str.getBytes());   //写入数据
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (output != null){
                try{
                    output.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }



    //方法二: 边度编写
    public static void method2(){

        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流的案例\\复制文本\\测试文件1.txt");
            output = new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流的案例\\复制文本\\测试文件2.txt",true);//追加写入
            //边读别写
            output.write("\n\n".getBytes());//先给它换行
            int by;
            while((by = input.read() ) != -1){//读取数据
                output.write((char) by);      //写入数据
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally{

            //释放字节输出流
            if (input != null){
                try{
                    input.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            //释放字节输入流。
            if (output != null ){
                try{
                    output.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }


        }
    }

}

package A1_MyJava.基础知识.IO流.字节流.字节流的案例.复制图片;

//把文件复制到当前文件下


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DameIO_Img {

    public static void main(String[] args) {

        //创建字节输入输出流对象
        FileInputStream input = null;
        FileOutputStream output = null;

        //try...catch...finally 进行操作。
        try {
            input = new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流的案例\\复制图片\\图片\\猫羽雫.jpg");
            output = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流的案例\\复制图片\\猫羽雫.jpg");

            //复制操作：
            byte [] array = new byte[1024*8];
            int by;
            while ( (by = input.read(array)) != -1 ){
                output.write(array,0,by);//后面两个参数尽量也要写
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (input != null){
                try{
                    input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (output != null){
                try{
                    output.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}

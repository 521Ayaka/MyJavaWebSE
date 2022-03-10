package 基础知识.IO流.字节流.字节流读数据;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStreamReadMethod {

    public static void main(String[] args) {

        //创建字节输入流对象
        FileInputStream input = null;
        try{

            //进行操作

            input = new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件1.txt");
            //input.read();
            /*
            public int read(byte b[]) throws IOException {
                return readBytes(b, 0, b.length);
            }

            注意返回值:
            调用readBytes()
            1.返回这个读取放入后的数组
            2.返回0
            3.返回一个int，数组的长度

            从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
            在某些输入可用之前，此方法将阻塞

            */
            //第一次读取
            byte [] array = new byte[5];//非索引emm...
            int read1 = input.read(array); //返回的是数组的长度，同时，给数组重新赋值！！！！！！
            System.out.println(read1); //5
            System.out.println(new String(array, 0 ,read1)); //abc d

            //第二次读取
            int read2 = input.read(array);
            System.out.println(read2); //5
            System.out.println(new String(array, 0 ,read2)); // 换行  hel
            /*
            * 第二次读取的内容是
            *
            * hel
            *
            * 里面换行了，\r\n 占用了 两个 byte数组
            * */


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        System.out.println("=============================================");

        //优化
        try{
            //进行操作
            input = new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");
            //读取
            byte [] array = new byte[1024];//一般都是设置为 [1024] 的整数倍
            int read;
            while ((read = input.read(array) ) != -1){
                System.out.print(new String(array,0,read));//后面两个参数也要写！！！！
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
    }

    }

}

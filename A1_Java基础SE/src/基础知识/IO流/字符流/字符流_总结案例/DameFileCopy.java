package 基础知识.IO流.字符流.字符流_总结案例;

import java.io.*;

/*
* 要求:
*
* 将本java文件 复制到该java文件同包下的 [复制到这里] 文件夹当中
*
* */
public class DameFileCopy {

    public static void main(String[] args) {

        //创建字符输入流 来 读取数据
        InputStreamReader isr = null;
        //创建字符输出流 来 写入数据
        OutputStreamWriter osw = null;

        try{//赋值
            isr = new InputStreamReader(new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_总结案例\\DameFileCopy.java"));
            osw = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_总结案例\\复制到这里\\DameFileCopy.java"));
            //开始赋值
            char[] array = new char[1024];
            int len;
            while ( (len = isr.read(array)) != -1){//读取
                osw.write(array,0,len);//写入
            }
            System.out.println("已复制");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (isr != null){
                try{
                    isr.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (osw != null){
                try{
                    osw.close();//刷新并释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }

}

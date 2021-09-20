package A1_MyJava.基础知识.IO流.字节字符流案例回顾.A2_文件到集合;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
同 [A1_...] 一样, 只不过结论相反
有时读取文件的东西,可以放入很多东西里面,
入[ArrayList集合]等...当中！
*/
public class FileToArrayList {

    public static void main(String[] args) {

        //启动
        new FileToArrayList().fileToArray();

    }

    //初始化
    public void fileToArray() {

        //创建一个空的数组
        ArrayList<String> array = new ArrayList<>();

        //创建字符缓冲输入流对象 用来 读取数据
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节字符流案例回顾\\A2_文件到集合\\文件.txt"));
            //开始复制到数组当中 每一行为一个元素
            String str;
            while ((str = br.readLine()) != null) {//获取
                array.add(str);//写入
            }
            //在控制台中便利一下数组 擦看结果
            int i = 0;
            for (String newAdd : array) {
                System.out.println("array[" + i + "]: " + newAdd);
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

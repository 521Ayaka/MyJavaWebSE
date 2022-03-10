package 基础知识.IO流.字节字符流案例回顾.A1_集合到文件;

/*
这个案例很简单,
这个案例告诉我:
不只是文件写入到文件当中,
还可以来源于其他地方 比如说[ArrayList数组]等...
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFile {

    public static void main(String[] args) {

        //启动
        new ArrayListToFile().arrayToFile();

    }

    //初始化
    public void arrayToFile() {
        //创建ArrayList数组
        ArrayList<String> array = new ArrayList<>();
        //添加元素
        array.add("问君能有几多愁");
        array.add("恰似一江春水向东流");
        array.add("================");
        array.add("我卢本伟NB,我卢本伟没有开挂");

        //创建字符缓冲输出流对象 用来 吸写入数据
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\A1_集合到文件\\文件.txt"));
            //写入到文件
            for (String str : array) {
                bw.write(str);
                bw.newLine();//别忘了换行！
                bw.flush();//刷新流
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

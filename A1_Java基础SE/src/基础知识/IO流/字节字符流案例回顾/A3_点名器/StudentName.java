package 基础知识.IO流.字节字符流案例回顾.A3_点名器;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class StudentName {

    public static void main(String[] args) {

        //启动
        new StudentName().getName();

    }

    //初始化
    public void getName() {

        //创建ArrayList集合用于存储名字
        ArrayList<String> array = new ArrayList<>();

        //创建字符缓冲入流 来 读取姓名
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\A3_点名器\\点名表.txt"));
            //获取姓名, 并添加到集合当中。
            String str;
            while ((str = br.readLine()) != null) {
                array.add(str);
            }
            //向控制台中随机点取三个名子,并输出 【允许重复名字的出现,倒霉】
            for (int i = 0; i < 3; i++) {
                System.out.println(array.get(new Random().nextInt(array.size())));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

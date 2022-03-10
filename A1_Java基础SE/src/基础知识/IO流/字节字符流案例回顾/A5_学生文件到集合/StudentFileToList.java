package 基础知识.IO流.字节字符流案例回顾.A5_学生文件到集合;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentFileToList {

    public static void main(String[] args) {

        //启动
        new StudentFileToList().setStudentList();

    }

    //初始化
    public void setStudentList() {

        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();

        //创建字符缓冲输入流对象 来 读取数据
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\A5_学生文件到集合\\学生文件.txt"));
            //读取数据
            String str;
            while ((str = br.readLine()) != null) {
                //分割字符串
                String[] strArray = str.split(",");
                //创建学生对象 , 并放入list集合当中
                list.add(new Student(strArray[0], Integer.parseInt(strArray[1]), Integer.parseInt(strArray[2])));
            }
            //遍历数组, 查看结果
            for (Student stu : list) {
                System.out.println("姓名: " + stu.getName() + ", 学号: " + stu.getId() + ", 年龄: " + stu.getAge());
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

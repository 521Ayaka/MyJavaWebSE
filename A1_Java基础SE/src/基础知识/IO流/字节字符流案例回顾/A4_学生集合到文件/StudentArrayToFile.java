package 基础知识.IO流.字节字符流案例回顾.A4_学生集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentArrayToFile {

    public static void main(String[] args) {

        //启动
        new StudentArrayToFile().setStudentToFile();

    }

    //初始化
    public void setStudentToFile() {

        //创建学生对象
        Student stu1 = new Student("尴尬酱", 2020521, 18);
        Student stu2 = new Student("尴尬帝", 2020999, 20);
        Student stu3 = new Student("尴尬了", 2020555, 19);
        Student stu4 = new Student("不尴尬", 2020001, 9);
        Student stu5 = new Student("很尴尬", 2020020, 99);

        //创建集合,并放入学生对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        //创建字符缓冲输出流 来 写数据
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\A4_学生集合到文件\\学生文件.txt"));
            //读取数组内容
            for (Student stu : list) {
                String str = "姓名: " + stu.getName() + ", 学号: " + stu.getId() + ", 年龄: " + stu.getAge();
                //写入[学生文件]当中
                bw.write(str);//写入
                bw.newLine();//换行
                bw.flush();//刷新
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

package A1_MyJava.基础知识.IO流.字节字符流案例回顾.A6_学生成绩录入;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentGradeToFile {

    public static void main(String[] args) {

        //启动
        new StudentGradeToFile().init();

    }

    //初始化
    public void init() {

        //创建TreeSet集合, 使用比较排序
        TreeSet<StudentGrade> treeSet = new TreeSet<>(new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade s1, StudentGrade s2) {
                //主要条件: 按照总分从高到低排序
                int num1 = s2.getSum() - s1.getSum();
                //次要条件1: 按照语文成绩从高到低
                int num2 = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;
                //次要条件2: 按照数学成绩从高到低
                int num3 = num2 == 0 ? s2.getMeth() - s1.getMeth() : num2;
                //次要条件3: 三科分数相同,比较名字
                int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName()) : num3;
                return num4;
            }
        });

        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("===请录入5名学生信息===");
        for (int i = 0; i < 5; i++) {
            System.out.println("输入第" + (i + 1) + "位学生信息");
            System.out.print("姓名: ");//不换行
            String name = sc.next();
            System.out.print("语文成绩: ");
            int chinese = sc.nextInt();
            System.out.print("数学成绩: ");
            int math = sc.nextInt();
            System.out.print("英语成绩: ");
            int english = sc.nextInt();
            System.out.println("====================");

            //创建学生对象, 添加学生信息
            StudentGrade stu = new StudentGrade(name, chinese, math, english);
            //添加到TreeSet集合当中
            treeSet.add(stu);
        }

        //创建字符缓冲输出流对象 来 写入数据
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src\\A1_MyJava\\基础知识\\IO流\\字节字符流案例回顾\\A6_学生成绩录入\\学生成绩.txt"));
            //写入数据
            for (StudentGrade stu : treeSet) {
                bw.write("姓名: " + stu.getName() + ", 语文成绩: " + stu.getChinese() + ", 数学成绩: " + stu.getMeth() + ", 英语成绩: " + stu.getEnglish());
                bw.newLine();//换行
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

    /*我的输入:
    ===请录入5名学生信息===
    输入第1位学生信息
    姓名: 尴尬酱
    语文成绩: 100
    数学成绩: 100
    英语成绩: 0
    ====================
    输入第2位学生信息
    姓名: 尴尬帝
    语文成绩: 100
    数学成绩: 100
    英语成绩: 99
    ====================
    输入第3位学生信息
    姓名: 尴尬了
    语文成绩: 60
    数学成绩: 0
    英语成绩: 0
    ====================
    输入第4位学生信息
    姓名: 真尴尬
    语文成绩: 0
    数学成绩: 0
    英语成绩: 0
    ====================
    输入第5位学生信息
    姓名: 不尴尬
    语文成绩: 99
    数学成绩: 99
    英语成绩: 99
    ====================
    */

}

package 基础知识.IO流.特殊操作流.对象序列反序列化流.A3_对象反序列化的问题与标准;

import java.io.*;

public class TestObjectStudent {

    public static void main(String[] args) {
        //write();
        read();
    }

    //对象序列化
    public static void write() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A3_对象反序列化的问题与标准\\序列化文件.txt"));) {
            //先创建对象
            Student stu = new Student("尴尬酱", 20, 202020);
            //对象序列化
            oos.writeObject(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //对象反序列化
    public static void read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("A1_Java基础SE\\src\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A3_对象反序列化的问题与标准\\序列化文件.txt"))) {
            //反序列化对象
            Object oStu = ois.readObject();//这里报的不在IOException包下
            //创建该对象
            Student stu = (Student) oStu;//向下转型
            //打印对象内容
            if (stu.getID() == 0 ){
                System.out.println("姓名: " + stu.getName() + ", 年龄: " + stu.getAge() + ", 学号: 无法查看");
            }else {
                System.out.println("姓名: " + stu.getName() + ", 年龄: " + stu.getAge() + ", 学号: " + stu.getID());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

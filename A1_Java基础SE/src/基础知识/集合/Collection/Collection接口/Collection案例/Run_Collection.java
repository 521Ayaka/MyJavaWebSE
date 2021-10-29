package 基础知识.集合.Collection.Collection接口.Collection案例;

/*
案例要求:
创建一个存储学生对象的集合，存储三个学生对象，使用程序实现在控制台遍历该集合。
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Run_Collection {

    public static void main(String[] args) {
        //创建三个对象，何某某
        Student stu1 = new Student("何雪冲",16);
        Student stu2 = new Student("何雪虫",18);
        Student stu3 = new Student("何学匆",20);
        //创建学生集合
        Collection<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //创建迭代器
        Iterator<Student> itr = list.iterator();
        //进行遍历
        while (itr.hasNext()){
            Student stu = itr.next();
            System.out.println("我叫: " + stu.getName() + ", 今年" + stu.getAge() + "岁了。");
        }


    }

}

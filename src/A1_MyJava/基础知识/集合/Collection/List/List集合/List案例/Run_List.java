package A1_MyJava.基础知识.集合.Collection.List.List集合.List案例;

/*
案例要求:
创建一个存储学生对象的集合，存储三个学生对象，使用程序实现在控制台遍历该集合。
(两种方式遍历，for循环遍历，迭代器遍历)
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Run_List {

    public static void main(String[] args) {

        Student stu1 = new Student("何雪冲", 16);
        Student stu2 = new Student("何雪虫", 18);
        Student stu3 = new Student("何学匆", 20);

        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println("我叫" + list.get(i).getName() + ",今年" + list.get(i).getAge() + "岁了。");
        }

        System.out.println("==================");

        //使用迭代器进行遍历
        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            //错误写法
            //System.out.println("我叫" + itr.next().getName() + ",今年" + itr.next().getAge() + "岁了。");
            Student stu = itr.next();
            System.out.println("我叫" + stu.getName() + ",今年" + stu.getAge() + "岁了。");
        }

    }

}

package A1_MyJava.基础知识.集合.Collection.Set.Set子集合.HashSet.案例练习;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Stu {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<Student>();
        Student stu1 = new Student("尴尬",18);
        Student stu2 = new Student("尴尬酱",19);
        Student stu3 = new Student("尴尬帝",20);

        Student stu4 = new Student("尴尬",18);

        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);

        hashSet.add(stu4); /**
        不同对象的地址值是不会重复的，所以stu1 和 stu3 不属于重复元素
        如果想达到要求：【对象的参数相同，即为同一个对象】 再Student类当中重写equals()和hashCode()方法
        */

        for (Student stu: hashSet){
            System.out.println("我叫："+stu.getName()+",年龄："+stu.getAge());
        }

        System.out.println("==============================================");

        Iterator<Student> ite = hashSet.iterator();
        while (ite.hasNext()){
            Student stu = ite.next();
            System.out.println("我叫："+stu.getName()+",年龄："+stu.getAge());
        }

    }

}

package A1_MyJava.基础知识.集合.Map.Map练习.Map练习2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameHashMap {

    public static void main(String[] args) {

        new DameHashMap().init();

    }

    //初始化
    public void init() {

        //初始化
        System.out.println("===============================================");

        //创建HashMap集合
        HashMap<Student, String> hashMap = new HashMap<>();

        //创建学生对象
        //添加对象要保证成员变量和成员方法不同，保证唯一性
        //需要给Student_hash重写hashCode()和equals()方法。
        Student stu1 = new Student("尴尬酱", 18);
        Student stu2 = new Student("尴尬帝", 20);
        Student stu3 = new Student("尴尬了", 11);
        Student stu4 = new Student("尴尬了", 11);//重复元素对象

        //向hashMap集合当中添加键值对
        hashMap.put(stu1, "20202218");
        hashMap.put(stu2, "20202220");
        hashMap.put(stu3, "20202211");
        hashMap.put(stu4, "20202211");

        //直接打印hashMap
        System.out.println(hashMap);
        //结果：
        // {A1_MyJava.基础知识.集合.Map.Map练习.Map练习2.Student_hash@2b4d4e7e=20202211,
        //  A1_MyJava.基础知识.集合.Map.Map练习.Map练习2.Student_hash@2b5568fa=20202218,
        //  A1_MyJava.基础知识.集合.Map.Map练习.Map练习2.Student_hash@2b4f31d0=20202220}

        //重写了hashCode()和equals()方法后，对于属性（成员变量）相同时，视为相同元素

        //循环遍历 方法一
        Set<Student> keyId = hashMap.keySet();
        for (Student stu : keyId) {
            //得到对应的value值
            String id = hashMap.get(stu);
            //打印信息
            System.out.println("姓名为: " + stu.getName() + ", 年龄: " + stu.getAge() + ", 学号: " + id);
        }

        System.out.println("===============================================");

        //循环遍历 方法二
        Set<Map.Entry<Student, String>> hashEm = hashMap.entrySet();
        for (Map.Entry<Student, String> stuId : hashEm) {
            //获得键值
            Student key = stuId.getKey();
            String value = stuId.getValue();
            //打印信息
            System.out.println("姓名为: " + key.getName() + ", 年龄: " + key.getAge() + ", 学号: " + value);
        }


    }

}

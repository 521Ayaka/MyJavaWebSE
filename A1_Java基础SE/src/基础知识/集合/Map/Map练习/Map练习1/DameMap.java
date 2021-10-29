package 基础知识.集合.Map.Map练习.Map练习1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameMap {

    public static void main(String[] args) {

        //创建集合
        HashMap<String, Student> map = new HashMap<>();

        //创建学生对象
        Student stu1 = new Student("尴尬酱", 18);
        Student stu2 = new Student("尴尬帝", 20);
        Student stu3 = new Student("尴尬了", 11);

        //添加到集合中
        map.put("20202218", stu1);
        map.put("20202220", stu2);
        map.put("20202211", stu3);

        //遍历方法 一
        Set<String> keySet = map.keySet();
        for (String id : keySet) {
            Student s1 = map.get(id);
            System.out.println("学号:" + id + ", 姓名:" + s1.getName() + ", 年龄:" + s1.getAge());
        }

        System.out.println("====================================================================");

        //遍历方法 二
        Set<Map.Entry<String,Student>> entry =  map.entrySet();
        for (Map.Entry<String,Student> em: entry){
            String key = em.getKey();
            Student value = em.getValue();
            System.out.println("学号:" + key + ", 姓名:" + value.getName() + ", 年龄:" + value.getAge());
        }

    }

}

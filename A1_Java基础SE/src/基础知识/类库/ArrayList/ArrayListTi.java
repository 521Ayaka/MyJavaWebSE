package 基础知识.类库.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTi {
    public static void main(String[] args) {
        //题目一：生成6个1~33的随机数字，添加到集合，并遍历集合。
        ArrayList<Integer> array1 = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            array1.add(num);
        }

        for(int i = 0; i <array1.size(); i++ ){
            System.out.println(array1.get(i));
        }
        System.out.println("=============================");

        //题目二：自定义五个学生对象，添加到集合，并遍历集合
        ArrayList<Student> array2 = new ArrayList<>();
        Student a = new Student("决斗大师" , 21);
        Student b = new Student("御剑仙", 21);
        Student c = new Student("魔法师",17);
        Student d = new Student("猩红之月",24);
        Student e = new Student("天神",9999);

        array2.add(a);
        array2.add(b);
        array2.add(c);
        array2.add(d);
        array2.add(e);

        for (int i = 0; i < array2.size(); i++) {
            Student stu = array2.get(i);
            System.out.println("名字："+stu.getName()+"，年龄："+stu.getAge());
        }

        System.out.println("=============================");

        //题目三：定义一个指定格式打印集合的方法，格式为：{元素@元素@元素@元素@元素}
        ArrayList<String> array03 = new ArrayList<>();
        array03.add("决斗大师");
        array03.add("猩红之月");
        array03.add("三国猛将");
        array03.add("天选福星");
        array03.add("天选天神");
        System.out.println(array03);

        System.out.println("指定格式打印：");
        Print(array03);

    }

    public static void Print(ArrayList<String> array03){
        System.out.print("{");
        for (int i = 0; i < array03.size(); i++) {
            if(i == array03.size() - 1){
                System.out.print(array03.get(i));
            }else{
                System.out.print(array03.get(i) + "@");
            }
        }
        System.out.print("}");
    }

}

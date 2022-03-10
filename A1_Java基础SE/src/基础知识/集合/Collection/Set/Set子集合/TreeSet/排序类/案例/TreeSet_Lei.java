package 基础知识.集合.Collection.Set.Set子集合.TreeSet.排序类.案例;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Lei {

    public static void main(String[] args) {

        //创建集合对象
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override //创建匿名内部类，并从写compare()方法，规定比较规则
            public int compare(Student s1, Student s2) {
                int num1 = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getChinese()); //总分降序
                int num2 = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;                   //语文降序
                int num = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;                 //姓名升序
                return num;
            }
        });

        //创建学生对象
        Student stu1 = new Student("GanGa", 100, 120);
        Student stu2 = new Student("GanGaJiang", 150, 150);
        Student stu3 = new Student("GanGaDi", 120, 120);
        Student stu4 = new Student("GanGaBaoBao", 1, 0);
        Student stu5 = new Student("GaGaLe", 150, 150);
        Student stu6 = new Student("GanGaWWW", 120, 100);
        Student stu7 = new Student("GanGaBaoB", 0, 1);
        Student stu8 = new Student("GanGaLou",100,120);


        //添加元素stu1
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(stu5);
        treeSet.add(stu6);
        treeSet.add(stu7);
        treeSet.add(stu8);

        //遍历集合
        for (Student stu : treeSet) {
            System.out.println(stu.getName());
            System.out.println("语文:" + stu.getChinese() + ",数学:" + stu.getMath() + "总分为：" + (stu.getChinese() + stu.getMath()));
            System.out.println();
        }

        //运行结果：
        //GaGaLe总分为：300
        //GanGaJiang总分为：300
        //GanGaDi总分为：240
        //GanGa总分为：220
        //GanGaBaoBao总分为：1

    }

}

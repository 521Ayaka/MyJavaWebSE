package A1_MyJava.基础知识.集合.Collection.Set.Set子集合.TreeSet.排序类.Comparable;
/*
[结论]:
1. 用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的。
2. 自然排序，就是【让元素所属的类实现Comparable接口】，【重写compareTo(T o)方法】。
3. 重写方法时，一定要注意排序规则必须按照要求的【主要条件】和【次要条件】来写。
*/
import java.util.TreeSet;
public class TreeSet_Lei {

    public static void main(String[] args) {

        try {
            Student_1 stu1 = new Student_1("GanGa", 18);
            Student_1 stu2 = new Student_1("GanGaJiang", 9);
            Student_1 stu3 = new Student_1("GanGaDi", 20);
            Student_1 stu4 = new Student_1("GanGaLe", 120);

            TreeSet<Student_1> tree = new TreeSet<>();
            tree.add(stu1);
            tree.add(stu2);
            tree.add(stu3);
            tree.add(stu4);

            for (Student_1 stu :
                    tree) {
                System.out.println(stu.getName() + "," + stu.getAge());
            }//ClassCastException 报错
        }catch(ClassCastException e){
            System.out.println("ClassCastException 报错");
        }

        //报错原因是：Comparable该接口对实现他的每一个类的对象强加一个整体排序
        //也就是说：  类<E>该类必须实现Comparable接口，并重写compareTo()方法

        System.out.println("===========================================================================================");

        //实现Comparable接口，并重写compareTo()方法
        Student_2 stu1 = new Student_2("GanGa", 18);
        Student_2 stu2 = new Student_2("GanGaJiang", 9);
        Student_2 stu3 = new Student_2("GanGaDi", 20);
        Student_2 stu4 = new Student_2("GanGaLe", 120);

        TreeSet<Student_2> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);

        for (Student_2 stu :
                tree) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }
        /*
        重写compareTo()方法，返回值是
        return 0;  表示比较值结果相同，不添加该元素
        return 1;  表示比较值结果大于，添加该元素
        return -1; 表示比较值结果小于，添加该元素前面。

        三种方式运行结果分别为:
        return 0;
                    GanGa,18
        return 1;
                    GanGa,18
                    GanGaJiang,9
                    GanGaDi,20
                    GanGaLe,120
        return -1;
                    GanGaLe,120
                    GanGaDi,20
                    GanGaJiang,9
                    GanGa,18
        */

        System.out.println("==============================");


         /*
        [如果想按照年龄大小比较(升序排列)]:
            @Override
            public int compareTo(Student_2 o) {
                int num = this.age - o.age;
                return num;
            }
        this.age是此时添加的对象的age值，
        o.age是前元素的age值，
        当返回值大于零就放在后面，小于零就放在前面

        同理:[降序排列]
           @Override
            public int compareTo(Student_2 o) {
                int num = o.age - this.age;
                return num;
            }

         【注意】：只这样写，stu5是添加不了的，这里只是比较了年龄
         【解决方法】；附加条件，年龄相同时，比较名字排列
            @Override
            public int compareTo(Student_2 o) {
                int num = this.age - o.age;
                num1 = num == 0 ? this.name.compareTo(o.name) : num;
                return num1;
            }
        */
        Student_3 stu01 = new Student_3("GanGa", 18);
        Student_3 stu02 = new Student_3("GanGaJiang", 9);
        Student_3 stu03 = new Student_3("GanGaDi", 20);
        Student_3 stu04 = new Student_3("GanGaLe", 120);
        Student_3 stu05 = new Student_3("GanGaBaoBao",9);
        Student_3 stu06 = new Student_3("GanGaBaoBao",9);//重复

        TreeSet<Student_3> treeSet = new TreeSet<>();
        treeSet.add(stu01);
        treeSet.add(stu02);
        treeSet.add(stu03);
        treeSet.add(stu04);
        treeSet.add(stu05);
        treeSet.add(stu06);//重复

        for (Student_3 stu :
                treeSet) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }/*
        GanGaBaoBao,9
        GanGaJiang,9
        GanGa,18
        GanGaDi,20
        GanGaLe,120
        */

        //回顾复习==============================================================================================
        System.out.println("==================================================================================");
        System.out.println("==================================================================================");

        TreeSet<Student_回顾复习> treeSet00 = new TreeSet<>();

        Student_回顾复习 student1 = new Student_回顾复习("GanGa", 18);
        Student_回顾复习 student2 = new Student_回顾复习("GanGaJiang", 9);
        Student_回顾复习 student3 = new Student_回顾复习("GanGaDi", 20);
        Student_回顾复习 student4 = new Student_回顾复习("GanGaLe", 120);
        Student_回顾复习 student5 = new Student_回顾复习("GanGaBaoBao",9);
        Student_回顾复习 student6 = new Student_回顾复习("GanGaBaoBao",9);//重复

        treeSet00.add(student1);
        treeSet00.add(student2);
        treeSet00.add(student3);
        treeSet00.add(student4);
        treeSet00.add(student5);
        treeSet00.add(student6);

        for (Student_回顾复习 stu :
                treeSet00) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }

        System.out.println("=======================================");


    }

}

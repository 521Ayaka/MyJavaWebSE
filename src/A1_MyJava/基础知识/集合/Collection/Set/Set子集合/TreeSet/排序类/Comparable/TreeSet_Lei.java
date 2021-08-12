package A1_MyJava.����֪ʶ.����.Collection.Set.Set�Ӽ���.TreeSet.������.Comparable;
/*
[����]:
1. ��TreeSet���ϴ洢�Զ�������޲ι��췽��ʹ�õ�����Ȼ�����Ԫ�ؽ�������ġ�
2. ��Ȼ���򣬾��ǡ���Ԫ����������ʵ��Comparable�ӿڡ�������дcompareTo(T o)��������
3. ��д����ʱ��һ��Ҫע�����������밴��Ҫ��ġ���Ҫ�������͡���Ҫ��������д��
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
            }//ClassCastException ����
        }catch(ClassCastException e){
            System.out.println("ClassCastException ����");
        }

        //����ԭ���ǣ�Comparable�ýӿڶ�ʵ������ÿһ����Ķ���ǿ��һ����������
        //Ҳ����˵��  ��<E>�������ʵ��Comparable�ӿڣ�����дcompareTo()����

        System.out.println("===========================================================================================");

        //ʵ��Comparable�ӿڣ�����дcompareTo()����
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
        ��дcompareTo()����������ֵ��
        return 0;  ��ʾ�Ƚ�ֵ�����ͬ������Ӹ�Ԫ��
        return 1;  ��ʾ�Ƚ�ֵ������ڣ���Ӹ�Ԫ��
        return -1; ��ʾ�Ƚ�ֵ���С�ڣ���Ӹ�Ԫ��ǰ�档

        ���ַ�ʽ���н���ֱ�Ϊ:
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
        [����밴�������С�Ƚ�(��������)]:
            @Override
            public int compareTo(Student_2 o) {
                int num = this.age - o.age;
                return num;
            }
        this.age�Ǵ�ʱ��ӵĶ����ageֵ��
        o.age��ǰԪ�ص�ageֵ��
        ������ֵ������ͷ��ں��棬С����ͷ���ǰ��

        ͬ��:[��������]
           @Override
            public int compareTo(Student_2 o) {
                int num = o.age - this.age;
                return num;
            }

         ��ע�⡿��ֻ����д��stu5����Ӳ��˵ģ�����ֻ�ǱȽ�������
         �����������������������������ͬʱ���Ƚ���������
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
        Student_3 stu06 = new Student_3("GanGaBaoBao",9);//�ظ�

        TreeSet<Student_3> treeSet = new TreeSet<>();
        treeSet.add(stu01);
        treeSet.add(stu02);
        treeSet.add(stu03);
        treeSet.add(stu04);
        treeSet.add(stu05);
        treeSet.add(stu06);//�ظ�

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

        //�ع˸�ϰ==============================================================================================
        System.out.println("==================================================================================");
        System.out.println("==================================================================================");

        TreeSet<Student_�ع˸�ϰ> treeSet00 = new TreeSet<>();

        Student_�ع˸�ϰ student1 = new Student_�ع˸�ϰ("GanGa", 18);
        Student_�ع˸�ϰ student2 = new Student_�ع˸�ϰ("GanGaJiang", 9);
        Student_�ع˸�ϰ student3 = new Student_�ع˸�ϰ("GanGaDi", 20);
        Student_�ع˸�ϰ student4 = new Student_�ع˸�ϰ("GanGaLe", 120);
        Student_�ع˸�ϰ student5 = new Student_�ع˸�ϰ("GanGaBaoBao",9);
        Student_�ع˸�ϰ student6 = new Student_�ع˸�ϰ("GanGaBaoBao",9);//�ظ�

        treeSet00.add(student1);
        treeSet00.add(student2);
        treeSet00.add(student3);
        treeSet00.add(student4);
        treeSet00.add(student5);
        treeSet00.add(student6);

        for (Student_�ع˸�ϰ stu :
                treeSet00) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }

        System.out.println("=======================================");


    }

}

package A1_MyJava.基础知识.集合.Collections工具类.CollectionToComparator;


import java.util.*;

public class TestCollectionToComparator {

    //启动类
    public static void main(String[] args) {
        new TestCollectionToComparator().init();
    }

    //初始化
    public void init(){

        //创建学生对象
        Student stu1 = new Student("尴尬酱", 18);
        Student stu2 = new Student("尴尬帝", 20);
        Student stu3 = new Student("尴尬了", 11);
        Student stu4 = new Student("这就尴", 20);
        Student stu5 = new Student("尴某某", 21);

        //创建ArrayList数组
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        //进行排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                int num = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return num;
            }
        });
        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()){
            Student stu = itr.next();
            System.out.println("姓名: "+stu.getName()+", 年龄: "+stu.getAge());
        }

    }
}

package A1_MyJava.����֪ʶ.����.Collection.Set.Set�Ӽ���.TreeSet.������.Comparable;

public class Student_2 implements Comparable<Student_2>{

    private String name;
    private int age;

    public Student_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student_2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student_2 o) {
//        return 0;  //�ظ�Ԫ��
//        return 1;  //�������
//        return -1; //����ǰ��
        return this.age - o.age;
    }

}
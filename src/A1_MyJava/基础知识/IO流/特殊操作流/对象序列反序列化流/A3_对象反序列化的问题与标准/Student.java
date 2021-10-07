package A1_MyJava.����֪ʶ.IO��.���������.�������з����л���.A3_�������л����������׼;

import java.io.Serializable;

//�Ƚϱ�׼��д����
public class Student implements Serializable/*1:ʵ��Serializable�ӿ�*/ {
    //2:���������������һ��serialVersionUID
         //--������ ��̬�� final���� long���� ������serialVersionUID
    private static final long serialVersionUID = 42L;

    //��Ա����
    private String name;
    private int age;
    //3:����������л��ó�Ա����ʹ��transient����
    private transient int ID = 0;

    //4:Ҫ�벻����,�����пɷ��ʵ��޲ι��췽����
    public Student() {
    }

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //��дtoString()����

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}

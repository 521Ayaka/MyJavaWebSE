package A1_MyJava.����֪ʶ.����.Collection.Set.Set�Ӽ���.HashSet.������ϰ;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Stu {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<Student>();
        Student stu1 = new Student("����",18);
        Student stu2 = new Student("���ν�",19);
        Student stu3 = new Student("���ε�",20);

        Student stu4 = new Student("����",18);

        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);

        hashSet.add(stu4); /**
        ��ͬ����ĵ�ֵַ�ǲ����ظ��ģ�����stu1 �� stu3 �������ظ�Ԫ��
        �����ﵽҪ�󣺡�����Ĳ�����ͬ����Ϊͬһ������ ��Student�൱����дequals()��hashCode()����
        */

        for (Student stu: hashSet){
            System.out.println("�ҽУ�"+stu.getName()+",���䣺"+stu.getAge());
        }

        System.out.println("==============================================");

        Iterator<Student> ite = hashSet.iterator();
        while (ite.hasNext()){
            Student stu = ite.next();
            System.out.println("�ҽУ�"+stu.getName()+",���䣺"+stu.getAge());
        }

    }

}

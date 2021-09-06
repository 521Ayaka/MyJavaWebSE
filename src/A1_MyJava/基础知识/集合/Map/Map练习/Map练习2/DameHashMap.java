package A1_MyJava.����֪ʶ.����.Map.Map��ϰ.Map��ϰ2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameHashMap {

    public static void main(String[] args) {

        new DameHashMap().init();

    }

    //��ʼ��
    public void init() {

        //��ʼ��
        System.out.println("===============================================");

        //����HashMap����
        HashMap<Student, String> hashMap = new HashMap<>();

        //����ѧ������
        //��Ӷ���Ҫ��֤��Ա�����ͳ�Ա������ͬ����֤Ψһ��
        //��Ҫ��Student_hash��дhashCode()��equals()������
        Student stu1 = new Student("���ν�", 18);
        Student stu2 = new Student("���ε�", 20);
        Student stu3 = new Student("������", 11);
        Student stu4 = new Student("������", 11);//�ظ�Ԫ�ض���

        //��hashMap���ϵ�����Ӽ�ֵ��
        hashMap.put(stu1, "20202218");
        hashMap.put(stu2, "20202220");
        hashMap.put(stu3, "20202211");
        hashMap.put(stu4, "20202211");

        //ֱ�Ӵ�ӡhashMap
        System.out.println(hashMap);
        //�����
        // {A1_MyJava.����֪ʶ.����.Map.Map��ϰ.Map��ϰ2.Student_hash@2b4d4e7e=20202211,
        //  A1_MyJava.����֪ʶ.����.Map.Map��ϰ.Map��ϰ2.Student_hash@2b5568fa=20202218,
        //  A1_MyJava.����֪ʶ.����.Map.Map��ϰ.Map��ϰ2.Student_hash@2b4f31d0=20202220}

        //��д��hashCode()��equals()�����󣬶������ԣ���Ա��������ͬʱ����Ϊ��ͬԪ��

        //ѭ������ ����һ
        Set<Student> keyId = hashMap.keySet();
        for (Student stu : keyId) {
            //�õ���Ӧ��valueֵ
            String id = hashMap.get(stu);
            //��ӡ��Ϣ
            System.out.println("����Ϊ: " + stu.getName() + ", ����: " + stu.getAge() + ", ѧ��: " + id);
        }

        System.out.println("===============================================");

        //ѭ������ ������
        Set<Map.Entry<Student, String>> hashEm = hashMap.entrySet();
        for (Map.Entry<Student, String> stuId : hashEm) {
            //��ü�ֵ
            Student key = stuId.getKey();
            String value = stuId.getValue();
            //��ӡ��Ϣ
            System.out.println("����Ϊ: " + key.getName() + ", ����: " + key.getAge() + ", ѧ��: " + value);
        }


    }

}

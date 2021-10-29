package ����֪ʶ.����.Map.Map��ϰ.Map��ϰ1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameMap {

    public static void main(String[] args) {

        //��������
        HashMap<String, Student> map = new HashMap<>();

        //����ѧ������
        Student stu1 = new Student("���ν�", 18);
        Student stu2 = new Student("���ε�", 20);
        Student stu3 = new Student("������", 11);

        //��ӵ�������
        map.put("20202218", stu1);
        map.put("20202220", stu2);
        map.put("20202211", stu3);

        //�������� һ
        Set<String> keySet = map.keySet();
        for (String id : keySet) {
            Student s1 = map.get(id);
            System.out.println("ѧ��:" + id + ", ����:" + s1.getName() + ", ����:" + s1.getAge());
        }

        System.out.println("====================================================================");

        //�������� ��
        Set<Map.Entry<String,Student>> entry =  map.entrySet();
        for (Map.Entry<String,Student> em: entry){
            String key = em.getKey();
            Student value = em.getValue();
            System.out.println("ѧ��:" + key + ", ����:" + value.getName() + ", ����:" + value.getAge());
        }

    }

}

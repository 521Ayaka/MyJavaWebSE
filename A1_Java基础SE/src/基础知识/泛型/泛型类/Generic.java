package ����֪ʶ.����.������;
/*
* ������
* */
public class Generic {

    public static void main(String[] args) {

        Student stu = new Student();

        //����
        stu.setName("�޼���ʦ");
        System.out.println(stu.getName());
        //����
        stu.setAge(10);
        //stu.setAge("ʮ��");
        System.out.println(stu.getAge());

        System.out.println("==========");

        //ʹ�÷�����
        GenericLei<Integer> gan1 = new GenericLei<>();
        gan1.setT(10);
        System.out.println(gan1.getT());

        GenericLei<String> gan2 = new GenericLei<>();
        gan2.setT("ʮ��");
        System.out.println(gan2.getT());

        GenericLei<Boolean> gan3 = new GenericLei<>();
        gan3.setT(true);
        System.out.println(gan3.getT());


    }

}

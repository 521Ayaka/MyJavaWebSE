package ����֪ʶ.����.Collection.Set.Set����.��ϣֵ;

/*
int i = Object.hashCode();

[ע��]:

�������ò���hashCode()�����ġ�

��Ĭ�������, hashCode()����û�б�������д�������:
1. ��ͬ����Ĺ�ϣֵ�ǲ�ͬ�ġ�
2. �����ַ�����˵��stu1�����е��ַ���[��ѩ��]��str�ַ�����[��ѩ��]��ϣֵ����ͬ�ġ�
3. ��ͬ���ַ����Ĺ�ϣֵҲ�п�������ͬ�ģ�

*/
public class Run_HashCode {

    public static void main(String[] args) {

        //����ѧ������
        Student stu1 = new Student("��ѩ��", 20);
        int iCode1 = stu1.hashCode();
        int iCode2 = stu1.hashCode();
        if (iCode1 == iCode2) {
            System.out.println("ͬһ�������ε��ù�ϣֵ��ͬ��");
        }

        //�����ڶ���ѧ������
        Student stu2 = new Student("��ѩ��", 20);
        int jCode1 = stu2.hashCode();
        int jCode2 = stu2.hashCode();
        if (jCode1 == jCode2) {
            System.out.println("ͬһ�������ε��ù�ϣֵ��ͬ��");
        }
        System.out.println("========================");


        //��Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ�ͬ��
        //����������£���дhashCode()������
        if (iCode1 == jCode1) {
            System.out.println("��д��hashCode()����");
        } else if (iCode1 != jCode1) {
            System.out.println("��ͬ����Ĺ�ϣֵ�ǲ�ͬ��");
        }
        System.out.println("========================");
        System.out.println("�ַ����Ĺ�ϣֵ");
        System.out.println("����: " + "����".hashCode());

        System.out.println("========================");
        System.out.println("�ص�: "+"�ص�".hashCode());
        System.out.println("ͨ��: "+"ͨ��".hashCode());
        if ("�ص�".hashCode() == "ͨ��".hashCode()){
            System.out.println("��ͬ���ַ����Ĺ�ϣֵ������ͬ��");
        }

        System.out.println("========================");
        //�����е��ַ����ͳ������е��ַ���
        String str = "��ѩ��";
        System.out.println("��ѩ��: " + str.hashCode());
        System.out.println("stu1�����name: " + stu1.getName().hashCode());
        if (stu1.getName().hashCode() == "��ѩ��".hashCode()){
            System.out.println("stu�����е��ַ���[��ѩ��]��str�ַ�����[��ѩ��]��ϣֵ��ͬ��");
        }

        int i = 1;

    }

}

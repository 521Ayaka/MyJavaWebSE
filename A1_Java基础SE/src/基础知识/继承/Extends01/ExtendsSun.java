package ����֪ʶ.�̳�.Extends01;
/*

 �ڼ̳еĹ�ϵ�У����������һ�����ࡱ��Ҳ����˵��������Ա��������࿴����
 ���縸����Ա���������ǽ�ʦ����ô����ʦ����һ��Ա��������ϵ��is-a��


 ���常��ĸ�ʽ��
 public class �������� {
 // ...
 }

 ��������ĸ�ʽ��
 public class �������� extends �������� {
 // ...
 }


 */
public class ExtendsSun {

    public static void main(String[] args) {

        //����һ���������
        Teacher teacher = new Teacher();

        // Teacher�൱����Ȼʲô��ûд�����ǻ�̳����Ը����method������
        teacher.method();


        // ������һ���������̵Ķ���
        Assistant assistant = new Assistant();
        assistant.method(); //��������̳�������method()������
    }


}

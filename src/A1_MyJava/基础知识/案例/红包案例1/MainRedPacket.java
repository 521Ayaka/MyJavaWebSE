package A1_MyJava.����֪ʶ.����.�������1;

//����
import A1_MyJava.����֪ʶ.�̳�.Extends11����.Manager;
import A1_MyJava.����֪ʶ.�̳�.Extends11����.Member;

import java.util.ArrayList;
import java.util.Scanner;

//������
public class MainRedPacket {

    //main����
    public static void main(String[] args) {

        //����Ⱥ��
        Manager gan = new Manager("���ν�", 521666.66);

        //�������ε�����
        Member one = new Member("��˶�ܵ�", 3.12);
        Member two = new Member("�������", 666.66);
        Member three = new Member("�����ܵ�", 5.32);
        Member four = new Member("������ʦ", 888.5);
        Member five = new Member("����Ե�����", 165.88);

        //===========================================================

        //My���
        gan.show();

        //����ĲƲ����
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();

        System.out.println("=========================================");

        //����Scanner��Ķ���ɨ�������������
        Scanner sc = new Scanner(System.in);

        //��ʼ��Ǯ

        //�����ܽ��
        System.out.println("����ܽ��Ϊ��");
        double totalMoney = sc.nextDouble();

        //���ú������
        System.out.println("���������");
        int count = sc.nextInt();

        //���ú������
        System.out.println("������棺");
        String str = sc.next();

        //��Manager�ഫ�������������ذ�װ�õĺ��
        ArrayList<Double> redList = gan.send(totalMoney, count);

        //����ѷ���
        System.out.println("=========================================");
        System.out.println("=======" + str + "======\n");

        //���������ڿ�ʼ����պ��
        one.receive(redList, gan.getMax());
        two.receive(redList, gan.getMax());
        three.receive(redList, gan.getMax());
        four.receive(redList, gan.getMax());
        five.receive(redList,gan.getMax());

        System.out.println("=========================================");

        //My�����
        gan.show();

        //��������
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();

        System.out.println("=========================================");

        //�������ڸ�л���أ�
        System.out.println(one.getName()+":");    WanSui();//���ø�л�ҵķ�����

        System.out.println(two.getName()+":");    WanSui();

        System.out.println(three.getName()+":");  WanSui();

        System.out.println(four.getName()+":");   WanSui();

        System.out.println(five.getName()+":");   WanSui();
    }

    //��л�ҵķ���  //�м�Ҫ��static�ؼ��ֽ������Ρ�����
    public static void WanSui(){
        System.out.println("���ν�����d(^��^*)))\n");
    }

}
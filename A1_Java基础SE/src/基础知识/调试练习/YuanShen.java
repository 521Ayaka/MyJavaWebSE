package ����֪ʶ.������ϰ;
//����

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
����
��ע
лл
���ԵĻ�������ʮ����Ҳ��/͵Ц�����꤬�Ȥ��������ޤ�
uid:���ɺó���
uid:136761371

*/
//��ʼ�����ԭ��һ��......
public class YuanShen {

    //����Ϸ
    public static void main(String[] args) {

        //��������
        Scanner sc = new Scanner(System.in);

        //miHoYo ԭ��
        System.out.println("���Ʋ�����Ϸ���ܾ�������Ϸ��");
        System.out.println("ע�����ұ�����������ƭ�ϵ���");
        System.out.println("�ʶ���Ϸ���ԣ�������Ϸ����");
        System.out.println("������ʱ�䣬���ܽ������");
        System.out.println("......");

        System.out.println("\n�������������Ϸ����...");

        System.out.println("������⴦����");//�Ƿ������
        System.out.println("�Ƿ������?yes?no?"); //��������뷨������

        String ask;
        do {
            ask = sc.next();
            if ("yes".equals(ask)) {
                System.out.println("��ӭ�����׺��ƣ�");
                method();//����method��������ʽ��ʼ��Ϸ
            } else if ("no".equals(ask)) {
                System.out.println("�ټ�mHoYo  �ټ�ԭ��");
            } else {
                System.out.println("���鸴�ӣ����������޷�ѡ��");
            }
        } while (!"yes".equals(ask) && !"no".equals(ask));

    }


    //method��ʽ��ʼ��Ϸ�ķ���=================================================================
    public static void method() {
        //��������
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        MyYuanShen my = new MyYuanShen();
        int YuanShi = my.getYuanShi();

        System.out.println("���ڽ���...");

        //�Ƿ��¿�
        if (my.isYueKa()) {
            System.out.println("���90ԭʯ");
            my.setYuanShi(my.getYuanShi() + 90);
        }

        //ÿ�����񣬴�����
        System.out.println("=====ÿ������=====");
        int yes =MeiRiWeiTuo();//���������ί�У�������ԭʯ
        my.setYuanShi(my.getYuanShi()+yes);//�����ҵ�ԭ����
        System.out.println("����\n�ɵ³�");
        System.out.println("ð�ռ�Э��\n��ɪ��\n������......");
        System.out.println("��л����......");
        System.out.println("ԭʯ+20");
        my.setYuanShi(my.getYuanShi()+20);//�����ҵ�ԭ����

        //���ջ��ԭʯ��
        System.out.println("���ջ��ԭʯ����"+(my.getYuanShi()-YuanShi));

        //��ǲ
        System.out.println("============================");
        System.out.println("ð�ռ�Э��\n��ɪ��\n������......");
        System.out.println("��ǲ����");
        my.setKuang1(my.getKuang1()+9*4);
        my.setKuang2(my.getKuang2()+7*4);
        my.setMoLa(my.getMoLa()+50000*2);

        //����̨
        System.out.println("============================");
        System.out.println("����̨\n�߸���\n�ţ�ʲô�ǣ�");
        my.setKuang2(my.getKuang2()-5*4*4);
        System.out.println("�ټ���");

        //�ϳ�̨
        System.out.println("============================");
        do {
            //�Ƿ�㵽������˹
            int kao =1;
            int xxx= ran.nextInt(2);
            if(kao == xxx){
                System.out.println("�ϳ�̨\n������˹\n��ã���Ҳ����......");
                System.out.println("�ټ�");
            }else{
                System.out.println("�ϳ�4��Ũ����֬");
                break;
            }
        }while(true);

        //��
        System.out.println("============================");
        int yuan = my.getYuanShi()/160;

        for (int i = 0; i < yuan; i++) {

        }

        for (int i = 1; i <= yuan; i++) {
            System.out.println("�һ�\n��\n��һ��\nȷ��");
            System.out.println("��ϲ��ã�");
            System.out.println("�������");
            my.setYuanShi(my.getYuanShi()-160);//��ȥ�ҵ�ԭ����
            System.out.println("ʣ��ԭʯ��"+my.getYuanShi());
        }
        System.out.println("����ϣ�");

        System.out.println("============================");

        //�Ƿ��Ƴ���Ϸ
        System.out.println("�Ƿ��Ƴ���Ϸ��yes��no��");
        String str;
        do {
            str = sc.next();
            if ("yes".equals(str)){
                System.out.println("�˳���Ϸ");
            }else if("no".equals(str)){
                System.out.println("�ڿ�ȥ......");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".........");
                }
            }else{
                System.out.println("�ϱ������ˣ����鸴�ӡ�����");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".........");
                }
            }
        }while(!"yes".equals(str) && !"no".equals(str));

        //
    }



    //ÿ��ί�еķ���=========================================================
    public static int MeiRiWeiTuo(){
        //��������
        MyYuanShen my = new MyYuanShen();
        Random ran = new Random();
        ArrayList<String> list = new ArrayList<>();

        //������������
        list.add("а�������");
        list.add("�ʸ�Σ��");
        list.add("��Σ����");
        list.add("�����˵�һС��");
        list.add("����ֲ��");
        list.add("��ȫ����");
        list.add("Σ������");
        list.add("�����ߣ��Ҷ���");
        list.add("�����ߣ���ɨ����");
        list.add("�����ߣ�ȥ......");
        //̫���ˣ�ʲô�¶�����������

        //�������4��ί��
        int yes = 0;
        ran.nextInt(list.size());
        for (int i = 0; i < 4; i++) {
            System.out.println("׷��");
            //��ȡί������ֵ
            int index = ran.nextInt(list.size());
            String renwu = list.get(index);
            System.out.println(renwu);
            list.remove(index);//ɾ�����ί��

            System.out.println("�������");
            System.out.println("ԭʯ+10");
            System.out.println("========");
            yes+=10;

        }

        return yes;
    }

}





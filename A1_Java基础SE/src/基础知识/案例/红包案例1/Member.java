package ����֪ʶ.����.�������1;
//����
import ����֪ʶ.�̳�.Extends11����.User;

import java.util.ArrayList;
import java.util.Random;

//��ͨ��Ա����   //�������  ����
public class Member extends User {

    //��������Ĳ�����Ϣ
    public Member(String name, double money) {
        super(name, money); //���ø��๹�췽������ӡ������Ϣ��
    }

    //��ͨ��Ա�պ���ķ���
    public void receive(ArrayList<Double> list, double max) {

        //�������int����
        int index = new Random().nextInt(list.size());
        //��list���ϵ�����ȡ�������
        Double delta = list.remove(index);

        //��ӡ�����ĺ�������ж�˭�Ľ�����
        if (max == delta){
            System.out.println("===(�Rv�Q)?������o((>��< ))o===");
            System.out.println(super.getName()+",����"+delta+"Ԫ��");
            System.out.println();
        }else{
            System.out.println(super.getName()+",����"+delta+"Ԫ��");
            System.out.println();
        }
        //�õ���������ص�������
        double money = super.getMoney();
        super.setMoney(money + delta);
    }

}
package ����֪ʶ.���.ʱ����.Date;

import java.util.Date;

/*
Date�����������췽�����������ѹ�ʱ��
1. public Date( ): ���� Date ���󲢳�ʼ���˶����Ա�ʾ��������ʱ�䣨��ȷ�����룩��
2. public Date(lang Date): ���� Date ���󲢳�ʼ���˶����Ա�ʾ�Դӱ�׼��׼ʱ�䣨��Ϊ����Ԫ��epoch�������� 1970 �� 1 �� 1 �� 00:00:00 GMT��������ָ����������

ֱ�Ӵ�ӡ������ʱ���Ӧ��ʱ�䡣��ΪDate��д��toString()������

*/
public class DateConstructionMethod {

    public static void main(String[] args) {

        //[1] �޲ι��췽��
        Date date1 = new Date();
        System.out.println(date1); //Thu Jun 10 10:07:58 CST 2021

        //[2] �вι��췽��
        Date date3 = new Date(0);
        System.out.println(date3); //Thu Jan 01 08:00:00 CST 1970
        Date date2 = new Date(1000*60*60*24*10);
        System.out.println(date2); //Sun Jan 11 08:00:00 CST 1970




    }

}

package ����֪ʶ.���.ʱ����.Date;

import java.util.Date;

/*
Date��ĳ��÷���:

public long getTime():  ��ȡ��ʱ���ڶ����1970��1��1��00:00:00�����ڵĺ���ֵ
[˵��]: ��������ʱlong ����ֵ��

public void setTime(long time):  ����ʱ�䣬����ʱ����ֵ��
[˵��]: �����Ҳ��long���͵ĺ���ֵ��

*/
public class DateMethod {

    public static void main(String[] args) {

        //�������ڶ���
        Date date = new Date();

        //public long getTime():  ��ȡ��ʱ���ڶ����1970��1��1��00:00:00�����ڵĺ���ֵ
        long dateTime = date.getTime();
        System.out.println(date.getTime());//Ĭ�Ϸ��ص�ǰ����1970/1/1�ĺ���ֵ
        System.out.println(1970+32/365.2422+dateTime*1.0/1000/60/60/24/365+"��");


        //public void setTime(long time):  ����ʱ�䣬����ʱ����ֵ��
        date.setTime(1000L*60*60*24*365*30);
        System.out.println(date.getTime());
        System.out.println(1970+date.getTime()/1000*60*60*24*365+"��");

    }

}

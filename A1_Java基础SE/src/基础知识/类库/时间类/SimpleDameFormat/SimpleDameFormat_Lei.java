package ����֪ʶ.���.ʱ����.SimpleDameFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*

[���췽��]:
public SimpleDateFormat(){//...}  ����һ��SimpleDateFormat, ʹ��Ĭ��ģʽ�����ڸ�ʽ
public SimpleDateFormat(String pattern){//...}

[��ĸ����ĸ�ʽ]:
��ĸ  ���ڻ�ʱ��Ԫ��  ��ʾ  ʾ��
G ------- Era ��־��  Text  AD
y ------- ��  Year  1996; 96
M ------- ���е��·�  Month  July; Jul; 07
w ------- ���е�����  Number  27
W ------- �·��е�����  Number  2
D ------- ���е�����  Number  189
d ------- �·��е�����  Number  10
F ------- �·��е�����  Number  2
E ------- �����е�����  Text  Tuesday; Tue
a ------- Am/pm ���  Text  PM
H ------- һ���е�Сʱ����0-23��  Number  0
k ------- һ���е�Сʱ����1-24��  Number  24
K ------- am/pm �е�Сʱ����0-11�� --------Number  0
h ------- am/pm �е�Сʱ����1-12�� --------Number  12
m ------- Сʱ�еķ�����--------- Number  30
s ------- �����е����� ---------Number  55
S ------- ������--------------  Number  978
z ------- ʱ�� -------------- General time zone  Pacific Standard Time; PST; GMT-08:00
Z ------- ʱ�� -------------- RFC 822 time zone  -0800

[��Ա����]:
          [��ʽ��]: Date ---> String
          public final String format(Date date){//...} �����ڸ�ʽ��������/ʱ���ַ���

          [��������]: String ---> Date
          public Date parse(String source){//...} ��ָ���ַ����Ŀ�ʼ�����ı�����������

*/
public class SimpleDameFormat_Lei {

    public static void main(String[] args) throws ParseException {

        Date date1 = new Date();

        //�޲ι��췽��
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        System.out.println("Ĭ���޲ι����ʽ:"+sdf1.format(date1)); // Ĭ���޲ι����ʽ:2021/6/17 ����7:39

        //�вι��췽��
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss:SS \n a hh:mm:ss:SS \n E F d ");
        String str = sdf2.format(date1); //�÷�������ֵ��String, ���Խ���String��
        System.out.println(sdf2.format(date1));

        System.out.println("========================================================================================");

        //��Ա����

        //[��ʽ��]: Date ---> String
        //public final String format(){//...} �����ڸ�ʽ��������/ʱ���ַ���
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy��MM��dd�� EE HH:mm:ss:SS");
        System.out.println(sdf1.format(date1));
        System.out.println(sdf3.format(date1));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //[��������]: String ---> Date
        //public Date parse(String source){//...} ��ָ���ַ����Ŀ�ʼ�����ı�����������
        SimpleDateFormat pattern = new SimpleDateFormat("yyyy��MM��dd�� E HH:mm:ss");
        /*
        String strDate = "1999-12-12 12:12:12:10";                  //��ʽ�Բ��Ͼͻ����
        Date dateX = pattern.parse(strDate);
        System.out.println(dateX);
        Exception in thread "main" java.text.ParseException: Unparseable date: "1999-12-12 12:12:12:10"
        at java.base/java.text.DateFormat.parse(DateFormat.java:396)
        at MyJava.����֪ʶ.���.ʱ����.SimpleDameFormat.SimpleDameFormat_Lei.main(SimpleDameFormat_Lei.java:73)
        */
        String strDate = "2021��6��15�� ���ڶ� 10:20:30";
        Date dateX = pattern.parse(strDate);
        System.out.println(dateX);
    }

}

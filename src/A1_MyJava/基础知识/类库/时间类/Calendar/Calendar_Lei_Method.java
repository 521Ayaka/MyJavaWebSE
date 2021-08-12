package A1_MyJava.����֪ʶ.���.ʱ����.Calendar;
/*
��Ա����:
 public int get(int field){//...} ���ظ��������ֶε�ֵ��//�����ǵ���Calendar�� [��̬����] !

 public abstract void add(int field,int amount) ���������Ĺ��򣬽�ָ����ʱ������ӻ��ȥ�����������ֶ�

 public final void set(int year, int month, int date){//...} ���õ�ǰ������������
*/

import java.util.Calendar;
import java.util.Date;

public class Calendar_Lei_Method {

    public static void main(String[] args) {

        //ʹ�ö�̬���д���Calendar����
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //java.util.GregorianCalendar[time=1623932023895,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=168,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=13,SECOND=43,MILLISECOND=895,ZONE_OFFSET=28800000,DST_OFFSET=0]


        //����ʹ��
        //public int get(int field){//...} ���ظ��������ֶε�ֵ��//�����ǵ���Calendar�� [��̬����] !
        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get(Calendar.MONTH) + 1; // �������˼�1�� ��������������������������������������
        int date1 = calendar.get(Calendar.DATE);
        System.out.println(year1 + "��" + month1 + "��" + date1 + "��");
        //2021��6��17��

        System.out.println("============================================================================================");

        //public abstract void add(int field,int amount) ���������Ĺ��򣬽�ָ����ʱ������ӻ��ȥ�����������ֶ�
        //��Ҫ10���Ľ��죬�����ǰ10�� ����ʹ��add()�������в���
        calendar.add(Calendar.YEAR , 10);
        calendar.add(Calendar.DATE, -10);
        //��ӡ----------------------------------
        int year2 = calendar.get(Calendar.YEAR);
        int month2 = calendar.get(Calendar.MONTH) + 1; // �������˼�1�� ��������������������������������������
        int date2 = calendar.get(Calendar.DATE);
        System.out.println(year2 + "��" + month2 + "��" + date2 + "��");
        //2031��6��7��

        System.out.println("============================================================================================");

        //public final void set(int year, int month, int date){//...} ���õ�ǰ������������
        //���������ó� 2222�� 12�� 22�� ����ʹ��set()�������в���
        calendar.set(2222,12-1,22); // 2222/12/22
        //��ӡ----------------------------------
        int year3 = calendar.get(Calendar.YEAR);
        int month3 = calendar.get(Calendar.MONTH) + 1; // �������˼�1�� ��������������������������������������
        int date3 = calendar.get(Calendar.DATE);
        System.out.println(year3 + "��" + month3 + "��" + date3 + "��");
        //2223��1��22��
        System.out.println("===========================================================================================");

        Date dateCalender = calendar.getTime();
        System.out.println(dateCalender);


    }

}

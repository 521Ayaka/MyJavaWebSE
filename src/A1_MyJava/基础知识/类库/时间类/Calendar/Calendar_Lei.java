package A1_MyJava.����֪ʶ.���.ʱ����.Calendar;

import java.util.Calendar;  //Calendar����util����
/*

[Calendar��] Ϊÿһʱ�̺�һ�������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶ��ṩ��һЩ����

[Calendar��] �ṩ��һ���෽�� [getInstance] ���ڻ�ȡ Calendar �����������ֶ���ʹ�õ�ǰ���ں�ʱ���ʼ��:
             �䴴�������ʽ��: Calendar [������] = Calendar.Instance();

*/


public class Calendar_Lei {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); //��̬��д����
        System.out.println(calendar);
        System.out.println(calendar.toString());
        //java.util.GregorianCalendar[time=1623896275120,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=168,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=17,SECOND=55,MILLISECOND=120,ZONE_OFFSET=28800000,DST_OFFSET=0]
                                     //����ֵ                                                                                                                                                                                                                                                 //year�� //�´��㿪ʼ5+1
        int year = calendar.get(Calendar.YEAR);       //������Calendar�ľ�̬����
        int month = calendar.get(Calendar.MONTH) + 1; //MONTH�·��Ǵ�0��ʼ�ģ���ȡ��ȷ�������·�Ӧ��+1
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+"��"+month+"��"+date+"��");


    }

}

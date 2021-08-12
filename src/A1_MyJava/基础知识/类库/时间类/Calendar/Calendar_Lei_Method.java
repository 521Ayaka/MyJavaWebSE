package A1_MyJava.基础知识.类库.时间类.Calendar;
/*
成员方法:
 public int get(int field){//...} 返回给定日历字段的值。//参数是调用Calendar的 [静态方法] !

 public abstract void add(int field,int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段

 public final void set(int year, int month, int date){//...} 设置当前日历的年月日
*/

import java.util.Calendar;
import java.util.Date;

public class Calendar_Lei_Method {

    public static void main(String[] args) {

        //使用多态进行创建Calendar对象。
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //java.util.GregorianCalendar[time=1623932023895,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=168,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=13,SECOND=43,MILLISECOND=895,ZONE_OFFSET=28800000,DST_OFFSET=0]


        //方法使用
        //public int get(int field){//...} 返回给定日历字段的值。//参数是调用Calendar的 [静态方法] !
        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get(Calendar.MONTH) + 1; // 【别忘了加1】 ！！！！！！！！！！！！！！！！！！！
        int date1 = calendar.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + date1 + "日");
        //2021年6月17日

        System.out.println("============================================================================================");

        //public abstract void add(int field,int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段
        //想要10年后的今天，今天的前10天 可以使用add()方法进行操作
        calendar.add(Calendar.YEAR , 10);
        calendar.add(Calendar.DATE, -10);
        //打印----------------------------------
        int year2 = calendar.get(Calendar.YEAR);
        int month2 = calendar.get(Calendar.MONTH) + 1; // 【别忘了加1】 ！！！！！！！！！！！！！！！！！！！
        int date2 = calendar.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + date2 + "日");
        //2031年6月7日

        System.out.println("============================================================================================");

        //public final void set(int year, int month, int date){//...} 设置当前日历的年月日
        //把日期设置成 2222年 12月 22日 可以使用set()方法进行操作
        calendar.set(2222,12-1,22); // 2222/12/22
        //打印----------------------------------
        int year3 = calendar.get(Calendar.YEAR);
        int month3 = calendar.get(Calendar.MONTH) + 1; // 【别忘了加1】 ！！！！！！！！！！！！！！！！！！！
        int date3 = calendar.get(Calendar.DATE);
        System.out.println(year3 + "年" + month3 + "月" + date3 + "日");
        //2223年1月22日
        System.out.println("===========================================================================================");

        Date dateCalender = calendar.getTime();
        System.out.println(dateCalender);


    }

}

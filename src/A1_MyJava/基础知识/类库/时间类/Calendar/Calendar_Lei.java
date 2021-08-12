package A1_MyJava.基础知识.类库.时间类.Calendar;

import java.util.Calendar;  //Calendar类在util包下
/*

[Calendar类] 为每一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法

[Calendar类] 提供了一个类方法 [getInstance] 用于获取 Calendar 对象，其日历字段已使用当前日期和时间初始化:
             其创建对象格式是: Calendar [对象名] = Calendar.Instance();

*/


public class Calendar_Lei {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); //多态的写法。
        System.out.println(calendar);
        System.out.println(calendar.toString());
        //java.util.GregorianCalendar[time=1623896275120,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=168,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=17,SECOND=55,MILLISECOND=120,ZONE_OFFSET=28800000,DST_OFFSET=0]
                                     //毫秒值                                                                                                                                                                                                                                                 //year年 //月从零开始5+1
        int year = calendar.get(Calendar.YEAR);       //参数是Calendar的静态方法
        int month = calendar.get(Calendar.MONTH) + 1; //MONTH月份是从0开始的，获取正确的日期月份应该+1
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");


    }

}

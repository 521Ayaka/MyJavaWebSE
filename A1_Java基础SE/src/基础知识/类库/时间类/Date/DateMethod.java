package 基础知识.类库.时间类.Date;

import java.util.Date;

/*
Date类的常用方法:

public long getTime():  获取的时日期对象从1970年1月1日00:00:00到现在的毫秒值
[说明]: 返回类型时long 毫秒值。

public void setTime(long time):  设置时间，给的时毫秒值。
[说明]: 传入的也是long类型的毫秒值。

*/
public class DateMethod {

    public static void main(String[] args) {

        //创建日期对象
        Date date = new Date();

        //public long getTime():  获取的时日期对象从1970年1月1日00:00:00到现在的毫秒值
        long dateTime = date.getTime();
        System.out.println(date.getTime());//默认返回当前基于1970/1/1的毫秒值
        System.out.println(1970+32/365.2422+dateTime*1.0/1000/60/60/24/365+"年");


        //public void setTime(long time):  设置时间，给的时毫秒值。
        date.setTime(1000L*60*60*24*365*30);
        System.out.println(date.getTime());
        System.out.println(1970+date.getTime()/1000*60*60*24*365+"年");

    }

}

package 基础知识.类库.时间类.Date;

import java.util.Date;

/*
Date类有两个构造方法。其他的已过时。
1. public Date( ): 分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
2. public Date(lang Date): 分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。

直接打印对象名时想对应的时间。因为Date重写的toString()方法。

*/
public class DateConstructionMethod {

    public static void main(String[] args) {

        //[1] 无参构造方法
        Date date1 = new Date();
        System.out.println(date1); //Thu Jun 10 10:07:58 CST 2021

        //[2] 有参构造方法
        Date date3 = new Date(0);
        System.out.println(date3); //Thu Jan 01 08:00:00 CST 1970
        Date date2 = new Date(1000*60*60*24*10);
        System.out.println(date2); //Sun Jan 11 08:00:00 CST 1970




    }

}

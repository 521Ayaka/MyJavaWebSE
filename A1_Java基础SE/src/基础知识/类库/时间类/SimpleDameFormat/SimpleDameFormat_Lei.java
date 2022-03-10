package 基础知识.类库.时间类.SimpleDameFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*

[构造方法]:
public SimpleDateFormat(){//...}  构造一个SimpleDateFormat, 使用默认模式和日期格式
public SimpleDateFormat(String pattern){//...}

[字母代表的格式]:
字母  日期或时间元素  表示  示例
G ------- Era 标志符  Text  AD
y ------- 年  Year  1996; 96
M ------- 年中的月份  Month  July; Jul; 07
w ------- 年中的周数  Number  27
W ------- 月份中的周数  Number  2
D ------- 年中的天数  Number  189
d ------- 月份中的天数  Number  10
F ------- 月份中的星期  Number  2
E ------- 星期中的天数  Text  Tuesday; Tue
a ------- Am/pm 标记  Text  PM
H ------- 一天中的小时数（0-23）  Number  0
k ------- 一天中的小时数（1-24）  Number  24
K ------- am/pm 中的小时数（0-11） --------Number  0
h ------- am/pm 中的小时数（1-12） --------Number  12
m ------- 小时中的分钟数--------- Number  30
s ------- 分钟中的秒数 ---------Number  55
S ------- 毫秒数--------------  Number  978
z ------- 时区 -------------- General time zone  Pacific Standard Time; PST; GMT-08:00
Z ------- 时区 -------------- RFC 822 time zone  -0800

[成员方法]:
          [格式化]: Date ---> String
          public final String format(Date date){//...} 将日期格式化成日期/时间字符串

          [解析日期]: String ---> Date
          public Date parse(String source){//...} 从指定字符串的开始解析文本以生成日期

*/
public class SimpleDameFormat_Lei {

    public static void main(String[] args) throws ParseException {

        Date date1 = new Date();

        //无参构造方法
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        System.out.println("默认无参构造格式:"+sdf1.format(date1)); // 默认无参构造格式:2021/6/17 下午7:39

        //有参构造方法
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SS \n a hh:mm:ss:SS \n E F d ");
        String str = sdf2.format(date1); //该方法返回值是String, 可以接收String。
        System.out.println(sdf2.format(date1));

        System.out.println("========================================================================================");

        //成员方法

        //[格式化]: Date ---> String
        //public final String format(){//...} 将日期格式化成日期/时间字符串
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 EE HH:mm:ss:SS");
        System.out.println(sdf1.format(date1));
        System.out.println(sdf3.format(date1));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //[解析日期]: String ---> Date
        //public Date parse(String source){//...} 从指定字符串的开始解析文本以生成日期
        SimpleDateFormat pattern = new SimpleDateFormat("yyyy年MM月dd日 E HH:mm:ss");
        /*
        String strDate = "1999-12-12 12:12:12:10";                  //格式对不上就会错误
        Date dateX = pattern.parse(strDate);
        System.out.println(dateX);
        Exception in thread "main" java.text.ParseException: Unparseable date: "1999-12-12 12:12:12:10"
        at java.base/java.text.DateFormat.parse(DateFormat.java:396)
        at MyJava.基础知识.类库.时间类.SimpleDameFormat.SimpleDameFormat_Lei.main(SimpleDameFormat_Lei.java:73)
        */
        String strDate = "2021年6月15日 星期二 10:20:30";
        Date dateX = pattern.parse(strDate);
        System.out.println(dateX);
    }

}

package A1_MyJava.基础知识.类库.时间类.时间工具案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

创建一个工具类一般吧构造方法设为静态，把成员方法设为静态

*/
public class DateUtils {

    private DateUtils(){
        //无参私有构造方法 外部不能创建对象
    }

    //传入一个日期Date对象，和要转换的指定格式字符串， 返回这个Date时间以这个格式所对应的时间字符串。
    public static String DateToString(Date date, String str){
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        String formatDate = sdf.format(date);
        return formatDate;
    }

    //传入一个日期字符串，和此日期格式字符串，返回解析所得到的字符串。
    public static Date StringToDate(String str1, String str2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(str2);
        Date parseDate = sdf.parse(str1);
        return parseDate;
    }


}

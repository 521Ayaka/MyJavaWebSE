package A1_MyJava.基础知识.类库.时间类.时间工具案例;

import java.text.ParseException;
import java.util.Date;

/*
*
* 测试类
*
* */

public class DateDemo {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();

        String dateString = DateUtils.DateToString(date, "yyyy年MM月dd HH:mm:ss");
        System.out.println(dateString);

        Date date2 = DateUtils.StringToDate("2021/06/15 星期二 12:12:12", "yyyy/MM/dd E HH:mm:ss");
        System.out.println(date2);
    }

}

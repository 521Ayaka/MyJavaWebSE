package A1_MyJava.����֪ʶ.���.ʱ����.ʱ�乤�߰���;

import java.text.ParseException;
import java.util.Date;

/*
*
* ������
*
* */

public class DateDemo {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();

        String dateString = DateUtils.DateToString(date, "yyyy��MM��dd HH:mm:ss");
        System.out.println(dateString);

        Date date2 = DateUtils.StringToDate("2021/06/15 ���ڶ� 12:12:12", "yyyy/MM/dd E HH:mm:ss");
        System.out.println(date2);
    }

}

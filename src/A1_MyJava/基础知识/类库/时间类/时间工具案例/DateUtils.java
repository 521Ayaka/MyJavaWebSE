package A1_MyJava.����֪ʶ.���.ʱ����.ʱ�乤�߰���;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

����һ��������һ��ɹ��췽����Ϊ��̬���ѳ�Ա������Ϊ��̬

*/
public class DateUtils {

    private DateUtils(){
        //�޲�˽�й��췽�� �ⲿ���ܴ�������
    }

    //����һ������Date���󣬺�Ҫת����ָ����ʽ�ַ����� �������Dateʱ���������ʽ����Ӧ��ʱ���ַ�����
    public static String DateToString(Date date, String str){
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        String formatDate = sdf.format(date);
        return formatDate;
    }

    //����һ�������ַ������ʹ����ڸ�ʽ�ַ��������ؽ������õ����ַ�����
    public static Date StringToDate(String str1, String str2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(str2);
        Date parseDate = sdf.parse(str1);
        return parseDate;
    }


}

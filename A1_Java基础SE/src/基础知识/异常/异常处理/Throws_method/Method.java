package 基础知识.异常.异常处理.Throws_method;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Method {

    public static void method5() throws ParseException {
        System.out.println("使用类待用");
        Scanner scanner = new Scanner(System.in);
        System.out.println("日期格式: 年/月/日 ");
        String string = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(string); //SimpleDateFormat类的parse方法要使用throws异常签名。
        System.out.println(sdf.format(date));
    }

}

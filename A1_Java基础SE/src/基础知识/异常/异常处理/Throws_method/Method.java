package ����֪ʶ.�쳣.�쳣����.Throws_method;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Method {

    public static void method5() throws ParseException {
        System.out.println("ʹ�������");
        Scanner scanner = new Scanner(System.in);
        System.out.println("���ڸ�ʽ: ��/��/�� ");
        String string = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(string); //SimpleDateFormat���parse����Ҫʹ��throws�쳣ǩ����
        System.out.println(sdf.format(date));
    }

}

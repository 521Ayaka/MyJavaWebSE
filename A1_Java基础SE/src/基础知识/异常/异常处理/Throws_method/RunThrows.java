package ����֪ʶ.�쳣.�쳣����.Throws_method;  //throws �� �� ˿��˿ ��
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
ע������:
1. throws����ʱ д�ڷ�����[ () ]���档
   [��ʽ]:  ���η� ������() throws �쳣�� { //������ }

2. throws�����쳣��ʱ����Щ�쳣���������õķ���ҲҪ���� throws ����           ��maim() method5() method2() �ĵ��á�
                              ����ʹ��try...catch...����                ��method3()�ĵ��á�

3. ��Щ�쳣����throws����󣬲������������У�Ҫ���������л���Ҫtry...catch...����  ��method1()�ĵ��á�

*/

public class RunThrows {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException{
        System.out.println("����ʼִ�С�");

        //method1();//������������
        method2();//���mainҲҪʹ��throws�쳣ǩ����
        method3();//Ҳ����ʹ��try...catch...���� �� ����method3û��ʹ��throws����
        Method.method5();//��Ȼ��Ҫthrows�׳��쳣��

        System.out.println("����������С�");
    }


    public static void method1() throws ArrayIndexOutOfBoundsException{
        String str = scanner.next();
        String[] array = {str};
        System.out.println(array[1]);/**
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at MyJava.����֪ʶ.�쳣.�쳣����.Throws_method.RunThrows.method(RunThrows.java:16)
        at MyJava.����֪ʶ.�쳣.�쳣����.Throws_method.RunThrows.main(RunThrows.java:10)
        */
    }

    //ʹ��SimpleDateFormat��parse������
    private static void method2() throws ParseException {

        System.out.println("���ڸ�ʽ: ��/��/�� ");
        String string = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(string); //SimpleDateFormat���parse����Ҫʹ��throws�쳣ǩ����
        System.out.println(sdf.format(date));
    }

    public static void method3() {
        System.out.println("�ٴ�����");
        try {
            method2();//��Ȼ��Ҫthrows�׳��쳣��
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

}

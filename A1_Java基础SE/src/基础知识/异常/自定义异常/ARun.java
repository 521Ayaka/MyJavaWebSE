package ����֪ʶ.�쳣.�Զ����쳣;
import java.util.Scanner;
/*
[�����쳣]:
��ʽ:        ���η� class �Զ����쳣�� extends Exception { //... }
�������췽��:  public �Զ����쳣��(){ }
             public �Զ����쳣��(String message){
                    super(message);
             }

[ʹ��]:
��ʽ: throw new �Զ����쳣��(  "�쳣����ʾ(�ַ�����Ҳ��������)"  );
ע��: ����ͷ()����Ҫʹ�� throws �Զ����쳣��{ //... }
     �ڵ���������쳣�ķ�����ʱ�� ���Զ��������ʹ�� try...catch...����

========================================================================================================================

[ע��]:
throws �� throw ������:

[1]
throws ���ڷ����������棬����ʱ�쳣������
throw  ���ڷ����ڲ�������ʱ�쳣��������

[2]
throws ��ʾ�׳��쳣���и÷����ĵ�����������
throw  ��ʾ�׳��쳣���з������ڵ���䴦��

[3]
throws ��ʾ�����쳣��һ�ֿ����ԣ�����һ���ᷢ����Щ�쳣
throw  ִ��throwһ��������ĳ���쳣

*/

public class ARun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("�����������");
        int score = sc.nextInt();

        Teacher teacher = new Teacher();
        try {
            teacher.scoreMethod(score);
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }

}

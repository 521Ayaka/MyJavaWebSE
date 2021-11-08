package C3_ע��.D5_Junit��ע�ⰸ��;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * �򵥵Ĳ��Կ��
 * <p>
 * ��������ִ�к�, ���Զ����б��������з��� (����TestAnnע��ķ���)
 * �жϷ����Ƿ����쳣, ��¼���ļ���
 */

public class TestCheck {

    public static String file = "D:\\Դ����\\A2_JavaWebѧϰjs\\B0_JavaWeb��������\\src\\C3_ע��\\D5_Junit��ע�ⰸ��\\bug.txt";

    @Test
    public void meTest() throws IOException {

        //1.����С���ļ������
        Calculator cal = new Calculator();

        //2.��ȡ�����Class����
        Class<? extends Calculator> cla = cal.getClass();

        int num = 0;//��¼�쳣����
        //����IO����¼�쳣 ��־
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        //3.��ȡ���󷽷��Ķ���
        Method[] mes = cla.getMethods();
        for (Method me : mes) {

            //4.�жϷ������Ƿ���TestAnnע��
            if (me.isAnnotationPresent(TestAnn.class)) {

                //5.����еĻ�,ִ��
                try {
                    //ͨ������ʹ�÷�����
                    me.invoke(cal);

                }
                catch (Exception e) {

                    //6.�����쳣 ��¼���ļ�����
                    num++;
                    bw.write(me.getName() + "�����쳣");
                    bw.newLine();
                    bw.write("�쳣������: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("�쳣��ԭ��: " + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("=======================================");
                    bw.newLine();
                }

            }

        }

        bw.write("���β��Թ����� " + num + " ���쳣��");
        bw.flush();
        bw.close();

        System.out.println("==============================");
        System.out.println("��־������,����: "+num+" ���쳣��");

    }

}

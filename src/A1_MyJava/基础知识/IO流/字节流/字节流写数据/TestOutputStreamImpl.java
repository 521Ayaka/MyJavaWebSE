package A1_MyJava.����֪ʶ.IO��.�ֽ���.�ֽ���д����;
/*
OutputStream�ӿ� ����������ֽ����ĳ��࣬����д�����ݡ�



*/

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStreamImpl {

    public static void main(String[] args) throws IOException /*throws FileNotFoundException*/ {

        //ʹ�ö�̬�ķ�������OutputStream�࣬�����õ���FileOutputStream��ʵ�ֵ�OutputStream
        FileOutputStream outputStream = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�.txt");

        /*
        ������ FileOutputStream �����������£�
        A: ����ϵͳ���ܴ����˸��ļ�
        B: �����ֽ����������
        C: ���ֽ����������ָ�򴴽��õ��ļ�
        */

        //����д�뷽��  public void write(int b): ��ָ���ֽ�д����ļ�
        outputStream.write(97); //�׳�IOException�󣬾Ͳ����׳� FileNotFoundException��
        //ʹ�ô˷�������Ҫ�����׳��쳣������
        outputStream.write(57);//��������ַ��ײ��ֽ�

        //ʹ����֮��һ����Ҫ���� ʹ��close���رմ��ļ���������ͷ�������йص�����ϵͳ��Դ����
        outputStream.close();

    }

}

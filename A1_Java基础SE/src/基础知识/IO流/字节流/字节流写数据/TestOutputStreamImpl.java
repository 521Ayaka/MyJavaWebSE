package ����֪ʶ.IO��.�ֽ���.�ֽ���д����;
/*
OutputStream�ӿ� ����������ֽ����ĳ��࣬����д�����ݡ�



*/

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStreamImpl {

    public static void main(String[] args) throws IOException /*throws FileNotFoundException*/ {

        //ʹ�ö�̬�ķ�������OutputStream�࣬�����õ���FileOutputStream��ʵ�ֵ�OutputStream
        FileOutputStream outputStream = new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�1.txt");

        /*
        ������ FileOutputStream �����������£�
        A: ����ϵͳ���ܴ����˸��ļ�
        B: �����ֽ����������
        C: ���ֽ����������ָ�򴴽��õ��ļ�
        */

        //����д�뷽��  public void write(int b): ��ָ���ֽ�д����ļ�
        outputStream.write(97); //�׳�IOException�󣬾Ͳ����׳� FileNotFoundException��
        //ʹ�ô˷�������Ҫ�����׳��쳣������
        outputStream.write(57-9);//��������ַ��ײ��ֽ�

        //ʹ����֮��һ����Ҫ���� ʹ��close���رմ��ļ���������ͷ�������йص�����ϵͳ��Դ����
        outputStream.close();

        System.out.println("===========================================================");

        /*
        ����Ĵ��� FileOutputStream outputStream = new FileOutputStream(·��);
        ���ԭ�ļ����ݸ��ɵ���д������ʱ���Ǵӿ�ͨд�ģ������Ҫ�ؿ�ͷд
        ��Ҫ����ʱ��ʹ������һ�����췽����

        public FileOutputStream(String name, boolean append) throws FileNotFoundException{
            this(name != null ? new File(name) : null, append);
        }

        boolean append �Ƿ�׷��д�����ݣ�appendΪtrueʱ��д���ļ�ʱ��β����ʼд�롣

        */
        //����Ϊtrue
        FileOutputStream fos = new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�2.txt",true);

        //��ʼд������
        for (int i = 0; i < 10; i++) {
            if (i == 0) { fos.write("\n".getBytes()); }// ���з� \n ����getBytes()����ʵ�ֻ���
            fos.write("�������Ҳ�����".getBytes());
            fos.write("\n".getBytes());// ���з� \n ����getBytes()����ʵ�ֻ���
            /*
            *��ͬϵͳ�Ļ��з���ͬ:
            *
            * windows: \r\n
            * Linux  : \n
            * Moc    : \r
            *
            * */
        }
        //���Ҫ����������õ�ϵͳ��Դ����������
        fos.close();


    }

}

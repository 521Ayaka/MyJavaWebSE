package A1_MyJava.����֪ʶ.IO��.�ֽڻ�����.A1_���������;

/*
���췽����

    //������OutputStream ��Ķ��� ��ֻ��һ������
    public BufferedOutputStream(OutputStream out) {
        this(out, 8192);     //�������������һ�����췽����Ĭ�� size�� 8*1024 = 8192
    }


    public BufferedOutputStream(OutputStream out, int size) {
        super(out);
        if (size <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        buf = new byte[size];   //�����˻����ֽ����顣
    }



*/

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream {

    public static void main(String[] args) throws IOException {

        //�����ֽ�����������
//        FileOutputStream out = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\�����ļ�.txt");
//        BufferedOutputStream bOut = new BufferedOutputStream(out);//�������

        //out����ֻ����һ�Σ�ʹ�����������Ż�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\�����ļ�.txt"));
        //ʹ��BufferedOutputStream ��д����
        bos.write("�ʾ����м����\r\n".getBytes());
        bos.write("��ʥ���´ﲻ��\r\n".getBytes());

        //��Ȼ��Ҫ�ͷ���Դ
        bos.close();//�������û���ͷ���Դ�Ļ����Ͳ������д�����ݣ�����
    }

}

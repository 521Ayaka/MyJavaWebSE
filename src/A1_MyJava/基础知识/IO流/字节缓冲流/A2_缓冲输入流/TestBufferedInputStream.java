package A1_MyJava.����֪ʶ.IO��.�ֽڻ�����.A2_����������;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

    public static void main(String[] args) throws IOException {

        //ͬBufferedInputStream��ͬ����������
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\�����ļ�.txt"));

        //ͨ��bis���ж�ȡ����

        //������ȡ
        /*
        int by;
        while((by = bis.read()) != -1){
            System.out.print((char) by);
        }*/
        //ʹ��byte�����ȡ
        byte [] array = new byte[1024];
        int len;
        while( (len = bis.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }

        //ͬ����Ҫ�ͷ���Դ
        bis.close();
    }

}

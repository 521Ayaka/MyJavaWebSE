package A1_MyJava.����֪ʶ.IO��.���������.�ֽ��ַ���ӡ��.�ֽڴ�ӡ��;

import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\�ֽڴ�ӡ��\\�ļ�.txt");
        //ʹ�÷���
        ps.write(97);//a     //write�����ַ���,�����ַ�,byte����,byte����һ����
        ps.println();  //����
        ps.print(97);  //97    //print / println ���з���||д���������ʲô,д��ȥ�����ݾ���ʲô
        ps.println();
        ps.println("����д��");

        //��Ҫ�ͷ���Դ
        ps.close();
    }

}

package A1_MyJava.����֪ʶ.IO��.�ֽ���.�ֽ���������;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) throws IOException {

        //�����ֽ�����������
        FileInputStream input1 = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�1.txt");

        //��ȡ���ݣ�ʹ�÷�����read()��������ȡ���ص���byte����
        //��һ�ζ�ȡ
        int i1 = input1.read();
        System.out.print(i1);// �ײ���byte
        System.out.println((char) i1); //ǿתΪ��Ҫ������ char
        //�ڶ��ζ�ȡ
        int i2 = input1.read();
        System.out.print(i2);
        System.out.println((char) i2);
        //�����ζ�ȡ
        int i3 = input1.read();
        System.out.print(i3);
        System.out.println((char) i3);
        //���Ĵζ�ȡ
        int i4 = input1.read();
        System.out.print(i4); //�ո��� 32
        System.out.println((char) i4); //��Ӧ��char���ǿո�
        //����ζ�ȡ
        int i5 = input1.read();
        System.out.print(i5);
        System.out.println((char) i5);
        System.out.println("=======");
        //��Ϊ��֪���ļ���������� ���Զ������
        System.out.println(input1.read()); //-1
        System.out.println(input1.read()); //-1
        System.out.println((char) input1.read()); // ? ���벻��
        //���������ͷ���Դ
        input1.close();
        /*
        * �����֪, �������ݵ�ʱ�򣬶�Ӧ��byte�� -1
        * ��ô�����ж� input.read() != -1 ���������ݵ�
        *
        * ������иĽ���
        * */

        System.out.println("================================================");

        //�����ֽ�����������
        FileInputStream input2 = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�1.txt");

        //��ȡ����
        int by = input2.read();//��ȡ
        while (by != -1){
            System.out.print((char) by);  //���ﲻҪ����
            by = input2.read();//���¶�ȡ��ֵ��by
        }
        //�ͷ���Դ
        input2.close();

        //�ɽ����ٴ��Ż���������������������
        System.out.println("\n����������������������������׼д����������������������������");

        //�����ֽ�����������
        FileInputStream input3 = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�2.txt");

        //��ȡ����
        int byt; //�ȶ���һ���������ڻ�ȡ��������ֵ
        /*
        * ( byt = input3.read() ) != -1�������������
        * ��һ: input3.read()        ��ȡ���ļ�����
        * �ڶ�: byt = input3.read()  �ѻ�ȡ����byte��ֵ��but
        * ����: byt != -1            ������ж��Ƿ�Ϊ -1
        * */
        while ( ( byt = input3.read() ) != -1){
            System.out.print((char) byt);  //���ﲻҪ����
        }
        //�ͷ���Դ
        input3.close();

        /*����Ǳ�׼�Ķ��ļ��Ĵ���

        //�����ֽ�����������
        FileInputStream input3 = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�2.txt");
        //��ȡ����
        int byt;
        while ( ( byt = input3.read() ) != -1){
            System.out.print((char) byt);
        }
        //�ͷ���Դ
        input2.close();

        */


        //��ȫ��׼д��
        System.out.println("\n����������������������������ȫ��׼д����������������������������");
        System.out.println("����������������������������ȫ��׼д����������������������������");
        //�����ֽ�����������
        FileInputStream fileInput = null;
        int getByte ;
        //��ȡ���ݣ�ʹ��try...catch...finally���ƴ���
        try{
            fileInput =  new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�2.txt");
            //��ȡ����
            while((getByte = fileInput.read()) != -1){
                System.out.print((char) getByte);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //�ͷ���Դ
            if(fileInput != null){
                try {
                    fileInput.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}

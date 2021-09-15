package A1_MyJava.����֪ʶ.IO��.�ֽ���.�ֽ���������;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStreamReadMethod {

    public static void main(String[] args) {

        //�����ֽ�����������
        FileInputStream input = null;
        try{

            //���в���

            input = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�1.txt");
            //input.read();
            /*
            public int read(byte b[]) throws IOException {
                return readBytes(b, 0, b.length);
            }

            ע�ⷵ��ֵ:
            ����readBytes()
            1.���������ȡ����������
            2.����0
            3.����һ��int������ĳ���

            �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С�
            ��ĳЩ�������֮ǰ���˷���������

            */
            //��һ�ζ�ȡ
            byte [] array = new byte[5];//������emm...
            int read1 = input.read(array); //���ص�������ĳ��ȣ�ͬʱ�����������¸�ֵ������������
            System.out.println(read1); //5
            System.out.println(new String(array, 0 ,read1)); //abc d

            //�ڶ��ζ�ȡ
            int read2 = input.read(array);
            System.out.println(read2); //5
            System.out.println(new String(array, 0 ,read2)); // ����  hel
            /*
            * �ڶ��ζ�ȡ��������
            *
            * hel
            *
            * ���滻���ˣ�\r\n ռ���� ���� byte����
            * */


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        System.out.println("=============================================");

        //�Ż�
        try{
            //���в���
            input = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�2.txt");
            //��ȡ
            byte [] array = new byte[1024];//һ�㶼������Ϊ [1024] ��������
            int read;
            while ((read = input.read(array) ) != -1){
                System.out.print(new String(array,0,read));//������������ҲҪд��������
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
    }

    }

}

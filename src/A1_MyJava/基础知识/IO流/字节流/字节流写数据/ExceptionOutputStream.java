package A1_MyJava.����֪ʶ.IO��.�ֽ���.�ֽ���д����;
/*

һ����׼�� �ֽ���д���� �� �쳣����

ʹ�� try...catch...finally

*/

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionOutputStream {

    public static void main(String[] args) {

        //��׼д����

        //���ⲿ���� ���󣬳�ʼֵΪ null
        FileOutputStream fos = null;
        try{
            //��try�ڲ���ֵ
            fos = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�3.txt");
            //��try��д������
            fos.write("�ʾ����м����\n��ʥ���´ﲻ��".getBytes());
        }catch (IOException e){
            //�쳣��ʾ��
            e.printStackTrace();
        }finally{
            //��finally�ڲ��ͷ���Դ
            //���ж�fos�Ƿ�Ϊnull (try���и�ֵʱ�����·�����󣬾ͻ�Ϊnull) �������close()ʱ���� [��ָ���쳣]
            if (fos != null){
                //��Ϊnullʱ���ͷ���Դ
                try{
                    //ʹ��close()����ʱ��Ҳ��Ҫclose()�����쳣��������
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        /*=============================================================================================================*/

        //��ע�Ͱ棺


        FileOutputStream out = null;
        try{
            out = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�3.txt");
            out.write("�ʾ����м����\n��ʥ���´ﲻ��".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (out != null){
                try{
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }



    }

}

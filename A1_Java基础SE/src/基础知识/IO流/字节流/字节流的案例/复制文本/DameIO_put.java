package ����֪ʶ.IO��.�ֽ���.�ֽ����İ���.�����ı�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DameIO_put {

    public static void main(String[] args) {

        method1();
        method1();//�߶���д���Լ򻯺ܶ���롣

    }

    //����һ: �ȶ�ȡ�������ݣ�Ȼ����ȫ��д��
    public static void method1(){
        //�����ֽ���������ȡ����
        FileInputStream input = null;
        String str = "";
        int by;
        try{
            input = new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ���\\�ֽ����İ���\\�����ı�\\�����ļ�1.txt");
            //������
            while( (by = (input.read())) != -1 ){
                str = str + (char)by;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(input != null){
                try{
                    input.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        //��ʼ��������
        FileOutputStream output = null;
        try{
            //׷��д��
            output = new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ���\\�ֽ����İ���\\�����ı�\\�����ļ�2.txt",true);
            output.write("\n\n".getBytes());//�ȸ�������
            output.write(str.getBytes());   //д������
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (output != null){
                try{
                    output.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }



    //������: �߶ȱ�д
    public static void method2(){

        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ���\\�ֽ����İ���\\�����ı�\\�����ļ�1.txt");
            output = new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ���\\�ֽ����İ���\\�����ı�\\�����ļ�2.txt",true);//׷��д��
            //�߶���д
            output.write("\n\n".getBytes());//�ȸ�������
            int by;
            while((by = input.read() ) != -1){//��ȡ����
                output.write((char) by);      //д������
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally{

            //�ͷ��ֽ������
            if (input != null){
                try{
                    input.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            //�ͷ��ֽ���������
            if (output != null ){
                try{
                    output.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }


        }
    }

}

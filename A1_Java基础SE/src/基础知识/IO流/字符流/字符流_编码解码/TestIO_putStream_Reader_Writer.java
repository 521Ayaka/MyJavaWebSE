package ����֪ʶ.IO��.�ַ���.�ַ���_�������;
/*
InputStreamReader: �Ǵ��ֽ������ַ���������
    ����ȡ�ֽڣ���ʹ��ָ���ı��뽫�����Ϊ�ַ�
    ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���
OutputStreamWriter: �Ǵ��ַ������ֽ���������
    ���Ǵ��ַ������ֽ�����������ʹ��ָ���ı��뽫д����ַ�����Ϊ�ֽ�
    ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���

*/

import java.io.*;

public class TestIO_putStream_Reader_Writer {

    public static void main(String[] args) throws IOException {

        /*OutputStreamWriter�Ĺ��췽����
        OutputStreamWriter(OutputStream out)  ����ʹ��Ĭ���ַ������ OutputStreamWriter��
        OutputStreamWriter(OutputStream out, Charset cs)  ����ʹ�ø����ַ����� OutputStreamWriter��
        */
        //�ȴ���һ���ֽ����������
        FileOutputStream fos = new /*�������쳣����*/ FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�1.txt");
        //��fos��Ϊ��������OutputStreamWriter����ŷ����С�

        /**���췽��һ��   OutputStreamWriter(OutputStream out)  ����ʹ��Ĭ���ַ������ OutputStreamWriter��*/

        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //ʹ��osw����д���ļ����ݣ�ƽ̨Ĭ�ϱ����
        osw.write("�й�����");
        osw.write("\r\n");//Windows Linux Mac ϵͳʶ��ͬ
        osw.write("=======");
        osw.write("\r\n");
        /*
        ���ʹ���ֽ����Ļ�,write()����,û�в�����(String str)�����ط�����
        ��ǰ��ͨ���ַ�����������д���:
        �� "�й�����".getBytes(String charSetName); ��          ��ʵ�ֵ�
        �� new String(byte[] array , String charSetName ) ��  ��ʵ�ֵ�
        */
        //��Ȼ��Ҫ�ͷ���Դ������
        osw.close();

        //============================================================================================================

        //��׼ �ַ�������� д���ݡ�
        method();

        /**���췽������   OutputStreamWriter(OutputStream out, Charset cs)  ����ʹ�ø����ַ����� OutputStreamWriter��*/

        OutputStreamWriter oswNew = null;
        InputStreamReader isr = null;
        InputStreamReader isrNew = null;
        try{//try...catch...finally�쳣���ƴ���ʽ �����쳣

            oswNew = new OutputStreamWriter(
                     new FileOutputStream
                         ("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�2.txt",true/*׷��д��*/)
            /*�涨����*/  ,"UTF8");//����ʹ��UTF8�ַ������н�����롣
            //д������
            oswNew.write("\r\n������ܻ�������룡");//这里可能会出现乱码！
            /**
             *
             * ����ԭ��
             * �ļ�.txt��GBK�ļ�
             * д��ʱ�õ�ʱUTF8���б�������
             * ���Ի��������
             * */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================
            //ʹ��InputStreamReader�ַ������� ��ȡ���ݣ�
            /*
            ���췽��
            InputStreamReader(InputStream in)  ����һ��ʹ��Ĭ���ַ����� InputStreamReader��
            InputStreamReader(InputStream in, Charset cs)  ����ʹ�ø����ַ����� InputStreamReader��
            */
            //���췽��һ:
            isr = new InputStreamReader(
                  new FileInputStream
                      ("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�2.txt"));
            //������
            int by;//ʹ�õ����ַ���
            while((by = isr.read()) != -1){
                System.out.print((char) by);
            }
            /*����ǣ�

            ========������ܻ�������룡=========
            这里可能会出现乱码！

            */
            // [这里可能会出现乱码！] �޷���ȡ �����UTF8д���
            System.out.println("\n///////////////////////////////////");
            //���췽��һ:
            isrNew = new InputStreamReader(
                     new FileInputStream
                         ("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�2.txt")
            /*�涨����*/ ,"UTF8");
            //������
            int byN;//ʹ�õ����ַ���
            while((byN = isrNew.read()) != -1){
                System.out.print((char) byN);
            }
            /*
            ���н��:
            ========???????????????=========
            ������ܻ�������룡

            ��ȻGBK��ȡ������,����,��ο��Զ�ȡUTF8�Ĵ�����!
            */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (oswNew != null){
                try{//�ͷ���Դ
                    oswNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isr != null){
                try{//�ͷ���Դ
                    isr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isrNew != null){
                try{//�ͷ���Դ
                    isrNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }









    //�Ż�Code , ��׼д��
    public static void method(){

        OutputStreamWriter osw = null;

        try{//try...catch...finally�쳣���ƴ���ʽ �����쳣
            //!!!!!!!!!!!!!!!!!!!!������׷��д�룬����Ҫ��append ����Ϊtrue
            osw = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�1.txt",true));
            //д������
            osw.write("��׼�ַ���д���ݵ�Code");
            osw.write("\r\n=======\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (osw != null){
                try{//�ͷ���Դ
                    osw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}

package ����֪ʶ.IO��.�ַ���.�ַ���_�ܽ᰸��;

import java.io.*;

/*
* Ҫ��:
*
* ����java�ļ� ���Ƶ���java�ļ�ͬ���µ� [���Ƶ�����] �ļ��е���
*
* */
public class DameFileCopy {

    public static void main(String[] args) {

        //�����ַ������� �� ��ȡ����
        InputStreamReader isr = null;
        //�����ַ������ �� д������
        OutputStreamWriter osw = null;

        try{//��ֵ
            isr = new InputStreamReader(new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�ܽ᰸��\\DameFileCopy.java"));
            osw = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�ܽ᰸��\\���Ƶ�����\\DameFileCopy.java"));
            //��ʼ��ֵ
            char[] array = new char[1024];
            int len;
            while ( (len = isr.read(array)) != -1){//��ȡ
                osw.write(array,0,len);//д��
            }
            System.out.println("�Ѹ���");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (isr != null){
                try{
                    isr.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (osw != null){
                try{
                    osw.close();//ˢ�²��ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }

}

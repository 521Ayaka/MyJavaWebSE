package A1_MyJava.����֪ʶ.IO��.�ֽڻ�����.����������;

import java.io.*;

public class DameBufferedIO_putStream {

    public static void main(String[] args) {

        /*
        ���ļ��� ��Ƶ�ļ� �µ� ����ʦ.mp4���Ƶ���ǰ���ļ��ж�Ӧ��method�ļ���
        */

        //����ʱ��
        //���÷���
        method1(); //���н��: method1��ʱ: 3409����
        method2(); //���н��: method2��ʱ: 167����
        method3(); //���н��: method3��ʱ: 106����
                   //�ٴ����н�����ܲ�ͬ��ϵͳ�ײ����⡣
        /*
        method1(); ����
        method2(); ��
        method3(); ���
        */


    }

    //��������ʱ�� ��ʼ
    public static long go(){
        return System.currentTimeMillis();
    }
    //��������ʱ�� ����
    public static long end(long go){
        return System.currentTimeMillis()-go;
    }


    //����byte���ж�ȡ����
    public static void method1(){
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\��Ƶ�ļ�\\����ʦ.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\method1\\����ʦ.mp4"));
            //��ʼ��ȡ��д������
            int by;
            while ( (by=bis.read()) != -1 ){
                bos.write(by);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bis != null){
                try{
                    bis.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try{
                    bos.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: "+end+"����");
    }


    //ʹ��byte[]������ж�ȡ���� ��byte.length��ֵΪ [1024]
    public static void method2(){
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\��Ƶ�ļ�\\����ʦ.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\method2\\����ʦ.mp4"));
            //��ʼ��ȡ��д������
            byte [] array = new byte[1024];
            int len;
            while ( (len=bis.read(array)) != -1 ){//byte[]���췽��
                bos.write(array,0,len);//���ι��췽��
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bis != null){
                try{
                    bis.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try{
                    bos.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method2��ʱ: "+end+"����");
    }


    //ʹ��byte[]������ж�ȡ���� ��byte.length��ֵΪ [32*1024]
    public static void method3(){
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\��Ƶ�ļ�\\����ʦ.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\method3\\����ʦ.mp4"));
            //��ʼ��ȡ��д������
            byte [] array = new byte[1024*32];
            int len;
            while ( (len=bis.read(array)) != -1 ){//byte[]���췽��
                bos.write(array,0,len);//���ι��췽��
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bis != null){
                try{
                    bis.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try{
                    bos.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method3��ʱ: "+end+"����");
    }


}

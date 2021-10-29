package ����֪ʶ.IO��.�ֽڻ�����.����������;

import java.io.*;

public class DameBufferedIO_putStream {

    private static String IN = "A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\��Ƶ�ļ�\\����pv.mp4";
    private static String OUT_OR_APPEND = "A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\";
    private static String OUT_OR_FILE = "\\����pv.mp4";

    public static void main(String[] args) {

        /*
        ���ļ��� ��Ƶ�ļ� �µ� ����ʦ.mp4���Ƶ���ǰ���ļ��ж�Ӧ��method�ļ���
        */
        //����ʱ��
        //���÷���

        /*ʹ�û�����    �����ַ���ȡ*/
        method1(); // method1��ʱ: 658����

        /*��ʹ�û�����  �����ַ���ȡ*/
        method2(); // method1��ʱ: 71230����

        /*ʹ�û�����   ʹ��byte[1024]��ȡд��*/
        method3(); // method2��ʱ: 31����

        /*��ʹ�û�����  ʹ��byte[1024]��ȡд��*/
        method4(); // method1��ʱ: 94����

        /*ʹ�û�����    ʹ��byte[1024*32]��ȡд��*/
        method5(); // method3��ʱ: 17����

        //�ٴ����н�����ܲ�ͬ��ϵͳ�ײ����⡣

        /**
        ���ۣ�
        ʹ��byte[]����  ��ȡ�ٶȿ� д���
        ʹ���ֽڻ�����   ��ȡ�ٶȿ� д���
        */


    }

    //��������ʱ�� ��ʼ
    public static long go() {
        return System.currentTimeMillis();
    }

    //��������ʱ�� ����
    public static long end(long go) {
        return System.currentTimeMillis() - go;
    }


    //ʹ�� [������] [����] byte���ж�ȡ����
    public static void method1() {
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method1").append(OUT_OR_FILE))));
            //��ʼ��ȡ��д������
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: " + end + "����");
    }

    //��ʹ�� [������] [����] byte���ж�ȡ����
    public static void method2() {
        //����
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method2").append(OUT_OR_FILE)));
            //��ʼ��ȡ��д������
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: " + end + "����");
    }


    //ʹ���ֽڻ����� ʹ��byte[]������ж�ȡ���� ��byte.length��ֵΪ [1024]
    public static void method3() {
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method3").append(OUT_OR_FILE))));
            //��ʼ��ȡ��д������
            byte[] array = new byte[1024];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]���췽��
                bos.write(array, 0, len);//���ι��췽��
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method2��ʱ: " + end + "����");
    }


    //��ʹ�� [������] [ʹ��byte[]����] ���ж�ȡ����
    public static void method4() {
        //����
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method4").append(OUT_OR_FILE)));
            //��ʼ��ȡ��д������
            byte[] array = new byte[1024];//����Ϊ1024
            int by;
            while ((by = fis.read(array)) != -1) {
                fos.write(array, 0, by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: " + end + "����");
    }


    //ʹ���ֽڻ����� ʹ��byte[]������ж�ȡ���� ��byte.length��ֵΪ [32*1024]
    public static void method5() {
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method5").append(OUT_OR_FILE))));
            //��ʼ��ȡ��д������
            byte[] array = new byte[1024 * 32];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]���췽��
                bos.write(array, 0, len);//���ι��췽��
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method3��ʱ: " + end + "����");
    }


}

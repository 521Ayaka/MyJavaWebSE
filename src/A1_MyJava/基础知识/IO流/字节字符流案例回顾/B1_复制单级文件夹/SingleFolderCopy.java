package A1_MyJava.����֪ʶ.IO��.�ֽ��ַ��������ع�.B1_���Ƶ����ļ���;

import java.io.*;

public class SingleFolderCopy {

    public static void main(String[] args) {

        //����
        new SingleFolderCopy().copy();


    }

    //��ʼ��
    public void copy() {

        //����Դ�ļ���ַ
        File yuanFile = new File("src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\B1_���Ƶ����ļ���\\Դ�ļ���");
        //��ȡԴ�ļ�������
        String yuanName = yuanFile.getName();

        //����Ŀ�ĵ�ַ
        File destFile = new File("src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\B1_���Ƶ����ļ���\\�����ļ���");
        //�ж�Ŀ�ĵ�ַ�Ƿ����, ���������, �������ļ���
        if (!destFile.exists()) {
            destFile.mkdir();
        }
        //��ȡԴ�ļ����ڵ��ļ������ַ, ����һ�����ϵ���
        File[] listFiles = yuanFile.listFiles();
        //��Դ�ļ���������ļ���װ����ַ����
        for (File files : listFiles) {
            String nameFile = files.getName();
            //��Դ�ļ��е��л�ȡ�����ļ�����׷�Ӹ�ֵ�� destFile Ŀ���ļ��е�ַ����
            File newNameFile = new File(destFile, nameFile);//���ļ�

            //�������ļ�
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                bis = new BufferedInputStream(new FileInputStream(files));
                bos = new BufferedOutputStream(new FileOutputStream(newNameFile));

                //��ʼ�����ļ�
                byte[] array = new byte[1024];
                int len;
                while ((len = bis.read(array)) != -1) {
                    bos.write(array,0,len);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (bos != null) {
                    try {
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

}

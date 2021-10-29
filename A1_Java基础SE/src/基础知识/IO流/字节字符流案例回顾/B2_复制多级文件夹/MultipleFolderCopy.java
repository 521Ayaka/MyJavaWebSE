package ����֪ʶ.IO��.�ֽ��ַ��������ع�.B2_���ƶ༶�ļ���;

import java.io.*;

public class MultipleFolderCopy {

    public static void main(String[] args) {

        //����Դ�ļ���ַ
        File fileYuan = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\B2_���ƶ༶�ļ���\\Դ�ļ���");
        //����Ŀ���ļ���ַ
        File fileNew = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\B2_���ƶ༶�ļ���\\Ŀ���ļ�");

        //���õݹ鷽��copy
        FolderCopy(fileYuan, fileNew);

    }

    //�ݹ��ļ���
    public static void FolderCopy(File fileYuan, File fileNew) {
        //�ж��Ƿ�Ϊ�ļ���
        if (fileYuan.isDirectory()) {
            //��ȡ�ļ���
            String name = fileYuan.getName();
            //�õ�һ���µĵ�ַ
            File file = new File(fileNew, name);
            if (!file.exists()) {
                file.mkdir();
            }
            //��ȡ�ļ����������
            File[] listFile = fileYuan.listFiles();
            //�����ļ�
            for (File files : listFile) {
                //�����Լ� �ݹ�, �ж��Ƿ��ļ��л��ļ�
                FolderCopy(files, file);
            }
        } else {
            //����Ϊ�ļ� �����ļ�
            fileCopy(fileYuan, new File(fileNew, fileYuan.getName()));
        }


    }

    //�����ļ�
    private static void fileCopy(File fileYuan, File fileNew) {

        //�������ļ�
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(fileYuan));
            bos = new BufferedOutputStream(new FileOutputStream(fileNew));

            //��ʼ�����ļ�
            byte[] array = new byte[1024];
            int len;
            while ((len = bis.read(array)) != -1) {
                bos.write(array, 0, len);
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


    }

}

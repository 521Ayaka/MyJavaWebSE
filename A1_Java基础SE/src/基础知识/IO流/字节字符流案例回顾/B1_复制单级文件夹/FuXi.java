package ����֪ʶ.IO��.�ֽ��ַ��������ع�.B1_���Ƶ����ļ���;

import java.io.*;

public class FuXi {

    public static void main(String[] args) {

        //����
        new FuXi().init();

    }

    //��ʼ��
    public void init() {

        //����Դ�ļ�File�����ַ
        File fileYuan = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\B1_���Ƶ����ļ���\\Դ�ļ���");
        //��ȡԴ�ļ���ַ��
        String yuanName = fileYuan.getName();

        //����Ŀ��File�����ַ
        File fileNew = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\B1_���Ƶ����ļ���\\newFolder");
        //�жϸ�Ŀ¼�Ƿ����, ���������, ����Ŀ¼
        if (!fileNew.exists()) {
            //����Ŀ�ĵ�ַ
            fileNew.mkdirs();
        }

        //��ȡԴ�ļ��ڵ��ļ���File����·��
        File[] fileArray = fileYuan.listFiles();
        //��ֵ���µ��ļ�File����·����
        for (File files : fileArray) {
            //׷�Ӵ���
            File file = new File(fileNew, files.getName());

            //��ʼ׼�������ļ�
            BufferedInputStream bis = null;  //Դ: files
            BufferedOutputStream bos = null; //Ŀ: file

            try {
                bis = new BufferedInputStream(new FileInputStream(files));
                bos = new BufferedOutputStream(new FileOutputStream(file));

                //��ʼ����
                byte[] array = new byte[1024 * 4];
                int len;
                while ((len = bis.read(array)) != -1) {
                    bos.write(array, 0, len);
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

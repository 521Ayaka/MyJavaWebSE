package A1_MyJava.基础知识.IO流.字节字符流案例回顾.B1_复制单级文件夹;

import java.io.*;

public class SingleFolderCopy {

    public static void main(String[] args) {

        //启动
        new SingleFolderCopy().copy();


    }

    //初始化
    public void copy() {

        //创建源文件地址
        File yuanFile = new File("src\\A1_MyJava\\基础知识\\IO流\\字节字符流案例回顾\\B1_复制单级文件夹\\源文件夹");
        //获取源文件夹名称
        String yuanName = yuanFile.getName();

        //创建目的地址
        File destFile = new File("src\\A1_MyJava\\基础知识\\IO流\\字节字符流案例回顾\\B1_复制单级文件夹\\副本文件夹");
        //判断目的地址是否存在, 如果不纯在, 创建该文件夹
        if (!destFile.exists()) {
            destFile.mkdir();
        }
        //获取源文件夹内的文件抽象地址, 放入一个集合当中
        File[] listFiles = yuanFile.listFiles();
        //将源文件夹里面的文件封装到地址当中
        for (File files : listFiles) {
            String nameFile = files.getName();
            //当源文件夹当中获取到的文件名称追加赋值到 destFile 目的文件夹地址当中
            File newNameFile = new File(destFile, nameFile);//新文件

            //操作该文件
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                bis = new BufferedInputStream(new FileInputStream(files));
                bos = new BufferedOutputStream(new FileOutputStream(newNameFile));

                //开始复制文件
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

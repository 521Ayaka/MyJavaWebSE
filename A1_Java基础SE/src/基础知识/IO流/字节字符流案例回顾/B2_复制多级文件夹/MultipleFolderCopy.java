package 基础知识.IO流.字节字符流案例回顾.B2_复制多级文件夹;

import java.io.*;

public class MultipleFolderCopy {

    public static void main(String[] args) {

        //创建源文件地址
        File fileYuan = new File("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\B2_复制多级文件夹\\源文件夹");
        //创建目的文件地址
        File fileNew = new File("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\B2_复制多级文件夹\\目的文件");

        //调用递归方法copy
        FolderCopy(fileYuan, fileNew);

    }

    //递归文件夹
    public static void FolderCopy(File fileYuan, File fileNew) {
        //判断是否为文件夹
        if (fileYuan.isDirectory()) {
            //获取文件名
            String name = fileYuan.getName();
            //得到一个新的地址
            File file = new File(fileNew, name);
            if (!file.exists()) {
                file.mkdir();
            }
            //获取文件夹里的内容
            File[] listFile = fileYuan.listFiles();
            //遍历文件
            for (File files : listFile) {
                //调用自己 递归, 判断是否文件夹或文件
                FolderCopy(files, file);
            }
        } else {
            //否则为文件 复制文件
            fileCopy(fileYuan, new File(fileNew, fileYuan.getName()));
        }


    }

    //复制文件
    private static void fileCopy(File fileYuan, File fileNew) {

        //操作该文件
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(fileYuan));
            bos = new BufferedOutputStream(new FileOutputStream(fileNew));

            //开始复制文件
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
                    bis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}

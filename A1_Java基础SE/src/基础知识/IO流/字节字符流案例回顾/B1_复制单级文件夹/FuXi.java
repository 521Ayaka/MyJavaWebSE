package 基础知识.IO流.字节字符流案例回顾.B1_复制单级文件夹;

import java.io.*;

public class FuXi {

    public static void main(String[] args) {

        //启动
        new FuXi().init();

    }

    //初始化
    public void init() {

        //创建源文件File抽象地址
        File fileYuan = new File("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\B1_复制单级文件夹\\源文件夹");
        //获取源文件地址名
        String yuanName = fileYuan.getName();

        //创建目的File抽象地址
        File fileNew = new File("A1_Java基础SE\\src\\基础知识\\IO流\\字节字符流案例回顾\\B1_复制单级文件夹\\newFolder");
        //判断该目录是否存在, 如果不存在, 创建目录
        if (!fileNew.exists()) {
            //创建目的地址
            fileNew.mkdirs();
        }

        //获取源文件内的文件的File抽象路径
        File[] fileArray = fileYuan.listFiles();
        //赋值给新的文件File抽象路径名
        for (File files : fileArray) {
            //追加创建
            File file = new File(fileNew, files.getName());

            //开始准备复制文件
            BufferedInputStream bis = null;  //源: files
            BufferedOutputStream bos = null; //目: file

            try {
                bis = new BufferedInputStream(new FileInputStream(files));
                bos = new BufferedOutputStream(new FileOutputStream(file));

                //开始复制
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

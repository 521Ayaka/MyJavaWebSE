package 基础知识.IO流.字节缓冲流.缓冲流案例;

import java.io.*;

public class DameBufferedIO_putStream {

    private static String IN = "A1_Java基础SE\\src\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\雷神pv.mp4";
    private static String OUT_OR_APPEND = "A1_Java基础SE\\src\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\";
    private static String OUT_OR_FILE = "\\雷神pv.mp4";

    public static void main(String[] args) {

        /*
        将文件夹 视频文件 下的 马老师.mp4复制到当前类文件夹对应的method文件下
        */
        //计算时间
        //调用方法

        /*使用缓冲流    单个字符读取*/
        method1(); // method1用时: 658毫秒

        /*不使用缓冲流  单个字符读取*/
        method2(); // method1用时: 71230毫秒

        /*使用缓冲流   使用byte[1024]读取写入*/
        method3(); // method2用时: 31毫秒

        /*不使用缓冲流  使用byte[1024]读取写入*/
        method4(); // method1用时: 94毫秒

        /*使用缓冲流    使用byte[1024*32]读取写入*/
        method5(); // method3用时: 17毫秒

        //再次运行结果可能不同，系统底层问题。

        /**
        结论：
        使用byte[]数组  读取速度快 写入快
        使用字节缓冲流   读取速度快 写入快
        */


    }

    //计算所用时间 开始
    public static long go() {
        return System.currentTimeMillis();
    }

    //计算所用时间 结束
    public static long end(long go) {
        return System.currentTimeMillis() - go;
    }


    //使用 [缓冲流] [单个] byte进行读取数据
    public static void method1() {
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method1").append(OUT_OR_FILE))));
            //开始读取并写入数据
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
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
        //结束计时
        long end = end(go);
        System.out.println("method1用时: " + end + "毫秒");
    }

    //不使用 [缓冲流] [单个] byte进行读取数据
    public static void method2() {
        //创建
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //开始计时
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method2").append(OUT_OR_FILE)));
            //开始读取并写入数据
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method1用时: " + end + "毫秒");
    }


    //使用字节缓冲流 使用byte[]数组进行读取数据 ，byte.length赋值为 [1024]
    public static void method3() {
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method3").append(OUT_OR_FILE))));
            //开始读取并写入数据
            byte[] array = new byte[1024];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]构造方法
                bos.write(array, 0, len);//三参构造方法
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
        //结束计时
        long end = end(go);
        System.out.println("method2用时: " + end + "毫秒");
    }


    //不使用 [缓冲流] [使用byte[]数组] 进行读取数据
    public static void method4() {
        //创建
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //开始计时
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method4").append(OUT_OR_FILE)));
            //开始读取并写入数据
            byte[] array = new byte[1024];//长度为1024
            int by;
            while ((by = fis.read(array)) != -1) {
                fos.write(array, 0, by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method1用时: " + end + "毫秒");
    }


    //使用字节缓冲流 使用byte[]数组进行读取数据 ，byte.length赋值为 [32*1024]
    public static void method5() {
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method5").append(OUT_OR_FILE))));
            //开始读取并写入数据
            byte[] array = new byte[1024 * 32];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]构造方法
                bos.write(array, 0, len);//三参构造方法
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
        //结束计时
        long end = end(go);
        System.out.println("method3用时: " + end + "毫秒");
    }


}

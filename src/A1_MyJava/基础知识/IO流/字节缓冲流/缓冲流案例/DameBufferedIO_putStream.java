package A1_MyJava.基础知识.IO流.字节缓冲流.缓冲流案例;

import java.io.*;

public class DameBufferedIO_putStream {

    public static void main(String[] args) {

        /*
        将文件夹 视频文件 下的 马老师.mp4复制到当前类文件夹对应的method文件下
        */

        //计算时间
        //调用方法
        method1(); //运行结果: method1用时: 3409毫秒
        method2(); //运行结果: method2用时: 167毫秒
        method3(); //运行结果: method3用时: 106毫秒
                   //再次运行结果可能不同，系统底层问题。
        /*
        method1(); 最慢
        method2(); 快
        method3(); 最快
        */


    }

    //计算所用时间 开始
    public static long go(){
        return System.currentTimeMillis();
    }
    //计算所用时间 结束
    public static long end(long go){
        return System.currentTimeMillis()-go;
    }


    //单个byte进行读取数据
    public static void method1(){
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\马老师.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\method1\\马老师.mp4"));
            //开始读取并写入数据
            int by;
            while ( (by=bis.read()) != -1 ){
                bos.write(by);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bis != null){
                try{
                    bis.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try{
                    bos.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method1用时: "+end+"毫秒");
    }


    //使用byte[]数组进行读取数据 ，byte.length赋值为 [1024]
    public static void method2(){
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\马老师.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\method2\\马老师.mp4"));
            //开始读取并写入数据
            byte [] array = new byte[1024];
            int len;
            while ( (len=bis.read(array)) != -1 ){//byte[]构造方法
                bos.write(array,0,len);//三参构造方法
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bis != null){
                try{
                    bis.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try{
                    bos.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method2用时: "+end+"毫秒");
    }


    //使用byte[]数组进行读取数据 ，byte.length赋值为 [32*1024]
    public static void method3(){
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try{
            bis = new BufferedInputStream(new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\马老师.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\method3\\马老师.mp4"));
            //开始读取并写入数据
            byte [] array = new byte[1024*32];
            int len;
            while ( (len=bis.read(array)) != -1 ){//byte[]构造方法
                bos.write(array,0,len);//三参构造方法
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bis != null){
                try{
                    bis.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try{
                    bos.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method3用时: "+end+"毫秒");
    }


}

package 基础知识.IO流.字符流.字符流_编码解码;
/*
InputStreamReader: 是从字节流到字符流的桥梁
    它读取字节，并使用指定的编码将其解码为字符
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
OutputStreamWriter: 是从字符流到字节流的桥梁
    它是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

*/

import java.io.*;

public class TestIO_putStream_Reader_Writer {

    public static void main(String[] args) throws IOException {

        /*OutputStreamWriter的构造方法：
        OutputStreamWriter(OutputStream out)  创建使用默认字符编码的 OutputStreamWriter。
        OutputStreamWriter(OutputStream out, Charset cs)  创建使用给定字符集的 OutputStreamWriter。
        */
        //先创建一个字节流输出对象
        FileOutputStream fos = new /*别忘了异常处理*/ FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件1.txt");
        //将fos作为参数传入OutputStreamWriter构造放法当中。

        /**构造方法一：   OutputStreamWriter(OutputStream out)  创建使用默认字符编码的 OutputStreamWriter。*/

        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //使用osw对象写入文件内容，平台默认编码表
        osw.write("中国汉字");
        osw.write("\r\n");//Windows Linux Mac 系统识别不同
        osw.write("=======");
        osw.write("\r\n");
        /*
        如果使用字节流的话,write()方法,没有参数带(String str)的重载方法。
        以前是通过字符串编码解码后写入的:
        【 "中国汉字".getBytes(String charSetName); 】          来实现的
        【 new String(byte[] array , String charSetName ) 】  来实现的
        */
        //依然需要释放资源！！！
        osw.close();

        //============================================================================================================

        //标准 字符流输出流 写数据。
        method();

        /**构造方法二：   OutputStreamWriter(OutputStream out, Charset cs)  创建使用给定字符集的 OutputStreamWriter。*/

        OutputStreamWriter oswNew = null;
        InputStreamReader isr = null;
        InputStreamReader isrNew = null;
        try{//try...catch...finally异常环绕处理方式 处理异常

            oswNew = new OutputStreamWriter(
                     new FileOutputStream
                         ("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件2.txt",true/*追加写入*/)
            /*规定编码*/  ,"UTF8");//这里使用UTF8字符集进行解码编码。
            //写入数据
            oswNew.write("\r\n这里可能会出现乱码！");//杩欓噷鍙兘浼氬嚭鐜颁贡鐮侊紒
            /**
             *
             * 分析原因：
             * 文件.txt是GBK文件
             * 写入时用的时UTF8进行编译解码的
             * 所以会出现乱码
             * */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================
            //使用InputStreamReader字符输入流 读取数据：
            /*
            构造方法
            InputStreamReader(InputStream in)  创建一个使用默认字符集的 InputStreamReader。
            InputStreamReader(InputStream in, Charset cs)  创建使用给定字符集的 InputStreamReader。
            */
            //构造方法一:
            isr = new InputStreamReader(
                  new FileInputStream
                      ("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件2.txt"));
            //读数据
            int by;//使用单个字符读
            while((by = isr.read()) != -1){
                System.out.print((char) by);
            }
            /*结果是：

            ========这里可能会出现乱码！=========
            杩欓噷鍙兘浼氬嚭鐜颁贡鐮侊紒

            */
            // [杩欓噷鍙兘浼氬嚭鐜颁贡鐮侊紒] 无法读取 这段是UTF8写入的
            System.out.println("\n///////////////////////////////////");
            //构造方法一:
            isrNew = new InputStreamReader(
                     new FileInputStream
                         ("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件2.txt")
            /*规定编码*/ ,"UTF8");
            //读数据
            int byN;//使用单个字符读
            while((byN = isrNew.read()) != -1){
                System.out.print((char) byN);
            }
            /*
            运行结果:
            ========???????????????=========
            这里可能会出现乱码！

            虽然GBK读取不了了,但是,这次可以读取UTF8的代码了!
            */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (oswNew != null){
                try{//释放资源
                    oswNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isr != null){
                try{//释放资源
                    isr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isrNew != null){
                try{//释放资源
                    isrNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }









    //优化Code , 标准写法
    public static void method(){

        OutputStreamWriter osw = null;

        try{//try...catch...finally异常环绕处理方式 处理异常
            //!!!!!!!!!!!!!!!!!!!!这里是追加写入，所以要用append 参数为true
            osw = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件1.txt",true));
            //写入数据
            osw.write("标准字符流写数据的Code");
            osw.write("\r\n=======\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (osw != null){
                try{//释放资源
                    osw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}

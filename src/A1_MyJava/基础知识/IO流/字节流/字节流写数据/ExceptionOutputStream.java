package A1_MyJava.基础知识.IO流.字节流.字节流写数据;
/*

一个标准的 字节流写数据 加 异常处理

使用 try...catch...finally

*/

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionOutputStream {

    public static void main(String[] args) {

        //标准写法：

        //在外部定义 对象，初始值为 null
        FileOutputStream fos = null;
        try{
            //在try内部赋值
            fos = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件3.txt");
            //在try内写入数据
            fos.write("问君能有几多愁\n剑圣塔下达不溜".getBytes());
        }catch (IOException e){
            //异常提示：
            e.printStackTrace();
        }finally{
            //在finally内部释放资源
            //先判断fos是否为null (try当中赋值时，如果路径错误，就会为null) 以免调用close()时出现 [空指针异常]
            if (fos != null){
                //不为null时，释放资源
                try{
                    //使用close()方法时，也需要close()进行异常处理！！！
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        /*=============================================================================================================*/

        //无注释版：


        FileOutputStream out = null;
        try{
            out = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件3.txt");
            out.write("问君能有几多愁\n剑圣塔下达不溜".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (out != null){
                try{
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }



    }

}

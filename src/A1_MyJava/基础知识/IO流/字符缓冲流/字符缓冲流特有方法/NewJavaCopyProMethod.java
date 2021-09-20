package A1_MyJava.基础知识.IO流.字符缓冲流.字符缓冲流特有方法;
/*
继续改进, 使用字符缓冲流的 特有方法 进行改进复制java文件
*/

import java.io.*;

public class NewJavaCopyProMethod {

    public static void main(String[] args) {

        //启动
        new NewJavaCopyProMethod().init();

    }

    //初始化
    public void init() {
        //创建缓冲里对象。
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\NewJavaCopyProMethod.java"));
            bw = new BufferedWriter(new FileWriter("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\复制到这里\\NewJavaCopyProMethod.java"));
            //读写操作
            String str;
            while ((str = br.readLine())!=null){
                bw.write(str);
                bw.newLine();//不要忘了换行
                bw.flush();//不要忘了刷新一下

                //在控制台输出一下看看
                System.out.println(str);//别忘了加ln
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

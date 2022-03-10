package 基础知识.IO流.标准异常处理;

/*
分析结论:

[方法一 JDK7之前]：
    使用finally保证了释放资源,同时不需要在抛出异常,但是步骤太繁琐

[方法二 JDK7之后]:
    在try()括号里进行创建流对象同时赋值,自动释放资源,不需要使用finally,不需要抛出异常,简化了代码！YYDS!

[方法三 JDK9之后]:
    在外面创建流对象并赋值,在try()括号内使用创建好的流对象,由于在外面创建的流,所以仍需要抛出异常！

[结论]:
    使用方案二比较好点,简化了代码,还不用抛出异常！

*/

import java.io.*;

public class HandleIOException {

    public static File fileYuan = new File("A1_Java基础SE\\src\\基础知识\\IO流\\标准异常处理\\源文件.txt");
    public static File fileNewAppend = new File("A1_Java基础SE\\src\\基础知识\\IO流\\标准异常处理");

    public static void main(String[] args) throws IOException/*来源于JDK9解决方案*/ {

        //启动类
        new HandleIOException().init();

    }

    //初始化
    public void init() throws IOException/*来源于JDK9解决方案*/ {

        ioeJDK6();
        ioeJDK7();
        ioeJDK9();


    }

    //在JDK7之前使用的异常处理方法
    public void ioeJDK6() {
        //封装目的路径对象
        File fileNew = new File(fileNewAppend, "\\IOEjdk6\\" + fileYuan.getName());

        //开始操作数据源
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(fileYuan));
            bw = new BufferedWriter(new FileWriter(fileNew));
            //开始复制
            String str1;//字符缓冲流就用特有方法readLend()!!!
            while ((str1 = br.readLine()) != null) {
                bw.write(str1);
                bw.newLine();//使用newLine()操作
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    //在JDK7之后使用的异常处理方法
    public void ioeJDK7() {
        //封装目的路径对象
        File fileNew = new File(fileNewAppend, "\\IOEjdk7\\" + fileYuan.getName());
        /*
        try(定义流对象){

        }catch (异常类名 变量名){
            异常处理代码;
        }
        */
        //开始操作
        try (//在try()括号里面 进行 创建对象 并赋值
             //会自动释放资源
             BufferedReader br = new BufferedReader(new FileReader(fileYuan));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileNew));) {//开始操作
            String str2;
            while ((str2 = br.readLine()) != null) {
                bw.write(str2);
                bw.newLine();
                bw.flush();//刷新流
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //在JDK9之后使用的异常处理方法
    public void ioeJDK9() throws IOException /*仍然需要抛出异常*/ {
        //封装目的路径对象
        File fileNew = new File(fileNewAppend, "\\IOEjdk9\\" + fileYuan.getName());

        //JDK9解决方案 仍然需要抛出异常
        BufferedReader br = new BufferedReader(new FileReader(fileYuan));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileNew));

        try (br; bw;) {
            //开始操作
            String str3;
            while ((str3 = br.readLine()) != null) {
                bw.write(str3);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

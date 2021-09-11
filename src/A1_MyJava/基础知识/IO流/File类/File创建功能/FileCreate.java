package A1_MyJava.基础知识.IO流.File类.File创建功能;
/*
public boolean createNewFile(){//...}  当具有该名称的文件不存在时，创建一个有该抽象路径名命名的新空文件

public boolean mkdir(){//...}  创建有此抽象路径命名的目录

public boolean mkdirs(){//...} 创建由此抽象路径名命名的目录, 包含任何不需但不存在的父目录

[注意]:
使用createNewFile该方法创建时，需要使用try...catch...异常处理环绕，或者使用throws异常抛出, 否则会报错
报错类：java.io.IOException类

*/

import java.io.File;
import java.io.IOException;//IO异常类

public class FileCreate {

    public static void main (String[] args) throws/*小写*/ IOException {

        //需求1:我要在 D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能 目录下创建一个文件java.txt
        File file1 = new File("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录\\java.txt");
        //System.out.println(file1.createNewFile());
        try{//使用createNewFile()方法需要使用 try...catch...异常环绕处理。
            System.out.println(file1.createNewFile());
        }catch(IOException/*I/O异常类*/ e){
            System.out.println("异常");
        }

        //需求2:我要在 D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录 目录下创建一个目录 Javase
        File file2 = new File("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录\\Javase");
        System.out.println(file2.mkdir());//这个没有异常处理

        //需求3:我要在 D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录 目录下创建一个多级目录JavaWEB\\HTML
        File file3 = new File("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录\\JavaWEB\\HTML");
        System.out.println(file3.mkdirs());//这个也不用异常处理

        //需求4:我要在 D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录 目录下创建一个文件YuanShen.txt
        File file4 = new File("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\File类\\File创建功能\\测试目录\\YuanShen.txt");

        //这两个创建的是文件夹
        //System.out.println(file4.mkdir());
        //System.out.println(file4.mkdirs());

        //createNewFile创建的是.文件
        System.out.println(file4.createNewFile());



    }

}

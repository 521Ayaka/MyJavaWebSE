package 基础知识.IO流.File类.File操作方法;

import java.io.File;

/*
File类判断和获取功能：
public boolean isDirectory(){//...} 测试此抽象方法路径名表示的File是否为目录

public boolean isFile(){//...} 测试此抽象路径名表示的File是否为文件

public boolean exists(){//...} 测试此抽象路径名表示的File是否存在

public String getAbsolutePath(){//...} 返回此抽象路径名的绝对路径名字符串

public String getPath(){//...}  将此抽象路径名转换为路径名字符串

public String getName(){//...}  返回由此抽象路径名表示的文件或目录名称

public String[] list(){//...}   返回此抽象路径名表示的目录中的文件和目录的名称字符串数组

public File[] listFiles(){//...} 返回此抽象路径名表示的目录中的文件和目录的File对象数组


*/
public class FileMethod {

    public static void main(String[] args) {
        //创建File抽象路径
        //文件夹 测试文件包
        File file1 = new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File操作方法\\测试文件包");
        //文件  文件1.txt
        File file2 = new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File操作方法\\测试文件包\\文件1.txt");
        //不存在的文件 文件3.txt
        File file3 = new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File操作方法\\测试文件包\\文件3.txt");
        //非绝对路径，直接封装
        File file4 = new File("其他文件\\1.jpg");


        //public boolean isDirectory(){//...} 测试此抽象方法路径名表示的File是否为目录
        System.out.println(file1.isDirectory());//true
        System.out.println(file2.isDirectory());//false
        System.out.println(file3.isDirectory());//false



        System.out.println("=====================================================================");
        //public boolean isFile(){//...} 测试此抽象路径名表示的File是否为文件
        System.out.println(file1.isFile());//false
        System.out.println(file2.isFile());//true
        System.out.println(file3.isFile());//也是false



        System.out.println("=====================================================================");
        //public boolean exists(){//...} 测试此抽象路径名表示的File是否存在
        System.out.println(file1.exists());//true
        System.out.println(file2.exists());//true
        System.out.println(file3.exists());//false
        System.out.println("=====================================================================");



        //public String getAbsolutePath(){//...} 返回此抽象路径名的绝对路径名字符串
        System.out.println(file1.getAbsolutePath());
        //运行结果为: D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包
        System.out.println(file2.getAbsolutePath());
        //运行结果为: D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件1.txt
        System.out.println(file3.getAbsolutePath());
        //结果也能出来: D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件1.txt

        System.out.println(file4.getAbsolutePath());
        //D:\源代码\其他文件\1.jpg  !!!!!!!!!!!!!!!!!!!!!!!!!!封装的是 "其他文件\1.jpg" 这里输出的是绝对路径



        System.out.println("=====================================================================");
        //public String getPath(){//...}  将此抽象路径名转换为路径名字符串
        System.out.println(file1.getPath());
        //D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包
        System.out.println(file2.getPath());
        //D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件1.txt
        System.out.println(file3.getPath());
        //D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件3.txt

        System.out.println(file4.getPath());
        //其他文件\1.jpg !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!这里是封装的路径，不是绝对路径。

        System.out.println("=====================================================================");
        //public String getName(){//...}  返回由此抽象路径名表示的文件或目录名称
        System.out.println(file1.getName());//测试文件包
        System.out.println(file2.getName());//文件1.txt
        System.out.println(file3.getName());//文件3.txt



        System.out.println("=====================================================================");
        //public String[] list(){//...}   返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        String[] list1 = file1.list();
        for (String str : list1) {
            System.out.print(str+" ");
        }//文件1.txt 文件2.txt 文件包1 文件包2

        try {
            String[] list2 = file2.list();
            for (String str : list2) {
                System.out.println(str+" ");
            }
        }catch (NullPointerException e){
            System.out.println("\n空指针异常。");
        }



        System.out.println("====================================================");
        //public File[] listFiles(){//...} 返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File[] files1 = file1.listFiles();
        for (File listFiles1 : files1) {
            System.out.println(listFiles1.getAbsolutePath());
            System.out.println(listFiles1.getName());
            /* 结果为：
            D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件1.txt
            文件1.txt
            D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件2.txt
            文件2.txt
            D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件包1
            文件包1
            D:\源代码\src\A1_MyJava\基础知识\IO流\File类\File操作方法\测试文件包\文件包2
            文件包2
            */
        }

        try {
            File[] files2 = file2.listFiles();
            for (File listFiles2 : files2) {
                System.out.println(listFiles2.getAbsolutePath());
                System.out.println(listFiles2.getName());
            }
        }catch (NullPointerException e){
            System.out.println("空指针异常。");
        }

        //后面的两个方法是用于目录下的路径，如果是文件，则适用
        System.out.println("====================================================");


       }

}

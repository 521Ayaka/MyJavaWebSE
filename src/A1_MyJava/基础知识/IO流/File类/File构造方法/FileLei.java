package A1_MyJava.基础知识.IO流.File类.File构造方法;

import java.io.File;

/*

File类：她是文件和目录路径名的抽象表示
1. 文件和目录是可以通过File封装成对象的。
2. 对于File而言, 其封装的并不是一个真正存在的文件,
   仅仅是一个路径名而已。她可以是存在的, 也可以是不存在的。
   将来是要通过具体的操作把这个路径的内容转换为具体存在的。

构造方法：
public File(String pathname){//...}
通过将给定路径名字符串转换为抽象路径名来创建一个新File实例

public File(String parent, String child){//...}
根据 parent 路径名字符串和 child 路径名字符串创建一个新File实例。

public File(File parent, String child){//...}
根据 parent 抽象路径名和 child 路径名字符串创建一个新File实例。

*/
public class FileLei {

    public static void main(String[] args) {

        //public File(String pathname){//...}
        //通过将给定路径名字符串转换为抽象路径名来创建一个新File实例
        File file1 = new File("D:\\源代码\\ideback\\亚索.txt");
        //ideback存在，但是 ”亚索.txt“ 是不存在的
        System.out.println(file1);// 重写了toString()方法 D:\源代码\ideback\亚索.txt
        /*public String toString() {
            return getPath();
        }*/

        //public File(String parent, String child){//...}
        //根据 parent 路径名字符串和 child 路径名字符串创建一个新File实例。
        String parent = "D:\\源代码";       //父目录
        String child = "ideback\\亚索.txt"; //子目录
        File file2 = new File(parent, child);
        System.out.println(file2);//  D:\源代码\ideback\亚索.txt

        //public File(File parent, String child){//...}
        //根据 parent 抽象路径名和 child 路径名字符串创建一个新File实例。
        File file3 = new File("D:\\源代码");
        File file4 = new File(file3, child);
        System.out.println(file4);//  D:\源代码\ideback\亚索.txt


    }

}

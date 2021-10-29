package 基础知识.IO流.File类.File删除功能;

//public boolean delete(){//...}   删除由此抽象路径名表示的文件或目录

import java.io.File;
import java.io.IOException;

public class FileDelete {

    public static void main(String[] args) throws IOException {

        //创建目录
        File file1 = new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File删除功能\\测试文件\\文件1.txt");
        File file2 = new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File删除功能\\测试文件\\目录1");

        File file3 = new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File删除功能\\测试文件\\不存在的文件.txt");

        //使用delete方法进行删除抽象路径
        System.out.println(file1.delete());
        System.out.println(file2.delete());
        System.out.println(file3.delete());

        System.out.println("==============================");

        //默认创建是在项目目录下的
        new File("创建文件.txt").createNewFile();

        //可追加到模块下
        new File("src\\创建模块下的文件.txt").createNewFile();

        //同样的，删除也是这样的，查看 恢复类 [ File_Redo ] 进行恢复操作


    }

}

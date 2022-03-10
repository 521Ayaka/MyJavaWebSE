package 基础知识.IO流.File类.File删除功能;

//恢复被删除的文件或目录

import java.io.File;
import java.io.IOException;

public class File_Redo {

    public static void main(String[] args) throws IOException {

        //还原被删除的文件或目录
        System.out.println(new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File删除功能\\测试文件\\文件1.txt").createNewFile());
        System.out.println(new File("A1_Java基础SE\\src\\基础知识\\IO流\\File类\\File删除功能\\测试文件\\目录1").mkdir());

        //删除测试添加的文件
        new File("创建文件.txt").delete();
        new File("src\\创建模块下的文件.txt").delete();

    }

}

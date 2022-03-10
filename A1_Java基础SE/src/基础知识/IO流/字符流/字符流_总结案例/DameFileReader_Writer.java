package 基础知识.IO流.字符流.字符流_总结案例;

/*
    优化案例: 使用 [数据源FileReader] [目的地FileWriter] 实现

    FileReader: 为了用于 [读取字符文件] 的 [便利便捷] 继承了 InputStreamReader
                FileReader(File file)
                FileReader(String fileName)

    FileWriter: 为了用于 [写入字符文件] 的 [便利便捷] 继承了 OutputStreamWriter
                FileWriter(File file)
                FileWriter(String fileName)

数据源: 源文件地址File————>读数据————>Reader————>InputStreamReader————>FileReader
       File类封装地址————>————>字符流抽象类————>使用实现类↑↓实现————>使用其子类↑↓简化
目的地: 源文件地址File————>写数据————>Writer————>OutputStreamWriter————>FileWriter

[注意]: FileReader FileWriter 虽然便利的书写,
       但是,如果涉及到编码解码问题时,就不能用了。

*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DameFileReader_Writer {

    public static void main(String[] args) throws IOException {
        //这里我直接抛出了异常,没有用try...catch...finally环绕,标准应该用环绕

        //根据数据源创建字符输入流对象,用于读取数据
        FileReader fr = new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_总结案例\\DameFileCopy.java");
        //根据目的地创建字符输出流对象,用于写入数据
        FileWriter fw = new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_总结案例\\复制到这里\\DameFileCopy_FUBEN.java");

        //读写操作
        /*单个字节读取数据
        int by;
        while ((by = fr.read()) != -1) {
            fw.write((char) by);
        }*/
        //char[] 数组
        char[] array = new char[1024];
        int len;
        while ((len = fr.read(array))!=-1){
            fw.write(new String(array,0,len));
        }

        //释放资源
        fr.close();
        fw.close();
    }

}

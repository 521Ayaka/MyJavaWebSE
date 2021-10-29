package 基础知识.IO流.字符缓冲流.字符缓冲流特有方法;

import java.io.*;

/*

BufferedWriter:
    void newLine(): 写一行行分隔符, 行分隔符字符串由系统属性定义

BufferedReader:
    public String readLine(): 读一行文字。结果包含行的内容的字符串,不包括任何行终止字符,
                              如果流的结尾已经到达, 则为null

*/
public class BufferedRWProMethod {

    public static void main(String[] args) {

        newLineMethod();
        readLineMethod();

    }

    public static void newLineMethod() {

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\文件.txt"));
            //写入数据
            bw.write("这就尴尬了");
            bw.newLine();
            bw.flush();//刷新
            bw.write("欸！我换行了！");
            bw.newLine();
            bw.flush();//刷新
            bw.write("卢本伟牛逼,卢本伟没有开挂！");
            bw.newLine();
            bw.flush();//刷新
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void readLineMethod() {

        BufferedReader br1 = null;
        BufferedReader br2 = null;
        try {
            br1 = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\文件.txt"));
            br2 = new BufferedReader(new FileReader("A1_Java基础SE\\src\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\文件.txt"));

            //读取第一行
            System.out.println(br1.readLine());
            //读取第二行
            System.out.println(br1.readLine());
            //读取第三行
            System.out.println(br1.readLine());
            //读取第四行
            System.out.println(br1.readLine());//为null
            System.out.println("==============================");

            String str;
            while ((str = br2.readLine()) != null) {
                System.out.println(str);//这个是要换行的println
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br1 != null) {
                try {
                    br1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br2 != null) {
                try {
                    br2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

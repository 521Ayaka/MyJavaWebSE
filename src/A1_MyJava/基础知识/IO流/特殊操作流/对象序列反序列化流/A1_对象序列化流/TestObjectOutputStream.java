package A1_MyJava.基础知识.IO流.特殊操作流.对象序列反序列化流.A1_对象序列化流;
/*
对象序列化流：ObjectOutputStream
        -- 将Java对象的原始数据类型和图像写入OutputStream。可以使用ObjectInputStream读取(重构)对象。
           可以通过使用流的文件来实现对象的持久存储。
           如果流是网络套接字流，则可以在拎一个主机上或另一个进程中重构对向。

构造方法：
        -- ObjectOutputStream(OutputStream): 创建一个写入指定的OutputStream的ObjectOutputStream

序列化对象的方法：
        -- void writeObject(Object obj): 将指定的对象写入ObjectOutputStream

*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {

        //method1();//发现报错了
        /*
        异常类: NotSerializableException
               -- 当实例需要具有序列化接口时，抛出此异常。
                  序列化运行时或实例的类会抛出此异常。参数应该为类的名称。
                  所有已实现的接口： Serializable

        实现接口: Serializable
                 -- 类通过实现 java.io.Serializable 接口以启用其序列化功能。
                    未实现此接口的类将无法使其任何状态序列化或反序列化。
                    可序列化类的所有子类型本身都是可序列化的。
                    序列化接口没有方法或字段，仅用于标识可序列化的语义。
                    ......

        所以：  要想序列化这个对象,这个对象的类就必须实现Serializable接口,否则就无法序列化该类的对象
        又因为： Serializable接口没有所要实现的方法,不用实现。只是说明该类的对象能被实例化而已。

        */

        method2();
        /*输出结果:
              sr gA1_MyJava.鍩虹鐭ヨ瘑.IO娴?.鐗规畩鎿嶄綔娴?.瀵硅薄搴忓垪鍙嶅簭鍒楀寲娴?.A1_瀵硅薄搴忓垪鍖栨祦.Student2u
             梑Xeｄ I ageL namet Ljava/lang/String;xp   t 	灏村艾閰?

         读不懂里面全部的东西,但是反序列化流能。
        */

    }

    public static void method1() throws IOException {
        //创建对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A1_对象序列化流\\对象序列化.txt"));
        //对象序列化总要有对象吧,创建对象
        Student1 stu = new Student1("尴尬酱", 20);

        //对象序列化的方法
        oos.writeObject(stu);

        //是流就要释放资源
        oos.close();
    }

    public static void method2()throws IOException{
        //创建对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A1_对象序列化流\\对象序列化.txt"));
        //对象序列化总要有对象吧,创建对象
        Student2 stu = new Student2("尴尬酱", 20);

        //对象序列化的方法
        oos.writeObject(stu);

        //是流就要释放资源
        oos.close();



    }


}

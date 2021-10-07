package A1_MyJava.基础知识.IO流.特殊操作流.对象序列反序列化流.A2_对象反序列化流;
/*
对象反序列化流: ObjectInputStream
        -- ObjectInputStream反序列化先前使用ObjectOutputSteam编写的原始数据和对象

构造方法:
        -- ObjectInputSteam(InputSteam in): 创建从指定的InputSteam读取的ObjectStream

反序列化对象的方法:
        -- Object readObject(): 从ObjectInputStream读取一个对象,返回值是一个对象

*/

import A1_MyJava.基础知识.IO流.特殊操作流.对象序列反序列化流.A1_对象序列化流.Student2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建反序列化流对象。构造方法:ObjectInputSteam(InputSteam in): 创建从指定的InputSteam读取的ObjectStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A1_对象序列化流\\对象序列化.txt"));

        //使用反序列化流的方法。反序列化对象的方法:Object readObject(): 从ObjectInputStream读取一个对象,返回值是一个对象
        Object oStu = ois.readObject();//抛出异常：ClassNotFoundException
        Student2 stu = (Student2) oStu;//向下转型为Student2

        //释放资源
        ois.close();

        //遍历该对象
        System.out.println("姓名: "+stu.getName()+", 年龄: "+stu.getAge());

    }

}

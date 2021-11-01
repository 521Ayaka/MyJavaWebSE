# IO流总结

说明: 处理异常用的JDK7之前的方法,推选使用JDK7之后的处理方法



## 图解



### 字节流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225251946.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225313894.png)

### 字符流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225351670.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225400585.png)

### 对象序列化流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360938556610.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/问题与解决-163360990564813.png)

### 打印流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336038884631.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336039094452.png)

====================================================================================================





## 先复习异常处理

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210922192323807.png)

### 直接上代码

```java
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

    public static File fileYuan = new File("src\\A1_MyJava\\基础知识\\IO流\\标准异常处理\\源文件.txt");
    public static File fileNewAppend = new File("src\\A1_MyJava\\基础知识\\IO流\\标准异常处理");

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
```





## File类

### 创建方法

```java
public boolean createNewFile(){//...}  当具有该名称的文件不存在时，创建一个有该抽象路径名命名的新空文件

public boolean mkdir(){//...}  创建有此抽象路径命名的目录

public boolean mkdirs(){//...} 创建由此抽象路径名命名的目录, 包含任何不需但不存在的父目录

// [注意]:
// 使用createNewFile该方法创建时，需要使用try...catch...异常处理环绕，或者使用throws异常抛出, 否则会报错
// 报错类：java.io.IOException类
```

### File 操作方法

```java
//File类判断和获取功能：

public boolean isDirectory(){//...} 测试此抽象方法路径名表示的File是否为目录

public boolean isFile(){//...} 测试此抽象路径名表示的File是否为文件

public boolean exists(){//...} 测试此抽象路径名表示的File是否存在

public String getAbsolutePath(){//...} 返回此抽象路径名的绝对路径名字符串

public String getPath(){//...}  将此抽象路径名转换为路径名字符串

public String getName(){//...}  返回由此抽象路径名表示的文件或目录名称

public String[] list(){//...}   返回此抽象路径名表示的目录中的文件和目录的名称字符串数组

public File[] listFiles(){//...} 返回此抽象路径名表示的目录中的文件和目录的File对象数组
    
```

### File删除方法

```java
//public boolean delete(){//...}   删除由此抽象路径名表示的文件或目录
```

====================================================================================================



## 字节流

### FileOutputStream 字节输出流

```java
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStreamReadMethod {

    public static void main(String[] args) {

        //创建字节输入流对象
        FileInputStream input = null;
        try{

            //进行操作

            input = new FileInputStream
                		("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件1.txt");
            //input.read();
            /*
            public int read(byte b[]) throws IOException {
                return readBytes(b, 0, b.length);
            }

            注意返回值:
            调用readBytes()
            1.返回这个读取放入后的数组
            2.返回0
            3.返回一个int，数组的长度

            从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
            在某些输入可用之前，此方法将阻塞

            */
            //第一次读取
            byte [] array = new byte[5];//非索引emm...
            int read1 = input.read(array); //返回的是数组的长度，同时，给数组重新赋值！！！！！！
            System.out.println(read1); //5
            System.out.println(new String(array, 0 ,read1)); //abc d

            //第二次读取
            int read2 = input.read(array);
            System.out.println(read2); //5
            System.out.println(new String(array, 0 ,read2)); // 换行  hel
            /*
            * 第二次读取的内容是
            *
            * hel
            *
            * 里面换行了，\r\n 占用了 两个 byte数组
            * */


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        System.out.println("=============================================");

        //优化
        try{
            //进行操作
            input = new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");
            //读取
            byte [] array = new byte[1024];//一般都是设置为 [1024] 的整数倍
            int read;
            while ((read = input.read(array) ) != -1){
                System.out.print(new String(array,0,read));//后面两个参数也要写！！！！
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
    }

    }

}
```



### FileInputStream 字节输入流

```java
/*
一个标准的 字节流写数据 加 异常处理

使用 try...catch...finally [JDK7之前的处理方法]
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionOutputStream {

    public static void main(String[] args) {

        //标准写法：

        //在外部定义 对象，初始值为 null
        FileOutputStream fos = null;
        try{
            //在try内部赋值
            fos = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件3.txt");
            //在try内写入数据
            fos.write("问君能有几多愁\n剑圣塔下达不溜".getBytes());
        }catch (IOException e){
            //异常提示：
            e.printStackTrace();
        }finally{
            //在finally内部释放资源
            //先判断fos是否为null (try当中赋值时，如果路径错误，就会为null) 以免调用close()时出现 [空指针异常]
            if (fos != null){
                //不为null时，释放资源
                try{
                    //使用close()方法时，也需要close()进行异常处理！！！
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
   /*=============================================================================================================*/

        //无注释版：
        FileOutputStream out = null;
        try{
            out = new FileOutputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件3.txt");
            out.write("问君能有几多愁\n剑圣塔下达不溜".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (out != null){
                try{
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

```



====================================================================================================





## 字节缓冲流

### 缓冲流输出流

```JAVA
	//构造方法：
    //参数是OutputStream 类的对象 ，只有一个参数
    public BufferedOutputStream(OutputStream out) {
        this(out, 8192);     //这里调用了下面一个构造方法，默认 size是 8*1024 = 8192
    }


    public BufferedOutputStream(OutputStream out, int size) {
        super(out);
        if (size <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        buf = new byte[size];   //创建了缓冲字节数组。
    }

```

### 字符缓冲输入流

```java
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

    public static void main(String[] args) throws IOException {

        //同BufferedInputStream相同，创建对象
        BufferedInputStream bis = new BufferedInputStream
            	(new FileInputStream("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\测试文件.txt"));

        //通过bis进行读取数据

        //单个读取
        /*
        int by;
        while((by = bis.read()) != -1){
            System.out.print((char) by);
        }*/
        //使用byte数组获取
        byte [] array = new byte[1024];
        int len;
        while( (len = bis.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }

        //同样需要释放资源
        bis.close();
    }

}
```



### 字节缓冲流案例 --复制视频 与 不同方法复制所用的时间

```java
package A1_MyJava.基础知识.IO流.字节缓冲流.缓冲流案例;

import java.io.*;

public class DameBufferedIO_putStream {

    private static String IN = "D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\雷神pv.mp4";
    private static String OUT_OR_APPEND = "D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\";
    private static String OUT_OR_FILE = "\\雷神pv.mp4";

    public static void main(String[] args) {

        /*
        将文件夹 视频文件 下的 马老师.mp4复制到当前类文件夹对应的method文件下
        */
        //计算时间
        //调用方法

        /*使用缓冲流    单个字符读取*/
        method1(); // method1用时: 658毫秒

        /*不使用缓冲流  单个字符读取*/
        method2(); // method1用时: 71230毫秒

        /*使用缓冲流   使用byte[1024]读取写入*/
        method3(); // method2用时: 31毫秒

        /*不使用缓冲流  使用byte[1024]读取写入*/
        method4(); // method1用时: 94毫秒

        /*使用缓冲流    使用byte[1024*32]读取写入*/
        method5(); // method3用时: 17毫秒

        //再次运行结果可能不同，系统底层问题。

        /**
        结论：
        使用byte[]数组  读取速度快 写入快
        使用字节缓冲流   读取速度快 写入快
        */


    }

    //计算所用时间 开始
    public static long go() {
        return System.currentTimeMillis();
    }

    //计算所用时间 结束
    public static long end(long go) {
        return System.currentTimeMillis() - go;
    }


    //使用 [缓冲流] [单个] byte进行读取数据
    public static void method1() {
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method1").append(OUT_OR_FILE))));
            //开始读取并写入数据
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method1用时: " + end + "毫秒");
    }

    //不使用 [缓冲流] [单个] byte进行读取数据
    public static void method2() {
        //创建
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //开始计时
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method2").append(OUT_OR_FILE)));
            //开始读取并写入数据
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method1用时: " + end + "毫秒");
    }


    //使用字节缓冲流 使用byte[]数组进行读取数据 ，byte.length赋值为 [1024]
    public static void method3() {
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method3").append(OUT_OR_FILE))));
            //开始读取并写入数据
            byte[] array = new byte[1024];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]构造方法
                bos.write(array, 0, len);//三参构造方法
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method2用时: " + end + "毫秒");
    }


    //不使用 [缓冲流] [使用byte[]数组] 进行读取数据
    public static void method4() {
        //创建
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //开始计时
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method4").append(OUT_OR_FILE)));
            //开始读取并写入数据
            byte[] array = new byte[1024];//长度为1024
            int by;
            while ((by = fis.read(array)) != -1) {
                fos.write(array, 0, by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method1用时: " + end + "毫秒");
    }


    //使用字节缓冲流 使用byte[]数组进行读取数据 ，byte.length赋值为 [32*1024]
    public static void method5() {
        //创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //开始计时
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method5").append(OUT_OR_FILE))));
            //开始读取并写入数据
            byte[] array = new byte[1024 * 32];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]构造方法
                bos.write(array, 0, len);//三参构造方法
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //结束计时
        long end = end(go);
        System.out.println("method3用时: " + end + "毫秒");
    }


}

```

====================================================================================================



## 字符流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336051640413.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/编码表.png)





### 字符输入流 InputStreamReader

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/TestInputStreamReader_Method.png)

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
读数据的方法和字节流的方法差不多，只不过一个是字节流，一个是字符流，一个是byte数组，一个是char数组

[方法]:
    int read()                一次读一个字符数据
    int read(char[] cbuf)     一次读一个字符数组数据

*/
public class TestInputStreamReader_Method {

    public static void main(String[] args) throws IOException {

        //方法一  int read()                一次读一个字符数据
        InputStreamReader isr1 = new InputStreamReader(
            new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt"));
        int by;
        while ((by = isr1.read()) != -1){
            System.out.print((char) by);
        }
        isr1.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //方法二  int read(char[] cbuf)     一次读一个字符数组数据
        InputStreamReader isr2 = new InputStreamReader(
            new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt"));
        char [] array = new char[1024];
        int len;
        while ((len = isr2.read(array)) != -1){
            System.out.print(new String(array,0,len));
        }
        isr2.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //读一个长文件
        InputStreamReader isr3 = new InputStreamReader(new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\TestOutputStreamWriter_Method.java"));
        char[] arrayN = new char[1024];
        int lenN;
        while( (lenN = isr3.read(arrayN)) != -1 ){
            System.out.print(new String(arrayN,0,lenN));
        }
        isr3.close();

    }

}

```





### 字符输出流 OutputStreamWriter

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/TestOutputStreamWriter_Method.png)

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
OutputStreamWriter 中写数据的方法
    void write(int c)                       写一个字符
    void write(char[] cbuf)                 写入一个字符数组
    void write(char[] cbuf,int off,int len) 写入字符数组的一部分
    void write(String str)                  写一个字符串
    void write(String str,int off, int len) 写一个字符串的一部分

[注意]:
字符流相对于字节流 是有缓冲的！！！
使用刷新流: flush();进行刷新。
close执行,先刷新一次,再关闭流,关闭后不能再写如数据

*/
public class TestOutputStreamWriter_Method {

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt"));
        //void write(int c)                       写一个字符
        osw1.write(97);
        osw1.flush();//刷新流
        osw1.write("\r\n");
        //这个没有flush()刷新也出来了，因为close() 先刷新,后关闭
        osw1.close();//释放资源
        //osw1.write(98);
        /**
         * 其实,close是关闭流，注意:close执行,先刷新一次,再关闭流,关闭后不能再写如数据
         * Exception in thread "main" java.io.IOException: Stream closed
         * */

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(char[] cbuf)                 写入一个字符数组
        char[] array = {'a','b','c','中','国','汉','字','\n'};
        osw2.write(array);
        osw2.close();//刷新+关闭流

        OutputStreamWriter osw3 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(char[] cbuf,int off,int len) 写入字符数组的一部分
        osw3.write(array,3,array.length-3);//规定为 '中','国','汉','字','\n'
        osw3.close();

        OutputStreamWriter osw4 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(String str)                  写一个字符串
        String str = "问君能有几多愁,恰似一江春水向东流。\r\n";
        osw4.write(str);
        osw4.close();

        OutputStreamWriter osw5 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_编码解码\\字符流类Method\\文件1.txt",true));
        //void write(String str,int off, int len) 写一个字符串的一部分
        osw5.write(str,8,str.length()-8);
        osw5.write("========================================");
        osw5.close();

    }

}

```



###  字符流改进与优化          FileReader和 FileWriter

```java
package A1_MyJava.基础知识.IO流.字符流.字符流_总结案例;

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
        FileReader fr = new FileReader("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_总结案例\\DameFileCopy.java");
        //根据目的地创建字符输出流对象,用于写入数据
        FileWriter fw = new FileWriter("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符流\\字符流_总结案例\\复制到这里\\DameFileCopy_FUBEN.java");

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

```





## 编码与解码



### 字符  编码&&解码

#### 图片

![img](D:\源代码\img\MDimg\img-16357582233051.png)

#### 代码

```java
package 基础知识.IO流.字符流.字符流_编码解码;
/*
InputStreamReader: 是从字节流到字符流的桥梁
    它读取字节，并使用指定的编码将其解码为字符
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
OutputStreamWriter: 是从字符流到字节流的桥梁
    它是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

*/

import java.io.*;

public class TestIO_putStream_Reader_Writer {

    public static void main(String[] args) throws IOException {

        /*OutputStreamWriter的构造方法：
        OutputStreamWriter(OutputStream out)  创建使用默认字符编码的 OutputStreamWriter。
        OutputStreamWriter(OutputStream out, Charset cs)  创建使用给定字符集的 OutputStreamWriter。
        */
        //先创建一个字节流输出对象
        FileOutputStream fos = new /*别忘了异常处理*/ FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件1.txt");
        //将fos作为参数传入OutputStreamWriter构造放法当中。

        /**构造方法一：   OutputStreamWriter(OutputStream out)  创建使用默认字符编码的 OutputStreamWriter。*/

        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //使用osw对象写入文件内容，平台默认编码表
        osw.write("中国汉字");
        osw.write("\r\n");//Windows Linux Mac 系统识别不同
        osw.write("=======");
        osw.write("\r\n");
        /*
        如果使用字节流的话,write()方法,没有参数带(String str)的重载方法。
        以前是通过字符串编码解码后写入的:
        【 "中国汉字".getBytes(String charSetName); 】          来实现的
        【 new String(byte[] array , String charSetName ) 】  来实现的
        */
        //依然需要释放资源！！！
        osw.close();

        //============================================================================================================

        //标准 字符流输出流 写数据。
        method();

        /**构造方法二：   OutputStreamWriter(OutputStream out, Charset cs)  创建使用给定字符集的 OutputStreamWriter。*/

        OutputStreamWriter oswNew = null;
        InputStreamReader isr = null;
        InputStreamReader isrNew = null;
        try{//try...catch...finally异常环绕处理方式 处理异常

            oswNew = new OutputStreamWriter(
                     new FileOutputStream
                         ("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件2.txt",true/*追加写入*/)
            /*规定编码*/  ,"UTF8");//这里使用UTF8字符集进行解码编码。
            //写入数据
            oswNew.write("\r\n这里可能会出现乱码！");//杩欓噷鍙?兘浼氬嚭鐜颁贡鐮侊紒
            /**
             *
             * 分析原因：
             * 文件.txt是GBK文件
             * 写入时用的时UTF8进行编译解码的
             * 所以会出现乱码
             * */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================
            //使用InputStreamReader字符输入流 读取数据：
            /*
            构造方法
            InputStreamReader(InputStream in)  创建一个使用默认字符集的 InputStreamReader。
            InputStreamReader(InputStream in, Charset cs)  创建使用给定字符集的 InputStreamReader。
            */
            //构造方法一:
            isr = new InputStreamReader(
                  new FileInputStream
                      ("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件2.txt"));
            //读数据
            int by;//使用单个字符读
            while((by = isr.read()) != -1){
                System.out.print((char) by);
            }
            /*结果是：

            ========这里可能会出现乱码！=========
            杩欓噷鍙?兘浼氬嚭鐜颁贡鐮侊紒

            */
            // [杩欓噷鍙?兘浼氬嚭鐜颁贡鐮侊紒] 无法读取 这段是UTF8写入的
            System.out.println("\n///////////////////////////////////");
            //构造方法一:
            isrNew = new InputStreamReader(
                     new FileInputStream
                         ("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件2.txt")
            /*规定编码*/ ,"UTF8");
            //读数据
            int byN;//使用单个字符读
            while((byN = isrNew.read()) != -1){
                System.out.print((char) byN);
            }
            /*
            运行结果:
            ========???????????????=========
            这里可能会出现乱码！

            虽然GBK读取不了了,但是,这次可以读取UTF8的代码了!
            */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (oswNew != null){
                try{//释放资源
                    oswNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isr != null){
                try{//释放资源
                    isr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isrNew != null){
                try{//释放资源
                    isrNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }





    //优化Code , 标准写法
    public static void method(){

        OutputStreamWriter osw = null;

        try{//try...catch...finally异常环绕处理方式 处理异常
            //!!!!!!!!!!!!!!!!!!!!这里是追加写入，所以要用append 参数为true
            osw = new OutputStreamWriter(new FileOutputStream("A1_Java基础SE\\src\\基础知识\\IO流\\字符流\\字符流_编码解码\\文件1.txt",true));
            //写入数据
            osw.write("标准字符流写数据的Code");
            osw.write("\r\n=======\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (osw != null){
                try{//释放资源
                    osw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}
```







## 字符缓冲流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336056277314.png)

### 字符缓冲流特有的Method

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336057736955.png)

### 代码

```java
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
            bw = new BufferedWriter(new FileWriter("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\文件.txt"));
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
            br1 = new BufferedReader(new FileReader("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\文件.txt"));
            br2 = new BufferedReader(new FileReader("D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流特有方法\\文件.txt"));

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

```

### 案例

```java
package A1_MyJava.基础知识.IO流.字符缓冲流.字符缓冲流案例;

import java.io.*;
/*
继续改进【字符流案例】这次使用 [字符缓冲流] 来实现

*/
public class NewJavaCopy {

    public static void main(String[] args) {

        //创建字符缓冲流
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //赋值路径对象
            br = new BufferedReader(new FileReader
				("src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流案例\\NewJavaCopy.java"));
            bw = new BufferedWriter(new FileWriter
                 ("src\\A1_MyJava\\基础知识\\IO流\\字符缓冲流\\字符缓冲流案例\\复制到这里\\NewJavaCopy.java"));
            //开始复制
            char[] array = new char[1024];
            int len;
            while ((len = br.read(array)) != -1) {
                //复制
                bw.write(array, 0, len);
                //打印输出到控制台
                System.out.print(new String(array,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null) {
                try {
                    br.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null) {
                try {
                    bw.close();//释放资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```



## 标准输入输出流

### 标准输入流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336090111437.png)

```java
package A1_MyJava.基础知识.IO流.特殊操作流.标准输入输出流.标准输入流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputStream {

    public static void main(String[] args) throws IOException {

        //启动
        new StandardInputStream().init();

    }

    //选择调用那个方法
    public void init() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("调用方法:");
        int isMethod = sc.nextInt();
        //选择调用
        if (isMethod == 1) {
            method1();//字节流
        } else if (isMethod == 2) {
            method2();//字节流 数组读取
        } else if (isMethod == 3) {
            method3();//字符流
        } else if (isMethod == 4) {
            method4();//字符缓冲流
        } else if (isMethod == 5) {
            method5();//Scanner的引入
        }

    }

    //在System中有一个静态常量
    //public static final InputStream in : 标准输入流
    public void method1() throws IOException {
        System.out.println("已调用方法一");
        //创建标准输入流
        InputStream in1 = System.in;
        //单个字节读取数据
        int by;
        while ((by = in1.read()) != -1) {
            System.out.print((char) by);
        }
        in1.close();
        /*
        输出结果可以, 但是由于这是 [字节流]
        所以, 当读取到中文的时候,
        由于中文采用了 UTF-8 / GBK / ...
        编码会出现错误
        如:
        输入: 尴尬
        结果: ???? //四个字符 编码采用的时 [GBK编码集]

        */
    }

    //使用标准输入流, 数组方式读取数据
    private void method2() throws IOException {
        System.out.println("已调用方法二");
        //创建标准输入流
        InputStream in = System.in;
        //读数据 byte[]
        byte[] array = new byte[1024];
        int len;
        while ((len = in.read(array)) != -1) {
            System.out.print(new String(array, 0, len));
        }
        /*
        使用字节流方法 中的 数组读取方法 可以读取中文了
        */
        in.close();
    }

    //将[标准输入流] 封装成为 [字符流]
    private void method3() throws IOException {
        System.out.println("已调用方法三");
        //创建标准输入流
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        //使用封装好后的 字符流 读取数据
        //两种
        /*单个字符读取
        int by;
        while ((by = isr.read()) != -1) {
            System.out.print((char) by);
        }*/
        //字符数组读取
        char[] array = new char[1024];
        int len;
        while ( (len = isr.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }
        //释放资源
        isr.close();
    }

    //包装为字符缓冲输入流
    public void method4() throws IOException {
        System.out.println("已调用方法四");
        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);
        // 三步简写
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //使用特殊的方法读取 单行读取
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }

    //关于类型格式与Scanner类
    public void method5() throws IOException {
        System.out.println("已调用方法五");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //如果读取的数据为想要的数据类型
        int num = Integer.parseInt(br.readLine());
        System.out.println("还需要使用转换工具 ："+num);
        br.close();
        //这样来回转换很麻烦。
        /*
        System.out.println("所以Java提供Scanner类包装的就是System.in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("===");
        int abc = scanner.nextInt();
        System.out.println(abc);
        */


    }

}
```





### 标准输出流

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336088557106.png)

```java
package A1_MyJava.基础知识.IO流.特殊操作流.标准输入输出流.标准输出流;

import java.io.PrintStream;

// public static final PrintStream out : 标准输出流
public class StandardPrintStream {

    public static void main(String[] args) {
        //返回值类型为: PrintStream
        PrintStream ps = System.out;
        //PrintStream继承了OutputStream
        //此类里面有很多方法用于输出各种类型
        ps.println("字符串");
        ps.println(521);
        ps.println(true);
        ps.println('尴');
        ps.print(123);
        ps.print("Go");

        //直接时使用！
        System.out.println("这就是System.out.println()");
        System.out.println();
        //System.out.print(); //把ln去掉不放参数会报错，因为没有该方法
    }
}
```



## 打印流

### 字节打印流 PrintStream

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336092207808.png)

```java
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream
            			("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\字节打印流\\文件.txt");
        //使用方法
        ps.write(97);//a     //write有三种方法,单个字符,byte数组,byte数组一部分
        ps.println();  //换行
        ps.print(97);  //97    //print / println 特有方法||写入的内容是什么,写进去的内容就是什么
        ps.println();
        ps.println("中文写入");

        //需要释放资源
        ps.close();
    }

}
```





### 字符打印流 PrintWriter

![img](D:\源代码\img\MDimg\img-16336092866979.png)

```java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
字符打印流其中的两个构造方法
        PrintWriter(String fileName)
            使用指定的文件名创建一个新的PrintWriter,而不自动执行刷新

        PrintWriter(Writer out,boolean autoFlush)
            创建一个新的PrintWriter
            -- out: 字符输入流
            -- autoFlush: 一个布尔值，如果为true，
                          则println,printf,format
                          方法将刷新输出缓冲区
*/
public class TestPrintWriter {

    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName) 使用指定的文件名创建一个新的PrintWriter,而不自动执行刷新
        PrintWriter rw = new PrintWriter("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\字符打印流\\文件.txt");
        rw.write(97); //使用write可以单个字符写入 可以char数组写入
        //需要刷新
        rw.flush();//需要刷新流操作
        rw.println();
        rw.println("尴尬酱万岁！");
        rw.flush();
        rw.println("============");
        rw.flush();

        //释放资源
        rw.close();

/*
		   PrintWriter(Writer out,boolean autoFlush)
            创建一个新的PrintWriter
                -- out: 字符输入流
                -- autoFlush: 一个布尔值，如果为true，则println,printf,format方法将刷新输出缓冲区
*/
        PrintWriter rwAuto = new PrintWriter(
                new FileWriter("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\字符打印流\\文件.txt")
                ,true);//参数为true
        //使用println printf format 会自动刷新
        rwAuto.println("这就尴尬了");
        rwAuto.print("中文");
        rwAuto.flush();
        rwAuto.printf("编码");
        rwAuto.println();
        rwAuto.format("完成写入");

        //释放资源
        rwAuto.close();

    }

}
```

### 打印流案例

```java
import java.io.*;

public class PrintWriterCopy {

    public static void main(String[] args) throws IOException{

        //字符缓冲流
        method1();

        //字符打印流改进
        method2();


    }



    private static void method1() throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\PrintWriterCopy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\NewCopy001.txt"));
        //读写数据
        String str;
        while ( (str=br.readLine())!= null ){
            bw.write(str); //写入数据
            bw.newLine();  //换行
            bw.flush();    //刷新
        }

        //最后释放资源
        br.close();
        bw.close();

    }

    private static void method2() throws IOException {
        //注意：打印流只负责写数据，不负责读取数据

        //读数据仍然使用字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\PrintWriterCopy.java"));
        //创建打印流
        PrintWriter pw = new PrintWriter(new FileWriter("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\字节字符打印流\\案例打印流复制文件\\NewCopy002.txt")
                                         , true);//第二个参数为true
        //读写数据
        String str;
        while ( (str = br.readLine())!= null ){
            pw.println(str);//三步：写入 换行 刷新
        }

        //释放资源
        br.close();
        pw.close();

    }
}

```





## 对象序列化流

### 概括

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360938556610.png)



### 对象序列化流 ObjectOutputStream

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360945961311.png)

```java
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
             ?? sr gA1_MyJava.鍩虹?�鐭ヨ瘑.IO娴?.鐗规畩鎿嶄綔娴?.瀵硅薄搴忓垪鍙嶅簭鍒楀寲娴?.A1_瀵硅薄搴忓垪鍖栨祦.Student2u
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

//=================================================================================================================
//=================================================================================================================

public class Student1 {

    private String name;
    private int age;

    public Student1() {
    }
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
//=================================================================================================================
//=================================================================================================================
//实现Serializable接口
import java.io.Serializable;
public class Student2 implements Serializable/*实现该接口后该类的对象能被序列化*/ {

    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

```



### 对象反序列化流 ObjectInputStream

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360972468112.png)

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建反序列化流对象。构造方法:ObjectInputSteam(InputSteam in): 创建从指定的InputSteam读取的ObjectStream
        ObjectInputStream ois = 
            new ObjectInputStream(
            new FileInputStream
            	("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A1_对象序列化流\\对象序列化.txt"));

        //使用反序列化流的方法。反序列化对象的方法:Object readObject(): 从ObjectInputStream读取一个对象,返回值是一个对象
        Object oStu = ois.readObject();//抛出异常：ClassNotFoundException
        Student2 stu = (Student2) oStu;//向下转型为Student2

        //释放资源
        ois.close();

        //遍历该对象
        System.out.println("姓名: "+stu.getName()+", 年龄: "+stu.getAge());

    }

}

```



### 对象序列化流遇到的问题 与 标准化

#### 问题与解决

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/问题与解决-163360990564813.png)



#### 比较标准的序列化    上代码

```java
import java.io.*;

public class TestObjectStudent {

    public static void main(String[] args) {
        //write();
        read();
    }

    //对象序列化
    public static void write() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A3_对象反序列化的问题与标准\\序列化文件.txt"));) {
            //先创建对象
            Student stu = new Student("尴尬酱", 20, 202020);
            //对象序列化
            oos.writeObject(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //对象反序列化
    public static void read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\特殊操作流\\对象序列反序列化流\\A3_对象反序列化的问题与标准\\序列化文件.txt"))) {
            //反序列化对象
            Object oStu = ois.readObject();//这里报的不在IOException包下
            //创建该对象
            Student stu = (Student) oStu;//向下转型
            //打印对象内容
            if (stu.getID() == 0 ){
                System.out.println("姓名: " + stu.getName() + ", 年龄: " + stu.getAge() + ", 学号: 无法查看");
            }else {
                System.out.println("姓名: " + stu.getName() + ", 年龄: " + stu.getAge() + ", 学号: " + stu.getID());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

//==========================================================================
//==========================================================================

import java.io.Serializable;

//比较标准的写法：
public class Student implements Serializable/*1: 实现Serializable接口*/ {
    //2: 给对象所属的类加一个serialVersionUID
         //--必须是 静态的 final修饰 long类型 名字是serialVersionUID
    private static final long serialVersionUID = 42L;

    //成员变量
    private String name;
    private int age;
    //3: 如果不想序列化该成员变量使用transient修饰
    private transient int ID = 0;

    //4:要想不报错,必须有可访问的无参构造方法！
    public Student() {
    }

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //重写toString()方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}

```





## 笔记链接

### [ @笔记链接 ](https://gitee.com/embarrassing-sauce/my-code/tree/master/src/A1_MyJava/基础知识/IO流)




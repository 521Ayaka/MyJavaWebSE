# IO流总结

### 注意: 由于先学的 用的异常处理时JDK7之前的方法, 以后再用异常处理, 使用JDK7之后的解决方案！！！

## 图解

### 字节流

![ img ](https://gitee.com/embarrassing-sauce/My-img/raw/master/img1.png) 

![image-20210920225313894](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225313894.png)

### 字符流

![image-20210920225351670](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225351670.png)

![image-20210920225400585](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225400585.png)

## 先回顾异常处理

### 直接看代码

```java
package A1_MyJava.基础知识.IO流.标准异常处理;

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

### 创建文件和目录

```java
public boolean createNewFile(){//...}  当具有该名称的文件不存在时，创建一个有该抽象路径名命名的新空文件

public boolean mkdir(){//...}  创建有此抽象路径命名的目录 

public boolean mkdirs(){//...} 创建由此抽象路径名命名的目录, 包含任何不需但不存在的父目录
```

### File 的 Method

```java
File类判断和获取功能：
    
public boolean isDirectory(){//...} 测试此抽象方法路径名表示的File是否为目录

public boolean isFile(){//...} 测试此抽象路径名表示的File是否为文件

public boolean exists(){//...} 测试此抽象路径名表示的File是否存在
    

public String getAbsolutePath(){//...} 返回此抽象路径名的绝对路径名字符串

public String getPath(){//...}  将此抽象路径名转换为路径名字符串

public String getName(){//...}  返回由此抽象路径名表示的文件或目录名称
    

public String[] list(){//...}   返回此抽象路径名表示的目录中的文件和目录的名称字符串数组

public File[] listFiles(){//...} 返回此抽象路径名表示的目录中的文件和目录的File对象数组
```

### File删除Method

```java
//public boolean delete(){//...}   删除由此抽象路径名表示的文件或目录
```

## FileInputStream  FileOutputStream

### FileOutputStream 输出流  用来写入数据

#### 写数据的Code //由于先学的 用的异常处理时JDK7之前的方法

```java
FileOutputStream out = null;
try{
    //赋值资源
    out =
    new FileOutputStream("src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流写数据\\测试文件3.txt");
    //写入数据
    out.write("问君能有几多愁\n剑圣塔下达不溜".getBytes()); //可使用 "字符串".getBytes();
}catch (IOException e){
    e.printStackTrace();
}finally{
    if (out != null){
        try{
            out.close();//释放资源
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

#### 写数据的Code // jdk7 后改进

### FileInputStream 输出流  用来写入数据

#### 读数据的Code  --单字节写入

```java
//创建字节输入流对象
FileInputStream fileInput = null;
//读取数据，使用try...catch...finally环绕处理
try{
    fileInput =  
    new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");
    //读取数据
    int getByte ;
    while((getByte = fileInput.read()) != -1){
        System.out.print((char) getByte);
    }
}catch(IOException e){
    e.printStackTrace();
}finally{
    //释放资源
    if(fileInput != null){
        try {
            fileInput.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

#### 读数据的Code  --byte[ ]数组节写入

```java


try{
    //进行操作
    input = 
    new FileInputStream("src\\A1_MyJava\\基础知识\\IO流\\字节流\\字节流读数据\\测试文件2.txt");
    //读取
    byte [] array = new byte[1024];//一般都是设置为 [1024] 的整数倍
    int read;
    while ((read = input.read(array) ) != -1){
        System.out.print(new String(array,0,read));//后面两个参数也要写！！！！
    }
}catch(IOException e){
    e.printStackTrace();
}finallyint getByte ;
    if (input != null){
        try{
            input.close();//释放资源
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```



## BufferedInputStream  BufferedOutputStream

### 缓冲流案例 不同复制视频的运行时间

```JAVA
import java.io.*;

public class DameBufferedIO_putStream {
	//源文件 要复制的图片
    private static String IN 
    = "D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\雷神pv.mp4";
    //追加前的目录
    private static String OUT_OR_APPEND
    = "D:\\源代码\\src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\";
   	//要复制成的文件名
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
```

### 写法 缓冲流赋值文件

```java
		//创建
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        
    try {
        //赋值
        bis = new BufferedInputStream(new FileInputStream
        ("src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\视频文件\\雷神pv.mp4"));
        bos = new BufferedOutputStream(new FileOutputStream
        ("src\\A1_MyJava\\基础知识\\IO流\\字节缓冲流\\缓冲流案例\\雷神pv.mp4"));
        
        //开始读取并写入数据
        byte[] array = new byte[1024]; //一般保证1024的整数倍,是[024*8]
        int len;//用来获取数组长度
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
```



![image-20210922192323807](D:\源代码\img\MDimg\image-20210922192323807.png)












# IO���ܽ�

˵��: �����쳣�õ�JDK7֮ǰ�ķ���,��ѡʹ��JDK7֮��Ĵ�����



## ͼ��



### �ֽ���

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225251946.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225313894.png)

### �ַ���

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225351670.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210920225400585.png)

### �������л���

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360938556610.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/��������-163360990564813.png)

### ��ӡ��

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336038884631.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336039094452.png)

====================================================================================================





## �ȸ�ϰ�쳣����

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/image-20210922192323807.png)

### ֱ���ϴ���

```java
/*
��������:

[����һ JDK7֮ǰ]��
    ʹ��finally��֤���ͷ���Դ,ͬʱ����Ҫ���׳��쳣,���ǲ���̫����

[������ JDK7֮��]:
    ��try()��������д���������ͬʱ��ֵ,�Զ��ͷ���Դ,����Ҫʹ��finally,����Ҫ�׳��쳣,���˴��룡YYDS!

[������ JDK9֮��]:
    �����洴�������󲢸�ֵ,��try()������ʹ�ô����õ�������,���������洴������,��������Ҫ�׳��쳣��

[����]:
    ʹ�÷������ȽϺõ�,���˴���,�������׳��쳣��

*/

import java.io.*;

public class HandleIOException {

    public static File fileYuan = new File("src\\A1_MyJava\\����֪ʶ\\IO��\\��׼�쳣����\\Դ�ļ�.txt");
    public static File fileNewAppend = new File("src\\A1_MyJava\\����֪ʶ\\IO��\\��׼�쳣����");

    public static void main(String[] args) throws IOException/*��Դ��JDK9�������*/ {

        //������
        new HandleIOException().init();

    }

    //��ʼ��
    public void init() throws IOException/*��Դ��JDK9�������*/ {

        ioeJDK6();
        ioeJDK7();
        ioeJDK9();


    }

    //��JDK7֮ǰʹ�õ��쳣������
    public void ioeJDK6() {
        //��װĿ��·������
        File fileNew = new File(fileNewAppend, "\\IOEjdk6\\" + fileYuan.getName());

        //��ʼ��������Դ
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(fileYuan));
            bw = new BufferedWriter(new FileWriter(fileNew));
            //��ʼ����
            String str1;//�ַ��������������з���readLend()!!!
            while ((str1 = br.readLine()) != null) {
                bw.write(str1);
                bw.newLine();//ʹ��newLine()����
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

    //��JDK7֮��ʹ�õ��쳣������
    public void ioeJDK7() {
        //��װĿ��·������
        File fileNew = new File(fileNewAppend, "\\IOEjdk7\\" + fileYuan.getName());
        /*
        try(����������){

        }catch (�쳣���� ������){
            �쳣�������;
        }
        */
        //��ʼ����
        try (//��try()�������� ���� �������� ����ֵ
             //���Զ��ͷ���Դ
             BufferedReader br = new BufferedReader(new FileReader(fileYuan));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileNew));) {//��ʼ����
            String str2;
            while ((str2 = br.readLine()) != null) {
                bw.write(str2);
                bw.newLine();
                bw.flush();//ˢ����
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //��JDK9֮��ʹ�õ��쳣������
    public void ioeJDK9() throws IOException /*��Ȼ��Ҫ�׳��쳣*/ {
        //��װĿ��·������
        File fileNew = new File(fileNewAppend, "\\IOEjdk9\\" + fileYuan.getName());

        //JDK9������� ��Ȼ��Ҫ�׳��쳣
        BufferedReader br = new BufferedReader(new FileReader(fileYuan));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileNew));

        try (br; bw;) {
            //��ʼ����
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





## File��

### ��������

```java
public boolean createNewFile(){//...}  �����и����Ƶ��ļ�������ʱ������һ���иó���·�����������¿��ļ�

public boolean mkdir(){//...}  �����д˳���·��������Ŀ¼

public boolean mkdirs(){//...} �����ɴ˳���·����������Ŀ¼, �����κβ��赫�����ڵĸ�Ŀ¼

// [ע��]:
// ʹ��createNewFile�÷�������ʱ����Ҫʹ��try...catch...�쳣�����ƣ�����ʹ��throws�쳣�׳�, ����ᱨ��
// �����ࣺjava.io.IOException��
```

### File ��������

```java
//File���жϺͻ�ȡ���ܣ�

public boolean isDirectory(){//...} ���Դ˳��󷽷�·������ʾ��File�Ƿ�ΪĿ¼

public boolean isFile(){//...} ���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�

public boolean exists(){//...} ���Դ˳���·������ʾ��File�Ƿ����

public String getAbsolutePath(){//...} ���ش˳���·�����ľ���·�����ַ���

public String getPath(){//...}  ���˳���·����ת��Ϊ·�����ַ���

public String getName(){//...}  �����ɴ˳���·������ʾ���ļ���Ŀ¼����

public String[] list(){//...}   ���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������

public File[] listFiles(){//...} ���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
    
```

### Fileɾ������

```java
//public boolean delete(){//...}   ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼
```

====================================================================================================



## �ֽ���

### FileOutputStream �ֽ������

```java
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStreamReadMethod {

    public static void main(String[] args) {

        //�����ֽ�����������
        FileInputStream input = null;
        try{

            //���в���

            input = new FileInputStream
                		("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�1.txt");
            //input.read();
            /*
            public int read(byte b[]) throws IOException {
                return readBytes(b, 0, b.length);
            }

            ע�ⷵ��ֵ:
            ����readBytes()
            1.���������ȡ����������
            2.����0
            3.����һ��int������ĳ���

            �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С�
            ��ĳЩ�������֮ǰ���˷���������

            */
            //��һ�ζ�ȡ
            byte [] array = new byte[5];//������emm...
            int read1 = input.read(array); //���ص�������ĳ��ȣ�ͬʱ�����������¸�ֵ������������
            System.out.println(read1); //5
            System.out.println(new String(array, 0 ,read1)); //abc d

            //�ڶ��ζ�ȡ
            int read2 = input.read(array);
            System.out.println(read2); //5
            System.out.println(new String(array, 0 ,read2)); // ����  hel
            /*
            * �ڶ��ζ�ȡ��������
            *
            * hel
            *
            * ���滻���ˣ�\r\n ռ���� ���� byte����
            * */


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        System.out.println("=============================================");

        //�Ż�
        try{
            //���в���
            input = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���������\\�����ļ�2.txt");
            //��ȡ
            byte [] array = new byte[1024];//һ�㶼������Ϊ [1024] ��������
            int read;
            while ((read = input.read(array) ) != -1){
                System.out.print(new String(array,0,read));//������������ҲҪд��������
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (input != null){
                try{
                    input.close();//�ͷ���Դ
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
    }

    }

}
```



### FileInputStream �ֽ�������

```java
/*
һ����׼�� �ֽ���д���� �� �쳣����

ʹ�� try...catch...finally [JDK7֮ǰ�Ĵ�����]
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionOutputStream {

    public static void main(String[] args) {

        //��׼д����

        //���ⲿ���� ���󣬳�ʼֵΪ null
        FileOutputStream fos = null;
        try{
            //��try�ڲ���ֵ
            fos = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�3.txt");
            //��try��д������
            fos.write("�ʾ����м����\n��ʥ���´ﲻ��".getBytes());
        }catch (IOException e){
            //�쳣��ʾ��
            e.printStackTrace();
        }finally{
            //��finally�ڲ��ͷ���Դ
            //���ж�fos�Ƿ�Ϊnull (try���и�ֵʱ�����·�����󣬾ͻ�Ϊnull) �������close()ʱ���� [��ָ���쳣]
            if (fos != null){
                //��Ϊnullʱ���ͷ���Դ
                try{
                    //ʹ��close()����ʱ��Ҳ��Ҫclose()�����쳣��������
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
   /*=============================================================================================================*/

        //��ע�Ͱ棺
        FileOutputStream out = null;
        try{
            out = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ���д����\\�����ļ�3.txt");
            out.write("�ʾ����м����\n��ʥ���´ﲻ��".getBytes());
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





## �ֽڻ�����

### �����������

```JAVA
	//���췽����
    //������OutputStream ��Ķ��� ��ֻ��һ������
    public BufferedOutputStream(OutputStream out) {
        this(out, 8192);     //�������������һ�����췽����Ĭ�� size�� 8*1024 = 8192
    }


    public BufferedOutputStream(OutputStream out, int size) {
        super(out);
        if (size <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        buf = new byte[size];   //�����˻����ֽ����顣
    }

```

### �ַ�����������

```java
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

    public static void main(String[] args) throws IOException {

        //ͬBufferedInputStream��ͬ����������
        BufferedInputStream bis = new BufferedInputStream
            	(new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\�����ļ�.txt"));

        //ͨ��bis���ж�ȡ����

        //������ȡ
        /*
        int by;
        while((by = bis.read()) != -1){
            System.out.print((char) by);
        }*/
        //ʹ��byte�����ȡ
        byte [] array = new byte[1024];
        int len;
        while( (len = bis.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }

        //ͬ����Ҫ�ͷ���Դ
        bis.close();
    }

}
```



### �ֽڻ��������� --������Ƶ �� ��ͬ�����������õ�ʱ��

```java
package A1_MyJava.����֪ʶ.IO��.�ֽڻ�����.����������;

import java.io.*;

public class DameBufferedIO_putStream {

    private static String IN = "D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\��Ƶ�ļ�\\����pv.mp4";
    private static String OUT_OR_APPEND = "D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽڻ�����\\����������\\";
    private static String OUT_OR_FILE = "\\����pv.mp4";

    public static void main(String[] args) {

        /*
        ���ļ��� ��Ƶ�ļ� �µ� ����ʦ.mp4���Ƶ���ǰ���ļ��ж�Ӧ��method�ļ���
        */
        //����ʱ��
        //���÷���

        /*ʹ�û�����    �����ַ���ȡ*/
        method1(); // method1��ʱ: 658����

        /*��ʹ�û�����  �����ַ���ȡ*/
        method2(); // method1��ʱ: 71230����

        /*ʹ�û�����   ʹ��byte[1024]��ȡд��*/
        method3(); // method2��ʱ: 31����

        /*��ʹ�û�����  ʹ��byte[1024]��ȡд��*/
        method4(); // method1��ʱ: 94����

        /*ʹ�û�����    ʹ��byte[1024*32]��ȡд��*/
        method5(); // method3��ʱ: 17����

        //�ٴ����н�����ܲ�ͬ��ϵͳ�ײ����⡣

        /**
        ���ۣ�
        ʹ��byte[]����  ��ȡ�ٶȿ� д���
        ʹ���ֽڻ�����   ��ȡ�ٶȿ� д���
        */


    }

    //��������ʱ�� ��ʼ
    public static long go() {
        return System.currentTimeMillis();
    }

    //��������ʱ�� ����
    public static long end(long go) {
        return System.currentTimeMillis() - go;
    }


    //ʹ�� [������] [����] byte���ж�ȡ����
    public static void method1() {
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method1").append(OUT_OR_FILE))));
            //��ʼ��ȡ��д������
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: " + end + "����");
    }

    //��ʹ�� [������] [����] byte���ж�ȡ����
    public static void method2() {
        //����
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method2").append(OUT_OR_FILE)));
            //��ʼ��ȡ��д������
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: " + end + "����");
    }


    //ʹ���ֽڻ����� ʹ��byte[]������ж�ȡ���� ��byte.length��ֵΪ [1024]
    public static void method3() {
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method3").append(OUT_OR_FILE))));
            //��ʼ��ȡ��д������
            byte[] array = new byte[1024];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]���췽��
                bos.write(array, 0, len);//���ι��췽��
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method2��ʱ: " + end + "����");
    }


    //��ʹ�� [������] [ʹ��byte[]����] ���ж�ȡ����
    public static void method4() {
        //����
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            fis = new FileInputStream(IN);
            fos = new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method4").append(OUT_OR_FILE)));
            //��ʼ��ȡ��д������
            byte[] array = new byte[1024];//����Ϊ1024
            int by;
            while ((by = fis.read(array)) != -1) {
                fos.write(array, 0, by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method1��ʱ: " + end + "����");
    }


    //ʹ���ֽڻ����� ʹ��byte[]������ж�ȡ���� ��byte.length��ֵΪ [32*1024]
    public static void method5() {
        //����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //��ʼ��ʱ
        long go = go();

        try {
            bis = new BufferedInputStream(new FileInputStream(IN));
            bos = new BufferedOutputStream(new FileOutputStream(String.valueOf(new StringBuilder(OUT_OR_APPEND).append("method5").append(OUT_OR_FILE))));
            //��ʼ��ȡ��д������
            byte[] array = new byte[1024 * 32];
            int len;
            while ((len = bis.read(array)) != -1) {//byte[]���췽��
                bos.write(array, 0, len);//���ι��췽��
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //������ʱ
        long end = end(go);
        System.out.println("method3��ʱ: " + end + "����");
    }


}

```

====================================================================================================



## �ַ���

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336051640413.png)

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/�����.png)





### �ַ������� InputStreamReader

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/TestInputStreamReader_Method.png)

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
�����ݵķ������ֽ����ķ�����ֻ࣬����һ�����ֽ�����һ�����ַ�����һ����byte���飬һ����char����

[����]:
    int read()                һ�ζ�һ���ַ�����
    int read(char[] cbuf)     һ�ζ�һ���ַ���������

*/
public class TestInputStreamReader_Method {

    public static void main(String[] args) throws IOException {

        //����һ  int read()                һ�ζ�һ���ַ�����
        InputStreamReader isr1 = new InputStreamReader(
            new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt"));
        int by;
        while ((by = isr1.read()) != -1){
            System.out.print((char) by);
        }
        isr1.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //������  int read(char[] cbuf)     һ�ζ�һ���ַ���������
        InputStreamReader isr2 = new InputStreamReader(
            new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt"));
        char [] array = new char[1024];
        int len;
        while ((len = isr2.read(array)) != -1){
            System.out.print(new String(array,0,len));
        }
        isr2.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //��һ�����ļ�
        InputStreamReader isr3 = new InputStreamReader(new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\TestOutputStreamWriter_Method.java"));
        char[] arrayN = new char[1024];
        int lenN;
        while( (lenN = isr3.read(arrayN)) != -1 ){
            System.out.print(new String(arrayN,0,lenN));
        }
        isr3.close();

    }

}

```





### �ַ������ OutputStreamWriter

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/TestOutputStreamWriter_Method.png)

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
OutputStreamWriter ��д���ݵķ���
    void write(int c)                       дһ���ַ�
    void write(char[] cbuf)                 д��һ���ַ�����
    void write(char[] cbuf,int off,int len) д���ַ������һ����
    void write(String str)                  дһ���ַ���
    void write(String str,int off, int len) дһ���ַ�����һ����

[ע��]:
�ַ���������ֽ��� ���л���ģ�����
ʹ��ˢ����: flush();����ˢ�¡�
closeִ��,��ˢ��һ��,�ٹر���,�رպ�����д������

*/
public class TestOutputStreamWriter_Method {

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt"));
        //void write(int c)                       дһ���ַ�
        osw1.write(97);
        osw1.flush();//ˢ����
        osw1.write("\r\n");
        //���û��flush()ˢ��Ҳ�����ˣ���Ϊclose() ��ˢ��,��ر�
        osw1.close();//�ͷ���Դ
        //osw1.write(98);
        /**
         * ��ʵ,close�ǹر�����ע��:closeִ��,��ˢ��һ��,�ٹر���,�رպ�����д������
         * Exception in thread "main" java.io.IOException: Stream closed
         * */

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(char[] cbuf)                 д��һ���ַ�����
        char[] array = {'a','b','c','��','��','��','��','\n'};
        osw2.write(array);
        osw2.close();//ˢ��+�ر���

        OutputStreamWriter osw3 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(char[] cbuf,int off,int len) д���ַ������һ����
        osw3.write(array,3,array.length-3);//�涨Ϊ '��','��','��','��','\n'
        osw3.close();

        OutputStreamWriter osw4 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(String str)                  дһ���ַ���
        String str = "�ʾ����м����,ǡ��һ����ˮ������\r\n";
        osw4.write(str);
        osw4.close();

        OutputStreamWriter osw5 = new OutputStreamWriter(new FileOutputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(String str,int off, int len) дһ���ַ�����һ����
        osw5.write(str,8,str.length()-8);
        osw5.write("========================================");
        osw5.close();

    }

}

```



###  �ַ����Ľ����Ż�          FileReader�� FileWriter

```java
package A1_MyJava.����֪ʶ.IO��.�ַ���.�ַ���_�ܽ᰸��;

/*
    �Ż�����: ʹ�� [����ԴFileReader] [Ŀ�ĵ�FileWriter] ʵ��

    FileReader: Ϊ������ [��ȡ�ַ��ļ�] �� [�������] �̳��� InputStreamReader
                FileReader(File file)
                FileReader(String fileName)

    FileWriter: Ϊ������ [д���ַ��ļ�] �� [�������] �̳��� OutputStreamWriter
                FileWriter(File file)
                FileWriter(String fileName)

����Դ: Դ�ļ���ַFile��������>�����ݡ�������>Reader��������>InputStreamReader��������>FileReader
       File���װ��ַ��������>��������>�ַ��������ࡪ������>ʹ��ʵ�������ʵ�֡�������>ʹ�������������
Ŀ�ĵ�: Դ�ļ���ַFile��������>д���ݡ�������>Writer��������>OutputStreamWriter��������>FileWriter

[ע��]: FileReader FileWriter ��Ȼ��������д,
       ����,����漰�������������ʱ,�Ͳ������ˡ�

*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DameFileReader_Writer {

    public static void main(String[] args) throws IOException {
        //������ֱ���׳����쳣,û����try...catch...finally����,��׼Ӧ���û���

        //��������Դ�����ַ�����������,���ڶ�ȡ����
        FileReader fr = new FileReader("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�ܽ᰸��\\DameFileCopy.java");
        //����Ŀ�ĵش����ַ����������,����д������
        FileWriter fw = new FileWriter("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�ܽ᰸��\\���Ƶ�����\\DameFileCopy_FUBEN.java");

        //��д����
        /*�����ֽڶ�ȡ����
        int by;
        while ((by = fr.read()) != -1) {
            fw.write((char) by);
        }*/
        //char[] ����
        char[] array = new char[1024];
        int len;
        while ((len = fr.read(array))!=-1){
            fw.write(new String(array,0,len));
        }

        //�ͷ���Դ
        fr.close();
        fw.close();
    }

}

```





## ���������



### �ַ�  ����&&����

#### ͼƬ

![img](D:\Դ����\img\MDimg\img-16357582233051.png)

#### ����

```java
package ����֪ʶ.IO��.�ַ���.�ַ���_�������;
/*
InputStreamReader: �Ǵ��ֽ������ַ���������
    ����ȡ�ֽڣ���ʹ��ָ���ı��뽫�����Ϊ�ַ�
    ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���
OutputStreamWriter: �Ǵ��ַ������ֽ���������
    ���Ǵ��ַ������ֽ�����������ʹ��ָ���ı��뽫д����ַ�����Ϊ�ֽ�
    ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���

*/

import java.io.*;

public class TestIO_putStream_Reader_Writer {

    public static void main(String[] args) throws IOException {

        /*OutputStreamWriter�Ĺ��췽����
        OutputStreamWriter(OutputStream out)  ����ʹ��Ĭ���ַ������ OutputStreamWriter��
        OutputStreamWriter(OutputStream out, Charset cs)  ����ʹ�ø����ַ����� OutputStreamWriter��
        */
        //�ȴ���һ���ֽ����������
        FileOutputStream fos = new /*�������쳣����*/ FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�1.txt");
        //��fos��Ϊ��������OutputStreamWriter����ŷ����С�

        /**���췽��һ��   OutputStreamWriter(OutputStream out)  ����ʹ��Ĭ���ַ������ OutputStreamWriter��*/

        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //ʹ��osw����д���ļ����ݣ�ƽ̨Ĭ�ϱ����
        osw.write("�й�����");
        osw.write("\r\n");//Windows Linux Mac ϵͳʶ��ͬ
        osw.write("=======");
        osw.write("\r\n");
        /*
        ���ʹ���ֽ����Ļ�,write()����,û�в�����(String str)�����ط�����
        ��ǰ��ͨ���ַ�����������д���:
        �� "�й�����".getBytes(String charSetName); ��          ��ʵ�ֵ�
        �� new String(byte[] array , String charSetName ) ��  ��ʵ�ֵ�
        */
        //��Ȼ��Ҫ�ͷ���Դ������
        osw.close();

        //============================================================================================================

        //��׼ �ַ�������� д���ݡ�
        method();

        /**���췽������   OutputStreamWriter(OutputStream out, Charset cs)  ����ʹ�ø����ַ����� OutputStreamWriter��*/

        OutputStreamWriter oswNew = null;
        InputStreamReader isr = null;
        InputStreamReader isrNew = null;
        try{//try...catch...finally�쳣���ƴ���ʽ �����쳣

            oswNew = new OutputStreamWriter(
                     new FileOutputStream
                         ("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�2.txt",true/*׷��д��*/)
            /*�涨����*/  ,"UTF8");//����ʹ��UTF8�ַ������н�����롣
            //д������
            oswNew.write("\r\n������ܻ�������룡");//这里�?��会出现乱码！
            /**
             *
             * ����ԭ��
             * �ļ�.txt��GBK�ļ�
             * д��ʱ�õ�ʱUTF8���б�������
             * ���Ի��������
             * */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================
            //ʹ��InputStreamReader�ַ������� ��ȡ���ݣ�
            /*
            ���췽��
            InputStreamReader(InputStream in)  ����һ��ʹ��Ĭ���ַ����� InputStreamReader��
            InputStreamReader(InputStream in, Charset cs)  ����ʹ�ø����ַ����� InputStreamReader��
            */
            //���췽��һ:
            isr = new InputStreamReader(
                  new FileInputStream
                      ("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�2.txt"));
            //������
            int by;//ʹ�õ����ַ���
            while((by = isr.read()) != -1){
                System.out.print((char) by);
            }
            /*����ǣ�

            ========������ܻ�������룡=========
            这里�?��会出现乱码！

            */
            // [这里�?��会出现乱码！] �޷���ȡ �����UTF8д���
            System.out.println("\n///////////////////////////////////");
            //���췽��һ:
            isrNew = new InputStreamReader(
                     new FileInputStream
                         ("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�2.txt")
            /*�涨����*/ ,"UTF8");
            //������
            int byN;//ʹ�õ����ַ���
            while((byN = isrNew.read()) != -1){
                System.out.print((char) byN);
            }
            /*
            ���н��:
            ========???????????????=========
            ������ܻ�������룡

            ��ȻGBK��ȡ������,����,��ο��Զ�ȡUTF8�Ĵ�����!
            */

            //============================================================================================================
            //============================================================================================================
            //============================================================================================================

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (oswNew != null){
                try{//�ͷ���Դ
                    oswNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isr != null){
                try{//�ͷ���Դ
                    isr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (isrNew != null){
                try{//�ͷ���Դ
                    isrNew.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }





    //�Ż�Code , ��׼д��
    public static void method(){

        OutputStreamWriter osw = null;

        try{//try...catch...finally�쳣���ƴ���ʽ �����쳣
            //!!!!!!!!!!!!!!!!!!!!������׷��д�룬����Ҫ��append ����Ϊtrue
            osw = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ļ�1.txt",true));
            //д������
            osw.write("��׼�ַ���д���ݵ�Code");
            osw.write("\r\n=======\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (osw != null){
                try{//�ͷ���Դ
                    osw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}
```







## �ַ�������

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336056277314.png)

### �ַ����������е�Method

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336057736955.png)

### ����

```java
/*

BufferedWriter:
    void newLine(): дһ���зָ���, �зָ����ַ�����ϵͳ���Զ���

BufferedReader:
    public String readLine(): ��һ�����֡���������е����ݵ��ַ���,�������κ�����ֹ�ַ�,
                              ������Ľ�β�Ѿ�����, ��Ϊnull

*/
public class BufferedRWProMethod {

    public static void main(String[] args) {

        newLineMethod();
        readLineMethod();

    }

    public static void newLineMethod() {

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\�ļ�.txt"));
            //д������
            bw.write("���������");
            bw.newLine();
            bw.flush();//ˢ��
            bw.write("�G���һ����ˣ�");
            bw.newLine();
            bw.flush();//ˢ��
            bw.write("¬��ΰţ��,¬��ΰû�п��ң�");
            bw.newLine();
            bw.flush();//ˢ��
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
            br1 = new BufferedReader(new FileReader("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\�ļ�.txt"));
            br2 = new BufferedReader(new FileReader("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\�ļ�.txt"));

            //��ȡ��һ��
            System.out.println(br1.readLine());
            //��ȡ�ڶ���
            System.out.println(br1.readLine());
            //��ȡ������
            System.out.println(br1.readLine());
            //��ȡ������
            System.out.println(br1.readLine());//Ϊnull
            System.out.println("==============================");

            String str;
            while ((str = br2.readLine()) != null) {
                System.out.println(str);//�����Ҫ���е�println
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

### ����

```java
package A1_MyJava.����֪ʶ.IO��.�ַ�������.�ַ�����������;

import java.io.*;
/*
�����Ľ����ַ������������ʹ�� [�ַ�������] ��ʵ��

*/
public class NewJavaCopy {

    public static void main(String[] args) {

        //�����ַ�������
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //��ֵ·������
            br = new BufferedReader(new FileReader
				("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ�����������\\NewJavaCopy.java"));
            bw = new BufferedWriter(new FileWriter
                 ("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ�����������\\���Ƶ�����\\NewJavaCopy.java"));
            //��ʼ����
            char[] array = new char[1024];
            int len;
            while ((len = br.read(array)) != -1) {
                //����
                bw.write(array, 0, len);
                //��ӡ���������̨
                System.out.print(new String(array,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null) {
                try {
                    br.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null) {
                try {
                    bw.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```



## ��׼���������

### ��׼������

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336090111437.png)

```java
package A1_MyJava.����֪ʶ.IO��.���������.��׼���������.��׼������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputStream {

    public static void main(String[] args) throws IOException {

        //����
        new StandardInputStream().init();

    }

    //ѡ������Ǹ�����
    public void init() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("���÷���:");
        int isMethod = sc.nextInt();
        //ѡ�����
        if (isMethod == 1) {
            method1();//�ֽ���
        } else if (isMethod == 2) {
            method2();//�ֽ��� �����ȡ
        } else if (isMethod == 3) {
            method3();//�ַ���
        } else if (isMethod == 4) {
            method4();//�ַ�������
        } else if (isMethod == 5) {
            method5();//Scanner������
        }

    }

    //��System����һ����̬����
    //public static final InputStream in : ��׼������
    public void method1() throws IOException {
        System.out.println("�ѵ��÷���һ");
        //������׼������
        InputStream in1 = System.in;
        //�����ֽڶ�ȡ����
        int by;
        while ((by = in1.read()) != -1) {
            System.out.print((char) by);
        }
        in1.close();
        /*
        ����������, ������������ [�ֽ���]
        ����, ����ȡ�����ĵ�ʱ��,
        �������Ĳ����� UTF-8 / GBK / ...
        �������ִ���
        ��:
        ����: ����
        ���: ???? //�ĸ��ַ� ������õ�ʱ [GBK���뼯]

        */
    }

    //ʹ�ñ�׼������, ���鷽ʽ��ȡ����
    private void method2() throws IOException {
        System.out.println("�ѵ��÷�����");
        //������׼������
        InputStream in = System.in;
        //������ byte[]
        byte[] array = new byte[1024];
        int len;
        while ((len = in.read(array)) != -1) {
            System.out.print(new String(array, 0, len));
        }
        /*
        ʹ���ֽ������� �е� �����ȡ���� ���Զ�ȡ������
        */
        in.close();
    }

    //��[��׼������] ��װ��Ϊ [�ַ���]
    private void method3() throws IOException {
        System.out.println("�ѵ��÷�����");
        //������׼������
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        //ʹ�÷�װ�ú�� �ַ��� ��ȡ����
        //����
        /*�����ַ���ȡ
        int by;
        while ((by = isr.read()) != -1) {
            System.out.print((char) by);
        }*/
        //�ַ������ȡ
        char[] array = new char[1024];
        int len;
        while ( (len = isr.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }
        //�ͷ���Դ
        isr.close();
    }

    //��װΪ�ַ�����������
    public void method4() throws IOException {
        System.out.println("�ѵ��÷�����");
        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);
        // ������д
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //ʹ������ķ�����ȡ ���ж�ȡ
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }

    //�������͸�ʽ��Scanner��
    public void method5() throws IOException {
        System.out.println("�ѵ��÷�����");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //�����ȡ������Ϊ��Ҫ����������
        int num = Integer.parseInt(br.readLine());
        System.out.println("����Ҫʹ��ת������ ��"+num);
        br.close();
        //��������ת�����鷳��
        /*
        System.out.println("����Java�ṩScanner���װ�ľ���System.in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("===");
        int abc = scanner.nextInt();
        System.out.println(abc);
        */


    }

}
```





### ��׼�����

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336088557106.png)

```java
package A1_MyJava.����֪ʶ.IO��.���������.��׼���������.��׼�����;

import java.io.PrintStream;

// public static final PrintStream out : ��׼�����
public class StandardPrintStream {

    public static void main(String[] args) {
        //����ֵ����Ϊ: PrintStream
        PrintStream ps = System.out;
        //PrintStream�̳���OutputStream
        //���������кܶ෽�����������������
        ps.println("�ַ���");
        ps.println(521);
        ps.println(true);
        ps.println('��');
        ps.print(123);
        ps.print("Go");

        //ֱ��ʱʹ�ã�
        System.out.println("�����System.out.println()");
        System.out.println();
        //System.out.print(); //��lnȥ�����Ų����ᱨ����Ϊû�и÷���
    }
}
```



## ��ӡ��

### �ֽڴ�ӡ�� PrintStream

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-16336092207808.png)

```java
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream
            			("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\�ֽڴ�ӡ��\\�ļ�.txt");
        //ʹ�÷���
        ps.write(97);//a     //write�����ַ���,�����ַ�,byte����,byte����һ����
        ps.println();  //����
        ps.print(97);  //97    //print / println ���з���||д���������ʲô,д��ȥ�����ݾ���ʲô
        ps.println();
        ps.println("����д��");

        //��Ҫ�ͷ���Դ
        ps.close();
    }

}
```





### �ַ���ӡ�� PrintWriter

![img](D:\Դ����\img\MDimg\img-16336092866979.png)

```java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
�ַ���ӡ�����е��������췽��
        PrintWriter(String fileName)
            ʹ��ָ�����ļ�������һ���µ�PrintWriter,�����Զ�ִ��ˢ��

        PrintWriter(Writer out,boolean autoFlush)
            ����һ���µ�PrintWriter
            -- out: �ַ�������
            -- autoFlush: һ������ֵ�����Ϊtrue��
                          ��println,printf,format
                          ������ˢ�����������
*/
public class TestPrintWriter {

    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName) ʹ��ָ�����ļ�������һ���µ�PrintWriter,�����Զ�ִ��ˢ��
        PrintWriter rw = new PrintWriter("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\�ַ���ӡ��\\�ļ�.txt");
        rw.write(97); //ʹ��write���Ե����ַ�д�� ����char����д��
        //��Ҫˢ��
        rw.flush();//��Ҫˢ��������
        rw.println();
        rw.println("���ν����꣡");
        rw.flush();
        rw.println("============");
        rw.flush();

        //�ͷ���Դ
        rw.close();

/*
		   PrintWriter(Writer out,boolean autoFlush)
            ����һ���µ�PrintWriter
                -- out: �ַ�������
                -- autoFlush: һ������ֵ�����Ϊtrue����println,printf,format������ˢ�����������
*/
        PrintWriter rwAuto = new PrintWriter(
                new FileWriter("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\�ַ���ӡ��\\�ļ�.txt")
                ,true);//����Ϊtrue
        //ʹ��println printf format ���Զ�ˢ��
        rwAuto.println("���������");
        rwAuto.print("����");
        rwAuto.flush();
        rwAuto.printf("����");
        rwAuto.println();
        rwAuto.format("���д��");

        //�ͷ���Դ
        rwAuto.close();

    }

}
```

### ��ӡ������

```java
import java.io.*;

public class PrintWriterCopy {

    public static void main(String[] args) throws IOException{

        //�ַ�������
        method1();

        //�ַ���ӡ���Ľ�
        method2();


    }



    private static void method1() throws IOException {
        //�����ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\PrintWriterCopy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\NewCopy001.txt"));
        //��д����
        String str;
        while ( (str=br.readLine())!= null ){
            bw.write(str); //д������
            bw.newLine();  //����
            bw.flush();    //ˢ��
        }

        //����ͷ���Դ
        br.close();
        bw.close();

    }

    private static void method2() throws IOException {
        //ע�⣺��ӡ��ֻ����д���ݣ��������ȡ����

        //��������Ȼʹ���ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\PrintWriterCopy.java"));
        //������ӡ��
        PrintWriter pw = new PrintWriter(new FileWriter("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\NewCopy002.txt")
                                         , true);//�ڶ�������Ϊtrue
        //��д����
        String str;
        while ( (str = br.readLine())!= null ){
            pw.println(str);//������д�� ���� ˢ��
        }

        //�ͷ���Դ
        br.close();
        pw.close();

    }
}

```





## �������л���

### ����

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360938556610.png)



### �������л��� ObjectOutputStream

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360945961311.png)

```java
/*
�������л�����ObjectOutputStream
        -- ��Java�����ԭʼ�������ͺ�ͼ��д��OutputStream������ʹ��ObjectInputStream��ȡ(�ع�)����
           ����ͨ��ʹ�������ļ���ʵ�ֶ���ĳ־ô洢��
           ������������׽����������������һ�������ϻ���һ���������ع�����

���췽����
        -- ObjectOutputStream(OutputStream): ����һ��д��ָ����OutputStream��ObjectOutputStream

���л�����ķ�����
        -- void writeObject(Object obj): ��ָ���Ķ���д��ObjectOutputStream

*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {

        //method1();//���ֱ�����
        /*
        �쳣��: NotSerializableException
               -- ��ʵ����Ҫ�������л��ӿ�ʱ���׳����쳣��
                  ���л�����ʱ��ʵ��������׳����쳣������Ӧ��Ϊ������ơ�
                  ������ʵ�ֵĽӿڣ� Serializable

        ʵ�ֽӿ�: Serializable
                 -- ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�
                    δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
                    �����л�������������ͱ����ǿ����л��ġ�
                    ���л��ӿ�û�з������ֶΣ������ڱ�ʶ�����л������塣
                    ......

        ���ԣ�  Ҫ�����л��������,����������ͱ���ʵ��Serializable�ӿ�,������޷����л�����Ķ���
        ����Ϊ�� Serializable�ӿ�û����Ҫʵ�ֵķ���,����ʵ�֡�ֻ��˵������Ķ����ܱ�ʵ�������ѡ�

        */

        method2();
        /*������:
             ?? sr gA1_MyJava.基�?�知识.IO�?.特殊操作�?.对象序列反序列化�?.A1_对象序列化流.Student2u
             �bXe�� I ageL namet Ljava/lang/String;xp   t 	尴尬�?

         ����������ȫ���Ķ���,���Ƿ����л����ܡ�
        */

    }

    public static void method1() throws IOException {
        //�����������л���
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A1_�������л���\\�������л�.txt"));
        //�������л���Ҫ�ж����,��������
        Student1 stu = new Student1("���ν�", 20);

        //�������л��ķ���
        oos.writeObject(stu);

        //������Ҫ�ͷ���Դ
        oos.close();
    }

    public static void method2()throws IOException{
        //�����������л���
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A1_�������л���\\�������л�.txt"));
        //�������л���Ҫ�ж����,��������
        Student2 stu = new Student2("���ν�", 20);

        //�������л��ķ���
        oos.writeObject(stu);

        //������Ҫ�ͷ���Դ
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
//ʵ��Serializable�ӿ�
import java.io.Serializable;
public class Student2 implements Serializable/*ʵ�ָýӿں����Ķ����ܱ����л�*/ {

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



### �������л��� ObjectInputStream

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/img-163360972468112.png)

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //���������л������󡣹��췽��:ObjectInputSteam(InputSteam in): ������ָ����InputSteam��ȡ��ObjectStream
        ObjectInputStream ois = 
            new ObjectInputStream(
            new FileInputStream
            	("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A1_�������л���\\�������л�.txt"));

        //ʹ�÷����л����ķ����������л�����ķ���:Object readObject(): ��ObjectInputStream��ȡһ������,����ֵ��һ������
        Object oStu = ois.readObject();//�׳��쳣��ClassNotFoundException
        Student2 stu = (Student2) oStu;//����ת��ΪStudent2

        //�ͷ���Դ
        ois.close();

        //�����ö���
        System.out.println("����: "+stu.getName()+", ����: "+stu.getAge());

    }

}

```



### �������л������������� �� ��׼��

#### ��������

![ img ](https://gitee.com/embarrassing-sauce/my-code/raw/master/img/MDimg/��������-163360990564813.png)



#### �Ƚϱ�׼�����л�    �ϴ���

```java
import java.io.*;

public class TestObjectStudent {

    public static void main(String[] args) {
        //write();
        read();
    }

    //�������л�
    public static void write() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A3_�������л����������׼\\���л��ļ�.txt"));) {
            //�ȴ�������
            Student stu = new Student("���ν�", 20, 202020);
            //�������л�
            oos.writeObject(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //�������л�
    public static void read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A3_�������л����������׼\\���л��ļ�.txt"))) {
            //�����л�����
            Object oStu = ois.readObject();//���ﱨ�Ĳ���IOException����
            //�����ö���
            Student stu = (Student) oStu;//����ת��
            //��ӡ��������
            if (stu.getID() == 0 ){
                System.out.println("����: " + stu.getName() + ", ����: " + stu.getAge() + ", ѧ��: �޷��鿴");
            }else {
                System.out.println("����: " + stu.getName() + ", ����: " + stu.getAge() + ", ѧ��: " + stu.getID());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

//==========================================================================
//==========================================================================

import java.io.Serializable;

//�Ƚϱ�׼��д����
public class Student implements Serializable/*1: ʵ��Serializable�ӿ�*/ {
    //2: ���������������һ��serialVersionUID
         //--������ ��̬�� final���� long���� ������serialVersionUID
    private static final long serialVersionUID = 42L;

    //��Ա����
    private String name;
    private int age;
    //3: ����������л��ó�Ա����ʹ��transient����
    private transient int ID = 0;

    //4:Ҫ�벻����,�����пɷ��ʵ��޲ι��췽����
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

    //��дtoString()����

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





## �ʼ�����

### [ @�ʼ����� ](https://gitee.com/embarrassing-sauce/my-code/tree/master/src/A1_MyJava/����֪ʶ/IO��)




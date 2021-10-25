# Lambda���ʽ && ����ʽ�ӿڸ�ϰ

![Lambda���ʽ](D:\Դ����\img\MDimg\Lambda���ʽ-16351478465551.png)



## Lambda���ʽ #��ʽ

### ͼƬ

![��������Lambda](D:\Դ����\img\MDimg\��������Lambda.png)



![Lambda���ʽ��ʽ](D:\Դ����\img\MDimg\Lambda���ʽ��ʽ.png)

### ����

```java
public class TestLambda {
    public static void main(String[] args) {
        //��ʽһ:
        RunnableImpl runImpl = new RunnableImpl();
        Thread t = new Thread(runImpl);
        t.start();

        //��ʽ��: ͨ�������ڲ���Ľ�
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��ʽ��: ���̳߳���������");
            }
        }).start();

        //��ʽ��: ͨ��Lambda���ʽ�Ľ�
        new Thread(() -> {
            System.out.println("��ʽ��: ���̳߳���������");
        }).start();
    }
}

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("��ʽһ: ���̳߳���������");
    }
}

```



========================================================================



## Lambda���ʽ #ʹ��ǰ��

### ͼƬ

![Lambda���ʽʹ��ǰ��](D:\Դ����\img\MDimg\Lambda���ʽʹ��ǰ��.png)

### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A3_Lambdaʹ��ǰ��;

public class RunLambda {

    public static void main(String[] args) {

        String str1 = "ʹ�������ڲ������";
        String str2 = "ʹ��Lambda���ʽ���";
        int len1 = 666;

        //ʹ�������ڲ���
        me(new MyInterface() {
            @Override
            public int method(String str, int lendX, int lendY) {
                System.out.print(str + "\t");
                System.out.println(lendX + lendY);//���
                return lendX + lendY;
            }
        }, str1, len1);

        System.out.println("=========================");

        //ʹ��Lambda���ʽ
        me((/*String*/ str,/*int*/ meLen,/*int*/ lenY) -> {
            //���������ǿ���ʡ�Ե�,��������������,����ֻʡ��һ��,Ҫʡ�Ծ�Ҫʡ���꣡
            System.out.print(str + "\t");
            System.out.println(meLen + lenY);//���
            System.out.println("Lambda���ʽ��Ϊ��࣡");
            return meLen + lenY;
        }, str2, len1);
    }

    //�÷�����һ�������ǽӿڣ��ýӿ���ֻ��һ�����󷽷���
    public static void me(MyInterface e, String str, int len2) {
        //�÷������õĳ��󷽷���
        int num = e.method(str, len2, 6000);

        //���Է���ֵ��
        System.out.println("����ֵ:" + num);
    }
}
//========================================================================================

public interface MyInterface {
    //Lambdaʹ��ǰ����
    //1.�Ǹ��ӿ�
    //2.�ӿ��н���һ�����󷽷�
    public abstract int method(String str, int lenX, int lenY);
}

```





========================================================================





## Lambda���ʽ �Ż�&&�������

### ͼƬ

![Lambda���ʽʡ�Թ���](D:\Դ����\img\MDimg\Lambda���ʽʡ�Թ���.png)



### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A4_���������Lambda���ʽ;

public class RunLambda {

    //Lambda���ʽ��������Ľӿڻ򷽷�
    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        me((String ssss) -> {
            System.out.println(ssss + 4);
        });

        //����ʡ�Բ�������
        me((sss) -> {
            System.out.println(sss + 3);
        });

        //��������б�ֻ��һ��, ������ֱ��ʡ�� "()" ֱ�� ����->{ }
        me(ss -> {
            System.out.println(ss + 2);
        });

        //���{�����} �� ֻ��һ�����,������ʡ�� ������";"  �� "{"   "}"
        me(s -> System.out.println(s + 1));

        //================================================
        //ǰ��1: ���{�����} �� ֻ��һ�����,������ʡ�� ������";"  �� "{"   "}"
        //ǰ��2: ��������Ǹ�����ֵ�Ļ�, returnҲҪʡ��, ��ʡ�Բ���
        System.out.println( rt( (x,y)-> x + y )  /*ʡ����return*/  );

    }

    private static void me(MyInterface impl) {
        impl.method("���������");
    }

    private static int rt(RutInterface impl){
        return impl.method(666, 666000);
    }
    
}

//=========================================================================================
public interface MyInterface {
    void method(String str);
}
//=========================================================================================
public interface RutInterface {
    int method(int x,int y);
}
```





========================================================================





## Lambda���ʽ ע������

### ͼƬ

![Lambda���ʽע������](D:\Դ����\img\MDimg\Lambda���ʽע������.png)



### ����

```java
public class RunLambdaT {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ����me1
        me1(() -> {
            System.out.println("Lambda���ʽ���");
        });

        //Lambda���ʽ������
        me1(() -> System.out.println("Lambda���ʽ���"));

        //�������me2, m2�Ĳ����ӿ��У����������󷽷����ᱨ��
//        me2( ()-> System.out.println("����ʹ��Lambda���ʽ") );

        //�����������ʻ����������Ƶ���Lambda��Ӧ�Ľӿ�
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("���������߳�01");
            }
        }).start();//�������߳�

        //()-> System.out.println("��������");
        Runnable r = () -> System.out.println("���������߳�02");
        new Thread(r).start();

        //��
        new Thread(() -> System.out.println("���������߳�03")).start();


    }

    //ֻ��һ�����󷽷��Ľӿ� ��Ϊ ��������
    private static void me1(MyInterfaceMe1 e) {
        e.method();
    }

    //���������󷽷��Ľӿ� ��Ϊ ��������
    private static void me2(MyInterfaceMe2s e) {
        e.method1();
    }
}

//=========================================================================================

public interface MyInterfaceMe1 {
    void method();
}

//=========================================================================================

public interface MyInterfaceMe2s {
    void method1();
    void method2();
}

```





========================================================================





## �������� #��ʽ

### ͼƬ

![��������](D:\Դ����\img\MDimg\��������.png)

![�����෽��](D:\Դ����\img\MDimg\�����෽��.png)

![�������ʵ������](D:\Դ����\img\MDimg\�������ʵ������.png)

![�������ʵ������ע������](D:\Դ����\img\MDimg\�������ʵ������ע������.png)

### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A6_���鷽������;


public class RunMethod {

    public String string = "�����ɰ���������";

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        method1(e -> System.out.println(e));
        System.out.println("=================");

        //����ʹ�÷�������
        method1(System.out::println);//ʹ�÷������á�
        System.out.println("=================");

        //ͨ����ľ�̬�����ĵ��� ʵ�ַ�������
        method1(MethodInterface01::me);//�Զ�ʶ��������� String
        System.out.println("=================");
        method1(RunMethod::me);//�Զ�ʶ��������� String
        System.out.println("=================");

        //ͨ��������øö��󷽷� ʵ�ַ�������
        Me meObj = new Me();
        method1(meObj::method);
        System.out.println("=================");

        //String����һ����̬����substring �����б���(String,int,int)
        subString((s,i,eI)->s.substring(i,eI));
        System.out.println("=================");
        subString(String::substring);
        //ע��/����:
        //Lambda���ʽ�����ʵ�����������ʱ��
        //��һ��������Ϊ������
        //����Ĳ���ȫ����˳�򴫵ݸ��÷�����Ϊ������
        System.out.println("=================");



    }

    private static void subString(MySubString e){
        String str = e.meSubString("��һ�����������߰�", 3, 7);
        System.out.println(str);
    }

    private static void method1(MethodInterface01 e) {
        e.method("���������");
    }


    private static int method2(MethodInterface02 e) {
        int i = e.method(6666);
        return i;
    }


    //�����е��������ط���
    public static void me(String str) {
        System.out.println("me���� ��������: String :" + str);
        System.out.println("RunMethod �ڲ�Ĭ�Ϸ�����");
    }

    public static void me(int a) {
        System.out.println("me���� ��������: int :" + a);
        System.out.println("RunMethod �ڲ�Ĭ�Ϸ�����");
    }

}
```
MethodInterface01

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A6_���鷽������;

public interface MethodInterface01 {
    void method(String s);//���󷽷�
    static void me(String str){
        System.out.println("me���� ��������: String :" + str);
        System.out.println("MethodInterface01 �ڲ�Ĭ�Ϸ�����");
    }
    static void me(int a){
        System.out.println("me���� ��������: int :" + a);
        System.out.println("MethodInterface01 �ڲ�Ĭ�Ϸ�����");
    }
}
```

MethodInterface02

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A6_���鷽������;

public interface MethodInterface02 {
    int method(int a);
}
```

MySubString

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A6_���鷽������;

public interface MySubString {
    String meSubString(String str,int index,int endIndex);
}
```

Me

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A6_���鷽������;

public class Me {
    public void method(String s){
        System.out.println("Me��, ���String:" + s);
    }
    public void method(int s){
        System.out.println("Me��, ���int:" + s);
    }
}
```





========================================================================





## ���ù�����

### ͼƬ

![���ù�����](D:\Դ����\img\MDimg\���ù�����.png)

### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A7_���ù�����;

public class RunStudent {

    public static void main(String[] args) {

        //ͨ��Lambda���ʽ����
        /*useStudent( (name,age)->{
            Student stu = new Student(name,age);
            return stu;
        } );*/
        useStudent((name,age)->new Student(name,age));

        System.out.println("====================");

        //ͨ��Lambda���ʽ�����ù�����
        useStudent(Student::new);
        //Lambda���ʽ�������������ʱ��, ������ʽ����ȫ�����ݸ��������Ĳ���
        //����Student ����Student ��������˳�򴫸�public Student(String name,int age){//...}

    }


    private static void useStudent(StudentInterface e) {
        Student stu = e.builder("���ν�", 20);
        System.out.println("����: " + stu.getName() + ", ����: " + stu.getAge());
    }

}
```


```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A7_���ù�����;

public interface StudentInterface {
    
    Student builder(String name,int age);
    
}
```



```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A7_���ù�����;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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





========================================================================





## ����ʽ�ӿ�

### ͼƬ

![����ʽ�ӿ�](D:\Դ����\img\MDimg\����ʽ�ӿ�.png)

### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A8_����ʽ�ӿ�;

public class RunFunctional {

    public static void main(String[] args) {
        String str = "��������������һ��--���ܡ�";

        //ͨ��Lambda���ʽ���� ����ʽ�ӿڶ���
        MyInterface mi1 = () -> System.out.println(str);

        //���÷���
        mi1.method();

    }
}
```

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A8_����ʽ�ӿ�;

@FunctionalInterface//����ʽ�ӿڵ�ע�⣡
public interface MyInterface {

    void method();

    //void method1(); //ע�ⱨ��

}
```





========================================================================





## ����ʽ�ӿ� ʹ��

### ����ʽ�ӿ���Ϊ�����Ĳ���

#### ͼƬ

![����ʽ�ӿ�������](D:\Դ����\img\MDimg\����ʽ�ӿ�������.png)

#### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A9_����ʽ�ӿ���Ϊ�����Ĳ���;

public class RunThread {

    public static void main(String[] args) {

        //ʹ�������ڲ���ķ�ʽ
        useThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+": �߳�����");
            }
        });

        //ʹ��Lambda���ʽ ��Ϊ����
        useThread( ()-> System.out.println(Thread.currentThread().getName()+": �߳�����"));

        //���֮ǰ��ѧ����, ֻ�ǻ�����˵�����ѣ�����

    }

    private static void useThread(Runnable r){
        new Thread(r).start();
    }

}
```



### ����ʽ�ӿ���Ϊ�����ķ���ֵ

#### ͼƬ

![����ʽ�ӿ�������ֵ](D:\Դ����\img\MDimg\����ʽ�ӿ�������ֵ.png)

#### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A10_����ʽ�ӿ���Ϊ�����ķ���ֵ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunList {

    public static void main(String[] args) {
        //��������
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbbb");
        list.add("d");
        list.add("cc");

        //����ǰ�ļ���
        System.out.println("����ǰ�ļ���:" + list);

        //��Ȼ�����ļ���
        Collections.sort(list);
        System.out.println("��Ȼ�����ļ���:" + list);

        //ʹ�ñȽ��������ļ���
        Collections.sort(list, getComparator02());
        System.out.println("�Ƚ��������ļ���:" + list);


    }


    //Comparator�ӿ��Ǻ���ʽ�ӿ�:  @FunctionalInterface

    //ʹ�������ڲ���
    private static Comparator<String> getComparator01() {
        //�����ڲ�����Ϊ����ֵ
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
    }

    //ʹ��Lambda���ʽ��Ϊ��������ֵ
    private static Comparator<String> getComparator02() {
        //compare(String o1,String o2)
        return (o1, o2) -> o1.length() - o2.length();
    }

}
```



## ////////////////////////





========================================================================





## ���ú���ʽ�ӿ�

![image-20211025111730019](D:\Դ����\img\MDimg\image-20211025111730019.png)

### Supplier�ӿ�

#### ͼƬ

![Supplier](D:\Դ����\img\MDimg\Supplier.png)

#### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Supplier�ӿ�;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ���е���
//        getString( () -> {
//            return "Supplier�ӿ�";
//        } );

        //Lambda���ʽ��д
        String str = getString(() -> "Supplier����ʽ�ӿ�");
        System.out.println(str);

        //Lambda���ʽ��ȡ
        Integer anInt = getInt(() -> 666);
        System.out.println(anInt);


    }

    //ʹ��Supplier�ӿ�, ��ȡһ���ַ���
    private static String getString(Supplier<String> sup){
        return sup.get(); //Supplier������һ��get()���� , ���ڷ��ط�������
    }

    //ʹ��Supplier�ӿ�, ��ȡһ��Integer
    private static Integer getInt(Supplier<Integer> sup){
        return sup.get(); //Supplier������һ��get()���� , ���ڷ��ط�������
    }

}
```



### Consumer�ӿ�

#### ͼƬ

![Consumer](D:\Դ����\img\MDimg\Consumer.png)

#### ����

```JAVA
package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Consumer�ӿ�;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        setAccept( "Saber",(s)-> System.out.println(s) );
        //ʹ��Lambda ʹ�÷������� ��д��
        setAccept("GanGa",System.out::println);

        System.out.println("======================");

        //������ ����
        /*setAccept("���ν�",s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });*/
        setAccept("���ν�",(s) -> System.out.println(new StringBuilder(s).reverse().toString()) );

    }

    private static void setAccept(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

}
```



### Predicate

#### ͼƬ

![Predicate](D:\Դ����\img\MDimg\Predicate.png)

#### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Predicate�ӿ�;

import java.util.function.Predicate;
/*
    boolean    test(T t) �ڸ����Ĳ������������ν�ʡ�

    //�߼��ж� ��
    default Predicate<T> negate() ���ر�ʾ��ν�ʵ��߼��񶨵�ν�ʡ�

    //�߼��ж� ��
    default Predicate<T> and(Predicate<? super T> other)
          ����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼�AND��

    //�߼��ж� ��
    default Predicate<T> or(Predicate<? super T> other)
            ����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼���

*/

public class TestPredicate {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        boolean p1 = pre1("���������", (s) -> {
            return s.length() >= 6;
        });
        System.out.println(p1);//false

        //Lambda���ʽ ��д
        p1 = pre1("һ�㶼������", s -> s.length() >= 6);
        System.out.println(p1);//true

        //=======================================================

        boolean p2 = pre2("һ�㶼������", (s -> s.length() >= 6));
        System.out.println(p2);//false

        //=======================================================

        boolean p3 = pre3("һ�㶼������", (s) -> s.length() < 4, s -> s.length() < 8);
        System.out.println(p3);//false

        //=======================================================

        boolean p4 = pre4("һ�㶼������", (s) -> s.length() < 4, s -> s.length() < 8);
        System.out.println(p4);//true

    }

    //Test �ڸ����Ĳ������������ν�ʡ�
    private static boolean pre1(String str, Predicate<String> e) {
        //boolean  test(T t) �ڸ����Ĳ������������ν�ʡ�
        return e.test(str);
    }

    //negate �߼���
    private static boolean pre2(String str, Predicate<String> e) {
        //return !e.test(str);
        //default Predicate<T> negate() ���ر�ʾ��ν�ʵ��߼��񶨵�ν�ʡ�
        return e.negate().test(str);
        //ʹ�÷��� ֻ�Ƿ� ��Ҫ����test �ȵ���negate negate�ٵ���test����
    }

    //and �߼���
    private static boolean pre3(String str, Predicate<String> e1, Predicate<String> e2) {
        //boolean b1 = e1.test(str);
        //boolean b2 = e2.test(str);
        //return b1 && b2;

        //default Predicate<T> and(Predicate<? super T> other)
        //����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼�AND��
        return e1.and(e2).test(str);
    }

    //or �߼���
    private static boolean pre4(String str,Predicate<String> e1,Predicate<String> e2){
        //boolean b1 = e1.test(str);
        //boolean b2 = e2.test(str);
        //return b1 && b2;

        //default Predicate<T> and(Predicate<? super T> other)
        //����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼�AND��
        return e1.or(e2).test(str);
    }

}
```



### Function�ӿ�

#### ͼƬ

![Function](D:\Դ����\img\MDimg\Function.png)

#### ����

```java
package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Function�ӿ�;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        convert("4399", (String s) -> {
            return Integer.parseInt(s);
        });
        //�Ż�
        convert("3213", s -> Integer.parseInt(s));
        //�ٴ��Ż� �෽������
        convert("6666", Integer::parseInt);

        System.out.println("===================================");

        convert(4567, i -> String.valueOf(i + 8));

        System.out.println("===================================");

        converts("8838", Integer::parseInt, s -> String.valueOf(s + 10));

    }

    //����һ������,��һ���ַ���תΪint����, �ڿ���̨���
    private static void convert(String s, Function<String, Integer> function) {
        int i = function.apply(s);
        //����ֻ�ǵ���applyת������
        //����ʵ��ʵ��Lambda���ʽ�����������ġ�
        System.out.println(i);
    }

    //����һ������,��һ��int���͵����ݼ���һ������֮��, תΪ�ַ����ڿ���̨���
    private static void convert(int i, Function<Integer, String> function) {
        String str = function.apply(i);
        //����ֻ�ǵ���applyת������
        //����ʵ��ʵ��Lambda���ʽ�����������ġ�
        System.out.println(str);
    }

    //����һ������,��һ���ַ���תΪint����, int���͵����ݼ���һ������֮����תΪ�ַ���, �ڿ���̨���
    private static void converts(String str, Function<String, Integer> e1, Function<Integer, String> e2) {
        int i = e1.apply(str);
        String newStr = e2.apply(i);
        //����ʵ��ʵ��Lambda���ʽ�����������ġ�
        System.out.println("newString:"+newStr);
    }


}
```





## ���ʸ�ϰ

### ����

|          ����           |      ����//����      |
| :---------------------: | :------------------: |
|                         |                      |
|       **Lambda**        |        **��**         |
| **FunctionalInterface** |  **����ʽ�ӿ�ע��**  |
|     **Comparable**      |     **��Ȼ����**     |
|     **Comparator**      |    **�Ƚ�������**    |
|                         |                      |
|      **Supplier**       |   **��Ӧ�� �ӿ�**    |
|                         |                      |
|      **Consumer**       |   **������ �ӿ�**    |
|       **accept**        |       **����**       |
|                         |                      |
|      **Predicate**      |  **ν���ж� �ӿ�**   |
|        **test**         | **���� // �����ж�** |
|       **negate**        |   **ȡ�� // ���**   |
|      **and / or**       | **�߼��� / �߼���**  |
|                         |                      |
|      **Function**       |  **����ת�� �ӿ�**   |
|        **apply**        |       **����**       |
|                         |                      |




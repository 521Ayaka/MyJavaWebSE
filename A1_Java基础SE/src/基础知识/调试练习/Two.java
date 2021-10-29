package 基础知识.调试练习;


import java.util.Arrays;
import java.util.Scanner;
//外部类
public class Two implements Comparable<Two>{
//输入接口后报错，鼠标点击红线，ALT+回车
    //implements Comparable<Two> 方法，让实体类实现内部比较器接口

    private String name;//名字
    private double difficulty;//难度
    private String code;//职业

    public void show(){
        System.out.println("真正的大师，永远都怀着一颗学徒的心");
    }

    @Override
    public int compareTo(Two o) {
        //使用基本数据类型double 的包装类Double的compare方法可以比较俩个double类型的数据，返回int类型
        return Double.compare(this.difficulty,o.difficulty);
    }
    //ALT+insert键 选toString()方法，里面，Ctrl+A全选即可
    @Override
    public String toString() {
        //“”双引号内的内容根据自己习惯进行修改
        return "\n" +
                "英雄:" + name  +
                ", 操作系数:" + difficulty +
                ", 职业:" + code  +
                ';';
    }

    //ALT+insert键 选Getter and Setter方法 里面，Ctrl+A全选即可
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return difficulty;
    }
    public void setAge(double age) {
        this.difficulty = age;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    //静态内部类
    public static class One{
        //主方法写在内部类中
        public static void main(String[] args) {
            //引入Scanner
            Scanner sc=new Scanner(System.in);
            System.out.print("请输入数组长度：");
            int a=sc.nextInt();
            //创建一个外部类的数组，定义为ts数组
            Two[] ts=new Two[a];

            for (int i = 0; i <ts.length ; i++) {
                //内部类调用外部类的成员
                //新（new）创建一个对象
                Two t=new Two();
                System.out.print("输入第"+(i+1)+"个英雄名字：");
                t.name=sc.next();
                System.out.print("操作难度：");
                t.difficulty=sc.nextDouble();
                System.out.print("职业：");
                t.code=sc.next();
                //将输入的数据装入外部类ts数组
                ts[i]=t;
            }
            System.out.println("-----------------------------");

            //将输入的数据，以数组的方式一个一个输出
            System.out.print("英雄名单：");
            for (int i = 0; i <ts.length ; i++) {
                System.out.print(ts[i]);
                //为了美化输出，最后一组数据输出后自动转行
                if (i==ts.length-1){
                    System.out.println();
                }
            }
            System.out.println("-----------------------------");

            System.out.print("根据操作难度排序：");
            //此处传入比较的 数组 和 内部比较器对象
            Arrays.sort(ts);
            //将对象数组转换为字符串输出
            System.out.println(Arrays.toString(ts));
            System.out.println("-----------------------------");

            //调用外部类内的show()方法
            Two t=new Two();
            t.show();
        }
    }
}

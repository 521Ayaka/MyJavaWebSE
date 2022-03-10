package 基础知识.集合.Collection.Set.Set集合.哈希值;

/*
int i = Object.hashCode();

[注意]:

数字是用不了hashCode()方法的。

在默认情况下, hashCode()方法没有被覆盖重写的情况下:
1. 不同对象的哈希值是不同的。
2. 对于字符串来说，stu1对象中的字符串[何雪聪]和str字符串的[何雪聪]哈希值是相同的。
3. 不同的字符串的哈希值也有可能是相同的！

*/
public class Run_HashCode {

    public static void main(String[] args) {

        //创建学生对象。
        Student stu1 = new Student("何雪聪", 20);
        int iCode1 = stu1.hashCode();
        int iCode2 = stu1.hashCode();
        if (iCode1 == iCode2) {
            System.out.println("同一个对象多次调用哈希值相同。");
        }

        //创建第二个学生对象
        Student stu2 = new Student("何雪聪", 20);
        int jCode1 = stu2.hashCode();
        int jCode2 = stu2.hashCode();
        if (jCode1 == jCode2) {
            System.out.println("同一个对象多次调用哈希值相同。");
        }
        System.out.println("========================");


        //在默认情况下，不同对象的哈希值是不同的
        //非特殊情况下，重写hashCode()方法。
        if (iCode1 == jCode1) {
            System.out.println("重写了hashCode()方法");
        } else if (iCode1 != jCode1) {
            System.out.println("不同对象的哈希值是不同的");
        }
        System.out.println("========================");
        System.out.println("字符串的哈希值");
        System.out.println("亚索: " + "亚索".hashCode());

        System.out.println("========================");
        System.out.println("重地: "+"重地".hashCode());
        System.out.println("通话: "+"通话".hashCode());
        if ("重地".hashCode() == "通话".hashCode()){
            System.out.println("不同的字符串的哈希值可能相同！");
        }

        System.out.println("========================");
        //对象中的字符串和常量池中的字符串
        String str = "何雪聪";
        System.out.println("何雪聪: " + str.hashCode());
        System.out.println("stu1对象的name: " + stu1.getName().hashCode());
        if (stu1.getName().hashCode() == "何雪聪".hashCode()){
            System.out.println("stu对象中的字符串[何雪聪]和str字符串的[何雪聪]哈希值相同。");
        }

        int i = 1;

    }

}

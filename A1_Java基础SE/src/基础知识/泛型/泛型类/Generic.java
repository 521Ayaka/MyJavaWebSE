package 基础知识.泛型.泛型类;
/*
* 测试类
* */
public class Generic {

    public static void main(String[] args) {

        Student stu = new Student();

        //姓名
        stu.setName("无极大师");
        System.out.println(stu.getName());
        //年龄
        stu.setAge(10);
        //stu.setAge("十岁");
        System.out.println(stu.getAge());

        System.out.println("==========");

        //使用泛型类
        GenericLei<Integer> gan1 = new GenericLei<>();
        gan1.setT(10);
        System.out.println(gan1.getT());

        GenericLei<String> gan2 = new GenericLei<>();
        gan2.setT("十岁");
        System.out.println(gan2.getT());

        GenericLei<Boolean> gan3 = new GenericLei<>();
        gan3.setT(true);
        System.out.println(gan3.getT());


    }

}

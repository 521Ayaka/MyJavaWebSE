package A1_MyJava.基础知识.泛型.泛型方法;

//测试类
public class Generic_Run {

    public static void main(String[] args) {

        //使用普通类
        Ordinary_Lei ordinaryLei = new Ordinary_Lei();
        ordinaryLei.method1("亚索哥哥");
        ordinaryLei.method2(18);
        ordinaryLei.method3(true);
        //ordinaryLei.method2("十八岁");
        // 非int无法添加

        System.out.println("========================");

        //使用泛型类
        Generic_Lei<String> gen1 = new Generic_Lei<>();
        gen1.method("永恩弟弟");

        Generic_Lei<Integer> gen2 = new Generic_Lei<>();
        gen2.method(17);

        Generic_Lei<Boolean> gen3 = new Generic_Lei<>();
        gen3.method(true);

        System.out.println("========================");

        //使用泛型方法
        Generic_Method generic = new Generic_Method();
        generic.method("寒冰射手");
        generic.method(9);
        generic.method(true);
        generic.method(66.66);

    }

}

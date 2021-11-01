package 基础知识.反射.A4_反射获取构造器方法.练习2;
/*

使用这个构造函数:
private Student(String name){
        this.name = name;
    }

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstance02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //创建class对象
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");

        //获取全部构造器参数 并简历结果
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor<?> obj : cons) {
            System.out.println(obj);
        }
        /*
        public 基础知识.反射.A3_获取class类的对象.Student(java.lang.String,int,java.lang.String)
        基础知识.反射.A3_获取class类的对象.Student(java.lang.String,int)
        private 基础知识.反射.A3_获取class类的对象.Student(java.lang.String)
        public 基础知识.反射.A3_获取class类的对象.Student()
        */
        System.out.println("\n======================================================\n");

        //使用 private 基础知识.反射.A3_获取class类的对象.Student(java.lang.String) 构造方法
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //使用 暴力创建
        //public void setAccessible(boolean flag) 取消访问检测
        con.setAccessible(true);


        //创建对象
        Object obj = con.newInstance("尴尬酱");
        System.out.println(obj);
        //发现报错了, 出现访问错误 private构造器


    }


}

package 基础知识.反射.A7_反射完成不可能的事情.A2_越过泛型检测访问原始方法;
/*
    要求
    向ArrayList<Integer> 集合当中添加 [字符串] ,泛型是Integer

*/

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class UseMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //创建ArrayList集合
        ArrayList<Integer> array = new ArrayList<>();

        //获取class对象
        Class<? extends ArrayList> c = array.getClass();

        //反射获取add方法
        Method addMe = c.getDeclaredMethod("add", Object.class);
        //向集合当中添加 字符串
        boolean isAdd = (boolean) addMe.invoke(array, "这就尴尬了");
        System.out.println("是否添加成功" + isAdd +"\n");
        addMe.invoke(array, "可以跳过泛型");
        addMe.invoke(array, "获取原始方法");

        //遍历结果:
        for (Object o: array) {
            System.out.println(o);
        }
        System.out.println(array);
        /*运行结果:

        是否添加成功true

        这就尴尬了
        可以跳过泛型
        获取原始方法
        [这就尴尬了, 可以跳过泛型, 获取原始方法]
        */

    }

}

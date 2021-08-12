package A1_MyJava.基础知识.泛型.泛型概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
泛型: 是JDK5中引入的的特性，它提供了编译时类型安全检测机制，该机制允许在编译是检测到非法的类型
     他的本质是【参数化类型】，也就是说所有操作的数据类型被指定为一个参数。

参数: 一提到参数，最熟悉的就是定义方法是有形参，然后调用此方法时传递实参。

参数化类型: 顾名思义，就是【将类型有原来的具体的类型参数化，然后在[使用/调用]时传入具体的类型】

使用: 这种参数类型可用在【类】、【方法】和【接口】中，分别被称为【泛型类】、【泛型方法】、【泛型接口】

好处: 1. 问题提前化到编译时异常,这样不用在运行时发现，在编译时就可以发现错误，及时修改，否则无法通过编译
     2. 避免了强制转换类型
==================================================================================

泛型定义格式:
-- <类型>:             指定一种类型格式。可以看成形参。
-- <类型1,类型2,...>:   指定多种类型格式。用逗号隔开。
-- 将来具体调用的时候，指定的类型--->实参  实参的类型只能时引用数据类型。

*/
public class Generic {

    public static void main(String[] args) {

        try {
            Collection array = new ArrayList(); //默认Object类型
            array.add("你好");
            array.add("Java");
            array.add("JavaEE");
            array.add(100);

            Iterator itr = array.iterator();
            while (itr.hasNext()){
                String str = (String) itr.next();
                System.out.println(str);
            }
        }catch(ClassCastException e){
            System.out.println("int 100——>String 类转换异常");
        }

        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("你好");
        arrayList.add("Java");
        arrayList.add("JavaEE");
        //arrayList.add(100);//编译时异常
        //问题提前化到编译时异常
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            String str = (String) itr.next();
            System.out.println(str);
        }

    }



}

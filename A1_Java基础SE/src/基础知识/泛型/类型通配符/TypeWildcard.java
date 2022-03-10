package 基础知识.泛型.类型通配符;

import java.util.ArrayList;
import java.util.List;

/*
[类型通配符]:

# 为了表示各种泛型List的父类,可以使用类型通配符
    ## [类型通配符]: <?>
    ## List<?>: 表示元素类型未知的List,它的元素可以匹配任何的类型。
    ## 这种带通配符的List仅表示他的各种泛型List的父类,并不能把元素添加到其中

# 如果说我们不希望List<?>是任何泛型List的父类,只希望它代表某一类泛型List的父类,可以使用类型通配符的上限
    ## [类型通配符上限]: <? extends 类型>
    ## List<? extends Number>: 表示的类型是Number或者其子类类型

# 除了可以指定类型通配符的上限,我们也可以指定类型通配符的下限
    ## [类型通配符下限]: <? super 类型>
    ## List<? super Number>: 它表示的类型是Number或者其父类型

*/
public class TypeWildcard {

    public static void main(String[] args) {

        //类型通配符
        List<?> list2 = new ArrayList<Object>();
        List<?> list3 = new ArrayList<Number>();
        List<?> list1 = new ArrayList<Integer>();

        //使用通配符上限
        //List<? extends Number> list4 = new ArrayList<Object>(); //Object是Number的父类
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        //使用通配符下限
        //List<? super Number> list7 = new ArrayList<Integer>();
        List<? super Number> list8 = new ArrayList<Number>();
        List<? super Number> list9 = new ArrayList<Object>();


    }

}

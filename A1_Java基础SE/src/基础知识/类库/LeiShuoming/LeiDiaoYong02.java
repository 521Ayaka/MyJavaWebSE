package 基础知识.类库.LeiShuoming;

public class LeiDiaoYong02 {

    public static void main(String[] args) {

        //1. 导包：指出需要使用的类，在什么位置。

        //调用成员变量
        Lei02 a = new Lei02();
        System.out.println(a.method(10));
        System.out.println("=====================================================");

        
        //定义一个数组 为调用成员方法提供参数
        String [] array = new String[]{"我在巨龙之巢","一起LOL吧","永远i爱你","尴尬酱"};
        System.out.println("原数组顺序为：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================================================");
        
        //调用成员方法
        System.out.println("反转后的array为：");
        a.arraystostring(array);
        System.out.println("======================================================");
    }
    
}

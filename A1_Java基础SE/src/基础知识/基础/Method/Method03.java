package 基础知识.基础.Method;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同。
 */
public class Method03 {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20)); // false
        System.out.println(isSame(20, 20)); // true
    }

    /*
    三要素：
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a, int b
     */
    public static boolean isSame(int a, int b) {
    
    //这里可以用4种方法来写 这也是我创建Method03的原因！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！

    //=========================================

        /*boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }*/

    //===========================================

        // boolean same = a == b ? true : false;

    //===========================================

        // boolean same = a == b;

    //===========================================

        return a == b;
    
    //===========================================
    }
}
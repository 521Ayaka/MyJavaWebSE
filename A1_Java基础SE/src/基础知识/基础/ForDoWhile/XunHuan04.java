package 基础知识.基础.ForDoWhile;

/*
=========================
do-while循环结构标准格式：

do{
    循环体；
} while（条件判断）;
=========================
扩张格式：

初始化语句;
do {
    循环语句;
    步进语句;
} while(条件语句)；
=========================
*/
public class XunHuan04 {
    public static void main(String[] args){
        for (int i = 1; i<=30; i++ ){
            System.out.println("原谅你啦！起来吧! 地上怪凉的！" + i);
        }
        System.out.println("==================================================================");
    // 使用do-whlie语句
        int x = 1;
        do {
            System.out.println("原谅你啦！起来吧! 地上怪凉的！" + x);
            x++;
        } while ( x <= 30 );
    }
}

package A1_MyJava.基础知识.基础.ForDoWhile;

/*

deadLoop

死循环

*/
public class XunHuan03 { 
    public static void main(String[]args){
        //去掉i++就是死循环了
        for(int i=1; i<=10;){
           System.out.print("尴尬 死循环啦"+i);
        }
        //while 条件改为true 就是死循了
        while(true){
            System.out.println("又是死循环");
        }
        // 重点注意 死循环后面不能再有语句 应为都死循环了
        // System.out.println("又是死循环");  这句就不能写 因为前面个已经死循环了
    }
}

package 基础知识.继承.Extends02;

public class Zi extends Fu {

    int numZi = 20;
    int num = 200;

    public void methodZi() {
        //this调用本类的成员变量
        int num = 30;
        System.out.println(this.num);
    }
}

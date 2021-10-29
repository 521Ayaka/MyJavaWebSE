package 基础知识.继承.Extends03;
/**

 局部变量：         直接写成员变量名
 本类的成员变量：    this.成员变量名
 父类的成员变量：    super.成员变量名

 */
public class Zi extends Fu {

    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num);       //访问本方法的局部变量
        System.out.println(this.num);  //访问本类的成员变量
        System.out.println(super.num); //访问父类的成员变量
    }

}

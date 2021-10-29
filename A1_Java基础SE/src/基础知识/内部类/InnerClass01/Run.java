package 基础知识.内部类.InnerClass01;

public class Run {

    public static void main(String[] args) {

        Wai wai = new Wai();
        wai.methodWai();

        System.out.println("=====================================================");

        //间接使用
        wai.method01();

        System.out.println("=============================");

        //直接使用
        Wai.Nei nei = new Wai().new Nei();
        System.out.println("直接调用"+nei.string);
        nei.methodNei();

        System.out.println("=====================================================");

        //重名变量的调用
        nei.methodNum();


    }

}

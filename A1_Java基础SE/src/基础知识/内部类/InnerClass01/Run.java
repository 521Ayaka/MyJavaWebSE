package ����֪ʶ.�ڲ���.InnerClass01;

public class Run {

    public static void main(String[] args) {

        Wai wai = new Wai();
        wai.methodWai();

        System.out.println("=====================================================");

        //���ʹ��
        wai.method01();

        System.out.println("=============================");

        //ֱ��ʹ��
        Wai.Nei nei = new Wai().new Nei();
        System.out.println("ֱ�ӵ���"+nei.string);
        nei.methodNei();

        System.out.println("=====================================================");

        //���������ĵ���
        nei.methodNum();


    }

}

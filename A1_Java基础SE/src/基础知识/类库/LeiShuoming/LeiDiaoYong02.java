package ����֪ʶ.���.LeiShuoming;

public class LeiDiaoYong02 {

    public static void main(String[] args) {

        //1. ������ָ����Ҫʹ�õ��࣬��ʲôλ�á�

        //���ó�Ա����
        Lei02 a = new Lei02();
        System.out.println(a.method(10));
        System.out.println("=====================================================");

        
        //����һ������ Ϊ���ó�Ա�����ṩ����
        String [] array = new String[]{"���ھ���֮��","һ��LOL��","��Զi����","���ν�"};
        System.out.println("ԭ����˳��Ϊ��");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================================================");
        
        //���ó�Ա����
        System.out.println("��ת���arrayΪ��");
        a.arraystostring(array);
        System.out.println("======================================================");
    }
    
}

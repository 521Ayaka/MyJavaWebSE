package A1_MyJava.����֪ʶ.IO��.File��.File�ݹ�;

/*
����Review�е����⣬ʹ�õݹ�ķ������в���
    �ݹ�������: ʹ�õݹ�ͱ����ȶ���һ������
        ����һ������ f(n) ����ʾ��n���µ�������
        ��ô, �� n-1 ���µ����������� f(n-1)
        ͬ��, �� n-2 ���µ����������� f(n-2)

*/


public class DameNewMethod {

    public static void main(String[] args) {

        //����f(int n)
        System.out.println(f(20));

    }

    //����ֵ �� �������� ����int
    public static int f(int n){
        if (i)
        n = f(n-1)+f(n-2);
        return n;//����ֵ�ǲ�������n
    }

}

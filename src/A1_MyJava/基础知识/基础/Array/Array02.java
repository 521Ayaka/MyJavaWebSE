package A1_MyJava.����֪ʶ.����.Array;

/*
1����������Ԫ�ص�maxֵ����minֵ
2�����鷴ת

*/
public class Array02 {
    public static void main(String[] args) {
        int [] array = new int[]{156,48,864,64,51,665,645,89,49,949165};

        //������array�е�maxֵ      //���÷���arraymax
        System.out.println("����array�е�maxֵΪ��"+arraymax(array));
        System.out.println("=====================================");

        //ͬ�� ������array�е�minֵ  //���÷���arraymin
        System.out.println("����array�е�minֵΪ��"+arraymin(array));
        System.out.println("=====================================");
        
        //�ص㣡��������array����ķ�ת��������  
        System.out.println("ԭ����Ϊ��");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================================");
        System.out.println("��ת�������Ϊ��");
        fanzhuanarray(array);    //���÷ŷ�fanzhuanarray
        System.out.println("���ν�����>.<");
        
    }

    // ������ max
    public static int arraymax(int [] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    //������ min
    public static int arraymin(int [] array){
        int min =array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    //������ ��ת
    public static void fanzhuanarray(int [] array){
        for(int min = 0, max = array.length-1; max >= min ;max--,min++){
            int ling = array[min];
            array[min] = array[max];
            array[max] = ling;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

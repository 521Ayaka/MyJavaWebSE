import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestMe {

    @Test
    public void method01(){
        Random r = new Random();

        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(20) + 1; // [1,21) �������
        }

        for(int i = 0 ; i < array.length - 1; i++){
            //ÿ����ѭ���ıȽ�,��0������ʼ, ÿ�ζ��ڵݼ�
            for(int j = 0 ; j < array.length-i-1; j++){
                //�Ƚϵ�����,��j��j+1
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int num :array) {
            System.out.println(num);
        }


    }


}

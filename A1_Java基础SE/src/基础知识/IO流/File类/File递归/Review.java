package ����֪ʶ.IO��.File��.File�ݹ�;

//�ع˵�ʱ��������: ǰ20ֻ����{1,1,2,3,5,8,......}  ǰ����Ϊ 1,1 ������ǰ�������ĺ� 1,1,2,3,5,8,......

import java.util.Arrays;

public class Review {

    public static void main(String[] args) {

        //����һ������Ϊ20��int����
        int [] array = new int[20];

        //ʹ��forѭ��
        for (int i = 0; i < array.length; i++) {
            if (i < 2){
                array[i] = 1;
            }else{
                array[i] = array[i-1]+array[i-2];
            }
        }

        //��������
        System.out.println(Arrays.toString(array));

    }

}

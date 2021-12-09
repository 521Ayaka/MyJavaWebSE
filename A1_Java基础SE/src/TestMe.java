import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestMe {

    @Test
    public void method01(){
        Random r = new Random();

        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(20) + 1; // [1,21) 的随机数
        }

        for(int i = 0 ; i < array.length - 1; i++){
            //每次内循环的比较,从0索引开始, 每次都在递减
            for(int j = 0 ; j < array.length-i-1; j++){
                //比较的索引,是j和j+1
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

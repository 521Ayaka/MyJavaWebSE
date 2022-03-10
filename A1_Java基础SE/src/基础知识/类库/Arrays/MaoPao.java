package 基础知识.类库.Arrays;
import java.util.Arrays;
public class MaoPao {

    public static void main(String[] args) {

        int [] arr = {177,180,42,66,165};

//        //第一次排序
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i+1]){
//                int b = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = b;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        //第二次排序
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i+1]){
//                int b = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = b;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //使用冒泡排序
        for (int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i+1]){
                    int b = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = b;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

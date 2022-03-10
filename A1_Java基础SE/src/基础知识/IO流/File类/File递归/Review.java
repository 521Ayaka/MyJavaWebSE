package 基础知识.IO流.File类.File递归;

//回顾当时神兔问题: 前20只兔子{1,1,2,3,5,8,......}  前两个为 1,1 往后都是前两个数的和 1,1,2,3,5,8,......

import java.util.Arrays;

public class Review {

    public static void main(String[] args) {

        //定义一个长度为20的int数组
        int [] array = new int[20];

        //使用for循环
        for (int i = 0; i < array.length; i++) {
            if (i < 2){
                array[i] = 1;
            }else{
                array[i] = array[i-1]+array[i-2];
            }
        }

        //遍历数组
        System.out.println(Arrays.toString(array));

    }

}

package A1_MyJava.基础知识.调试练习;

import java.util.Comparator;
import java.util.TreeSet;

public class 不一样的数组反正 {

    public static void main(String[] args) {

        int []array = {50,10,30,40,20,60};

        //正序排列
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int j : array) {
            set.add(j);
        }
        int num = 0;
        for (int k : set) {
            array[num] = k;
            num++;
        }
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("============================================");

        //反转
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        });

        for (int j : array) {
            treeSet.add(j);
        }
        num = 0;
        for (int k : treeSet){
            array[num] = k;
            num++;
        }
        for(int i : array){
            System.out.println(i);
        }


    }

}

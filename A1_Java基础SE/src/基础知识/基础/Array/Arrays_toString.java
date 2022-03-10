package 基础知识.基础.Array;

import java.util.Arrays;

public class Arrays_toString {
    public static void main(String[] args) {
        String [] ganga = new String [] {"一起LOL吧","我在巨龙之巢","ID是：永远i爱你"};
        System.out.println(Arrays.toString(ganga));
        for (int i = 0; i < ganga.length; i++) {
            System.out.println(ganga[i]);
        }
    }
}

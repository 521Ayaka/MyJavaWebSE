package A1_MyJava.基础知识.类库.Random;

import java.util.Random;

public class gangale{

    public static void main(String [] args){

        Random r = new Random();

        int x;
        for (int i = 0; i < 50; i++) {
            x = r.nextInt(9)+1;
            System.out.println(x);
        }
    }

}

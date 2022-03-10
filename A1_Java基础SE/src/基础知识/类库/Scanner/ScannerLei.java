package 基础知识.类库.Scanner;
import java.util.Scanner;

public class ScannerLei {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("你要糖吃吗？要次？不次？");
        String wen = sc.next();

        while(!wen.equals("要次") && !wen.equals("不次")){
            System.out.println("尴尬听不懂");
            System.out.println("================");
            wen = sc.next();
        }
        method(wen);


        sc.close();
    }

    public static void method(String wen){
        if(wen .equals("要次")){
            for(int i = 1; i<=100; i++){
                System.out.println("不给不给>.< ");
            }
        }else{
            System.out.println("不次算了");
        }
    }
}

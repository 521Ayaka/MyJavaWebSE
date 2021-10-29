package 基础知识.基础.Array;

public class Array03 {
    public static void main(String[] args) {
        int [] chengji={100, 0, 20, 1, 55, 6, 77, 99, 0, 1, 20, 45};
        double[] array1 = ganga(chengji);
        System.out.println("================尴尬================");
        System.out.println(array1[0]);
        System.out.println("===============尴尬===============");
        System.out.println(array1[1]);
    }
    public static double[] ganga(int[] chengji) {
        int sum=0;
        for (int i = 0; i < chengji.length; i++) {
            sum = sum + chengji[i];
        }
        double avg = ( sum / chengji.length );
        double[] array2 ={ sum, avg };
        return array2;
    }
    
}

import java.util.Arrays;
import java.util.Scanner;

public class StuTest {

    public static void main(String[] args) {
        //����
        new StuTest().init();
    }

    //��ʼ��
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("������γ̵�����ѧϰ�ɼ�:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println("====������Ϊ:====");
        System.out.println("====�ܷ�Ϊ:"+sum(num1, num2, num3) + "=====");
        System.out.println("====ƽ����Ϊ:"+ avg(num1, num2, num3) + "===");

    }

    //�ܳɼ�
    public double sum(double ... array){
        //���㲢����
        return Arrays.stream(array).sum();
    }

    //ƽ����
    public double avg(double ... array){
        double num = Arrays.stream(array).sum();
        if(num <= 0){
            return 0;
        }else {
            return num/array.length;
        }
    }

}

package 基础知识.基础.ForDoWhile;

public class XunHuan02 {
    public static void main (String[]args){
        for(int hour = 0; hour<24 ; hour++){
            for(int minute=0;minute<60;minute++){
                for(int s=0;s<60;s++){
                    System.out.println("                          "+hour+"点"+minute+"分"+s+"秒"+"在想你...");
                }
            }
        }
        System.out.println("                          24点00分00秒在仍然在想念你");
    }
}

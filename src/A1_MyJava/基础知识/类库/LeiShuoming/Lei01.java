package A1_MyJava.基础知识.类库.LeiShuoming;

/*
定义一个类

成员变量（属性）：
    String x;
    int y; 


成员方法（行为）：
    public void ganga01() {}
    public void ganga02() {} 


注意事项：
1. 成员变量是直接定义在类当中的，在方法外边。
2. 成员方法不要写static关键字。
 */
public class Lei01 {
    String x = "尴尬酱万岁";
    int y = 521;
    
    public void ganga01(){
        System.out.println("永远嘀神！");
    }

    public void ganga02(){
        System.out.println("尴尬，吃饭吃饭！");
    }
    public  void nani (){
        for(int hour = 0; hour<24;hour++){
            for(int minute=0;minute<60;minute++){
                for(int s=0;s<60;s++){
                    System.out.println("                          "+hour+"点"+minute+"分"+s+"秒"+"在想你...");
                }
            }
        }
        System.out.println("                          24点00分00秒在仍然在想念你");
    }

    public String getX() {
        return x;
    }

    public void setX(final String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

}

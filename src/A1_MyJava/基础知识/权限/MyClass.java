package A1_MyJava.����֪ʶ.Ȩ��;

public class MyClass {

    public int num1 = 1;
    protected int num2 = 2;
    /* (default) */ int num3 = 3;
    private int num4 = 4;

    private void method1(){
        System.out.println("˽�з���");
    }

    void method2(){
        System.out.println("(default)����");
    }


    //�޲ι���
    public MyClass() {
    }

    //ȫ�ι���
    public MyClass(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    //GetSet����
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }
}

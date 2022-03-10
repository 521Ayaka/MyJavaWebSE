package 基础知识.考试作业.第一次作业.题目6;

public class Number {

    //定义私有成员变量n1,n2
    private int n1;
    private int n2;
    //全参构造方法
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //加法========================================
    public int addition(){
        return n1+n2;
    }
    //减法========================================
    int subtrationAB(){
        return n1-n2;
    }
    int subtrationBA(){
        return n2-n1;
    }

    //乘法========================================
    int multiplication(){
        return n1*n2;
    }

    //除法========================================
    // A/B
    int divisionAB() throws XXXException {      //throws抛出异常
        if (n2 == 0){
            throw new XXXException("除数不能为0");//如果除数为零，抛出异常
        }
        return n1/n2;
    }
    // B/A
    int divisionBA() throws XXXException {      //throws抛出异常
        if (n1 == 0){
            throw new XXXException("除数不能为0");//如果除数为零，抛出异常
        }
        return n2/n1;
    }


}

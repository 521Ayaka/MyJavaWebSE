package A1_MyJava.基础知识.IO流.字节字符流案例回顾.A6_学生成绩录入;

public class StudentGrade {

    //姓名
    private String name;
    //语文成绩
    private int Chinese;
    //数学成绩
    private int Meth;
    //英语成绩
    private int English;

    //总分
    public int getSum() {
        return this.Chinese + this.Meth + this.English;
    }

    public StudentGrade() {
    }

    public StudentGrade(String name, int chinese, int method, int english) {
        this.name = name;
        Chinese = chinese;
        Meth = method;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMeth() {
        return Meth;
    }

    public void setMeth(int meth) {
        Meth = meth;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }
}

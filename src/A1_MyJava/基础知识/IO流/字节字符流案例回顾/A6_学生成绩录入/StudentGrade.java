package A1_MyJava.����֪ʶ.IO��.�ֽ��ַ��������ع�.A6_ѧ���ɼ�¼��;

public class StudentGrade {

    //����
    private String name;
    //���ĳɼ�
    private int Chinese;
    //��ѧ�ɼ�
    private int Meth;
    //Ӣ��ɼ�
    private int English;

    //�ܷ�
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

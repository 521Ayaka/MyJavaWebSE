package A1_MyJava.����֪ʶ.���.LeiShuoming;

/*
����һ����

��Ա���������ԣ���
    String x;
    int y; 


��Ա��������Ϊ����
    public void ganga01() {}
    public void ganga02() {} 


ע�����
1. ��Ա������ֱ�Ӷ������൱�еģ��ڷ�����ߡ�
2. ��Ա������Ҫдstatic�ؼ��֡�
 */
public class Lei01 {
    String x = "���ν�����";
    int y = 521;
    
    public void ganga01(){
        System.out.println("��Զ����");
    }

    public void ganga02(){
        System.out.println("���Σ��Է��Է���");
    }
    public  void nani (){
        for(int hour = 0; hour<24;hour++){
            for(int minute=0;minute<60;minute++){
                for(int s=0;s<60;s++){
                    System.out.println("                          "+hour+"��"+minute+"��"+s+"��"+"������...");
                }
            }
        }
        System.out.println("                          24��00��00������Ȼ��������");
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

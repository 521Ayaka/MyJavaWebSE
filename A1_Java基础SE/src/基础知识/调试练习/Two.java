package ����֪ʶ.������ϰ;


import java.util.Arrays;
import java.util.Scanner;
//�ⲿ��
public class Two implements Comparable<Two>{
//����ӿں󱨴���������ߣ�ALT+�س�
    //implements Comparable<Two> ��������ʵ����ʵ���ڲ��Ƚ����ӿ�

    private String name;//����
    private double difficulty;//�Ѷ�
    private String code;//ְҵ

    public void show(){
        System.out.println("�����Ĵ�ʦ����Զ������һ��ѧͽ����");
    }

    @Override
    public int compareTo(Two o) {
        //ʹ�û�����������double �İ�װ��Double��compare�������ԱȽ�����double���͵����ݣ�����int����
        return Double.compare(this.difficulty,o.difficulty);
    }
    //ALT+insert�� ѡtoString()���������棬Ctrl+Aȫѡ����
    @Override
    public String toString() {
        //����˫�����ڵ����ݸ����Լ�ϰ�߽����޸�
        return "\n" +
                "Ӣ��:" + name  +
                ", ����ϵ��:" + difficulty +
                ", ְҵ:" + code  +
                ';';
    }

    //ALT+insert�� ѡGetter and Setter���� ���棬Ctrl+Aȫѡ����
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return difficulty;
    }
    public void setAge(double age) {
        this.difficulty = age;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    //��̬�ڲ���
    public static class One{
        //������д���ڲ�����
        public static void main(String[] args) {
            //����Scanner
            Scanner sc=new Scanner(System.in);
            System.out.print("���������鳤�ȣ�");
            int a=sc.nextInt();
            //����һ���ⲿ������飬����Ϊts����
            Two[] ts=new Two[a];

            for (int i = 0; i <ts.length ; i++) {
                //�ڲ�������ⲿ��ĳ�Ա
                //�£�new������һ������
                Two t=new Two();
                System.out.print("�����"+(i+1)+"��Ӣ�����֣�");
                t.name=sc.next();
                System.out.print("�����Ѷȣ�");
                t.difficulty=sc.nextDouble();
                System.out.print("ְҵ��");
                t.code=sc.next();
                //�����������װ���ⲿ��ts����
                ts[i]=t;
            }
            System.out.println("-----------------------------");

            //����������ݣ�������ķ�ʽһ��һ�����
            System.out.print("Ӣ��������");
            for (int i = 0; i <ts.length ; i++) {
                System.out.print(ts[i]);
                //Ϊ��������������һ������������Զ�ת��
                if (i==ts.length-1){
                    System.out.println();
                }
            }
            System.out.println("-----------------------------");

            System.out.print("���ݲ����Ѷ�����");
            //�˴�����Ƚϵ� ���� �� �ڲ��Ƚ�������
            Arrays.sort(ts);
            //����������ת��Ϊ�ַ������
            System.out.println(Arrays.toString(ts));
            System.out.println("-----------------------------");

            //�����ⲿ���ڵ�show()����
            Two t=new Two();
            t.show();
        }
    }
}

package ����֪ʶ.������ҵ.��һ����ҵ.��Ŀ6;

public class Number {

    //����˽�г�Ա����n1,n2
    private int n1;
    private int n2;
    //ȫ�ι��췽��
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //�ӷ�========================================
    public int addition(){
        return n1+n2;
    }
    //����========================================
    int subtrationAB(){
        return n1-n2;
    }
    int subtrationBA(){
        return n2-n1;
    }

    //�˷�========================================
    int multiplication(){
        return n1*n2;
    }

    //����========================================
    // A/B
    int divisionAB() throws XXXException {      //throws�׳��쳣
        if (n2 == 0){
            throw new XXXException("��������Ϊ0");//�������Ϊ�㣬�׳��쳣
        }
        return n1/n2;
    }
    // B/A
    int divisionBA() throws XXXException {      //throws�׳��쳣
        if (n1 == 0){
            throw new XXXException("��������Ϊ0");//�������Ϊ�㣬�׳��쳣
        }
        return n2/n1;
    }


}

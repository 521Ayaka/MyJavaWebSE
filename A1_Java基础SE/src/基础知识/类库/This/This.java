package ����֪ʶ.���.This;

public class This {
    public static void main(String[] args) {
        ThisLei01 lei04 = new ThisLei01();
        lei04.name= "������";
        lei04.hello1("��˼��");
        System.out.println("=================================");
        
        //�������ľֲ���������ĳ�Ա����������ʱ�򣬸��ݡ��ͽ�ԭ�򡱣�����ʹ�þֲ�������

        lei04.name= "������";
        //���� �ֲ������� ������ ��

        lei04.hello2("��˼��");

        System.out.println("================================");
        lei04.name= "������";
        //���� �ֲ������� ������ ��
        lei04.hello3("��˼��");
        // System.out.println(name+"��ã��ҽ�"+this.name);
        //ʹ����this���ʳ�Ա����
        
        System.out.println("======================================================");

        ThisLei02 lei02 = new ThisLei02();
        lei02.fun("���Ǿֲ�����");

        
        /*      void fun(String str){
                    System.out.println(str);  //��ӡ����str
                    System.out.println(this.str);   //ʹ��this.str ��ӡȫ�ֱ���
            
                    //�ǲ���str��ֵ��ȫ�ֱ���str
                    this.str = str;
                    System.out.println(this.str);
                }
        */
    }
}

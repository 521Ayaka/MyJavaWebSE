package ����֪ʶ.���.This;

public class ThisLei02{

    String str = "���ǳ�Ա����";

    void fun(String str){
        System.out.println(str);  //��ӡ����str
        System.out.println(this.str);   //ʹ��this.str ��ӡȫ�ֱ���
        
        //�ǲ���str��ֵ��ȫ�ֱ���str
        this.str = str;
        System.out.println(this.str);
    }
}

package A1_MyJava.����֪ʶ.���.This;

public class ThisLei01 {
    String name;
    public void hello1(String who){
        System.out.println(who+"��ã��ҽ�"+name);
    }

    public void hello2(String namae){
        System.out.println(name+"��ã��ҽ�"+name);
    }
    public void hello3(String name){
        System.out.println(name+"��ã��ҽ�" + this.name);
        //ʹ����this���ʳ�Ա����
    }

    
}

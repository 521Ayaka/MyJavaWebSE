package ����֪ʶ.����.final�ؼ���.final02;
/*
2. ��final�ؼ�������һ��������ʱ��:

��final�ؼ�������һ��������ʱ��������������շ�����Ҳ���ǲ��ܱ�������д��

��ʽ:
���η� final ����ֵ���� ��������(�����б�){
    //������
}

ע������:
������ͷ�����˵��final�ؼ��ֺ�abstract�ؼ��ֲ���ͬʱʹ�ã���Ϊì�ܡ�

*/
public abstract class Fu {

    public final void method (){
        System.out.println("����ִ��");
    }

    //����ͬʱʹ�ã�abstract���뱻ʵ�ָ�����д��final���ܱ𸲸���д���໥ì�ܡ�
    public abstract /* final */ void methodAbs();

}

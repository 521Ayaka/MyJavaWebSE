package ����֪ʶ.���.Anonymous;

/*
��������ı�׼��ʽ��
������ ������ = new ������();

�����������ֻ���ұߵĶ���û����ߵ����ֺ͸�ֵ�������
new ������();

ע�������������ֻ��ʹ��Ψһ��һ�Σ��´����ò��ò��ٴ���һ���¶���
ʹ�ý��飺���ȷ����һ������ֻ��Ҫʹ��Ψһ��һ�Σ��Ϳ�������������
 */
public class Anonymous01 {

    public static void main(String[] args) {
        // ��ߵ�one���Ƕ��������
        Lei one = new Lei();
        one.name = "���ν�";
        one.showName(); // �ҽ����ν�
        System.out.println("===============");

        // ��������
        new Lei().name = "����͢";
        new Lei().name = "����";
        System.out.println(new Lei().name = "����");
        new Lei().showName(); // �ҽУ�null
    }

}

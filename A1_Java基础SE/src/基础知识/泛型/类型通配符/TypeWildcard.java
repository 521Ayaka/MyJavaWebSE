package ����֪ʶ.����.����ͨ���;

import java.util.ArrayList;
import java.util.List;

/*
[����ͨ���]:

# Ϊ�˱�ʾ���ַ���List�ĸ���,����ʹ������ͨ���
    ## [����ͨ���]: <?>
    ## List<?>: ��ʾԪ������δ֪��List,����Ԫ�ؿ���ƥ���κε����͡�
    ## ���ִ�ͨ�����List����ʾ���ĸ��ַ���List�ĸ���,�����ܰ�Ԫ����ӵ�����

# ���˵���ǲ�ϣ��List<?>���κη���List�ĸ���,ֻϣ��������ĳһ�෺��List�ĸ���,����ʹ������ͨ���������
    ## [����ͨ�������]: <? extends ����>
    ## List<? extends Number>: ��ʾ��������Number��������������

# ���˿���ָ������ͨ���������,����Ҳ����ָ������ͨ���������
    ## [����ͨ�������]: <? super ����>
    ## List<? super Number>: ����ʾ��������Number�����丸����

*/
public class TypeWildcard {

    public static void main(String[] args) {

        //����ͨ���
        List<?> list2 = new ArrayList<Object>();
        List<?> list3 = new ArrayList<Number>();
        List<?> list1 = new ArrayList<Integer>();

        //ʹ��ͨ�������
        //List<? extends Number> list4 = new ArrayList<Object>(); //Object��Number�ĸ���
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        //ʹ��ͨ�������
        //List<? super Number> list7 = new ArrayList<Integer>();
        List<? super Number> list8 = new ArrayList<Number>();
        List<? super Number> list9 = new ArrayList<Object>();


    }

}

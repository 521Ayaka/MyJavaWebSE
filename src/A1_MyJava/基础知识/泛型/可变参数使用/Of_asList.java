package A1_MyJava.����֪ʶ.����.�ɱ����ʹ��;

/*
Arrays: ���صļ��ϲ�����ɾ���������Խ����޸Ĳ���

List  : ���صļ��ϲ�������ɾ�Ĳ���

Set   : ���ܸ��ظ���Ԫ�أ����صļ��ϲ�������ɾ������û���޸ĵķ���

*/

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Of_asList {

    public static void main(String[] args) {

        //Arrays�������е���һ����̬����: public static <T> List <T> asList(T... a){...};
        //==========================================================================
        List<String> asList = Arrays.asList("��ѥ��", "�������", "�����һ��");
        System.out.println(asList);
        try{//���
            asList.add("�����Ӳ���");
            System.out.println("asList.add(\"�����Ӳ���\") δ�����쳣 ");
        }catch (UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }
        try{//ɾ��
            asList.remove("�����һ��");
            System.out.println(" asList.remove(\"�����һ��\") δ�����쳣 ");
        }catch (UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }
        try{//�޸�
            asList.set(1,"��Ѧ��");
            System.out.println("asList.set(1,\"��Ѧ��\"); δ�����쳣 ");
        }catch(UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }

        System.out.println("===================================================================");
        System.out.println("===================================================================");

        //List�ӿ�����һ����̬������public static <E> List <E> of(E... elements): ���ذ�����������Ԫ�صĲ��ɱ��б�
        List<String> listOf = List.of("��ѥ��", "�������", "�����һ��");

        try{//���
            listOf.add("�ľ����м����");
            System.out.println(" listOf.add(\"�ľ����м����\"); δ�����쳣 ");
        }catch(UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }
        try{//ɾ��
            listOf.remove("�ľ����м����");
            System.out.println(" listOf.remove(\"�ľ����м����\"); δ�����쳣 ");
        }catch(UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }
        try{//�޸�
            listOf.set(1,"�ʾ����м����");
            System.out.println(" listOf.set(\"�ľ����м����\"); δ�����쳣 ");
        }catch(UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }

        System.out.println("===================================================================");
        System.out.println("===================================================================");

        //Set�ӿ�����һ����̬����: public static <> Set <> of(E... elements): ����һ��������������Ԫ�صĲ��ɱ伯��
        Set<String> setOf = Set.of("��ѥ��", "�������", "�����һ��");
        try{//���
            setOf.add("����");
            System.out.println("setOf.add(\"����\") δ�����쳣");
        }catch(UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }
        try{//ɾ��
            setOf.remove("�����һ��");
            System.out.println("setOf.add(\"����\") δ�����쳣");
        }catch(UnsupportedOperationException e){
            System.out.println("�����쳣��UnsupportedOperationException");
        }
        System.out.println("û���޸ĵķ���");


    }

}

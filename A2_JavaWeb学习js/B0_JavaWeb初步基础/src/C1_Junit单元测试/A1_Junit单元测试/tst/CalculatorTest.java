package C1_Junit��Ԫ����.A1_Junit��Ԫ����.tst;
/*
    Assertions  ���� ��

    assert   ����
    Expected  Ԥ��

    Assertions.assertEquals();

    @Before  ֮ǰ
    @After   ֮��
                                */

import C1_Junit��Ԫ����.A1_Junit��Ԫ����.Calculator;

//���뻷����
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//��������: ����+Test
public class CalculatorTest {

    @Before //ע�� @Before  ���������в��Է�����
    public void init(){
        System.out.println("init...");
    }

    @After //ע�� @After  ���������в��Է����� ִ�и÷������ݣ�
    public void close(){
        System.out.println("close...");
    }


    //ʹ��ע��:  @Test --> ��Junit���� jdk �����С�
    @Test
    void/*���鷵��ֵ: void*/ testSum/*���鷽����: test+������(��ͷ��д)*/( /*��������б�: ��*/) {
        System.out.println("testSun...");
        //��������
        Calculator cal = new Calculator();
        //���÷���
        int num = cal.sum(1, 2);
/*      //���
        System.out.println(num);*/
        //һ��ʹ�����, ֻ����ɫ
        //ʹ��: ����:
        //��ʽһ:
        // assert 4 == num;
        //��ʽ��:
        Assertions.assertEquals(3,num);
        //����1��Ԥ��   ����2���������н��
    }

    //������ͼ: �ṹ alt + 7    idea

    //TODO: ����ѧϰ�ɣ�

    @Test
    void testCa() {
        System.out.println("testCa...");
        //��������
        Calculator cal = new Calculator();
        //���÷���
        int num = cal.ca(3, 2);

        //����
        Assertions.assertEquals(1,num);
    }


}

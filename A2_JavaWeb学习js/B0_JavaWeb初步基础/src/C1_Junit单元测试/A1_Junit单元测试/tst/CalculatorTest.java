package C1_Junit��Ԫ����.A1_Junit��Ԫ����.tst;

import C1_Junit��Ԫ����.A1_Junit��Ԫ����.Calculator;
//���뻷����
import org.junit.jupiter.api.Test;

//��������: ����+Test
public class CalculatorTest {


    //ʹ��ע��:  @Test --> ��Junit���� jdk �����С�
    @Test
    void/*���鷵��ֵ: void*/ testSum/*���鷽����: test+������(��ͷ��д)*/( /*��������б�: ��*/) {

        //�������� �����÷��� �����
        System.out.println(new Calculator().sum(1, 2));

        //��ֲ���
    }

    //������ͼ: �ṹ alt + 7    idea

    //TODO: ����ѧϰ�ɣ�

    @Test
    void testCa() {
        //�������� �����÷���
        new Calculator().ca(4, 2);
    }

}

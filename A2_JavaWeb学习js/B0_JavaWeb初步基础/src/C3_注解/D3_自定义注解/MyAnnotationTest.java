package C3_ע��.D3_�Զ���ע��;

import org.junit.jupiter.api.Test;

//@MyAnnotation02(name = "����ע���ڷ�������")
public class MyAnnotationTest {

    @Test
    @MyAnnotation01(age = 19, is18 = false, name = "GanGa", MES = Mes.GanGa, SW = @SuppressWarnings("all"), nums = {1, 1, 2}, str = "Ĭ�Ͽ��Բ����и�ֵ")
    public void myAnnotationTest(){
        //�����Ծͱ��븳ֵ, ������Ĭ������, ���Բ��ø�ֵ��
    }


    @Test
    @MyAnnotation02(name = "ע���ڷ�����")
    public void annTest() {

    }

    @MyAnnotation02(name = "����ע���ڳ�Ա������")
    private static int num = 123;

}

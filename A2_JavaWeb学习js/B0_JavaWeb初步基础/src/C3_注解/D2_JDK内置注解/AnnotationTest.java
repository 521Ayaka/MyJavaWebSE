package C3_ע��.D2_JDK����ע��;
/*

JDK��Ԥ�����һЩע��

	* @Override	����ⱻ��ע���ע�ķ����Ƿ��Ǽ̳��Ը���(�ӿ�)��
	* @Deprecated����ע���ע�����ݣ���ʾ�ѹ�ʱ
	* @SuppressWarnings��ѹ�ƾ���
		* һ�㴫�ݲ���all  @SuppressWarnings("all")

    @SuppressWarnings("all")  ���в����ģ�
*/

import org.junit.jupiter.api.Test;

@SuppressWarnings("all") //������ǰ����ѹ��ȫ��������
public class AnnotationTest {

    @SuppressWarnings("all")  //���÷���ǰ����ѹ����ȫ������
    @Override //Override �������Ƿ���д���෽��
    public String toString(){
        String s = "��дtoString";
        return s;
    }

    @Test
    public void testDeprecated(){
        me1(); //idea����ʾ�÷����ѹ�ʱ��
        me2();

    }

    @Deprecated
    public void me1(){
        System.out.println("me1�ѻķ�,����ѡʹ��");
    }

    public void me2(){
        System.out.println("me2������me1����");
    }




}

package C3_ע��.D3_�Զ���ע��;
/*

Ԫע��:

    ��������ע���ע�⣺

    		* @Target������ע���ܹ����õ�λ��
    			* ElementTypeȡֵ��
    				* TYPE����������������
    				* METHOD�����������ڷ�����
    				* FIELD�����������ڳ�Ա������

    		* @Retention������ע�ⱻ�����Ľ׶�
    			* @Retention(RetentionPolicy.RUNTIME)����ǰ��������ע�⣬�ᱣ����class�ֽ����ļ��У�����JVM��ȡ��
                             RetentionPolicy.

    		* @Documented������ע���Ƿ񱻳�ȡ��api�ĵ���
    		* @Inherited������ע���Ƿ�����̳�


*/

import java.lang.annotation.*;


//Ԫע�����Զ���ע��ǰ��:

//@Target������ע���ܹ����õ�λ��
@Target(/*value = */{ElementType.METHOD, ElementType.FIELD}) //TYPE

//@Retention: ����ע�ⱻ�����Ľ׶�
@Retention(RetentionPolicy.RUNTIME)

//@Documented������ע���Ƿ񱻳�ȡ��api�ĵ���
@Documented  //ʹ������Զ���ע�����, ʹ��doc����ᱣ��ע��ע��


//@Inherited������ע���Ƿ�����̳�
@Inherited  //ʹ������Զ���ע����������, �������ע��

public @interface MyAnnotation02 {

    String name();

}

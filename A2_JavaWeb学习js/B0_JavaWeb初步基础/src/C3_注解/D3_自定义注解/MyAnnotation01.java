package C3_ע��.D3_�Զ���ע��;
/*
    * ��ʽ��
		Ԫע��
		public @interface ע������{
			�����б�;
		}

	* ���ʣ�ע�Ȿ���Ͼ���һ���ӿڣ��ýӿ�Ĭ�ϼ̳�Annotation�ӿ�
		* public interface MyAnno extends java.lang.annotation.Annotation {}

	* ���ԣ��ӿ��еĳ��󷽷�
		* Ҫ��
			1. ���Եķ���ֵ����������ȡֵ
				* ����void��
				* ������������
				* String
				* ö��
				* ע��
				* �������͵�����

			2. ���������ԣ���ʹ��ʱ��Ҫ�����Ը�ֵ
				1. �����������ʱ��ʹ��default�ؼ��ָ�����Ĭ�ϳ�ʼ��ֵ����ʹ��ע��ʱ�����Բ��������Եĸ�ֵ��
			    	*���磺  int num() default 12;
                            String str() default "DEFAULT";
                            int[] s() default {1,2,3,4};

				2. ���ֻ��һ��������Ҫ��ֵ���������Ե�������value����value����ʡ�ԣ�ֱ�Ӷ���ֵ���ɡ�
				3. ���鸳ֵʱ��ֵʹ��{}���������������ֻ��һ��ֵ����{}����ʡ��

	* Ԫע�⣺MyAnnotation02 ����ʾ

*/



//����: public @interface ע������ { }
public @interface MyAnnotation01 {

/*  ���ԣ��ӿ��еĳ��󷽷�
	���Եķ���ֵ����������ȡֵ
			* ����void��
			* ������������
			* String
			* ö��
			* ע��
			* �������͵�����
                                      */

    // public void name(); //������void

    //������������
    public int age();
    public boolean is18();

    //String����
    String name();

    //ö��
    Mes MES();

    //ע��Y 09O ZA11
    SuppressWarnings SW();

    //�Լ�������������:
    int[] nums();

    //====================================nums
    //Ĭ������ֵ:
    int num() default 12;
    String str() default "DEFAULT";
    int[] s() default {1,2,3,4};

}

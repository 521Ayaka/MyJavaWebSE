package ����֪ʶ.�쳣.�Զ����쳣;

public class Teacher {

    public void scoreMethod(int score) throws CustomException {
        if (score < 0 || score > 100){
            throw new CustomException("������ķ������󣬷�����Χ��0~100֮��"); //��ע��!�����ؼ��֡���throw�� ������throws��
        }else{
            System.out.println("����ķ���������");
        }
    }

}

package 基础知识.异常.自定义异常;

public class Teacher {

    public void scoreMethod(int score) throws CustomException {
        if (score < 0 || score > 100){
            throw new CustomException("你给出的分数有误，分数范围在0~100之间"); //【注意!】【关键字】【throw】 【不是throws】
        }else{
            System.out.println("输入的分数正常。");
        }
    }

}

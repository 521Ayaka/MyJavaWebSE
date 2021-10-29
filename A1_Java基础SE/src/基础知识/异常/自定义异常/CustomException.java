package 基础知识.异常.自定义异常;

public class CustomException extends Exception{

    public CustomException(){
    }

    public CustomException(String message){
        super(message);
    }

}

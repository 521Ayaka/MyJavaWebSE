package A1_MyJava.����֪ʶ.���.GetSet;

/*

һ����׼����ͨ��Ҫӵ�������ĸ���ɲ��֣�

1�����г�Ա������Ҫ�ùؼ���private����˽�л����Ρ�

2��Ϊÿһ����Ա������дһ�Զ�Getter/Settet������

3����дһ���޲����Ĺ��췽����

4����дһ��ȫ�����Ĺ��췽����

������׼���࣬Ҳ����Java Bean
*/
public class Lei {


    // 1�����г�Ա������Ҫ�ùؼ���private����˽�л����Ρ�
    private String name ;
    private int age;
    private String aihao;
    private boolean liubu;
    private int bian;


    // 2��Ϊÿһ����Ա������дһ�Զ�Getter/Settet������

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public int getAge(){
        return age;
    }

    public void setAihao(String aihao){
        this.aihao = aihao;
    }

    public String getAaihao(){
        return aihao;
    }
    
    public void setLiubu(boolean liubu){
        this.liubu = liubu;
    }

    public boolean isLiubu(){
        return liubu;
    }

    public void setInt(int bian){
        this.bian = bian;
    }

    public int getInt(){
        return bian;
    }



    // ���췽��


    //3����дһ���޲����Ĺ��췽����
    public Lei(){
    }

    //4����дһ��ȫ�����Ĺ��췽����
    public Lei(String name, int age, String aihao, boolean liubu, int bian){
        this.name = name;
        this.age = age;
        this.aihao = aihao;
        this.liubu = liubu;
    }
       
}

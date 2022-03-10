package 基础知识.类库.GetSet;

public class FuXi {
    public static void main(String[] args) {
        System.out.println("=========复习========");

        LeiFuXi lei1 = new LeiFuXi();
        lei1.setGanga(888);
        lei1.setName("尴尬了");
        lei1.setWen(true);

        System.out.println(lei1.getGanga());
        System.out.println(lei1.getName());
        System.out.println(lei1.isWen());

        System.out.println("===================================================");

        LeiFuXi lei2 = new LeiFuXi(66666,"尴尬尴尬尴尬了",true);
        System.out.println(lei2.getGanga());
        System.out.println(lei2.getName());
        System.out.println(lei2.isWen());


    }
}

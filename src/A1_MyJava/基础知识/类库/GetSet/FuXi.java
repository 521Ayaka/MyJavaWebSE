package A1_MyJava.ª˘¥°÷™ ∂.¿‡ø‚.GetSet;

public class FuXi {
    public static void main(String[] args) {
        System.out.println("=========∏¥œ∞========");

        LeiFuXi lei1 = new LeiFuXi();
        lei1.setGanga(888);
        lei1.setName("ﬁœﬁŒ¡À");
        lei1.setWen(true);

        System.out.println(lei1.getGanga());
        System.out.println(lei1.getName());
        System.out.println(lei1.isWen());

        System.out.println("===================================================");

        LeiFuXi lei2 = new LeiFuXi(66666,"ﬁœﬁŒﬁœﬁŒﬁœﬁŒ¡À",true);
        System.out.println(lei2.getGanga());
        System.out.println(lei2.getName());
        System.out.println(lei2.isWen());


    }
}

package A1_MyJava.����֪ʶ.����.A�ӿ���Ϊ��������;


//hero Ӣ��
public class Hero {

    private String name;
    private int age;
    private Skill skill;
    private Weapon weapon;

    //��ӡӢ����Ϣ����Ϊ
    void method(){
        System.out.print("����Ϊ:"+age+"��"+name+",��������["+ weapon.getCode()+"] ʹ����Ϊ[");
        skill.use();
        System.out.println("]�ļ��� �ڴ�Ұ......��ӣ�");
    }


    void skill(){

    }

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon, Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

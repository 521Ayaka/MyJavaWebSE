package 基础知识.类量.A接口作为变量类型;

//skill 技能实现类
public class SkillImpl implements Skill{

    // 实现 寒冰射手艾希的技能 biu~biu~biu~
    @Override
    public void use() {
        System.out.print("biu~biu~biu~");
    }
}

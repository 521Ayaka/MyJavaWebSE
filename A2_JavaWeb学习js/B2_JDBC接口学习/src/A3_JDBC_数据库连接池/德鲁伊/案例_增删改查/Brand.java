package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查;

/*
* 基本数据类型 在这里 建议使用 其 [包装类]！
* */

public class Brand {

    // id 主键
    private Integer id;
    // 品牌名称
    private String brandName;
    // 企业名称
    private String companyName;
    // 排序字段
    private Integer ordered;
    // 描述信息
    private String description;
    // 状态: 0:禁用 1:启用
    private Integer status;

    //GetSet
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand_name='" + brandName + '\'' +
                ", company_name='" + companyName + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }



    /*

    create table tb_brand(

    -- id 主键
    id int primary key auto_increment,
    -- 品牌名称
    brand_name varchar(20),
    -- 企业名称
    company_name varchar(20),
    -- 排序字段
    ordered int,
    -- 描述信息
    description varchar(100),
    -- 状态: 0:禁用 1:启用
    status int

    );

    -- 添加数据
    insert into tb_brand (brand_name, company_name, ordered, description, status)
        values ('三只松鼠', '三只松鼠股份有限公司', 5 , '好吃不上火', 0),
               ('华为', '华为科技有限公司', 100 , '华为致力于把数字带入每个人、每个家庭、每个组织，构建万物互联的智能世界', 1),
               ('小米', '小米科技有限公司', 50 , 'are you ok', 1);

    -- 查询该表
    select * from tb_brand;



    */

}

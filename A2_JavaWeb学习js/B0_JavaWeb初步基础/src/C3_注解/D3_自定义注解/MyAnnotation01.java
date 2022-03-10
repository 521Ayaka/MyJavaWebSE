package C3_注解.D3_自定义注解;
/*
    * 格式：
		元注解
		public @interface 注解名称{
			属性列表;
		}

	* 本质：注解本质上就是一个接口，该接口默认继承Annotation接口
		* public interface MyAnno extends java.lang.annotation.Annotation {}

	* 属性：接口中的抽象方法
		* 要求：
			1. 属性的返回值类型有下列取值
				* 不能void！
				* 基本数据类型
				* String
				* 枚举
				* 注解
				* 以上类型的数组

			2. 定义了属性，在使用时需要给属性赋值
				1. 如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
			    	*列如：  int num() default 12;
                            String str() default "DEFAULT";
                            int[] s() default {1,2,3,4};

				2. 如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可。
				3. 数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}可以省略

	* 元注解：MyAnnotation02 类演示

*/



//定义: public @interface 注解名称 { }
public @interface MyAnnotation01 {

/*  属性：接口中的抽象方法
	属性的返回值类型有下列取值
			* 不能void！
			* 基本数据类型
			* String
			* 枚举
			* 注解
			* 以上类型的数组
                                      */

    // public void name(); //不能是void

    //基本数据类型
    public int age();
    public boolean is18();

    //String类型
    String name();

    //枚举
    Mes MES();

    //注解Y 09O ZA11
    SuppressWarnings SW();

    //以及上述类型数组:
    int[] nums();

    //====================================nums
    //默认属性值:
    int num() default 12;
    String str() default "DEFAULT";
    int[] s() default {1,2,3,4};

}

package classAndObject;

public class PropertyInitTest {
    public String name = "some employee"; //姓名————————初始化顺序1
    public float age; //年龄
    float salary; //薪资

    public static int salaryMonth=6; //月份

    static {
        salaryMonth = 8;
    }

    public PropertyInitTest(){

        name = "one employee";   //初始化顺序3
    }

    {
        name = "the employee";  //初始化顺序2
    }

    public static void main(String[] args) {
        System.out.println(PropertyInitTest.salaryMonth);

        PropertyInitTest pi = new PropertyInitTest();

        System.out.println(pi.name);

        /**
         * 属性初始化顺序：
         * 1、先所有数据域被初始化为默认值
         * 2、按照在类声明中出现的次序,依次执行所有域初始化语句和初始化块
         * 3、如果构造器第一行调用了第二个构造器(子类默认调用父类的无参构造函数super,this),则执行第二个构造器主体.
         * 4、执行这个构造器的主体
         */

    }
}

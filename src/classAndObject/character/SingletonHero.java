package classAndObject.character;

/**
 * 使用饿汉式单例模式, 把Hero类改造成为单例模式
 */
public class SingletonHero {

    private static SingletonHero singletonHero1 = new SingletonHero();
    private static SingletonHero singletonHero2 = new SingletonHero("哈哈");

    public static SingletonHero getInstance1(){//无参
        System.out.println("返回无参对象");
        return singletonHero1;
    }
    public static SingletonHero getInstance2(){//有名字
        System.out.println("返回有name对象");
        return singletonHero2;
    }



    private SingletonHero(){
        System.out.println("无参构造器");
    }

    private SingletonHero(String name){
        this.name = name;
        System.out.println("带name的构造器");
    }

    private SingletonHero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    private SingletonHero(String name, float hp, float armor, int moveSpeed){
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }



    private String name; //姓名

    private float hp; //血量

    private float armor; //护甲

    private int moveSpeed; //移动速度

    private static String copyRight;


    public static void main(String[] args) {
        System.out.println(SingletonHero.getInstance2());
        System.out.println(SingletonHero.getInstance2());
    }
}

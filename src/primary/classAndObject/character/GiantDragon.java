package primary.classAndObject.character;

/**
 * 饿汉式单例模式
 */
public class GiantDragon {

    private GiantDragon(){ //私有化构造方法

    }

    //类加载时就会实例化对象，指向唯一
    private static GiantDragon giantDragon = new GiantDragon();

    public static GiantDragon getInstance(){
        return giantDragon;
    }
}

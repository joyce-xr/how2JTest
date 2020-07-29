package primary.classAndObject.character;

/**
 * 懒汉式单例模式
 */
public class GiantDragon2 {

    //这里只是声明了一个静态属性
    private static GiantDragon2 dragon2;

    private GiantDragon2(){

    }

    public static GiantDragon2 getInstance(){
        if(dragon2==null){
            dragon2 = new GiantDragon2();//调用这个方法时才会实例化对象，且只会执行一次
        }
        return dragon2;
    }
}

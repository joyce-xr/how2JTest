package classAndObject;

import classAndObject.character.GiantDragon;
import classAndObject.character.GiantDragon2;

public class SingletonTest1 {

    public static  void test1(){
        //GiantDragon giantDragon = new GiantDragon();   不可以这样实例化对象，因为构造器是私有的

        GiantDragon giantDragon = GiantDragon.getInstance();
        GiantDragon giantDragon2 = GiantDragon.getInstance();

        System.out.println("饿汉式3单例模式，无论实例化多少次，都返回同一个对象:");
        System.out.println(giantDragon==giantDragon2);
    }

    public static void test2(){
        GiantDragon2 dragon1 = GiantDragon2.getInstance();
        GiantDragon2 dragon2 = GiantDragon2.getInstance();
        System.out.println("懒汉式单例模式，无论实例化多少次，都返回同一个对象:");
        System.out.println(dragon1==dragon2);
    }


    public static void main(String[] args) {

        test2();
    }
}

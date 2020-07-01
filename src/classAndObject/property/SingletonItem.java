package classAndObject.property;

import classAndObject.character.SingletonHero;

/**
 * 使用懒汉式单例模式，把Item类改造成为单例模式
 */
public class SingletonItem {
    private static SingletonItem singletonItem;

    private SingletonItem(){}

    public static SingletonItem getInstance(){
        if(singletonItem == null){
            singletonItem = new SingletonItem();
        }

        return singletonItem;
    }
}

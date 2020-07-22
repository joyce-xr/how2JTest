package interfaceAndImplement.charactor;

import interfaceAndImplement.property.Item;
import interfaceAndImplement.property.LifePotion;
import interfaceAndImplement.property.MagicPotion;



/**
 * 对象转型test
 */
public class Hero {

    public String name;
    protected float hp;//血量

    public Hero(){
        System.out.println("hero的无参构造器");
    }

    public Hero(String name){
        System.out.println("hero的有参构造器");
    }

  public void useItem(Item i){
        i.effect();
    }

    public void kill(Mortal m){
        m.die();
    }

    public static void battleWin(){
        System.out.println("Hero battleWin");
    }


    public static void main(String[] args) {
        /**
         * test1
         */
//        {
//            ADHero ad = new ADHero();
//            APHero ap = new APHero();
//
//            Hero h1 = ad;
//            Hero h2 = ap;
//
//            System.out.println(h1 instanceof ADHero);
//            System.out.println(h2 instanceof APHero);
//            System.out.println(h1 instanceof Hero);
//            System.out.println(ad instanceof Hero);
//        }

        /**
         * test2
         */
//        {
//            Hero garen = new Hero();
//            garen.name="盖伦";
//
//            LifePotion lifePotion = new LifePotion();
//            MagicPotion magicPotion = new MagicPotion();
//            garen.useItem(lifePotion);
//            garen.useItem(magicPotion);
//        }

        /**
         * test3
         */
//        {
//            Hero garen = new Hero();
//            garen.name = "盖伦";
//
//            ADHero ad = new ADHero();
//            APHero ap = new APHero();
//            ADAPHero adap = new ADAPHero();
//
//            garen.kill(ad);
//            garen.kill(ap);
//            garen.kill(adap);
//        }

        /**
         * test4
         */
//        Hero.battleWin();
//        ADHero.battleWin();
//
//        Hero h = new ADHero();
//        h.battleWin();

        /**
         * test5
         */
//        new ADHero();
//        new ADHero("haha");

        /**
         * test6
         */
//        System.out.println(new Hero());
//        System.out.println(new Hero().toString());

    }
}

class ADHero extends Hero implements AD,Mortal {

    public ADHero(){
        System.out.println("ADHero的无参构造器");
    }

    public ADHero(String name){
        System.out.println("ADHero的有参构造器");
    }

    @Override
    public void physicAttack() {

        System.out.println("进行物理攻击");
    }

    @Override
    public void die() {

        System.out.println("这是ADHero的die方法");
    }

    public static void battleWin(){
        System.out.println("ADHero battleWin");
    }
}

class APHero extends Hero implements AP,Mortal{

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("这是APHero的die方法");
    }
}

class ADAPHero extends Hero implements AD,AP,Mortal {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");

    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");

    }

    @Override
    public void die() {
        System.out.println("这是ADAPHero的die方法");
    }

    @Override
    public void attack() {
        System.out.println("ADAPHero attack");
    }

}



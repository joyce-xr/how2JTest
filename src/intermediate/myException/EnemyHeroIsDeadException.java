package intermediate.myException;

import primary.interfaceAndImplement.charactor.Hero;

public class EnemyHeroIsDeadException extends Exception{
    public EnemyHeroIsDeadException(){

    }

    public EnemyHeroIsDeadException(String msg){
        super(msg);
    }

    public static void main(String[] args){
        Hero h1 = new Hero("大英雄");
        Hero h2 = new Hero("小英雄");
        h2.hp = 0;
        try {
            h1.attackHero(h2);
        } catch (EnemyHeroIsDeadException e) {//当被攻击的英雄血量为0时,捕获异常
            System.out.println("异常原因："+e.getMessage());
            e.printStackTrace();
        }
    }
}

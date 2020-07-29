package primary.classAndObject.character1;

import primary.classAndObject.character.Hero;

/**
 * 辅助英雄类
 */
public class Support extends Hero {
    void heal(){
        System.out.println(name + "给自己治疗");
    }

    void heal(Hero h){
        System.out.println(name + "给【" + h.name +"】治疗");
    }

    void heal(Hero h, int hp){
        System.out.println(name + "给【" + h.name +"】治疗了 " + hp);
    }






    public static void main(String[] args) {
        Support support = new Support();
        support.name = "华佗";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        support.heal();
        support.heal(h1);
        support.heal(h2,500);

    }
}

package interfaceAndImplement.charactor;

import classAndObject.character.Hero;

public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("实现接口的heal方法");
    }

    public Support(String name,float hp){
        super(name,hp);
    }

    public static void main(String[] args) {
        Support h = new Support("support name",100);
        h.recover(10);
        System.out.println(h.hp);
        h.heal();

    }
}

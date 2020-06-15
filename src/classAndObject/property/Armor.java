package classAndObject.property;

public class Armor extends Item {
    /**
     * 设计一个类Armor护甲
     * 继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
     *
     * 实例化出两件护甲
     * 名称 价格 护甲等级
     * 布甲 300 15
     * 锁子甲 500 40
     */

    int ac;//护甲等级

    public String toString(){
        return this.name + "\t" +this.price + "\t" + this.ac;
    }

    public static void main(String[] args) {
        Armor a1 = new Armor();
        Armor a2 = new Armor();
        a1.name = "布甲";
        a1.price = 300;
        a1.ac = 15;
        a2.name = "锁子甲";
        a2.price = 500;
        a2.ac = 40;

        System.out.println("对象a1的属性："+a1);
        System.out.println("对象a2的属性："+a2);
    }

}

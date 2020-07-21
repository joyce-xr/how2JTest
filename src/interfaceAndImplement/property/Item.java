package interfaceAndImplement.property;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }

    public void effect(){
        System.out.println("物品使用后，有效果");
    }


    public static void main(String[] args) {
        /**
         * test1
         */
//        {
//            Item item = new Item();
//            LifePotion lifePotion = new LifePotion();
//            item.effect();
//            lifePotion.effect();
//            lifePotion.buy();
//        }
        /**
         * test2
         */
        {

            Item item1 = new Item();
            Item item2 = new LifePotion();
            Item item3 = new MagicPotion();

            System.out.println("item1 是Item类型，执行effect方法：");
            item1.effect();
            System.out.println("item2 是LifePotion类型，执行effect方法：");
            item2.effect();
            System.out.println("item3 是MagicPotion类型，执行effect方法：");
            item3.effect();
        }
    }
}

package interfaceAndImplement.property;

public class Item {
    String name;
    int price;

    public String toString(){
        return name+"   "+price;
    }
    public void finalize(){
        System.out.println(this + "对象正在被回收");
    }
    public boolean equals(Object o){

        if(o instanceof Item){
            return ((Item) o).price == this.price;
        }
        return false;
    }


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
//        {
//
//            Item item1 = new Item();
//            Item item2 = new LifePotion();
//            Item item3 = new MagicPotion();
//
//            System.out.println("item1 是Item类型，执行effect方法：");
//            item1.effect();
//            System.out.println("item2 是LifePotion类型，执行effect方法：");
//            item2.effect();
//            System.out.println("item3 是MagicPotion类型，执行effect方法：");
//            item3.effect();
//        }
        /**
         * test3
         */
        Item item1 = new Item();
        item1.price=100;
        Item item2 = new Item();
        item2.price=100;
        System.out.println(item1.equals(item2));
        System.out.println(item1.toString());
    }
}

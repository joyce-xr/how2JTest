public class ItemTest {
    public static void main(String args[]){
        Item item1 = new Item("血瓶",100,1000,0,0,0);
        Item item2 = new Item("草鞋",50,500,0,0,2000);
        Item item3 = new Item("长剑",200,60,10,3000,200);

        item1.legendary();

        System.out.println(item1.name + "的当前血量" +item1.getBlood());
        item1.recovery(100);
        System.out.println(item1.name + "恢复后的血量" +item1.getBlood());
    }
}

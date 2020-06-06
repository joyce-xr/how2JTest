public class Item {
    String name; //名字
    float price;//价格
    int blood;//血量
    int armor;//防御力
    int attack;//攻击力
    int moveSpeed;//移动速度

    Item(String name, float price, int blood, int armor, int attack, int moveSpeed){
        this.name = name;
        this.price = price;
        this.blood = blood;
        this.armor = armor;
        this.attack = attack;
        this.moveSpeed = moveSpeed;
    }


    //超神
    void legendary(){
        System.out.println(name + " 超神了");
    }
    //获取当前血量
    int getBlood(){
        return blood;
    }
    //回血
    void recovery(int addBlood){
        blood = blood + addBlood;
    }
}

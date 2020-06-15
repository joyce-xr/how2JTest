package classAndObject.character;

public class Hero {
    public String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero(){

    }

    public Hero(String name){
        this.name = name;
    }

    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, float hp, float armor, int moveSpeed){
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public void recover(int xp){
        hp = hp+xp;
        xp = 0;
    }

    // 攻击一个英雄，并让他掉damage点血
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }

    //复活提莫
    public void revive(Hero h){
        h = new Hero("提莫",383);
        //h.hp = 383;
    }

    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);
//        //血瓶，其值是100
//        int xueping = 100;
//        //提莫通过这个血瓶回血
//        teemo.recover(xueping);
//        System.out.println(xueping);


//        Hero garen = new Hero("盖伦", 616);
//        garen.attack(teemo, 100);
//        System.out.println(teemo.hp);


        //提莫受到400点伤害
        teemo.hp = teemo.hp - 400;
        //复活
        teemo.revive(teemo);
        //此时teemo的血量
        System.out.println(teemo.hp);

    }

}

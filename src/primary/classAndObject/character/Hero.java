package primary.classAndObject.character;

public class Hero {
    public String name; //姓名

    protected float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    static String copyRight;

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

    //实例方法
    public void die(){
        hp=0;
    }

    //类方法
    public static void printGameDuration(){
        //die(); //类方法中不能直接调用实例方法
        System.out.println("您已经在线XX小时了");
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


//        //提莫受到400点伤害
//        teemo.hp = teemo.hp - 400;
//        //复活
//        teemo.revive(teemo);
//        //此时teemo的血量
//        System.out.println(teemo.hp);

        /**
         * 静态属性
         * 可以通过类访问，也可通过对象访问
         */
//        {
//            Hero garen = new Hero();
//
//            Hero.copyRight = "copyRight1111111";
//            System.out.println(garen.copyRight);
//
//            garen.copyRight = "copyRight2222222";
//            System.out.println(teemo.copyRight);
//
//            System.out.println(garen.copyRight);
//
//            System.out.println(Hero.copyRight);
//        }





    }

}

package intermediate.collectionPackage;

import java.util.ArrayList;

public class CollectionFirstTest {
    public static void main(String[] args) {
        //test1();
        //basicTest();
        equalTest();
    }

    //判断是否相同
    public static void equalTest(){
        ArrayList heros = new ArrayList();
        for (int i=0; i<5; i++){
            heros.add(new Hero("hero"+i));
        }
        System.out.println(heros);

        //判断集合里是否包含name=hero1的元素
        for(int i=0;i<heros.size();i++){
            if(heros.get(i).toString().equals("hero1")){
                System.out.println("true");
                break;
            }else if(i==heros.size()-1){
                System.out.println("false");
            }
        }
    }

    //基本方法
    public static void basicTest(){
        ArrayList heros = new ArrayList();
        //1、增加
        for (int i=0; i<5; i++){
            heros.add(new Hero("hero"+i));
        }
        System.out.println(heros);

        //2、指定位置增加
        heros.add(3,new Hero("special hero"));
        System.out.println(heros);

        //3、判断是否存在
        Hero h = new Hero("contain hero");
        heros.add(h);
        System.out.println(heros);
        System.out.println("list中包含【contain hero】吗？  " + heros.contains(h));

        //4、根据索引值获取指定位置的对象
        System.out.println("第4个英雄是："+heros.get(4));

        //5、获取对象所在位置
        System.out.println("contain hero所在位置："+heros.indexOf(h));

        //6、删除对象(指定对象)
        heros.remove(h);
        heros.remove(1);
        System.out.println(heros);

        //7、替换
        heros.set(1,new Hero("hero22"));
        System.out.println(heros);

        //8、获取大小
        System.out.println("heros 的大小："+heros.size());

        //9、转为数组
        //**********需要传递一个Hero数组类型的对象给toArray()，这样toArray方法才知道，你希望转换为哪种类型的数组，否则只能转换为Object数组
        Hero[] heroArray = (Hero[])heros.toArray(new Hero[]{});
        for(int i=0;i<heros.size();i++){
            System.out.printf("%s   ",heroArray[i].toString());
        }
        System.out.println();

        //10、把另一个容器所有对象都加进来
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("another hero 1"));
        anotherHeros.add(new Hero("another hero 2"));
        heros.addAll(anotherHeros);
        System.out.println(heros);

        //11、清空容器
        heros.clear();
        System.out.println(heros);

    }

    //test1
    public static void test1(){

        ArrayList heros = new ArrayList();
        heros.add(new Hero("提莫"));
        heros.add(new Hero("盖伦"));
        System.out.println(heros.size());
    }
}

class Hero{
    public String name;
    public float hp;

    public int damage;

    public Hero() {

    }

    // 增加一个初始化name的构造方法
    public Hero(String name) {

        this.name = name;
    }

    public String toString(){
        return name;
    }

}
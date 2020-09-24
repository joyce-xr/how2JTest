package intermediate.collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorListTest {


    List<Hero> heroes;

    public void init(){
        heroes = new ArrayList<>();
        for(int i=0;i<100 ;i++){//初始化一个Hero集合，里面放100个Hero对象
            heroes.add(new Hero("hero "+i));
        }
    }

    public void deleteFunc(int a){//删除掉名字编号是8的倍数的对象

        Iterator<Hero> IHero = heroes.iterator();
        while (IHero.hasNext()){
            int index = Integer.parseInt(IHero.next().name.split(" ")[1]);
            if(index%a == 0){
                IHero.remove();
            }
        }

    }

    public static void main(String[] args) {

        IteratorListTest test = new IteratorListTest();
        test.init();
        System.out.println(test.heroes);
        test.deleteFunc(8);
        System.out.println(test.heroes);
    }
}

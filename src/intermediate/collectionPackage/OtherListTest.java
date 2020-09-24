package intermediate.collectionPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OtherListTest {

    public static void main(String[] args) {

        //linkedListTest();
        queueTest();
    }

    public static void linkedListTest(){

        LinkedList<Hero> llHeroes = new LinkedList<>();
        llHeroes.addLast(new Hero("hero 1"));
        llHeroes.addLast(new Hero("hero 2"));
        llHeroes.addFirst(new Hero("hero X"));

        System.out.println(llHeroes);

        System.out.println(llHeroes.getFirst());
        System.out.println(llHeroes.getLast());
        System.out.println(llHeroes);

        System.out.println(llHeroes.removeFirst());
        System.out.println(llHeroes.removeLast());
        System.out.println(llHeroes);

    }

    public static void queueTest(){
        List<Hero> ll = new LinkedList<>();
        Queue<Hero> q = new LinkedList<>();

        System.out.println("初始化队列：");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));

        System.out.println(q);

        System.out.println("查看第一个元素："+q.peek());
        System.out.println("取出第一个元素："+q.poll());
        System.out.println("查看第一个元素："+q.peek());
    }

}

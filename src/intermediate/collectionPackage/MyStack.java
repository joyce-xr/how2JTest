package intermediate.collectionPackage;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * 使用LinkedList实现Stack栈
 * FILO
 */
public class MyStack implements Stack {

    LinkedList<Hero> llHero = new LinkedList<>(); ;

    @Override
    public void push(Hero h) {

        llHero.addLast(h);

    }

    @Override
    public Hero pull() {
        return llHero.removeLast();
    }

    @Override
    public Hero peek() {

//        Iterator<Hero> IHero = llHero.iterator();
//
//        while(IHero.hasNext()){
//            Hero result = IHero.next();
//            if (!IHero.hasNext()){
//                return result;
//            }
//        }

        return llHero.getLast();
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(new Hero("hero1"));
        myStack.push(new Hero("hero2"));
        myStack.push(new Hero("hero3"));
        myStack.push(new Hero("hero4"));
        System.out.println(myStack.peek());
        System.out.println(myStack.pull());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
    }
}



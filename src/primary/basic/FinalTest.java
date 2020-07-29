package primary.basic;

public class FinalTest {
    public void function1(){
        final int i = 1;
        //i = 5; 编译出错
    }

    public void funciotn2(){
        final int j ;
        j = 10;
        //j = 12; 编译报错
    }

    public void functiong3( final int i){
        //i = 3;不能赋值
        System.out.println(i);
    }

    public static void main(String[] args) {
        new FinalTest().functiong3(123);
    }
}

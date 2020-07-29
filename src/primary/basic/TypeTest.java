package primary.basic;

public class TypeTest {

    public static String get(Object obj){
        return obj.getClass().toString();
    }
    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        System.out.printf(get(a+b));
    }
}

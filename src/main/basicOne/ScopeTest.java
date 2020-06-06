public class ScopeTest {
    int i = 1;
    public static void function1 ( int i ){
        System.out.println(i);
    }

    public static void main(String[] args) {
        function1(5);
    }
}

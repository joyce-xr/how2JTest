package numberAndString;

public class BoxingTest {
    public static void main(String[] args) {
        byte b1 = 1;
        //byte b2 = i;   byte和integer不能自动拆箱
        //Integer i= b1;  byte 和integer不能自动装箱

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}

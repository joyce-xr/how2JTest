package primary.basic;

public class Long$shortTest {
    public static void main(String[] args) {
        int i=2;
        //长路： 不论结果如何，所有表达式都会运算
        System.out.println( i==1 & i++ ==2);
        System.out.println(i);

        int j = 2;
        //短路:  第一个表达式已经能够得出结论了，则不会第二个表达式不会再运算了
        System.out.println( j == 1 && j++ ==2);
        System.out.println(j);

    }
}

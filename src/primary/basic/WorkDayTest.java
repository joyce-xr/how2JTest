package primary.basic;

import java.util.Scanner;

public class WorkDayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("今天是星期几？");
        int i = input.nextInt();
        //三元操作符：表达式结果为true时返回值1，false时返回值2       表达式?值1:值2
        String s = i<6 ? "今天是工作日":"今天是周末";
        System.out.println(s);

    }
}

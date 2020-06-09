import java.util.Scanner;

public class FactorialTest {
    /*
    阶乘算法：N*(N-1)*(N-2)....
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        int i = n;
        int factorial = 1;
        do{
            factorial *= i;
            i--;
        }while(i>0);

        System.out.println(n + "的阶乘是：" + factorial);
    }
}

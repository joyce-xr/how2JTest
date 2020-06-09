import java.util.Scanner;

public class LeepYearTest {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        /*
        闰年判断条件：满足其一即可
        1. 如果能够被4整除，但是不能被100整除
        2. 能够被400整除
         */
        if((year%4 == 0) && (year%100 != 0)){
            System.out.println(year + "是闰年");
        }else if(year%400 == 0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "是平年");
        }

    }
}

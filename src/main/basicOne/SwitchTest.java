import java.util.Scanner;

public class SwitchTest {

    public static void seasonTest(int month){
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
        }
    }

    public static void weekTest(int week){
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("???");


        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = input.nextInt();
        seasonTest(month);
        System.out.println("今天是星期几？");
        int week = input.nextInt();
        weekTest(week);
    }
}

package primary.basic;

public class BeggarTest {

    public static void main(String[] args) {
        /*
        天朝有一个乞丐姓洪，去天桥要钱
        第一天要了1块钱
        第二天要了2块钱
        第三天要了4块钱
        第四天要了8块钱
        以此类推：每天的收入是前一天的两倍

        问题： 洪乞丐干10天，收入是多少？
         */

        int day =10;
        int oneDayIncome = 0;//一天的收入
        int income = 0; //总收入
        for(int i = 1; i<=day; i++){
            if(i==1){
                oneDayIncome = 1;
            }else{
                oneDayIncome *=2;
            }
            income +=oneDayIncome;
        }
        System.out.println(day + "天的收入是：" +income);

    }
}

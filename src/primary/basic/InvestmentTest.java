package primary.basic;

public class InvestmentTest {
    public static void main(String[] args) {
        /**
         * 每年投资1.2w，年化收益率20%，复利计算多久总收入可达到100w？
         */
        double expect = 100;//期望总收益
        double f = 0; //总收入
        double p = 1.2; //初始本金
        double r = 0.2;//年化收益率
        int n = 1; //需几年

        while(f<expect){
            for (int i = 1; i<=n; i++){  //计算当年总收入
                f = p*(1+r);
            }
            if(f>=expect){ //如果已经达到目标就结束
                break;
            }
            p = f + 1.2;  //还没有达到目标：次年继续追加1.2w的投资
            n++;
        }

        System.out.println("投资总收入达到" + expect + "需要" + n +"年");

    }
}

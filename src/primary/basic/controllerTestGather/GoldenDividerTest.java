package primary.basic.controllerTestGather;

public class GoldenDividerTest {
    /**题目
     * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
     * 分母和分子不能同时为偶数
     * 分母和分子 取值范围在[1-20]
     */
    public static void main(String[] args) {
        double min = 100; //最小距离
        double result=0;
        int targetDen=0;  //分母
        int targetMol=0;  //分子

        for(int i = 1; i <=20 ; i++){//分母循环
            System.out.println("i = " + i);
            for(int j = 0; j<i ; j++){ //分子，肯定小于分母，所以循环到分母就可以结束了
                System.out.println("j = "+ j);
                if(i%2 ==0 && j%2 ==0){ //分子分母都是偶数，则继续下一循环
                    continue;
                }
                double tmp = (double)j/i; //这里要注意：Int类型相除仍然是int类型，要显式转为浮点型
                System.out.println("j/i = " + tmp);
                System.out.println(Math.abs(tmp-0.618));
                if (Math.abs(tmp-0.618) < min){
                    min = Math.abs(tmp-0.618);
                    targetDen = i;
                    targetMol = j;
                    result = tmp;
                }
            }

        }

        System.out.println("离黄金分隔点（0.618）最近的数相除是： " + targetMol +"/"+targetDen+"=" +result);
    }

}

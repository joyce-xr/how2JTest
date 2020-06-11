package basic.controllerTestGather;

public class DaffodilsTest {
    /**
     * 水仙花数定义：
     * 1. 一定是3位数
     * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
     *
     * 寻找所有的水仙花数
     */
    public static void main(String[] args) {
//        for(int i=1; i<=9;i++){
//            for (int j=0; j<=9;j++){
//                for (int k=0; k<=9; k++){
//                    int tmp = i*100+j*10+k;
//                    if(tmp == i*i*i+j*j*j+k*k*k){//是水仙花数
//                        System.out.println(tmp);
//                    }
//                }
//            }
//        }

        for(int i = 100; i <1000; i++){
            int a = i/100; //取百位数
            int b = i%100/10; //取十位数
            int c = i%10; //取个位数
            int flower = a*100+b*10+c;

            if(flower == a*a*a+b*b*b+c*c*c){
                System.out.println(flower);
            }
        }
    }
}

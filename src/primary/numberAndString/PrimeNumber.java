package primary.numberAndString;

/**
 * 统计找出一千万以内，一共有多少质数
 */
public class PrimeNumber {

    public static boolean isPrime(int i){

        for(int j=2; j<=Math.sqrt(i); j++){
            if(i%j == 0){
                return false;
            }
        }
        System.out.println(i+"是质数");
        return true;
    }

    public static void main(String[] args) {
//        {
//            int num = 1;
//            for (int i = 2; i <= 10000000; i++) {
//
//                for (int j = 2; j < i; j++) {//以2到i之间的数作为除数
//                    if (i % j == 0) {//如果能整除，则i不是质数，直接结束循环
//                        System.out.println(i + "不是质数");
//                        break;
//                    }
//                    if (j == (i - 1)) {//没有跳出循环，且j=i-1时，说明i为质数
//                        System.out.println(i + "是质数");
//                        num++;
//                    }
//                }
//            }
//            System.out.println(num);
//        }


        long startTime = System.currentTimeMillis();
        int num = 1;
        for(int i=3; i<=1e7;i++){
            if(isPrime(i)){
                num++;
            }
        }
        System.out.printf("共%d个质数",num);
        long endTime = System.currentTimeMillis();
        System.out.println("统计用时："+ (endTime-startTime));

    }
}

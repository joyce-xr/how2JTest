package arrayTest;

public class MaxRandomTest {
    /**
     * 使用增强型for找出数组中最大的数
     */
    public static void main(String[] args) {
        int[] a = new RandomArray().getRandomIntArray();
        int max=0;
        for (int b:a){
            if(b>max){
                max = b;
            }
        }

        System.out.println("数组中最大数为："+max);
    }
}

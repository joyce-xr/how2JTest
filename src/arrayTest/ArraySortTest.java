package arrayTest;

public class ArraySortTest {
    public static void main(String[] args) {
        int[] a = new RandomArray().getRandomIntArray();

        /**选择法正序排序:把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来**/
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length;j++){
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("打印正序排序后数组：");
        for (int b:a) {
            System.out.println(b);
        }

        /**冒泡发倒序排序：
        冒泡法排序的思路：
        第一步：从第一位开始，把相邻两位进行比较
        如果发现前面的比后面的【小】，就把【小】的数据交换在后面，循环比较完毕后，最后一位就是最小的
        第二步： 再来一次，只不过不用比较最后一位
         **/
        for(int i=0;i<a.length-1;i++){ //要冒泡的次数
            for (int j=0; j<a.length-1-i;j++){ //每次比较相邻两个数
                if (a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                }
            }
        }

        System.out.println("打印倒序排序后数组：");
        for (int b:a) {
            System.out.println(b);
        }
    }
}

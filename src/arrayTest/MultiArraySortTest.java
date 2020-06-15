package arrayTest;

import java.util.Arrays;

/**
 * 二维数组排序
 */
public class MultiArraySortTest {
    /**
     * 首先定义一个5X8的二维数组，然后使用随机数填充满。
     * 借助Arrays的方法对二维数组进行排序。
     * 参考思路：
     *  先把二维数组使用System.arraycopy进行数组复制到一个一维数组
     *  然后使用sort进行排序
     *  最后再复制回到二维数组。
     */
    public static void main(String[] args) {
       RandomArray randomArray = new RandomArray();

       int[][] a = randomArray.getRandomIntMultiArray(5,8);
       int[] b = new int[40];


       for(int i=0; i<a.length;i++){
           System.arraycopy(a[i],0,b,i*a[0].length,a[0].length);
       }

       //打印一维数组
        System.out.println(Arrays.toString(b));

       //一维数组排序
        Arrays.sort(b);

        //排序后再复制回二维数组
        for(int i=0; i<a.length; i++){
            System.arraycopy(b,i*a[0].length,a[i],0,a[0].length);
            System.out.println(Arrays.toString(a[i]));
        }



    }
}

package arrayTest;

import java.util.Arrays;

public class ArraysTest {
    RandomArray randomArray = new RandomArray();

    void test1(){
        int[] a = randomArray.getRandomIntArray2(5);
        /**
         * copyOfRange(int[] original, int from, int to)
         * 第一个参数表示源数组
         * 第二个参数表示开始位置(包含)
         * 第三个参数表示结束位置(不包含)
         */
        int[] b = Arrays.copyOfRange(a,0,3);//

        for(int c:b){
            System.out.print(c + " ");
        }
    }
    void printArray(){
        int[] a = randomArray.getRandomIntArray2(6);
        System.out.println(Arrays.toString(a));
    }

    void sortArray(){
        int[] a = randomArray.getRandomIntArray2(7);
        Arrays.sort(a);
        System.out.println("打印排序后：");
        System.out.println(Arrays.toString(a));
    }

    void searchArray(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        Arrays.sort(a);
        System.out.println("打印排序后数组");
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));
    }

    void compareArray(){
//        int[] a = randomArray.getRandomIntArray2(8);
//        int[] b = randomArray.getRandomIntArray2(8);

        int[] a = {5,57, 22, 53, 48, 59, 27, 75};
        int[] b = {5,57, 22, 53, 48, 59, 27, 75};
        System.out.println("数组a和数组b相同： " + Arrays.equals(a,b));

    }

    public static void main(String[] args) {
        ArraysTest at = new ArraysTest();
        //at.test1();
        //at.printArray();
        //at.sortArray();
        //at.searchArray();
        at.compareArray();

    }
}

package primary.arrayTest;

public class BubbleSortTest {
    public static void main(String[] args) {
        /**
         * 冒泡法排序的思路：
         * 第一步：从第一位开始，把相邻两位进行比较
         * 如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
         * 第二步： 再来一次，只不过不用比较最后一位
         * 以此类推
         */
        int a [] = new int[]{18,62,68,82,65,9};
        //排序前，先把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for(int i=0; i<a.length-1;i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=tmp;
                }
            }
        }

        //打印排序后内容
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
}

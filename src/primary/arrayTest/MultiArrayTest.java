package primary.arrayTest;

public class MultiArrayTest {
    /**
     * 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
     * 找出这个二维数组里，最大的那个值，并打印出其二维坐标
     */
    public static void main(String[] args) {
        int[][] a = new int[4][5];
        int max = 0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=(int)(Math.random()*100);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }

        System.out.println("数组中最大值为：" + max);


    }
}

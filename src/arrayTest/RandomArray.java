package arrayTest;


public class RandomArray {


    /**
     * 提取方法：创建随机int数组
     */
    public int[] getRandomIntArray(){
        int[] a = new int[5];
        for (int i=0; i<a.length;i++){
            a[i]=(int) (Math.random()*100);
        }

        System.out.println("打印原始数组：");
        for (int b:a) {
            System.out.println(b);
        }

        return a;
    }

    /**
     * 提取方法：创建指定长度的随机int数组
     */
    public int[] getRandomIntArray2(int n){
        int[] a = new int[n];
        for (int i=0; i<n;i++){
            a[i]=(int) (Math.random()*100);
        }

        System.out.println("打印原始数组：");
        for (int b:a) {
            System.out.print(b + " ");
        }
        System.out.println();

        return a;
    }

    public int[][] getRandomIntMultiArray(int l1, int l2){//l1-一维长度；l2-二维长度

        int[][] a = new int[l1][l2];

        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                a[i][j] = (int) (Math.random()*100);
            }
        }

        System.out.println("打印原始二维数组：");
        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        return a;
    }
}

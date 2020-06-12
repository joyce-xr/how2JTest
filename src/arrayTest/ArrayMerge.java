package arrayTest;

public class ArrayMerge {
    /**
     * 首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组     *
     * 然后准备第三个数组，第三个数组的长度是前两个的和
     * 通过System.arraycopy 把前两个数组合并到第三个数组中
     */
    public static void main(String[] args) {
        int[] a = new RandomArray().getRandomIntArray2((int)(Math.random()*5+5));
        int[] b = new RandomArray().getRandomIntArray2((int)(Math.random()*5+5));
        int[] c = new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);

        System.out.println("打印出合并后结果：");
        for(int i:c){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

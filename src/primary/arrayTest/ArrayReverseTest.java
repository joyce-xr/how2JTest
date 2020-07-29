package primary.arrayTest;

public class ArrayReverseTest {
    public static void main(String[] args) {

        //创建数组的方法
        int[] a = new int[]{1,2,3,4,5};

        int[] b = {6,7,8};

        //int[] c = new int[3]{9,0,11};

        System.out.println("打印原数组：");
        for(int i =0; i<5;i++){
            a[i] = (int)(Math.random()*100);
            System.out.println(a[i]);
        }

        System.out.println("打印反转后数组：");
        for(int i=a.length; i>0;i--){
            System.out.println(a[i-1]);
        }
    }
}

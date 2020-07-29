package primary.arrayTest;

public class MinRandomTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] =(int) (Math.random()*100); //Math.random()返回0~1的浮点数
        a[1] =(int) (Math.random()*100);
        a[2] =(int) (Math.random()*100);
        a[3] =(int) (Math.random()*100);
        a[4] =(int) (Math.random()*100);
        int min =  100;
        System.out.println("数组中各随机数是：");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("数组中最小随机数是："+min);

    }
}

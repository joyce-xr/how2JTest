package basic.controllerTestGather;

public class NestCalcTest {
    /**
     * 多层嵌套计算
     * a+b=8    a  b <=8
     * c-d=6    c>=6
     * a+c=14   c<=14
     * b+d=10   d>=2   d<=10
     */
    public static void main(String[] args) {
        for(int a = 0; a<=8;a++){
            for(int b = 0;b<=8;b++){
                for(int c=6; c<=14;c++){
                    for(int d=2;d<=10;d++){
                        if(a+b==8 && c-d==6 && a+c==14 && b+d==10){
                            System.out.println("a="+a+ " ,b="+b+" ,c="+c+" ,d="+d);
                        }
                    }
                }
            }
        }
    }

}

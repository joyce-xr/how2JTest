package numberAndString;

import static numberAndString.CharacterTest.randomChars;

public class StringBufferTest {

    public static void main(String[] args) {

        basicFunction();
        //lengthAndCapacity();
        //stringPerformance();
        //stringBufferPerformance();

    }

    /**
     * 生成10位长度的随机字符串
     * 使用String的+,连接10000个随机字符串,计算消耗的时间
     */
    public static void stringPerformance(){

        String str = "";

        long startTime = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            str = str + randomChars(10);
        }
        long endTime = System.currentTimeMillis();

        long consumeTime = endTime - startTime;
        System.out.println(consumeTime);
        System.out.println(str);

    }

    /**
     * 生成10位长度的随机字符串
     * 使用StringBuffer,连接10000个随机字符串,计算消耗的时间
     */
    public static void stringBufferPerformance(){

        StringBuffer stringBuffer = new StringBuffer();

        long startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++){
            stringBuffer.append(randomChars(10));
        }
        long endTime = System.currentTimeMillis();

        long consumeTime = endTime - startTime;
        System.out.println("使用StringBuffer,连接1000000个随机字符串,计算消耗的时间为:" + consumeTime);

    }

    /**
     * 长度和容量
     */
    public static  void lengthAndCapacity(){

        StringBuffer stringBuffer = new StringBuffer("the");
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
    }

    /**
     * StringBuffer的基本方法append delete insert reverse
     */
    public static void basicFunction(){
        String str = "let there ";
        StringBuffer stringBuffer = new StringBuffer(str);

        //在最后追加be light
        stringBuffer.append("be light");
        System.out.println(stringBuffer);

        //删除4-10之间的字符
        stringBuffer.delete(4,4);//保留end
        System.out.println(stringBuffer);

        //在4这个位置插入 there
        stringBuffer.insert(4,"there ");
        System.out.println(stringBuffer);

        //反转
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}

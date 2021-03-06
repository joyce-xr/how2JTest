package primary.numberAndString;

import intermediate.myException.IndexIsNagetiveException;
import intermediate.myException.IndexIsOutofRangeException;

import static primary.numberAndString.CharacterTest.randomChars;

public class CompareStringBuffer {

    public static void main(String[] args) {
        StringBufferTest.stringBufferPerformance();

        MyStringBuffer msb = new MyStringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++){
            try {
                msb.append(randomChars(10));
            } catch (IndexIsOutofRangeException e) {
                e.printStackTrace();
            } catch (IndexIsNagetiveException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();

        long consumeTime = endTime - startTime;
        System.out.println("使用MyStringBuffer,连接1000000个随机字符串,计算消耗的时间为:" + consumeTime);
    }
}

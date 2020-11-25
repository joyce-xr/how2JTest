package jmeterTest;

import java.util.Random;

public class RandomNumberTool {

    public static void main(String[] args) {
        int i = (int)Math.floor(Math.random()*10+1);

        System.out.println(i);

        Random random = new Random();
        int i2 = random.nextInt(12);
        System.out.println(i2+1);
    }
}

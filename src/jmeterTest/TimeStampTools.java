package jmeterTest;

import java.util.Date;

public class TimeStampTools {

    public static void main(String[] args){
        Date now = new Date();

        System.out.println(now.getTime());
        System.out.println(now.getTime()/1000);



    }
}

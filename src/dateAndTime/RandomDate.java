package dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RandomDate {

    public static void main(String[] args) {

        //getRandomDate(1995,1995);
        //dateFormatPractice();

        //calendarDateConserse();

        turnCalendar();
    }

    /**
     * 翻日历
     */
    public static void turnCalendar(){

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前日期：\t" + simpleDateFormat.format(calendar.getTime()));

        //下个月今天
        calendar.add(Calendar.MONTH,1);
        System.out.println("下个月今天：\t" + simpleDateFormat.format(calendar.getTime()));

        //去年今天
        calendar.setTime(now);
        calendar.add(Calendar.YEAR,-1);
        System.out.println("去年的今天: \t" + simpleDateFormat.format(calendar.getTime()));

        //上个月的第三天
        calendar.setTime(now);
        calendar.add(Calendar.MONTH,-1);//上个月今天
        calendar.set(Calendar.DAY_OF_MONTH,3);
        //calendar.set(Calendar.DATE,3);
        System.out.println("上个月的第三天：\t" + simpleDateFormat.format(calendar.getTime()));

        //上个月最后一天
        calendar.setTime(now);
        calendar.set(Calendar.DAY_OF_MONTH,1);//本月第一天
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println("上个月的最后一天：\t" + simpleDateFormat.format(calendar.getTime()));

        //下个月倒数第三天
        //1、下下个月第一天-3
        calendar.setTime(now);
        calendar.add(Calendar.MONTH,2);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        System.out.println("下个月的倒数第三天：\t" + simpleDateFormat.format(calendar.getTime()));

    }

    /**
     * Calendar与Date进行转换
     */
    public static void calendarDateConserse(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("calendar.getTime() : " + date);

        Date date2 = new Date(0);
        calendar.setTime(date2);
        System.out.println(date2);
    }


    /**
     * 获取指定区间内的随机日期
     * @param startYear
     * @param endYear
     * @return
     */
    public static Date getRandomDate(int startYear, int endYear){
        Date date1=new Date(startYear-1900, 1-1, 1, 0, 0, 0);
        Date date2 = new Date(endYear-1900, 12-1, 31, 23, 59, 59);

        //System.out.printf("%d年的第一天：%s%n",startYear,date1);
        //System.out.printf("%d年的最后一天：%s%n",endYear,date2);

        Date randomDate = new Date((long)(Math.random()*(date2.getTime()-date1.getTime()+1)+date1.getTime()));
        //System.out.printf("%d年到%d年中的一个随机时间：%s%n",startYear,endYear,randomDate);

        return randomDate;
    }

    /**
     * 准备一个长度是9的日期数组
     * 使用1970年-2000年之间的随机日期初始化该数组
     * 按照这些日期的时间进行升序排序
     * 比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
     */
    public static void dateFormatPractice(){
        Date[] dates = new Date[9];
        System.out.println("得到的随机日期数组：");
        for(int i=0; i<dates.length; i++){

            dates[i] = getRandomDate(1970,2000);
            String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dates[i]);
            System.out.printf("%s\t\t",s);
            if((i+1)%3 == 0){
                System.out.println();
            }
        }

        //根据getTime排序
        for(int i=0; i<dates.length; i++){
            for(int j=i+1; j<dates.length; j++){
                if(dates[j].getTime() < dates[i].getTime()){
                    Date temp = dates[i];
                    dates[i] = dates[j];
                    dates[j] = temp;
                }
            }
        }

        System.out.println("排序后的随机日期数组：");
        for (int i=0; i<dates.length; i++){
            String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dates[i]);
            System.out.printf("%s\t\t",s);
            if((i+1)%3 == 0){
                System.out.println();
            }
        }



    }

    public static void test1(){
        String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date());
        System.out.println("当前时间格式化：" +s);
    }

    public static void test2(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s = "2020/07/29 10:00:00";
        try {
            Date d = format.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            System.out.println("字符串格式不正确，无法转化为日期");
            e.printStackTrace();
        }
    }
}

package numberAndString;

import java.util.Scanner;


public class CharacterTest {
    public static void main(String[] args) {
        //练习1：
        //printUpperCaseAndDigit();

        //练习2：
        //System.out.println(randomChars(5));

        //练习3：
        //stringArrayRank(8);

        //练习4：
        decryption();

    }

    /**
     * 练习4：破解密码
     * 1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
     * 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
     * 要求： 分别使用多层for循环 和 递归解决上述问题
     */
    public static void decryption(){
        //创建长度为3的随机字符串（大写字母、小写字母、数字），作为密码
        String password = randomChars(3);
        System.out.println("打印密码："+ password);

        char[] guessPsd = new char[3];

        outloop:
        for (short i ='0';i<='z';i++){
            for(short j = '0';j<='z';j++){
                for(short k = '0'; k<='z';k++){
                    //System.out.println("测试：" + (char)i+(char)j+(char)k);

                    guessPsd[0]=(char)i;
                    guessPsd[1]=(char)j;
                    guessPsd[2]=(char)k;

                    if(new String(guessPsd).equals(password)){
                        System.out.println("嵌套循环穷举法，找到密码为：" + (char)i+(char)j+(char)k);
                        break outloop;
                    }
                }
            }
        }

        //System.out.println("测试：打印破解的密码："+ new String(guessPsd));

    }


    /**
     * 练习3：创建一个长度是8的字符串数组，使用8个长度是5的随机字符串初始化这个数组，对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
     * @param l 数组长度
     * @return 返回排序后数组
     */
    public static String[] stringArrayRank(int l){

        System.out.println("测试：打印原始数组：");
        String[] sArray = new String[l];
        for(int i=0;i<l;i++){
            sArray[i] = randomChars(5);
            System.out.printf("[%s] ",sArray[i]);
        }
        System.out.println();

        //选择法正序
        for(int i=0;i<l-1;i++){//需排l-1次
            for(int j=i+1;j<l;j++){
                if(sArray[i].charAt(0)>sArray[j].charAt(0)){ //对比字符串首字母
                    String tmp = sArray[i];
                    sArray[i] = sArray[j];
                    sArray[j] = tmp;
                }
            }
        }

        for(String s : sArray){
            System.out.printf("[%s] ",s);
        }

        return sArray;

    }

    /**练习2：
     * 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
     * 返回：由5个随机字符生成的字符串
     */
    public static String randomChars(int num){
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = new char[num];

        for(int i=0; i<num; i++){
            int random = (int)(Math.random()*str.length());
            chars[i] = str.charAt(random);
            //System.out.printf("第%d个字符是%s%n",random,chars[i]);
        }

        String s = String.valueOf(chars);
        return s;
    }

    /**练习1：
     * 通过Scanner从控制台读取字符串，然后把字符串转换为字符数组,转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
     */
    public static void printUpperCaseAndDigit(){
        System.out.println("请随意输入大写字母、小写字母、数字：");

        Scanner in = new Scanner(System.in);
        String s = in.next();

        char[] chars = s.toCharArray();
        for (char c:chars) {
            if (Character.isUpperCase(c) || Character.isDigit(c)){
                System.out.print(c);
            }
        }
    }

}





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
        //decryption();

        //练习5：
        //upperFirstLetter();

        //练习6：
        //countTwister('p');

        //练习7
        //lengendary();

        //练习8
        //lengendary2();

        //练习9
        //changeLastTwo();

        //练习10
        countRepeat();


    }

    /**
     * 练习10：
     * 创建一个长度是100的字符串数组
     * 使用长度是2的随机字符填充该字符串数组
     * 统计这个字符串数组里重复的字符串有多少种
     */
    public static void countRepeat(){

        //创建并打印长度是100的字符串数组，每20个一行
        String[] arrays = new String[100];
        for(int i=0; i<100; i++){
            arrays[i] = randomChars(2);
            System.out.printf("%s ",arrays[i]);
            if((i+1)%20 == 0){
                System.out.println();
            }
        }

        String[] duplicate = new String[50];//存储重复的字符串数组
        int count = 0;//重复的字符串个数
        outloop:
        for(int i=0; i<100; i++){
            for(int j=i+1; j<100; j++){
                if(arrays[i].equals(arrays[j])){
                    for(int k=0; k<count; k++){//遍历重复数组，看arrays[i]是否已经在其中
                        System.out.println("测试：遍历重复数组");
                        if(arrays[i].equals(duplicate[k])){//如果已经在，则直接进入下一次循环
                            continue outloop;
                        }
                    }
                    duplicate[count++] = arrays[i];//如果不在重复数组中，则加入并计数
                    break;
                }
            }
        }

        //输出结果
        System.out.printf("共有%d种重复的字符串%n",count);
        if(count>0){
            System.out.print("它们是：");
            for(int i=0; i<count; i++){
                System.out.printf("%s ",duplicate[i]);
            }
        }
    }

    /**
     * 练习9：
     * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
     * 把最后一个two单词首字母大写
     */
    public static void changeLastTwo(){
        String sentence = "Nature has given us that two ears, two eyes, and but one tongue, " +
                "to the end that we should hear and see more than we speak";
        char[]  sentenceArrays = sentence.toCharArray();
        //找到最后一个two，获取到所在位置 lastIndexOf
        int index = sentence.lastIndexOf("two");
        //System.out.println(index);
        sentenceArrays[index] = Character.toUpperCase(sentenceArrays[index]);
        System.out.println(sentenceArrays);
    }

    /**
     * 练习8：把 lengendary 最后一个字母变大写
     */
    public static void lengendary2(){
        //把字符串转化为char数组，然后根据数组索引值能否被2整除判断大写还是小写，组成新的字符串
        String letter = "lengendary";
        char[] charsLetter = letter.toCharArray();

        char last = Character.toUpperCase(charsLetter[charsLetter.length-1]);//最后一个字母转大写
        charsLetter[charsLetter.length-1] = last;

        System.out.println(charsLetter);
    }

    /**
     * 练习7：把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
     */
    public static void lengendary(){
        //把字符串转化为char数组，然后根据数组索引值能否被2整除判断大写还是小写，组成新的字符串
        String letter = "lengendary";
        String result = "";
        char[] charsLetter = letter.toCharArray();
        for (int i=1; i<=charsLetter.length; i++){
            if(i%2 != 0){//奇数位字母转大写
                //result = result + String.valueOf(charsLetter[i-1]).toUpperCase();
                result = result + Character.toUpperCase(charsLetter[i-1]);
            }else{//偶数位的不用转，直接拼接
                result = result + charsLetter[i-1];
            }
        }
        System.out.println(result);
    }

    /**
     * 练习6：
     * 英文绕口令：peter piper picked a peck of pickled peppers
     * 统计这段绕口令有多少个以p开头的单词
     * @param aimWord   要统计的目标字母
     * @return 统计结果（个）
     */
    public static int countTwister(char aimWord){

        String sentence = "peter piper picked a peck of pickled peppers";
        int count = 0;

        String[] splitS = sentence.split(" ");//把语句按单词分割为字符串数组
        for (int i=0; i<splitS.length; i++){
            if((splitS[i].charAt(0)) == aimWord){ //单词首字母是否是目标字母p
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /**
     * 练习5：
     * 给出一句英文句子： "let there be light"
     * 得到一个新的字符串，每个单词的首字母都转换为大写
     */
    public static void upperFirstLetter(){
        String sentence = "let there be light";
        String[] splitS = sentence.split(" ");//把语句按单词分割为字符串数组

        String[] temp = new String[splitS.length];//用于存放首字母大写后的字符串数组
        String result="";
        for (int i=0;i<splitS.length;i++){
            String a = String.valueOf(splitS[i].charAt(0));//单词首字母
            temp[i]=splitS[i].replaceFirst(a,a.toUpperCase());//首字母替换为大写
            result = result + temp[i] + " ";
        }

        System.out.println(result);
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





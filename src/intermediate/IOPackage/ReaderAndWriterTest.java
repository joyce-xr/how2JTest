package intermediate.IOPackage;

import java.io.*;

public class ReaderAndWriterTest {

    public static void main(String[] args) {

        //从字符输入流读
        //test1();

        //向字符输出流写
        //test2();

        //System.out.println(charToASCII('a'));
        //System.out.println(ASCIIToChar(97));

//        char c ='1';
//        int i = 97;
//        System.out.println(c>'2');


        //加密测试
        File encodingFile = new File("D:\\ideaWorkSpace\\fileTest\\TXT1.txt");
        File edcodedFile = new File("D:\\ideaWorkSpace\\fileTest\\TXT1-edcode.txt");
        encodeTest(encodingFile,edcodedFile);

    }

    /**
     * 练习题：文件加密
     * 在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
     * 加密算法：
     * 数字：
     * 如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
     * 如果是9的数字，变成0
     * 字母字符：
     * 如果是非z字符，向右移动一个，比如d变成e, G变成H
     * 如果是z，z->a, Z-A。
     * 字符需要保留大小写
     * 非字母字符
     * 比如',&^ 保留不变，中文也保留不变
     * 建议： 使用以前学习的练习题中的某个Java文件，比如循环练习，就有很多的字符和数字
     * @param encodingFile
     * @param edcodedFile
     */
    public static void encodeTest(File encodingFile, File edcodedFile){

        char[] all = new char[(int)encodingFile.length()];

        //字符输入流从encodingFile读取
        try(FileReader fileReader = new FileReader(encodingFile)){

            //存储所有读取进来的字符
            fileReader.read(all);

            //遍历字符数组，进行加密
            for(int i=0; i<all.length; i++){
                if(all[i] == '9'){//如果是数组9：变成0
                    all[i]='0';
                }else if(all[i] == 'Z'){//如果是字母Z:变成A
                    all[i] = 'A';
                }else if(all[i] == 'z'){//如果是字母z:变成a
                    all[i] = 'a';
                }else if((all[i] >= '0' && all[i] < '9') ||  (all[i] >= 'a' && all[i] < 'z') || (all[i] >= 'A' && all[i] < 'Z')){//如果是其他数字或字母：向右移1
                    all[i] = (char) ((int)all[i]+1);
                }
                //如果非数字、字母，则保持不变

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //字符输出流向edcodedFile写入加密后字符
        try(FileWriter fileWriter = new FileWriter(edcodedFile)){
            fileWriter.write(all);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //测试字符和ASCII码转换
    private static int charToASCII(char c){

        int result = (int)c;

        return result;
    }
    private static char ASCIIToChar(int a){
        char result = (char) a;
        return result;
    }

    public static void test1(){
        File f = new File("D:\\ideaWorkSpace\\fileTest\\TXT1.txt");//创建文件对象
        try(FileReader fileReader = new FileReader(f)){//创建基于文件的字符流；放在try中，try/catch块结束后自动关闭流
            char[] all = new char[(int)f.length()];
            fileReader.read(all);
            for (char c: all){
                System.out.print(c);//打印
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void test2(){
        File f = new File("D:\\ideaWorkSpace\\fileTest\\TXT1.txt");//创建文件对象
        try(FileWriter fileWriter = new FileWriter(f)){
            char[] cs = "FileWriter.write()测试".toCharArray();
            fileWriter.write(cs);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

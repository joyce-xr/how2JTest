package intermediate;

import primary.interfaceAndImplement.practice.Fish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionTest {

    public static void main(String[] args) {

        //test1();
        //method1();
        //System.out.println(method());

        runtimeExceptionTest();
    }

    private static void runtimeExceptionTest(){
        try{
            //任何除数不能为0:ArithmeticException
            int k = 5/0;
        }catch(RuntimeException e){
            System.out.println("【异常】：除数不能为0");
        }

        try{
            //下标越界异常：ArrayIndexOutOfBoundsException
            int j[] = new int[5];
            j[10] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("【异常】：数组越界");
        }

        try{
            //空指针异常：NullPointerException
            String str = null;
            str.length();
        }catch (NullPointerException e){
            System.out.println("【异常】：空指针");
        }

    }

    public static int method(){
        try {
            System.out.println("执行try");
            return 1;
        }catch (Exception e){
            System.out.println("执行catch");
            return 2;
        }finally {
            System.out.println("执行finally");
            return 3;
        }
    }

    private static void method1(){
        System.out.println("执行method1");

        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void method2() throws FileNotFoundException {

        System.out.println("执行method2");

        String filePath = "D:/hello.txt";
        //String filePath = "D:/helloWorld.txt";
        File f = new File(filePath);


        System.out.printf("尝试打开文件 [%s]%n" ,filePath);
        new FileInputStream(f);

    }

    private static void test1() {
        //String filePath = "D:/hello.txt";
        String filePath = "D:/helloWorld.txt";
        File f = new File(filePath);

        try {
            System.out.printf("尝试打开文件 [%s]%n" ,filePath);
            new FileInputStream(f);
            System.out.println("文件打开成功");
        } catch (FileNotFoundException e) {
            System.out.printf("[%s] 文件不存在%n",filePath);
            e.printStackTrace();
        }
    }
}

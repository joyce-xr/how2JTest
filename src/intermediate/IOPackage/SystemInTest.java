package intermediate.IOPackage;

import java.io.*;
import java.util.Scanner;

public class SystemInTest {

    public static void main(String[] args) {
        autoNewClass();
    }

    public static void autoNewClass(){

        Scanner s = new Scanner(System.in);
        System.out.println("请输入类名称：");
        String className = s.nextLine();
        System.out.println("请输入属性类型：");
        String fieldType = s.nextLine();
        System.out.println("请输入属性名称：");
        String fieldName = s.nextLine();

        char f = fieldName.toCharArray()[0];
        String first = String.valueOf(f).toUpperCase();
        String UfieldName = fieldName.replaceFirst(String.valueOf(f),first);

        String classContext = "public class @class@ {\n" +
                "    public @type@ @property@;\n" +
                "    public @class@() {\n" +
                "    }\n" +
                "    public void set@Uproperty@(@type@  @property@){\n" +
                "        this.@property@ = @property@;\n" +
                "    }\n" +
                "      \n" +
                "    public @type@  get@Uproperty@(){\n" +
                "        return this.@property@;\n" +
                "    }\n" +
                "}";

        String classNew = classContext.replaceAll("@class@",className)
                .replaceAll("@type@",fieldType)
                .replaceAll("@property@",fieldName)
                .replaceAll("@Uproperty@",UfieldName);

        //System.out.println(classNew);

        //生成java文件
        File file = new File("D:\\ideaWorkSpace\\fileTest\\AutoJava.java");
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                PrintWriter printWriter = new PrintWriter(fileOutputStream);
                ) {

            printWriter.write(classNew);

            printWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void test1(){
        try(InputStream in = System.in){
            while(true){
                int i = in.read();
                System.out.println(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test2() {

        Scanner s = new Scanner(System.in);

        while(true){
            String line = s.nextLine();
            System.out.println(line);
        }

    }

    public static void test3(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
    }
}

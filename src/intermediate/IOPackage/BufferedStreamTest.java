package intermediate.IOPackage;

import java.io.*;

public class BufferedStreamTest {

    public static void main(String[] args) {

        removeComments(new File("D:\\ideaWorkSpace\\fileTest\\Test.java"));
    }

    /**
     * 使用缓存流读取数据
     */
    public static void test1(){
        File f = new File("D:\\ideaWorkSpace\\fileTest\\hello.txt");//文件对象
        try (
                FileReader fileReader = new FileReader(f);//文件字符流
                BufferedReader bufferedReader = new BufferedReader(fileReader);//在文件字符流基础上创建缓存流
        ){

            while (true){

                String line = bufferedReader.readLine();
                if(line == null){//文件结束的标志是readLine返回null
                    break;
                }
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用缓存流写出数据
     */
    public static void test2(){

        File f = new File("D:\\ideaWorkSpace\\fileTest\\hello2.txt");
        try(
                FileWriter fileWriter = new FileWriter(f);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                ){
            printWriter.println("jdhfalkdhjf28937892");
            printWriter.println("哈哈哈哈！");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 练习1：移除Java文件中的注释
     */
    public static void removeComments(File javaFile){

        String newFilePath = "D:\\ideaWorkSpace\\fileTest\\TestRemoved.java";

        File newFile = new File(newFilePath);

        try(
        FileReader fileReader = new FileReader(javaFile);
        FileWriter fileWriter = new FileWriter(newFile);
        ) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while (true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }else if(!line.trim().startsWith("//")){//读取的行不是以//开头的就写入新文件（java文件有缩进，需去掉前后空格）
                    printWriter.println(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

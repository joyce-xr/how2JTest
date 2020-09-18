package intermediate.IOPackage;

import javax.xml.crypto.Data;
import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {

        //write();
        //read();

        //bufferedReadAndWrite();
        dataStreamReadAndWrite();
    }

    /**
     * 读写两个数字的两种方法1：缓存流
     */
    public static void bufferedReadAndWrite(){
        File file = new File("D:\\ideaWorkSpace\\fileTest\\intR&W.txt");

        try{
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("%d@%d",13,15);
            printWriter.flush();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
            String[] numbers = line.split("@");

            System.out.println("文件中包含的数字有：");
            for(String s: numbers){
                System.out.printf("%d\t" ,Integer.valueOf(s));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 读写两个数字的两种方法2：数据流
     */
    public static  void dataStreamReadAndWrite(){
        File file = new File("D:\\ideaWorkSpace\\fileTest\\intR&W.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(13);
            dataOutputStream.writeInt(15);
            dataOutputStream.flush();

            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            int i1 = dataInputStream.readInt();
            int i2 = dataInputStream.readInt();

            System.out.printf("文件中包含的数据有: %d,%d",i1,i2);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /**
     * 数据流写方法
     */
    public static void write(){
        File file = new File("D:\\ideaWorkSpace\\fileTest\\hello.txt");
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                ){
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeUTF("123 this is gareen");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据流读方法
     */
    public static void read(){
        File file = new File("D:\\ideaWorkSpace\\fileTest\\hello.txt");

        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                ){

            boolean b = dataInputStream.readBoolean();
            int i = dataInputStream.readInt();
            String s = dataInputStream.readUTF();

            System.out.println("读取的布尔值为：" + b);
            System.out.println("读取的int值为：" + i);
            System.out.println("读取的字符串为：" + s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

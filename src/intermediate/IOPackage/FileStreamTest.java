package intermediate.IOPackage;

import java.io.*;

public class FileStreamTest {

    public static void main(String[] args) {
        File f = new File("D:\\ideaWorkSpace\\fileTest\\TXT1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(f);
            FileOutputStream fileOutputStream = new FileOutputStream(f);

            fileOutputStream.write(97);

            System.out.println(fileInputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

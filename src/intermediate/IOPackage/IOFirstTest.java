package intermediate.IOPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IOFirstTest {

    //用于创建文件夹、创建文件、删除文件
    static String directory = "D:\\ideaWorkSpace\\fileTest2\\fileTest2-1";
    static  String  fileName = "newFiletxt.txt";

    public static void main(String[] args) {

        test5();

    }

    //练习6：删除文件
    public static void test6(){
        File f = new File(directory,fileName);
        f.delete();
    }

    //练习5：创建文件
    public static void test5(){
        File f = new File(directory,fileName);
        try {
            f.getParentFile().mkdirs();
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //练习4：创建文件夹
    public static void test4(){
        File d2 = new File("D:\\ideaWorkSpace\\fileTest2\\fileTest2-1");
        //创建文件夹,如果父目录不存在，则创建失效
        d2.mkdir();
        //创建文件夹,如果父目录不存在，则创建父目录
        d2.mkdirs();

    }

    //练习3：list
    public static void test3() {
        File d = new File("D:\\ideaWorkSpace\\fileTest");

        //打印文件夹下所有文件
        for (String s : d.list()){//以字符串数组的形式返回文件夹下所有文件
            System.out.println(s);
        }
        for (File f : d.listFiles()){//以文件数组的形式返回文件夹下所有文件
            System.out.println(f.getName());
        }

        System.out.println("当前文件/文件夹所在目录：" + d.getParent());//以字符串形式返回
        System.out.println("当前文件/文件夹所在目录（File）" + d.getParentFile());//以文件形式返回

        //列出所有盘符
        System.out.println("所有盘符：");
        for (File f : d.listRoots()){
            System.out.printf("%s   ",f.toString());
        }

    }

    //练习2：
    public static void test2(){
        File f = new File("D:\\ideaWorkSpace\\fileTest\\TXT1.txt");
        System.out.println("当前文件是：" + f);

        System.out.println("文件是否存在：" + f.exists());
        System.out.println("文件长度：" + f.length());
        System.out.println("判断是否是文件：" + f.isFile());
        System.out.println("判断是否是文件夹：" + f.isDirectory());

        System.out.println("文件最后修改时间："
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(f.lastModified())));
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);
        System.out.println("文件最后修改时间："
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(f.lastModified())));

        //文件重命名
        File f2 = new File("D:\\ideaWorkSpace\\fileTest\\TXT2.txt");
        f.renameTo(f2);
        System.out.println("重命名后f的文件名为：" + f);
        System.out.println("重命名后f的name属性值为：" + f.getName());

    }

    //练习1
    public static void test1(){
        File f1 = new File("helloWorld.txt");//相对路径创建对象

        File f2 = new File("D:\\pathTest");//绝对路径创建对象

        System.out.println("f1的绝对路径" + f1.getAbsolutePath());
        System.out.println("f2的绝对路径" + f2.getAbsolutePath());

        File f3 = new File(f2,"hello.txt");
        System.out.println("f3的绝对路径" + f3.getAbsolutePath());
    }
}

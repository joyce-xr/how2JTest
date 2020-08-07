package intermediate.IOPackage;

import java.io.File;

public class IOPractice {


    static long max=0;
    static long min=Long.MAX_VALUE;

    static File maxFile = null;
    static File minFile = null;

    /**练习1：遍历文件夹
     * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
     * 遍历这个目录下所有的文件(不用遍历子目录)
     * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
     * 注: 最小的文件不能是0长度
     */
    public static void listDirectory(String path){

        File d = new File(path);
        File[] files = d.listFiles();
        for(File f : files){
            System.out.printf("文件%s的长度是：%d%n",f.getAbsolutePath(),f.length());
            if(f.length() > 0){
                if(f.length() < min){
                    min = f.length();
                    minFile = f;
                }
                if(f.length() > max){
                    max = f.length();
                    maxFile = f;
                }
            }

        }
        System.out.printf("最大的文件是%s，其大小是：%d%n",maxFile,max);
        System.out.printf("最小的文件是%s，其大小是：%d%n",minFile,min);
    }

    /**练习2：遍历文件夹(含子目录)
     * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
     * 遍历这个目录下所有的文件(含子目录)
     * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
     * 注: 最小的文件不能是0长度
     */
    public static void recursionListDirectory(String path) throws NullPointerException{

        File d = new File(path);
        File[] files = d.listFiles();

        for (File f : files){
            System.out.printf("文件%s的长度是：%d%n",f.getAbsolutePath(),f.length());
            if(f.isDirectory() && !f.equals(null)){//如果是子文件夹，则递归遍历

                recursionListDirectory(f.getAbsolutePath());
            }else if(f.isFile()){//如果是文件，则判断长度
                if(f.length() > 0 && f.length() < min){
                    min = f.length();
                    minFile = f;
                }
                if(f.length() > max){
                    max = f.length();
                    maxFile = f;
                }

            }
        }

    }


    public static void main(String[] args) {

        String path = "D:\\收付嘉";
        //listDirectory(path);
        recursionListDirectory(path);
        System.out.printf("最大的文件是%s，其大小是：%d%n",maxFile,max);
        System.out.printf("最小的文件是%s，其大小是：%d%n",minFile,min);

    }
}

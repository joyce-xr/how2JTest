package intermediate.IOPackage;

import java.io.*;

/**
 * 综合练习
 */
public class Comprehensive {
    public static void main(String[] args) {

        //复制文件
//        String srcFile = "D:\\ideaWorkSpace\\fileTest\\新建文本文档 (2).txt";
//        String destFile = "D:\\ideaWorkSpace\\fileTest\\新建文本文档 (2)-copy.txt";
//        copyFile(srcFile,destFile);

        //复制文件夹
//        String srcDirPath = "D:\\ideaWorkSpace\\fileTest\\dirCopy";
//        String destDirPath = "D:\\ideaWorkSpace\\fileTest\\dirCopy2";
//        copyFolder(srcDirPath,destDirPath);

        File folder = new File("D:\\ideaWorkSpace\\fileTest\\keyWordSearchDir");
        search(folder,"异常");

    }

    /**
     * 复制文件：缓存流
     * @param srcFile
     * @param destFile
     */
    public static  void copyFile(String srcFile, String destFile){

        File src = new File(srcFile);
        File dest = new File(destFile);

        try(
                FileReader fileReader =  new FileReader(src);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(dest);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                ){

            while(true){
                String line = bufferedReader.readLine();//原文件不是utf-8编码时，读取的是乱码
                if(line == null){
                    break;
                }else {
                    printWriter.write(line);
                }
            }
            printWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 复制文件夹
     * @param srcFolder
     * @param destFolder
     */
    public static void copyFolder(String srcFolder, String destFolder){

        File src = new File(srcFolder);
        File dest = new File(destFolder);

        if(src.isDirectory()){

            //如果是文件夹，遍历；
            for(String s : src.list()){

                //使用遍历出来的子文件（夹）继续调用复制文件夹方法
                copyFolder(src.getAbsolutePath()+"\\"+s,dest.getAbsolutePath()+"\\"+s);
            }

        }else{

            dest.getParentFile().mkdirs();//****先创建父级文件夹，不然会报错：路径不存在
            //如果不是文件夹，复制文件
            copyFile(src.getAbsolutePath(),dest.getAbsolutePath());
        }

    }

    /**
     * 在目标路径folder中查找包含关键字search的文件
     * @param folder
     * @param search
     */
    public static void search(File folder, String search){

        if(folder.isDirectory()){
            //遍历文件夹
            for(String s : folder.list()){
                //System.out.println(s);
                File file = new File(folder.getAbsolutePath()+"\\" +s);
                file.mkdirs();
                search(file,search);
            }

        }else {//目标路径是文件时，读取文件内容，判断是否包含关键字

            try(
                    FileReader fileReader = new FileReader(folder);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    ){
                while(true){
                    String line = bufferedReader.readLine();
                    if(line == null){
                        break;
                    }else if (line.contains(search)){
                        System.out.printf("文件%s包含关键字【%s】\n", folder.getAbsolutePath(),search);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

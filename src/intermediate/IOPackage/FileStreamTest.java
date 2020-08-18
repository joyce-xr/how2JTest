package intermediate.IOPackage;

import primary.numberAndString.MyStringBuffer;

import java.io.*;

public class FileStreamTest {

    public static void main(String[] args) {

        //inputStreamTest("D:\\ideaWorkSpace\\fileTest\\TXT1.txt");

        //outputStreamTest("D:\\ideaWorkSpace\\fileTest\\D1\\D2\\hello.txt");

        //文件拆分
        //fileSplit("D:\\ideaWorkSpace\\fileTest\\收付嘉产品接口协议(JavaApi)-V4.5-20180724.docx");//超过100kb

        //fileSplit("D:\\ideaWorkSpace\\fileTest\\接口列表V2.0.xlsx");//不足100kb

        //合并文件
        fileMerge(fileSplit("D:\\\\ideaWorkSpace\\\\fileTest\\\\收付嘉产品接口协议(JavaApi)-V4.5-20180724.docx"));

    }

    /**
     * 合并文件
     */
    public static void fileMerge(String[] subFileName){

        //如果入参为null，则无需合并
        if(subFileName == null){
            System.out.println("没有需要合并的文件");
            return;
        }

        try {
            //合并后的文件名
            String fileName = subFileName[0].split("-")[0]+ "-merge";
            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            //子文件数组
            File[] subFiles = new File[subFileName.length];
            for(int i=0; i<subFileName.length; i++){
                subFiles[i] =  new File(subFileName[i]);
                byte[] b = new byte[(int) subFiles[i].length()];
                FileInputStream fileInputStream = new FileInputStream(subFiles[i]);
                fileInputStream.read(b);
                fileOutputStream.write(b);

                fileInputStream.close();
                subFiles[i].delete();
            }

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束
     * @param filePath
     */
    public static String[] fileSplit(String filePath){

        try {
            File f = new File(filePath);
            FileInputStream fil = new FileInputStream(f);

            if(f.length() < 100*1024){//如果文件长度不足100kb就不拆分
                System.out.println("文件不足100kb，无需拆分");
                return null;
            }

            byte[] all = new byte[(int) f.length()];//按文件字节长度创建字节数组
            fil.read(all);//以字节流的形式读取文件

            //文件长度转化为kb
            double fileLength = Math.ceil(f.length()/1024);
            System.out.println("文件长度（byte）：" + f.length());
            System.out.println("文件长度（KB）：" + fileLength);

            int fileNum = (int) Math.ceil(fileLength/100);//拆分为几个文件（向上取整）
            String[] subFileName = new String[fileNum];

            for(int i=0; i<fileNum; i++){
                System.out.println("一级循环，打印i: "+ i);
                //创建拆分后的文件名
                subFileName[i] = f.getAbsolutePath() + "-" +i;
                File subFile = new File(subFileName[i]);
                FileOutputStream fol = new FileOutputStream(subFile);
                for(int j=i*100*1024; j<(i+1)*100*1024; j++){//每100kb循环，写入拆分后的文件
                    if(j>=f.length()){//如果当前索引值已等于文件长度，则跳出循环
                        break;
                    }
                    fol.write(all[j]);
                }
                fol.close();
            }

            System.out.println("打印子文件名：");
            for (String s : subFileName){
                System.out.println(s);
            }

            fil.close();
            return subFileName;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    //public static void singleByteWrite()


    public static void outputStreamTest(String filePath){
        try {
            File f = new File(filePath);
            int dIndex = filePath.lastIndexOf("\\");
            String directory = filePath.substring(0,dIndex);
            File d = new File(directory);


            //1、判断文件是否存在，如果不存在，继续判断文件夹是否存在；
            //2、如果文件夹也不存在，就先创建文件夹
            if(!f.exists()){
                if(!d.exists()){
                    d.mkdirs();
                }
            }


            FileOutputStream fileOutputStream = new FileOutputStream(f);

            byte[] inputData = {88,89};
            fileOutputStream.write(inputData);

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void inputStreamTest(String filePath){

        try {
            File f = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(f);

            byte[] all = new byte[(int) f.length()];
            fileInputStream.read(all);
            for (byte b : all){
                System.out.println(b);
            }

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

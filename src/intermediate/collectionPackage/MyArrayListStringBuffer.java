package intermediate.collectionPackage;

import java.util.ArrayList;

public class MyArrayListStringBuffer {

    private ArrayList arrayList ;

    public MyArrayListStringBuffer(){
        arrayList = new ArrayList();
    }

    //追加
    public void append(String str){
        arrayList.add(str);
    }

    //插入
    public void insert(int pos,String str){
        arrayList.add(pos,str);

    }

    //删除，指定位置
    public void delete(int start){
        if(start>0 && start<arrayList.size()){
            arrayList.remove(start);
        }else if(start<0){
            System.out.println("要删除的元素索引值不能小于0");
        }else if (start>=arrayList.size()){
            System.out.println("要删除的元素索引值不能大于等于list的长度");
        }

    }

    //删除，中间一段
    public void delete(int start, int end){

        if (start<0) {

            System.out.println("start<0");
        }
        if (end>arrayList.size()){

            System.out.println("end越界");
        }
        if (start>end){
            System.out.println("start>end");
        }

        if (start< end && start>0 && end < arrayList.size()){
            for(int i=0; i<=end-start;i++){
                arrayList.remove(start);
            }
        }

    }

    //翻转
    public void reverse(){

        for(int i=0; i<arrayList.size()/2; i++){
            String tmpStr = (String)arrayList.get(i);
            arrayList.set(i,arrayList.get(arrayList.size()-i-1));
            arrayList.set(arrayList.size()-i-1,tmpStr);
        }
    }

    public static void main(String[] args) {

        MyArrayListStringBuffer myArrayListStringBuffer = new MyArrayListStringBuffer();
        myArrayListStringBuffer.append("haha");
        myArrayListStringBuffer.append("haha1");
        myArrayListStringBuffer.append("haha2");
        myArrayListStringBuffer.append("haha3");
        myArrayListStringBuffer.append("haha4");
        myArrayListStringBuffer.insert(2,"xixi");
//        myArrayListStringBuffer.delete(2);
//        myArrayListStringBuffer.delete(2,3);
        myArrayListStringBuffer.reverse();
        System.out.println(myArrayListStringBuffer.arrayList);
    }

}

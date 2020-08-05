package primary.numberAndString;

import intermediate.myException.IndexIsNagetiveException;
import intermediate.myException.IndexIsOutofRangeException;

public class MyStringBuffer implements IStringBuffer {

    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer(){
        value = new char[capacity];
    }

    public MyStringBuffer(String str){

        this();//必须在最前

        if(str == null){
            return;
        }
        if(capacity < str.length()){//如果当前容量小，则先扩容再初始化
            capacity = str.length()*2;
            value = new char[capacity];
        }
        if(capacity >= str.length()){
            //value = str.toCharArray();//使用toCharArray赋值后，value长度变成字符串长度了
            System.arraycopy(str.toCharArray(),0,value,0,str.length());//value数组长度仍然是capacity
        }
        length = str.length();
    }

    /**
     * 扩容
     */
    public void expansion(int l){
        capacity = (length + l)*2;
        char[] temp = value;
        value = new char[capacity];
        System.arraycopy(temp,0,value,0,temp.length);
    }

    @Override
    public void append(String str) throws IndexIsOutofRangeException, IndexIsNagetiveException {

//        if(capacity < length + str.length()){//如果长度不足，则需要扩容
//            expansion(str.length());
//        }
//
//        System.arraycopy(str.toCharArray(),0,value,length,str.length());
//        length = length + str.length();

        insert(length,str);

    }

    @Override
    public void append(char c) throws IndexIsOutofRangeException, IndexIsNagetiveException {
        append(String.valueOf(c));

    }

    @Override
    public void insert(int pos, char c) throws IndexIsOutofRangeException, IndexIsNagetiveException {
        insert(pos,String.valueOf(c));

    }

    @Override
    public void insert(int pos, String str) throws IndexIsNagetiveException, IndexIsOutofRangeException {

        //pos<0，抛出IndexIsNagetiveException 异常
        if(pos < 0){
            throw new IndexIsNagetiveException("pos参数不能小于0");
        }

        //pos>length，抛出IndexIsOutofRangeException 异常
        if(pos > length){
            throw new IndexIsOutofRangeException("pos参数超出范围："+ length);
        }

        // str == null ,抛出NullPointException
        if(str == null || str.equals("")){
            throw new NullPointerException("str参数不能为空");
        }

        //将value拆分为两个数组（0~pos-1；pos~length-1）
        char[] first = new char[pos];
        char[] last =new char[length-pos];

        System.arraycopy(value,0,first,0,pos);
        System.arraycopy(value,pos,last,0,length-pos);

        //扩容
        if(capacity < length + str.length()){
            expansion(str.length());
        }

        //重组
        System.arraycopy(first,0,value,0,first.length);
        System.arraycopy(str.toCharArray(),0,value,pos,str.length());
        System.arraycopy(last,0,value,pos+str.length(),last.length);
        System.out.println(value);
        length = length+str.length();

    }

    @Override
    public void delete(int start) throws IndexIsOutofRangeException, IndexIsNagetiveException {
        delete(start,length);

    }

    @Override
    public void delete(int start, int end) throws IndexIsNagetiveException, IndexIsOutofRangeException {

        //start<0 或 end<0，抛出IndexIsNagetiveException
        if(start<0){
            throw new IndexIsNagetiveException("start参数不能小于0");
        }
        if(end<0){
            throw new IndexIsNagetiveException("end参数不能小于0");
        }

        //end > length 或 start > end , 抛出 IndexIsOutofRangeException
        if(end>length){
            throw  new IndexIsOutofRangeException("end不能超出字符串总长度");
        }
        if(start>end){
            throw  new IndexIsOutofRangeException("start不能大于end");
        }


//        if(start > end || start < 0 || end < 0 || end > length){
//            System.out.println("参数不合法");
//            return;
//        }

        char[] temp = value;
        System.out.println(temp);
        value = new char[capacity];
        System.arraycopy(temp,0,value,0,start);
        System.arraycopy(temp,end,value,start,length-end);

        System.out.println(value);

        length = length - (end-start);
    }

    @Override
    public void reverse() {
        for(int i=0; i<value.length/2; i++){
            char temp = value[i];
            value[i] = value[value.length-i-1];
            value[value.length-i-1] = temp;
        }
        System.out.println(value);

    }

    @Override
    public int length() {
        return capacity;
    }

    public static void main(String[] args) {
//        char[] c = new char[5];
//        System.out.println(c.length);
//        c = "abc".toCharArray();
//        System.out.println(c.length);

        //new MyStringBuffer("DuoXiA").reverse();
        //System.out.println(new MyStringBuffer(null).toString());

//        System.out.println(new MyStringBuffer("ueyhrjfydhejeiywhej").length);
//        System.out.println(new MyStringBuffer("ueyhrjfydhejeiywhej").capacity);

        //new MyStringBuffer("Test1234567890test").append("happy1234567890happy");

        //new MyStringBuffer("ABCDEFG").insert(3,"345");

        //new MyStringBuffer("ABCDEFGHIJKL").delete(3,3);
        //new MyStringBuffer("ABCDEFGHIJKL").delete(6);

        //异常测试
//        try {
//            new MyStringBuffer("Test1234567890test").insert(1,"");
//        } catch (IndexIsOutofRangeException e) {
//            e.printStackTrace();
//        } catch (IndexIsNagetiveException e) {
//            e.printStackTrace();
//        }

        try {
            new MyStringBuffer("ABCDEFGHIJKL").delete(1,13);
        } catch (IndexIsOutofRangeException e) {
            e.printStackTrace();
        } catch (IndexIsNagetiveException e) {
            e.printStackTrace();
        }
    }
}

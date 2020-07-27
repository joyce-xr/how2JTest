package numberAndString;


public class MyStringBuffer implements IStringBuffer {

    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer(){
        value = new char[capacity];
        System.out.println("调用无参构造器");
    }

    public MyStringBuffer(String str){

        this();//必须在最前

        if(str!=null){
            value = str.toCharArray();//此时  value数组长度就是str字符串长度，与capacity无关
        }
        length = value.length;
        if(capacity<length){
            capacity = value.length*2;
        }
        System.out.println("调用了有参构造器");
    }

    @Override
    public void append(String str) {
        //判断是否需要扩容
        if(capacity < length + str.length()){

        }

    }

    @Override
    public void append(char c) {

    }

    @Override
    public void insert(int pos, char c) {

    }

    @Override
    public void insert(int pos, String str) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

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
        return 0;
    }

    public static void main(String[] args) {
//        char[] c = new char[5];
//        c = "abc".toCharArray();
//        System.out.println(c.length);

        //new MyStringBuffer("DuoXiA").reverse();
        System.out.println(new MyStringBuffer(null).toString());

    }
}

package primary.numberAndString;

public interface IStringBuffer {
    //追加字符串
    public void append(String str);
    //追加字符
    public void append(char c);
    //指定位置插入字符
    public void insert(int pos, char c);
    //指定位置插入字符串
    public void insert(int pos, String str);
    //从指定位置开始，删除剩下的
    public void delete(int start);
    //从指定位置开始，删除结束位置-1
    public void delete(int start, int end);
    //反转
    public void reverse();
    //返回长度
    public int length();

}

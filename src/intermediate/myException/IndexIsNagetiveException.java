package intermediate.myException;

/**
 * 下标为负异常
 */
public class IndexIsNagetiveException extends Exception{
    public IndexIsNagetiveException(){

    }

    public IndexIsNagetiveException(String msg){
        super(msg);
    }
}

package intermediate.myException;

/**
 * 下标超出范围异常
 */
public class IndexIsOutofRangeException extends Exception {
    public IndexIsOutofRangeException(){

    }

    public IndexIsOutofRangeException(String msg){
        super(msg);
    }
}

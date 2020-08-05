package intermediate.bank;

public class OverdraftException extends Exception {
    //属性：透支额
    private double deficit;

    public OverdraftException(String message, double deficit){

        super(message);
        this.deficit = deficit;
    }

    //方法：获取透支额
    public double getDeficit(){
        return deficit;
    }
}

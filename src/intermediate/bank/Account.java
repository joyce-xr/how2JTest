package intermediate.bank;

/**
 * 银行账户
 */
public class Account {
    //属性：账户余额
    double balance;

    public Account(double balance){

        this.balance = balance;
    }

    //方法：获取账户余额
    public double getBalance(){
        return balance;
    }

    //方法：存钱
    public void deposit(double amt){
        balance = balance + amt;
    }

    //方法：取钱, 余额不足时抛出透支异常OverdraftException
    public void withdraw(double amt) throws OverdraftException {
        if(amt > balance){
            System.out.println("amt > balance");
            throw new OverdraftException("普通账户余额不足，无法提现", 0);
        }
        balance = balance - amt;
    }
}

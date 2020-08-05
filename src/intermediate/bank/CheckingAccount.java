package intermediate.bank;

/**
 * 支票账户:有余额，具备透支额度
 */
public class CheckingAccount extends Account {

    //属性：透支额度
    private double overdraftProtection;

    public CheckingAccount(double balance){//不能透支
        super(balance);
        overdraftProtection = 0;
    }

    public CheckingAccount(double balance, double protect){//可透支
        super(balance);
        overdraftProtection = protect;
    }

    public double getOverdraftProtection(){
        return overdraftProtection;
    }

    //方法：取钱
    public void withdraw(double amt) throws OverdraftException {
        //透支额度不足，无法提现
        if(balance + overdraftProtection < amt){
            System.out.println("透支额度不足，无法提现");
            throw new OverdraftException("支票账户已超出透支额度，无法提现", overdraftProtection);
        }

        //余额不足，可透支
        if(balance < amt && balance + overdraftProtection >= amt){
            System.out.println("余额不足，可透支");
            overdraftProtection = overdraftProtection + balance - amt;
            balance = 0;

        }

        //余额充足
        if(balance >= amt){
            System.out.println("余额充足");
            balance = balance - amt;
        }
    }
}

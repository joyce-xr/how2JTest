package intermediate.bank;

public class AccountTest {

    public static void main(String[] args) {
        //测试普通账户：
//        Account account1 = new Account(100);
//        try {
//            System.out.println("原始余额：" + account1.getBalance());
//            account1.withdraw(30);
//            System.out.println("当前余额：" + account1.getBalance());
//        } catch (OverdraftException e) {
//            e.printStackTrace();
//        }


        //测试支票账户：
        CheckingAccount checkingAccount = new CheckingAccount(100,20);
        try {
            System.out.println("支票账户原始余额：" + checkingAccount.getBalance());
            checkingAccount.withdraw(30);
            System.out.printf("提现30后 余额：%.2f，透支额度：%.2f%n", checkingAccount.getBalance(),checkingAccount.getOverdraftProtection());
            checkingAccount.withdraw(80);
            System.out.printf("提现80后 余额：%.2f，透支额度：%.2f%n", checkingAccount.getBalance(),checkingAccount.getOverdraftProtection());
            checkingAccount.withdraw(50);
            System.out.printf("提现50后 余额：%.2f，透支额度：%.2f%n", checkingAccount.getBalance(),checkingAccount.getOverdraftProtection());

        } catch (OverdraftException e) {
            e.printStackTrace();
        }


    }
}

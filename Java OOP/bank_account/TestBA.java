public class TestBA{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.00, 1000.00);
        System.out.println("Account Number: " + account1.getAccNum());
            account1.deposit(200.02, "checking");
            account1.deposit(300.05, "savings");
            account1.displayAccBal();

            System.out.println(BankAccount.totalMoney);

            account1.withdraw(10.01, "checking");
            account1.withdraw(50.52, "savings");
            account1.displayAccBal();

            System.out.println(BankAccount.totalMoney);

        
        BankAccount account2 = new BankAccount(1000.00, 1000.00);
        System.out.println("Account Number: " + account2.getAccNum());
            account2.deposit(500.65, "checking");
            account2.deposit(600.12, "savings");

            System.out.println(BankAccount.totalMoney);

            account2.withdraw(200.12, "checking");
            account2.withdraw(500.54, "savings");
            account2.displayAccBal();

            System.out.println(BankAccount.totalMoney);
    }
}
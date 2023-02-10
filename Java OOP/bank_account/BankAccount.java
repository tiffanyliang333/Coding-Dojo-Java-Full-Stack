import java.util.Random;

public class BankAccount {
    private double checking;
    private double savings;
    private int accNum;

    public static int numOfAccounts = 0;
    public static double totalMoney = 0.0;

    public BankAccount(double checkingParam, double savingsParam) {
        checking = checkingParam;
        savings = savingsParam;
        numOfAccounts++;
    }

    public int getAccNum(){
        return this.accNum;
    }

    public double getChecking(){
        return this.checking;
    }

    public double getSavings(){
        return this.savings;
    }

    public void setAccNum(int account){
        this.accNum = account;
    }

    public void setChecking(double check){
        this.checking = check;
    }

    public void setSavings(double save){
        this.savings = save;
    }

    public void deposit(double money, String account){
        if (account.equals(savings)){
            this.savings += money;
        }
        else if(account.equals(checking)){
            this.checking += money;
        }
        BankAccount.totalMoney = BankAccount.totalMoney + money;
        System.out.println("Deposit was successful.");
    }

    public void withdraw(double money, String account){
        if (account.equals(savings)){
            if (this.savings - money <= 0){
                System.out.println("Insufficient funds.");
            }
            else if (this.savings - money > 0){
                this.savings -= money;
                BankAccount.totalMoney -= money;
                System.out.println("Withdrawal was successful.");
            }
        }
        else if(account.equals(checking)){
            if (this.checking - money <= 0){
                System.out.println("Insufficient funds.");
            }
            else if(this.checking - money > 0){
                this.checking -= money;
                BankAccount.totalMoney -= money;
                System.out.println("Withdrawal was successful.");
            }
        }
    }

    public void displayAccBal(){
        System.out.printf("Checking: %s, Savings: %s \n", this.checking, this.savings);
    }
}
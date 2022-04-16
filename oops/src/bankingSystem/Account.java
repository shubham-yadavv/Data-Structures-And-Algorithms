package bankingSystem;

public abstract class Account {
    private int accountNumber;
    private int balance;

    public int getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);

}

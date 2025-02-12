public class Account{
    private AccountState state;
    private Double balance;
    private String accountNumber;

    //default state
    public Account(String accountNumber, Double initialBalance){
        this.state = new ActiveState();
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }
    
    public void setState(AccountState state){
        this.state = state;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(Double depositAmount){
        state.deposit(this, depositAmount);
    }

    public void withdraw(Double withdrawAmount){
        state.withdraw(this, withdrawAmount);
    }

    public void activate(){
        state.activate(this);
    }

    public void suspend(){
        state.suspend(this);
    }

    public void close(){
        state.close(this);
    }

    @Override
    public String toString(){
        return
        "Account Number = " + accountNumber + " | " +
        "balance = " + balance;
    }
}
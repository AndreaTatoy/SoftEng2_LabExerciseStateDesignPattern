public interface AccountState{
    public void switchState(Account account);
    public void deposit(Double depositAmount);
    public void withdraw(Double withdrawAmount);
    public void activate();
    public void suspend();
    public void close();
}
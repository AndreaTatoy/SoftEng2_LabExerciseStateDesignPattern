public interface AccountState{
    void deposit(Account account, Double depositAmount);
    void withdraw(Account account, Double withdrawAmount);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
}
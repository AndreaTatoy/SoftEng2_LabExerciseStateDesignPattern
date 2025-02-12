public class ClosedState implements AccountState{
    //You can neither suspend nor activate it.
    //No deposits and withdrawals allowed.
    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("\nYou cannot deposit on a closed account! " + account.toString());
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("\nYou cannot withdraw on a closed account! " + account.toString());
    }

    @Override
    public void close(Account account){
       System.out.println("\nAccount is already closed!");
    }

    @Override
    public void activate(Account account){
        System.out.println("\nYou cannot activate a closed account!");
    }

    @Override
    public void suspend(Account account){
        System.out.println("\nYou cannot suspend a closed account!");
    }

}
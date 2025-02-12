public class SuspendedState implements AccountState{
    //You can either activate or close it.
    //No deposits and withdrawals allowed.

    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("\nYou cannot deposit on a suspended account! " + account.toString());
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("\nYou cannot withdraw on a suspended account! " + account.toString());
    }

    @Override
    public void suspend(Account account){
       System.out.println("\nAccount is already suspended!");
    }

    @Override
    public void activate(Account account){
        System.out.println("\nAccount is activated!");
    }
    
    @Override
    public void close(Account account){
        System.out.println("\nAccount is closed!");
    }
}
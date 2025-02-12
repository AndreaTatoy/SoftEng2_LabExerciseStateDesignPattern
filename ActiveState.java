public class ActiveState implements AccountState{
   //You can either suspend it or close it.

   @Override
   public void deposit(Account account, Double depositAmount) {
       account.setBalance(account.getBalance() + depositAmount);
       System.out.println("\nDeposit successful. " + account.toString());
   }

   @Override
   public void withdraw(Account account, Double withdrawAmount) {
       if (account.getBalance() >= withdrawAmount) {
           account.setBalance(account.getBalance() - withdrawAmount);
           System.out.println("\nWithdrawal successful. " + account.toString());
       } else {
           System.out.println("\nInsufficient balance. " + account.toString());
       }
   }

   @Override
   public void activate(Account account){
      System.out.println("\nAccount is already activated!");
   }

   @Override
   public void suspend(Account account){
      account.setState(new SuspendedState());
      System.out.println("\nAccount is suspended!");
   }

   @Override
   public void close(Account account){
      account.setState(new ClosedState());
      System.out.println("\nAccount is closed!");
   }
}
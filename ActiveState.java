public class ActiveState implements AccountState{
   //You can either suspend it or close it.

   public void switchState(Account myaccount){
      myAccount.setState(new SuspendedState());
      myAccount.setState(new ClosedState());
   }
}
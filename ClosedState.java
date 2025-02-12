public class ClosedState implements AccountState{
    //You can neither suspend nor activate it.
    //No deposits and withdrawals allowed.

    /*public void switchState(Account account){
      account.setState(new ActiveState());
    }
    
    public activate(){
        return "You cannot activate a closed account!";
    }

    public suspend(){
        return "You cannot suspend a closed account!";
    }

    public deposit(Double depositAmount){
        return "You cannot deposit on a closed account!";
    }

    public withdraw(Double withdrawAmount){
        return "You cannot withdraw on a closed account!";

    } */
}
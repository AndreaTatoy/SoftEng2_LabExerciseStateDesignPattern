public class Account{
    private AccountState state;
    private Double balance;
    private String accountNumber;

    //default state
    public Account(){
        state = new ActiveState();
    }
    public String activate(){
        return "Account is activated!";
    }
    public String suspend(){
        return "Account is suspended!";
    }
    public String close(){
        return "Account is closed!";
    }

    public void setState(AccountState state){
        this.state = state;
    }
}
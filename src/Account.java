public abstract class Account implements IPrintBalance {

    int accountBalance;


    protected int pay(int amount) {

        return amount;
    }

    protected void transfer(Account account, int amount){
        account.addMoney(amount);
        accountBalance= accountBalance - amount;

    }

    protected int addMoney(int amount) {

        return accountBalance= accountBalance + amount;
    }



}

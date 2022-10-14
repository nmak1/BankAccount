public class CreditAccount extends Account {


    @Override
    protected int pay(int amount) {

     return accountBalance = accountBalance - amount;

    }


    @Override
    protected void transfer(Account account, int amount) {
        super.transfer(account, amount);
    }

    @Override
    protected int addMoney(int amount) {
        if (accountBalance >0){
            System.out.println(new StringBuilder().append(this)
                    .append(" Отказ в операции. Возможное пополнение не более ")
                    .append(-accountBalance).toString());
        }
        return super.addMoney(amount);
    }



    @Override
    public void printBalance() {
        super.printBalance();
        System.out.print(this);
        System.out.println(accountBalance);
    }

    @Override
    public String toString() {
        return "Кредитный счет :";
    }
}

public class SavingsAccount extends Account {

    @Override
    protected void transfer(Account account, int amount) {
        if ((accountBalance - amount) < 0) {
            System.out.println(toString() + "  Отказ в операции. Платеж больше чем баланс");
        } else super.transfer(account, amount);
    }

    @Override
    protected int addMoney(int amount) {
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
        return "Сберегательный счет :";
    }
}

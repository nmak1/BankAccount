public class Main {

    public static void main(String[] args) {

        Account check = new CheckingAccount();
        Account credit = new CreditAccount();
        Account save = new SavingsAccount();

        check.addMoney(100);
        check.printBalance();
        check.pay(200);

        check.transfer(credit,20);
        credit.printBalance();
        check.printBalance();
        check.transfer(save, 50);

        save.printBalance();

    }
}

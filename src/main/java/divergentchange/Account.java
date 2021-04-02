package divergentchange;

public class Account {

    private final int accountNumber;
    private double balance = 0;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public String toXml() {
        return "<account><id>" + getAccountNumber() + "</id>" +
                "<balance>" + getBalance() + "</balance></account>";
    }

}
public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        this.balance = this.getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if(this.getBalance() >= amount) {
            this.balance = this.getBalance() - amount;
        } else {
            throw new BalanceInsufficentException("Hata: Bakiye yetersiz");
        }
    }

    public double getBalance() {
        return balance;
    }
}

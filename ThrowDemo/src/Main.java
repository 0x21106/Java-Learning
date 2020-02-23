public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        System.out.println(manager.getBalance());
        manager.deposit(10.4242);
        System.out.println(manager.getBalance());
        try {
            manager.withdraw(20);
        }
        catch(BalanceInsufficentException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(manager.getBalance());
        }

    }
}

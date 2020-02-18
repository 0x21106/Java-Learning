public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger baseLogger) {
        this.logger = baseLogger;
    }

    public void add() {
        System.out.println("Musteri eklendi.");
        this.logger.log("Eklendi");
    }
}

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsoleLogger()};
//        for(BaseLogger logger:loggers) {
//            logger.log("Log mesaji.");
//        }
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();

    }
}

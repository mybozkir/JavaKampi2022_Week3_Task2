import java.io.File;

public class Main {
    public static void main(String[] args) {

        /*EmailLogger emailLogger = new EmailLogger();
        DatabaseLogger databaseLogger = new DatabaseLogger();
        emailLogger.log("Log mesajı.");
        databaseLogger.log("Log mesajı");*/

        /*BaseLogger[] loggers = new BaseLogger[]{
                new FileLogger(),
                new EmailLogger(),
                new DatabaseLogger(),
                new ConsoleLogger(),
        };

        for(BaseLogger logger : loggers){
            logger.log("Log mesajı");
        }*/

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
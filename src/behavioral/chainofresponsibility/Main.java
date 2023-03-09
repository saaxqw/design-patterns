package behavioral.chainofresponsibility;

public class Main {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new fileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(
                AbstractLogger.INFO,
                "This is an information message..."
        );
        loggerChain.logMessage(
                AbstractLogger.ERROR,
                "This is an error message...."
        );
        loggerChain.logMessage(
                AbstractLogger.DEBUG,
                "This is a debug level message"
        );
        for (int i = 0; i < 2; i++) {

        }
    }
}

package behavioral.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {
    ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard error logger->Info: " + message);
    }
}

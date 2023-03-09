package behavioral.chainofresponsibility;

public class fileLogger extends AbstractLogger {
    fileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard file logger->Info: " + message);
    }
}

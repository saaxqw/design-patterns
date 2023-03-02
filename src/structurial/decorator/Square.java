package structurial.decorator;

public class Square implements IShape {
    @Override
    public void drawShape() {
        System.out.println("IShape:: Square");
    }
}

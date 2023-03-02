package creational.abstractfacthory;

public class Triangle implements IShape {
    @Override
    public void drawShape() {
        System.out.println("Triangle is drawing...");
    }
}

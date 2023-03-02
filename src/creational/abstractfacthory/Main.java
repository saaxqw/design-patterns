package creational.abstractfacthory;

public class Main {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        IShape circle = shapeFactory.getShape("Circle");
        circle.drawShape();

        IShape ellipse = shapeFactory.getShape("Ellipse");
        ellipse.drawShape();

        IShape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.drawShape(); // RECTANGLE

        IShape triangle = shapeFactory.getShape("Triangle");
        triangle.drawShape();
    }
}

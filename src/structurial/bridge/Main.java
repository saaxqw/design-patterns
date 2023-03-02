package structurial.bridge;

public class Main {
    public static void main(String[] args) {
        ShapeBridge square   = new ShapeType(new Square());
        ShapeBridge triangle = new ShapeType(new Triangle());
        square.drawShape_ShapeBridge();
        System.out.println("********************");
        triangle.drawShape_ShapeBridge();

        ShapeBridge blueTriangle = new Color(new Blue());
        blueTriangle.shapeBP.shapeType_IShape();
        blueTriangle.shapeBP.shapeColor_IShape();

        ShapeBridge redTriangle = new Color(new Red());
        redTriangle.shapeBP.shapeType_IShape();
        redTriangle.shapeBP.shapeColor_IShape();
    }
}

package structurial.bridge;

public class Red implements IShape_BP {
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class RedTriangle");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class RedTriangle, method -> shapeColor_IShape()");
    }
}

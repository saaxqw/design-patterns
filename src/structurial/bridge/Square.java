package structurial.bridge;

public class Square implements IShape_BP {

    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Square");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Square, method -> shapeColor_IShape()");
    }
}

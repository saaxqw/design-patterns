package structurial.bridge;

public class Triangle implements IShape_BP {
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Triangle");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Triangle, method -> shapeColor_IShape()");
    }
}

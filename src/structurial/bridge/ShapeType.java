package structurial.bridge;

public class ShapeType extends ShapeBridge {
    public ShapeType(IShape_BP shapeBP) {
        super(shapeBP);
    }
    @Override
    void drawShape_ShapeBridge() {
        System.out.println("Inside the public class Shape, which extends ShapeBridge");
        shapeBP.shapeType_IShape();
    }

    @Override
    void fillColor_ShapeBridge() {
        //  do-nothing
    }
}

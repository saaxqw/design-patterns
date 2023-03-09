package structurial.bridge;

public class Color extends ShapeBridge {
    public Color(IShape_BP shapeBP) {
        super(shapeBP);
    }

    @Override
    void drawShape_ShapeBridge() {
        // do-nothing
    }

    @Override
    void fillColor_ShapeBridge() {
        System.out.println("Inside the public class Color, which extends ShapeBridge");
        shapeBP.shapeColor_IShape();

    }
}

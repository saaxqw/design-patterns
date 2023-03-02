package structurial.bridge;

public abstract class ShapeBridge {
    protected IShape_BP shapeBP;

    public ShapeBridge(IShape_BP shapeBP) {
        this.shapeBP = shapeBP;
    }

    abstract void drawShape_ShapeBridge();
    abstract void fillColor_ShapeBridge();
}

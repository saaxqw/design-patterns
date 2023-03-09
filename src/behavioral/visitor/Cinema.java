package behavioral.visitor;

public class Cinema implements IPlace {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

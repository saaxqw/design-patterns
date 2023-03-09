package behavioral.visitor;

public class Zoo implements IPlace {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

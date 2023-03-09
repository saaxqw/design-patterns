package behavioral.visitor;

public class Circus implements IPlace {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

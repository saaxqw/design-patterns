package behavioral.visitor;

public class Vacation implements IVisitor {
    public String place;

    @Override
    public void visit(Zoo zoo) {
        place = "Visited zoo place";
    }

    @Override
    public void visit(Cinema cinema) {
        place = "Visited cinema place";
    }

    @Override
    public void visit(Circus circus) {
        place = "Visited circus place";
    }
}

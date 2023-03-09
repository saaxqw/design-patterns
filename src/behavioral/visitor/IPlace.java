package behavioral.visitor;

public interface IPlace {
    void accept(IVisitor visitor);
}

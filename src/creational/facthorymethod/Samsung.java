package creational.facthorymethod;

public class Samsung extends SmartPhone {
    private String modelName;
    public Samsung(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}

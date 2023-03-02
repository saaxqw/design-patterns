package structurial.adapter;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())
        };

        int x1 = 10;
        int y1 = 20;
        int x2 = 40;
        int y2 = 80;

        for(Shape shape : shapes){
            shape.draw(x1,y1,x2,y2);
            System.out.println();
        }
    }
}

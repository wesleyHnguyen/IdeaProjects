public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5.0);
        shapes[1] = new Circle(4.0);
        shapes[2] = new Rectangle(2.0,4.0);

        for (Shape shape: shapes) {
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }

    }
}



public class ResizeableTest {
    public static void main(String[] args) {
        Shape circle = new Circle(3.5);
        Shape rectangle = new Rectangle(2.0,5.0);
        Shape square = new Square(5);

        System.out.println("Circle before resizing");
        System.out.println(circle.toString());
        ((Circle) circle).resize(2);
        System.out.println("Circle after resizing");
        System.out.println(circle.toString());

        System.out.println("Rectangle before resizing");
        System.out.println(rectangle.toString());
        ((Rectangle) rectangle).resize(3.0);
        System.out.println("Rectangle after resizing");
        System.out.println(rectangle.toString());

        System.out.println("Square before resizing");
        System.out.println(square.toString());
        ((Square) square).resize(2);
        System.out.println("Square after resizing");
        System.out.println(square.toString());


    }
}


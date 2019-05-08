public class DisplayCircles {

    public static void main(String[] args) {
        Circle circle =new Circle();

        circle.setRadius(30);
        circle.setColor("red");

       System.out.println("Display circle details: " + circle.toString());

        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(30);
        cylinder.setColor("yellow");
        cylinder.setHeight(10);

        System.out.println("Display cylinder details: " + cylinder.toString());

       // cylinder.show();
        //cylinder.show2();

    }
}

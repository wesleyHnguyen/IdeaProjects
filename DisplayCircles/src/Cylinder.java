public class Cylinder extends Circle {

    private double height;
    private double radius;
    private String color;

    public void setHeight(double height){
        this.height = height;
    }

    public  double getHeight(){
        return this.height;
    }


    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public double getArea(){
        return 2 * super.getArea() + 2 * Math.PI * this.getRadius() * this.getHeight();
    }

    @Override
    public  String toString(){
        return "Cylinder: " + " radius: " + this.getRadius() + " color: " + this.getColor() + " height: " + this.height +
                " Area: " + this.getArea() + " Volume: " + this.getVolume();
    }

    public void show(){
        System.out.println("radius: " + this.radius + " color: " + this.color);
    }

    public void show2(){
        System.out.println("radius: " + this.getRadius() + " color: " + this.getColor());

    }


}

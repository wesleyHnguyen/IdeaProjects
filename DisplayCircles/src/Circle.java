public class Circle {

    private double radius;
    private  String color;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public  double getRadius(){
        return  this.radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return Math.PI * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return "Circle: radius " + this.radius + " , " + " color: " + this.color + " AreaSquare: " + this.getArea();
    }


}

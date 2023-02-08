package shapes;

public class Circle extends Shape {
    // instance variables
    private double radius;
    // constructors
    public Circle(){
        super(1);
        radius = 1;
    }
    public Circle(double radius) {
        setRadius(radius);
    }
    // methods
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        if (radius > 0) {
        throw new IllegalArgumentException("This radius must be greater than 0");
        }
        this.radius = radius;
    }
    public String getArea() {
        double area =  Math.PI * Math.pow(radius, 2);
        String areaStr = String.format("%.2f", area);
        return areaStr;
    }
}

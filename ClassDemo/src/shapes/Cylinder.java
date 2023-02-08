package shapes;

public class Cylinder extends Shape {
    private double height;
    private Circle circle;

    public Cylinder(){
        super(3);
        height = 1;
        circle = new Circle();
    }
    public Cylinder(double height, Circle circle){
        setHeight(height);
        setCircle(circle);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw  new IllegalArgumentException("Height must be greater than 0");
        }
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }


    @Override
    public String getArea() {
        return null;
    }
    public double getVolume(){
        return circle.getArea() * this.height;
    }
}

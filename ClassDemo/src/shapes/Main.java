package shapes;

public class Main {
    public static void main (String [] args) {
        Shape shape = new Circle();
        Shape shape2 = new Rectangle();
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(2.25, 4.1);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        Cylinder cylinder1 = new Cylinder(); // height 1,radius 1
        Cylinder cylinder2 = new Cylinder(4.5,circle); // height 4.5, radius 2.5
        System.out.println("%.2f\n",cylinder2.getArea());
        System.out.println("%.2f\n",cylinder2.getArea());
        System.out.println("%.2f\n",cylinder1.getVolume());
        System.out.println("%.2f\n",cylinder2.getVolume());
    }
}

public class TestCircle {
    
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        a.setRadius(3);

        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());
        System.out.println("");

        b.setRadius(20);

        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
        System.out.println("");

        c.setRadius(15);

        System.out.println("Radius of the third circle: " + c.getRadius());
        System.out.println("Diameter of the third circle: " + c.getDiameter());
        System.out.println("Area of the third circle: " + c.getArea());

    }
}

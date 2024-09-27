public class Circle{
    private static double radius;
    private static double diameter;
    private static double area;

    public static void setRadius(double rad){
        radius = rad;
        diameter = radius * 2.0;
        area = Math.PI * radius * radius;
    }

    public static double getRadius(){
        return radius;
    }

    public static double getDiameter(){
        return diameter;
    }

    public static double getArea(){
        return area;
    }

}
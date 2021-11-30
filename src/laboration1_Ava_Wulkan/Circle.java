package laboration1_Ava_Wulkan;

public class Circle {

    private final static double PI = 3.14;
    private static double radius;

    public Circle() {
    }

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static double area() {
        return radius * radius * PI;
    }

    public static double circumference() {
        return PI * 2 * radius;
    }

    public String toString() {
        return "Cirkel - Radie: " + getRadius() + " Area: " + area()
                + " Omkrets: " + circumference();
    }

}

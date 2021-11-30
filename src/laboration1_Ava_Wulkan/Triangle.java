package laboration1_Ava_Wulkan;

public class Triangle {

    private static double side1;
    private static double side2;
    private static double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        Triangle.side1 = side1;
        Triangle.side2 = side2;
        Triangle.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        Triangle.side1 = side1;
    }

    public void setSide2(double side2) {
        Triangle.side2 = side2;
    }

    public void setSide3(double side3) {
        Triangle.side3 = side3;
    }

    public static double area() {
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    public static double circumference() {
        return side1 + side2 + side3;
    }

    
    public static boolean isValidTriangle(double a, double b, double c) {
        double longestSide = a;
        if (b > longestSide) {
            longestSide = b;
        }
        if (c > longestSide) {
            longestSide = c;
        }

        return (longestSide < a + b + c - longestSide);
    }

    public String toString() {
        return "Triangle - Sidor: " + getSide1() + ", " + getSide2()
                + ", " + getSide3() + " Area: " + area()
                + " Omkrets: " + circumference();
    }

}

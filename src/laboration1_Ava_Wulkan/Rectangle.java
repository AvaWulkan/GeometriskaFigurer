package laboration1_Ava_Wulkan;

public class Rectangle {

    private static double hight;
    private static double lenght;

    public Rectangle() {
    }

    public Rectangle(double hight, double lenght) {
        Rectangle.hight = hight;
        Rectangle.lenght = lenght;
    }

    public double getHight() {
        return hight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setHight(double hight) {
        Rectangle.hight = hight;
    }

    public void setLenght(double lenght) {
        Rectangle.lenght = lenght;
    }

    public static double area() {
        return hight * lenght;
    }

    public static double circumference() {
        return (hight + lenght) * 2;
    }

    public String toString() {
        return "Rektangle - Höjd: " + getHight() + "    Längd: "
                + getLenght() + "   Area: " + area()
                + " Omkrets: " + circumference();
    }

}

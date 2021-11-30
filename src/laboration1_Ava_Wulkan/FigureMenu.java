package laboration1_Ava_Wulkan;

import java.util.Scanner;

public class FigureMenu {

    static Scanner sc = new Scanner(System.in);

    static void Calculate(String figur) {
        System.out.println("Vad vill du räkna ut?");
        System.out.println("1. Area");
        System.out.println("2. Omkrets");
        System.out.println("3. Båda");
        System.out.println("9. Inget, gå tillbaka till huvudmenyn");
        System.out.println("0. Avsluta programmet");
        System.out.println();
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                switch (figur) {
                    case "Cirkelns":
                        System.out.println(figur + " area = " + Circle.area());
                        System.out.println();
                        break;
                    case "Rektanglens":
                        System.out.println(figur + " area = " + Rectangle.area());
                        System.out.println();
                        break;
                    case "Trianglens":
                        System.out.println(figur + " area = " + Triangle.area());
                        System.out.println();
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (figur) {
                    case "Cirkelns":
                        System.out.println(figur + " omkrets = " + Circle.circumference());
                        System.out.println();
                        break;
                    case "Rektanglens":
                        System.out.println(figur + " omkrets = " + Rectangle.circumference());
                        System.out.println();
                        break;
                    case "Trianglens":
                        System.out.println(figur + " omkrets = " + Triangle.circumference());
                        System.out.println();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (figur) {
                    case "Cirkelns":
                        System.out.println(figur + " area = " + Circle.area());
                        System.out.println(figur + " omkrets = " + Circle.circumference());
                        System.out.println();
                        break;
                    case "Rektanglens":
                        System.out.println(figur + " area = " + Rectangle.area());
                        System.out.println(figur + " omkrets = " + Rectangle.circumference());
                        System.out.println();
                        break;
                    case "Trianglens":
                        System.out.println(figur + " area = " + Triangle.area());
                        System.out.println(figur + " omkrets = " + Triangle.circumference());
                        System.out.println();
                        break;
                    default:
                        break;
                }
                break;
            case 9:
                break;
            case 0:
                break;
            default:
                System.out.println(choice + " är inte ett valbart alternativ.");
                System.out.println();
                break;
        }
    }

}

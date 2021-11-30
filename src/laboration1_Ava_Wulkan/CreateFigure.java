package laboration1_Ava_Wulkan;

import java.util.Scanner;
import static laboration1_Ava_Wulkan.Triangle.isValidTriangle;

public class CreateFigure {

    static Scanner sc = new Scanner(System.in);

    public static void createFigure() {
        System.out.println("Vilken figur vill du skapa");
        System.out.println("1. Cirkel");
        System.out.println("2. Rektangel");
        System.out.println("3. Triangel");
        System.out.println("9. Backa till huvudmenyn");
        System.out.println("0. Avsluta programmet");
        System.out.println();
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                createCircle();
                FigureMenu.Calculate("Cirkelns");
                break;
            case 2:
                createRectangle();
                FigureMenu.Calculate("Rektanglens");
                break;
            case 3:
                createTriangle();
                FigureMenu.Calculate("Trianglens");
                break;
            case 9:
                FigureMain.startProgram();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println(choice + " är inte ett valbart alternativ.");
                System.out.println();
                createFigure();
                break;
        }
    }

    static void createCircle() {
        System.out.print("Skriv in cirkelns radie: ");
        double radius = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        Circle myCircle = new Circle(radius);
        FigureLists.addCircle(myCircle);
    }

    static void createRectangle() {
        System.out.print("Skriv in rektangelns höjd: ");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.print("Skriv in rektangelns längd: ");
        double lenght = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        Rectangle myRectangle = new Rectangle(height, lenght);
        FigureLists.addRectangle(myRectangle);
    }

    static void createTriangle() {
        System.out.print("Skriv in trianglens ena sida: ");
        double side1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Skriv in trianglens andra sida: ");
        double side2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Skriv in trianglens tredje sida: ");
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        if (isValidTriangle(side1, side2, side3)) {
            Triangle myTriangle = new Triangle(side1, side2, side3);
            FigureLists.addTriangle(myTriangle);
        } else {
            System.out.println("En triangl med dessa sidor går inte att skapa.");
            System.out.println("Testa igen");
            System.out.println();
            createTriangle();
            System.out.println();
        }
    }

}

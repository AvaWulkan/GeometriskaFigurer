package laboration1_Ava_Wulkan;

import java.util.Scanner;
import static laboration1_Ava_Wulkan.FigureLists.*;

public class PrintFigure {

    static Scanner sc = new Scanner(System.in);

    public static void printFigure() {
        System.out.println("Vilka figurer vill du skriva ut?");
        System.out.println("1. Cirkelar");
        System.out.println("2. Rektanglar");
        System.out.println("3. Trianglar");
        System.out.println("4. Alla");
        System.out.println("9. Backa till huvudmenyn");
        System.out.println("0. Avsluta");
        System.out.println();
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                printAllCircle();
                System.out.println();
                break;
            case 2:
                printAllRectangle();
                System.out.println();
                break;
            case 3:
                printAllTriangle();
                System.out.println();
                break;
            case 4:

                boolean[] emtyList = FigureLists.checkIfEmty();
                if (emtyList[0] || emtyList[1] || emtyList[2]) {
                    if (emtyList[0]) {
                        printAllCircle();
                    }
                    if (emtyList[1]) {
                        printAllRectangle();
                    }
                    if (emtyList[2]) {
                        printAllTriangle();
                    }

                } else {
                    System.out.println("Du har inte skapat några figurer än");
                }
                System.out.println();
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
                printFigure();
                break;
        }
    }
}

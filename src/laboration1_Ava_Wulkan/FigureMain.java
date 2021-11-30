package laboration1_Ava_Wulkan;
/**
 *
 * @author avawu
 */

import java.util.Scanner;
import static laboration1_Ava_Wulkan.CreateFigure.*;
import static laboration1_Ava_Wulkan.PrintFigure.*;

public class FigureMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            startProgram();
        }
    }

    static void startProgram() {
        System.out.println("Vad vill du göra?");
        System.out.println("1. Skapa figurer");
        System.out.println("2. Skriva ut skapade figurer");
        System.out.println("0. Avsluta programmet");
        System.out.println();
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                createFigure();
                break;
            case 2:
                printFigure();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println(choice + " är inte ett valbart alternativ.");
                System.out.println();
                break;
        }
    }

    
}

package laboration1_Ava_Wulkan;

import java.util.Scanner;

public class FigureLists {

    static Scanner sc = new Scanner(System.in);
    static Circle[] circles = new Circle[10];
    static Rectangle[] rectangles = new Rectangle[10];
    static Triangle[] triangles = new Triangle[10];
    static int circlePosition = 0;
    static int rectanglePosition = 0;
    static int trianglePosition = 0;

//  =========================================================================
    public static void addCircle(Circle c) {
        if (circlePosition < circles.length) {
            circles[circlePosition] = c;
            circlePosition++;
        } else {
            System.out.println("Listan med cirklar är tyvärr full.");
            System.out.println();
        }
    }

    public static void printAllCircle() {
        if (circlePosition == 0) {
            System.out.println();
            System.out.println("Du har inte skapat några cirklar än.");
        } else {
            for (int i = 0; i < circlePosition; i++) {
                System.out.println(circles[i]);
            }
        }
    }

//  =========================================================================
    public static void addRectangle(Rectangle c) {
        if (rectanglePosition < rectangles.length) {
            rectangles[rectanglePosition] = c;
            rectanglePosition++;
        } else {
            System.out.println("Listan med rektanglar är tyvärr full.");
            System.out.println();
        }
    }

    public static void printAllRectangle() {
        if (rectanglePosition == 0) {
            System.out.println();
            System.out.println("Du har inte skapat några rektanglar än.");
        } else {
            for (int i = 0; i < rectanglePosition; i++) {
                System.out.println(rectangles[i]);
            }
        }
    }

//  =========================================================================
    public static void addTriangle(Triangle c) {
        if (trianglePosition < triangles.length) {
            triangles[trianglePosition] = c;
            trianglePosition++;
        } else {
            System.out.println("Listan med trianglar är tyvärr full.");
            System.out.println();
        }
    }

    public static void printAllTriangle() {
        if (trianglePosition == 0) {
            System.out.println();
            System.out.println("Du har inte skapat några trianglar än.");
        } else {
            for (int i = 0; i < trianglePosition; i++) {
                System.out.println(triangles[i]);
            }
        }
    }

//  =========================================================================    
    public static boolean[] checkIfEmty() {
        boolean[] emtyList = new boolean[3];
        emtyList[0] = circlePosition != 0;
        emtyList[1] = rectanglePosition != 0;
        emtyList[2] = trianglePosition != 0;
        return emtyList;
    }
}

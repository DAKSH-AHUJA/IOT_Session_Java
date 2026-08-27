package day1;

import java.util.Scanner;

public class Area {

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double areaOfTriangle(double base, double height) {
        return (base * height) / 2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle = " + areaOfCircle(r));
        System.out.print("Enter base of triangle: ");
        
        double b = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        
        double h = sc.nextDouble();
        System.out.println("Area of triangle = " + areaOfTriangle(b, h));

        sc.close();
    }
}


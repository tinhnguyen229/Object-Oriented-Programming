package oop_project.homework.lab1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("--CircleComputation--");
        Circle(radius);
        System.out.println("--SphereComputation--");
        Sphere(radius);
        System.out.println("--CylinderComputation--");
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        Cylinder(radius, height);
    }

    public static void Circle(double radius){
        double diameter = 2.0 * radius;
        double circumference = 2.0 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);
        
        System.out.printf("Diameter is: %.2f \n", diameter);
        System.out.printf("Area is: %.2f \n", area);
        System.out.printf("Circumference is: %.2f \n", circumference);
    }

    public static void Sphere(double radius){
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = 4 / 3 * Math.PI * radius * radius * radius;

        System.out.printf("SurfaceArea is: %.2f \n", surfaceArea);
        System.out.printf("Volume is: %.2f \n", volume);
    }

    public static void Cylinder(double radius, double height){
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        double volume = baseArea * height;

        System.out.printf("BaseArea is: %.2f \n", baseArea);
        System.out.printf("SurfaceArea is: %.2f \n", surfaceArea);
        System.out.printf("Volume is: %.2f \n", volume);
    }
}

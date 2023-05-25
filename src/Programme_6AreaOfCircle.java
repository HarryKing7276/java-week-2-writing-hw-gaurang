import java.util.Scanner;

/** Write a program to enter any radius of the circle and find out the area.
 * (Formula of Area = A = PI*r*r)
 */


public class Programme_6AreaOfCircle {
    public static void main(String[]args){
        // Scanner declaration for reading input in console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = scanner.nextDouble();
        areaOfCicle(radius);
        // Closing the scanner object
        scanner.close();
    }
    public static void areaOfCicle(double radius){
        double pi = Math.PI;
        double area = (pi*radius*radius);
        System.out.println("The area if Circle is :"+area);
    }

}


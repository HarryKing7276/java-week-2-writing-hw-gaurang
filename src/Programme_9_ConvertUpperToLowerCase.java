import java.util.Scanner;

/** Write a program to convert the upper case to lower case.
 *
 */

public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {

// scanner declaration for reading from input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string:");
        String uppercase = scanner.next();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
     //   t.convertUppercaseToLowerCase(uppercase);
        // Closing the scanner object
        scanner.close();}


// Conversion to Uppercase to Lowercase method

        public void convertUppercaseToLowercase(String text){
            System.out.println("The Lowercase value is = " + text.toLowerCase());



    }
}
import java.util.Scanner;

/** Write a Java program to convert a string into lowercase.
 * Sample Input : THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output : the quick brown fox jumps over the  lazy dog.
 */


public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        // Scanner declaration to read from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        // Closing the scanner
        scanner.close();
    }



    // Convert the string to lowercase
    public void convertStringToLowerCase(String str){
        System.out.println("The lowercase of the String is ="+str.toLowerCase());

    }
}

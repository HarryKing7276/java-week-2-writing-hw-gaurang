import java.util.Scanner;

/** Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //Scanner declaration to read the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapVariables(first,second);
        // Close the scanner
        scanner.close();

    }

    // Swapping the value of variables
    public void swapVariables(int a, int b){
        int c;
        System.out.println("Before the swapping, the values of the first variable is :"+a+
                "and second variable is: "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After the swapping,the values of first variable is :"+a+"and second " +
                "variable is:"+b);}
    }



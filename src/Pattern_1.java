import java.util.Scanner;

/**
 * Pattern 1
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * @author Jeel
 * @since 13-11-2023
 */
public class Pattern_1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in); // scanner class
        System.out.println("Enter a Number : "); // take input form user
        int n = scanner.nextInt(); // store user input in variable n

        // outer loop for row
        for (int row = 1; row <= n ; row++){
            // inner loop for column
            for (int col = 1; col <= n ; col++){
                // use System.out.print() for print * in a row
                System.out.print("* ");
            }
            //after a row print new line
            System.out.println();
        }
    }
}
import java.util.Scanner;
/**
 * Pattern 5
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * @author Jeel
 * @since 13-11-2023
 */
public class Pattern_5 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in); // scanner class
        System.out.print("Enter a Number : "); // take input form user
        int n = scanner.nextInt(); // store user input in variable n

        // outer loop for row
        for (int row = 1; row <= n ; row++){
            // inner loop for column
            for (int col = 1; col <= row ; col++){
                System.out.print(row +" ");
            }
            //after a row print new line
            System.out.println();
        }
    }
}
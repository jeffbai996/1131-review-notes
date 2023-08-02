import java.util.Scanner;

/**
 * Quadratic equation calculator
 *
 * @author Jeff Bai
 * @version 0.1
 */
public class Quadratic
{
    public static void main(String[] args) {
        int a, b, c; // declare variables a, b, c
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the value for a (the coefficient of x squared): ");
        a = scan.nextInt();
        
        System.out.print("Enter the value for b (the coefficient of x): ");
        b = scan.nextInt();
        
        System.out.print("Enter the value for c (the constant term): ");
        c = scan.nextInt();
        
        double root1 = (-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c));
        double root2 = (-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c));
        
        System.out.println("The roots are: " + root1 + ", and: " + root2);
    }
}

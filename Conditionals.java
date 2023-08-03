import java.util.Scanner;
/**
 * Write a description of class Conditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conditionals
{
    // Types of Java loops
    // while, do
    // for
    
    // ==, != for equality
    // >= <=, etc.
    
    // !, &&, || for logic
    
    // the if statement
    public static void main(String[] args) {
        final int MINOR = 21;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        
        // it's a good convention to use block formatting even when not necessary to improve readability
        if (age < MINOR) {
            System.out.println("Youth is a wonderful thing.");
        } else {
            System.out.println("Age is just a state of mind.");
        }
        
        // the conditional operator
        // i.e. the ternary operator - similar syntax to other language ternary operators
        final int MAX = 10;
        int total = 5;
        int result = (total > MAX) ? total + 1 : total * 2;
        System.out.println(result);
        
        // nested if
        int num1, num2, num3, min = 0;
        System.out.println("Enter 3 integers: ");
        
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else {
            if (num2 < num3) {
                min = num2;
            } else {
                min = num3;
            }
        }
        System.out.println("Minimum value: " + min);
        
        // Comparison
        // floats
        // Two floats are equal only when all the binary digits of their representation match
        // Therefore, it's not a great idea to use == on floats
        // A better way is to compute the abs(a - b) of the two floats and compare the result
        // to a tolerance level, e.g. 0.00001
        
        // if (Math.abs(a - b) < TOLERANCE) {
        //   System.out.println("Essentially equal.");
        // }
        
        // chars
        // The character set determines the order of all the possible characters that can be used
        // 'a' comes before 'b' in Unicode, and therefore a < b
        
        // Objects
        // Do not use == or != to compare strings. There is a string method, .equals(), that returns the boolean value
        
        // if (name1.equals(name2))
        //   System.out.println("The names are the same.");
        // else 
        //   System.out.println("The names are not the same.");
        
        // Using == or != simply tells you whether both reference variables point to the same string object
        
        // the switch statement
        // Allows a program to follow one of several paths
        
        int aCount = 0, bCount = 0, cCount = 0;
        System.out.print("Enter either A B or C");
        char char1 = scan.next().charAt(0);
        switch (char1)
        {
            case 'A':
                aCount++;
                break;
            case 'B':
                bCount++;
                break;
            case 'C':
                cCount++;
                break;
            default:
                System.out.println("Error in character. Please input A, B, or C.");
        }
    }
}

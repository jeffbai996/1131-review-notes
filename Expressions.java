import java.util.Scanner;
import java.lang.*;

/**
 * Write a description of class Expressions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Expressions
{
    public static void main(String[] args) {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        
        double fahrenheitTemp;
        Scanner celsiusReader = new Scanner(System.in); // create Scanner
        System.out.println("Enter celsius temperature: ");
        String celsiusStr = celsiusReader.nextLine(); // read input
        
        int celsiusTemp = Integer.parseInt(celsiusStr); // cast to int
        
        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        System.out.println(celsiusTemp + " degrees Celsius is " +
        fahrenheitTemp + " degrees Fahrenheit.");
    }
}

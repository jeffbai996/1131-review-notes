import java.util.Random;
import java.text.*;

/**
 * Write a description of class Objects here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Objects
{
    public static void main(String[] args) {
        // Strings are objects, which are represented in the code with
        // 'references'. When you assign one object to another, you are
        // simply setting the references to be equal, i.e. the two 
        // references now point to the same object in memory
        
        String name1 = "Bob";
        String name2 = "Jack";
        
        name2 = name1;
        
        System.out.println(name2); // => "Bob", however, this did not create
        // a new object!! name2 simply points to the same object as name1.
        // These are known as 'aliases'
        
        // initializing a String with new
        String str1;
        str1 = new String("I'm a string!");
        
        // However, strings are so crucial that we can implicitly 
        // instantiate one
        
        String str2 = "I'm an implicitly instantiated string";
        
        // The String class
        // Strings are immutable
        String str3 = "A string";
        // some methods
        str3.charAt(0); // returns character at index
        str3.compareTo(str2); // is this string smaller/equal/larger
        str3.equals(str2); // boolean comparison
        
        // Packages
        // You can 'fully qualify' a method call, i.e. hash out the
        // entire name of it to invoke without importing packages
        // Only methods of java.lang.* are available by default
        // Import classes with the 'import' keyword
        // e.g. : import java.util.Random;
        
        // the Random class (java.util.Random)
        Random rng = new Random(); // instantiate a Random object w ref 'rng'
        int rand1 = rng.nextInt(10); // returns rand from 0 to 9
        int rand2 = rng.nextInt(10) + 10; // returns rand from 10 to 19
        // .nextFloat() does not take any parameters
        float rand3 = rng.nextFloat(); // returns float from 0.0 to 1.0(exc.)
        
        /*  The Math class (java.lang.Math)
         *  Does not need to be imported (part of java.lang)
         *  This class is wholly comprised of 'static methods', i.e. those
         *  where you don't have to instantiate a new instance of the class
         *  in order to invoke. 
        */
        
        int negative = -15;
        System.out.println(Math.abs(negative)); // 15
        double frac = 3 / 4;
        System.out.println(Math.acos(frac)); // 1.57...
        
        // Formatting Output (java.text)
        // NumberFormat (java.text.NumberFormat)
        // Formats numbers as a specific type (like currency/percent on Excel)
        
        final double TAX_RATE = 0.06; // 6% sales tax
        int quantity = 5;
        double subtotal, tax, totalCost, unitPrice;
        
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        
        unitPrice = 9.9;
        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalCost));
        
        // DecimalFormat 
        // Must instantiate a DecimalFormat object
        // Can format a decimal according to a pattern
        
        int radius = 1;
        double area, circumference;
        
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        
        DecimalFormat dfmt = new DecimalFormat("0.###"); // only 3 trailing decimals allowed
        
        System.out.println("Area : " + dfmt.format(area) + ", Circumference: " + dfmt.format(circumference));
    }
}
